package Controller;

import Model.Cliente;
import Model.ClienteDAO;
import Model.Exercicios;
import Model.ExerciciosDAO;
import Model.Funcionario;
import Model.FuncionarioDAO;
import Model.Treino;
import Model.TreinoDAO;
import View.TelaPrincipal;
import View.TreinoCliente;
import View.TreinoInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreinoController {

    private final TelaPrincipal telaPrincipal;
    private final TreinoCliente treinoCliente;
    private final TreinoInfo treinoInfo;
    Util util = new Util();
    ClienteDAO daoCliente = new ClienteDAO();
    ExerciciosDAO daoExercicio = new ExerciciosDAO();
    FuncionarioDAO daoFuncionario = new FuncionarioDAO();
    TreinoDAO daoTreino = new TreinoDAO();

    public TreinoController(TelaPrincipal telaPrincipal, TreinoInfo treinoInfo, TreinoCliente treinoCliente) {
        this.telaPrincipal = telaPrincipal;
        this.treinoCliente = treinoCliente;
        this.treinoInfo = treinoInfo;
    }

    public void initTreinoController() {
        telaPrincipal.getjButtonCadastrarTreino().addActionListener(e -> inserirDados(0));
        telaPrincipal.getjButtonSalvarTreino().addActionListener(e -> cadastrarTreino());
        telaPrincipal.getjButtonPesquisarTreinoCli().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarTreinoCli().getText(), 0));
        telaPrincipal.getjButtonListarTreino().addActionListener(e -> listarClientes(2));
        telaPrincipal.getjButtonPesquisarTreinoListCli().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarTreinoListCli().getText(), 2));
        telaPrincipal.getjButtonCancelarTreino().addActionListener(e -> telaPrincipal.limparCamposTreinos());
        telaPrincipal.getjButtonGetTreinos().addActionListener(e -> listarTreinos());
        treinoCliente.getjButtonDesativaTreino().addActionListener(e -> statusTreino(0));
        treinoCliente.getjButtonAtivarTreino().addActionListener(e -> statusTreino(1));
        treinoCliente.getjButtonEditarTreino().addActionListener(e -> getTreino());
        treinoCliente.getjButtonPesquisarTreinoAtivo().addActionListener(e -> listarTreinos(treinoCliente.getjTextFieldPesquisarTreinoAtivo().getText()));
        treinoCliente.getjButtonEditarTreinoPDF().addActionListener(e -> gerarPDF());
        treinoCliente.getjButtonListTreinoCancel().addActionListener(e -> treinoCliente.dispose());
        treinoInfo.getjButtonPesquisarTreinoCli().addActionListener(e -> listarClientes(treinoInfo.getjTextFieldPesquisarTreinoCli().getText(), 1));
        treinoInfo.getjButtonSalvarTreino().addActionListener(e -> atualizarTreino());
        treinoInfo.getjButtonCancelarTreino().addActionListener(e -> treinoInfo.dispose());
    }

    private void cadastrarTreino() {
        JTable tabela = telaPrincipal.getjTableTreinoClientes();
        int linha = tabela.getSelectedRow();
        String exerc = String.valueOf(telaPrincipal.getjComboBoxTreinoExercicios().getSelectedItem());
        String ordem = String.valueOf(telaPrincipal.getjComboBoxOrdem().getSelectedItem());
        String instrutor = String.valueOf(telaPrincipal.getjComboBoxInstrutorTreino().getSelectedItem());
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        String dataTroca = "";
        if (telaPrincipal.getjDateChooserTrocaTreino().getDate() != null) {
            dataTroca = formatoData.format(telaPrincipal.getjDateChooserTrocaTreino().getDate());
        }

        if (linha == -1) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o cliente",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (exerc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o exercicio",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (ordem.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione a ordem de execução",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (telaPrincipal.getjTextFieldCargaTreino().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "Insira a carga do treino",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (telaPrincipal.getjTextFieldSeriesTreino().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "Insira o número de séries do treino",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (telaPrincipal.getjTextFieldRepeticaoTreino().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "Insira o número de repetições da série",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (telaPrincipal.getjTextFieldTipoTreino().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "Insira o tipo do treino",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (instrutor.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Instrutor responsável",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
        } else if (dataTroca.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Data de troca é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjDateChooserTrocaTreino().requestFocus();
        } else {
            if (linha != -1) {
                long matricula = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
                Cliente cli = daoCliente.getCliente(matricula);
                int funcID = Integer.parseInt(util.removeLetras(instrutor));
                int ExercID = Integer.parseInt(util.removeLetras(exerc));
                Funcionario func = daoFuncionario.getFuncionario(funcID);
                Exercicios exercicio = daoExercicio.getExercicios(ExercID);

                int repeticao = Integer.parseInt(telaPrincipal.getjTextFieldRepeticaoTreino().getText());
                int carga = Integer.parseInt(telaPrincipal.getjTextFieldCargaTreino().getText());
                String series = telaPrincipal.getjTextFieldSeriesTreino().getText();
                String tipoTreino = telaPrincipal.getjTextFieldTipoTreino().getText();
                String observacao = telaPrincipal.getjTextAreaObservacaoTreino().getText();

                if (daoTreino.inserirTreino(new Treino(Integer.parseInt(ordem),
                        repeticao, carga, series, tipoTreino, observacao, func,
                        cli, exercicio, dataTroca))) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Treino Cadastrado com sucesso",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    telaPrincipal.limparCamposTreinos();
                }
            }
        }
    }

    private void inserirDados(int controle) {
        ArrayList<Exercicios> listaExerc = daoExercicio.listarExercicios();
        ArrayList<Funcionario> listaFunc = daoFuncionario.listarFuncionarios();
        if (controle == 0) { //Popula cadastro
            listarClientes(0);
            telaPrincipal.getjComboBoxTreinoExercicios().removeAllItems();
            telaPrincipal.getjComboBoxTreinoExercicios().addItem("Selecione");
            for (int i = 0; i < listaExerc.size(); i++) {
                telaPrincipal.getjComboBoxTreinoExercicios().addItem("ID: " + listaExerc.get(i).getId() + " - " + listaExerc.get(i).getNome());
            }
            telaPrincipal.getjComboBoxInstrutorTreino().removeAllItems();
            telaPrincipal.getjComboBoxInstrutorTreino().addItem("Selecione");
            for (int i = 0; i < listaFunc.size(); i++) {
                telaPrincipal.getjComboBoxInstrutorTreino().addItem("ID: " + listaFunc.get(i).getId() + " - " + listaFunc.get(i).getNome());
            }
        } else if (controle == 1) { //Popula tela de edicao        
            treinoInfo.getjComboBoxTreinoExercicios().removeAllItems();
            treinoInfo.getjComboBoxTreinoExercicios().addItem("Selecione");
            for (int i = 0; i < listaExerc.size(); i++) {
                treinoInfo.getjComboBoxTreinoExercicios().addItem("ID: " + listaExerc.get(i).getId() + " - " + listaExerc.get(i).getNome());
            }

            treinoInfo.getjComboBoxInstrutorTreino().removeAllItems();
            treinoInfo.getjComboBoxInstrutorTreino().addItem("Selecione");
            for (int i = 0; i < listaFunc.size(); i++) {
                treinoInfo.getjComboBoxInstrutorTreino().addItem("ID: " + listaFunc.get(i).getId() + " - " + listaFunc.get(i).getNome());
            }
        }
    }

    private void listarClientes(int controle) {
        ArrayList<Cliente> lista = daoCliente.listarClientes();
        if (lista != null && controle == 0) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getErrorOffset(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (lista != null && controle == 1) {
            DefaultTableModel modelo = (DefaultTableModel) treinoInfo.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getErrorOffset(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
            int linhaCliEdit = telaPrincipal.getjTableListTreinoClientes().getSelectedRow();
            treinoInfo.getjTableTreinoClientes().addRowSelectionInterval(linhaCliEdit, linhaCliEdit);
        } else if (lista != null && controle == 2) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableListTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getMessage(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void listarClientes(String pesquisa, int controle) {
        ArrayList<Cliente> lista = daoCliente.listarClientes(pesquisa);
        if (lista != null && controle == 0) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getErrorOffset(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (lista != null && controle == 1) {
            DefaultTableModel modelo = (DefaultTableModel) treinoInfo.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getMessage(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (lista != null && controle == 2) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableListTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Erro ao adiquirir data - Código: " + e.getMessage(),
                            "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void listarTreinos() {
        ArrayList<Treino> lista = daoTreino.listarTreino();
        if (lista != null) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) treinoCliente.getjTableListTreinosAtivos().getModel();
            DefaultTableModel modeloInativo = (DefaultTableModel) treinoCliente.getjTableListTreinosInativos().getModel();
            modeloAtivo.setRowCount(0);
            modeloInativo.setRowCount(0);
            long matriculaCli;
            JTable tabelaCliEdit = telaPrincipal.getjTableListTreinoClientes();
            int linhaCliEdit = tabelaCliEdit.getSelectedRow();
            if (linhaCliEdit != -1) {
                matriculaCli = Long.parseLong(String.valueOf(tabelaCliEdit.getValueAt(linhaCliEdit, 0)));
                treinoCliente.getjLabelGetStoredMatricula().setText(String.valueOf(matriculaCli));
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).isAtivo() && lista.get(i).getCliente().getMatricula() == matriculaCli) {
                        modeloAtivo.addRow(new Object[]{
                            lista.get(i).getId(),
                            lista.get(i).getCliente().getNome(),
                            lista.get(i).getExercicios().getNome(),
                            lista.get(i).getOrdem() + " ª",
                            lista.get(i).getCarga() + " KG",
                            lista.get(i).getSeries(),
                            lista.get(i).getRepeticao() + " Vezes",});
                    } else if (!lista.get(i).isAtivo() && lista.get(i).getCliente().getMatricula() == matriculaCli) {
                        modeloInativo.addRow(new Object[]{
                            lista.get(i).getId(),
                            lista.get(i).getCliente().getNome(),
                            lista.get(i).getExercicios().getNome(),
                            lista.get(i).getOrdem() + " ª",
                            lista.get(i).getCarga() + " KG",
                            lista.get(i).getSeries(),
                            lista.get(i).getRepeticao() + " Vezes",});
                    }
                }
            } else {
                JOptionPane.showMessageDialog(telaPrincipal, "Selecione um usuário",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            util.setColumnWidths(treinoCliente.getjTableListTreinosAtivos(), 40, 450, 450, 50, 50, 50, 70);
            util.setColumnWidths(treinoCliente.getjTableListTreinosInativos(), 40, 450, 450, 50, 50, 50, 70);
        }
    }

    private void listarTreinos(String pesquisa) {
        ArrayList<Treino> lista = daoTreino.listarTreino(pesquisa);
        DefaultTableModel modeloAtivo = (DefaultTableModel) treinoCliente.getjTableListTreinosAtivos().getModel();
        DefaultTableModel modeloInativo = (DefaultTableModel) treinoCliente.getjTableListTreinosInativos().getModel();
        modeloAtivo.setRowCount(0);
        modeloInativo.setRowCount(0);
        long matriculaCli;
        JTable tabelaCliEdit = telaPrincipal.getjTableListTreinoClientes();
        int linhaCliEdit = tabelaCliEdit.getSelectedRow();
        if (linhaCliEdit != -1) {
            matriculaCli = Long.parseLong(String.valueOf(tabelaCliEdit.getValueAt(linhaCliEdit, 0)));
            if (lista != null) {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).isAtivo() && lista.get(i).getCliente().getMatricula() == matriculaCli) {
                        modeloAtivo.addRow(new Object[]{
                            lista.get(i).getId(),
                            lista.get(i).getCliente().getNome(),
                            lista.get(i).getExercicios().getNome(),
                            lista.get(i).getOrdem() + " ª",
                            lista.get(i).getCarga() + " KG",
                            lista.get(i).getSeries(),
                            lista.get(i).getRepeticao() + " Vezes",});
                    } else if (!lista.get(i).isAtivo() && lista.get(i).getCliente().getMatricula() == matriculaCli) {
                        modeloInativo.addRow(new Object[]{
                            lista.get(i).getId(),
                            lista.get(i).getCliente().getNome(),
                            lista.get(i).getExercicios().getNome(),
                            lista.get(i).getOrdem() + " ª",
                            lista.get(i).getCarga() + " KG",
                            lista.get(i).getSeries(),
                            lista.get(i).getRepeticao() + " Vezes",});
                    }
                }
            }
            util.setColumnWidths(treinoCliente.getjTableListTreinosAtivos(), 40, 450, 450, 50, 50, 50, 70);
        }
    }

    private void gerarPDF() {
        ArrayList<Treino> lista = daoTreino.listarTreino();
        DefaultTableModel modeloAtivo = (DefaultTableModel) treinoCliente.getjTableListTreinosAtivos().getModel();
        long matriucula = Long.parseLong(treinoCliente.getjLabelGetStoredMatricula().getText());
        if (modeloAtivo.getRowCount() > 0) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Deseja gerar um PDF dos exercicíos ativos?");
            if (showConfirmDialog == 0) {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).isAtivo() && lista.get(i).getCliente().getMatricula() != matriucula) {
                        lista.remove(i);
                    }
                }
                util.gerarPDF(lista);
            }

        }
    }

    private void getTreino() {
        listarClientes(1);
        inserirDados(1);
        JTable tabela = treinoCliente.getjTableListTreinosAtivos();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            try {
                SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
                int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
                Treino treino = daoTreino.getTreino(id);
                Date dataTroca = formatoData.parse(treino.getDataTrocaTreino());
                if (treino.getDataTrocaTreino() != null) {
                    dataTroca = formatoData.parse(treino.getDataTrocaTreino());
                }
                treinoInfo.getjLabelStoredID().setText(String.valueOf(treino.getId()));
                treinoInfo.getjTextFieldCargaTreino().setText(String.valueOf(treino.getCarga()));
                treinoInfo.getjTextFieldSeriesTreino().setText(treino.getSeries());
                treinoInfo.getjTextFieldRepeticaoTreino().setText(String.valueOf(treino.getRepeticao()));
                treinoInfo.getjTextFieldTipoTreino().setText(treino.getTipoTreino());
                treinoInfo.getjTextAreaObservacaoTreino().setText(treino.getObservacao());
                treinoInfo.getjDateChooserTrocaTreino().setDate(dataTroca);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(treinoInfo, "Erro ao adiquirir a data de aquisição",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(treinoCliente, "Selecione um exercício",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarTreino() {
        String exerc = String.valueOf(treinoInfo.getjComboBoxTreinoExercicios().getSelectedItem());
        String ordem = String.valueOf(treinoInfo.getjComboBoxOrdem().getSelectedItem());
        String instrutor = String.valueOf(treinoInfo.getjComboBoxInstrutorTreino().getSelectedItem());
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        String dataTroca = null;
        long matriculaCli = 0;
        JTable tabelaCliEdit = treinoInfo.getjTableTreinoClientes();
        int linhaCliEdit = tabelaCliEdit.getSelectedRow();
        if (linhaCliEdit != -1) {
            //validacoes dos campos de edicao
            if (treinoInfo.getjDateChooserTrocaTreino().getDate() != null) {
                dataTroca = formatoData.format(treinoInfo.getjDateChooserTrocaTreino().getDate());
            }
            if (exerc.equals("Selecione")) {
                JOptionPane.showMessageDialog(treinoInfo, "Selecione o exercicío",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (ordem.equals("Selecione")) {
                JOptionPane.showMessageDialog(treinoInfo, "Selecione a ordem do exercicío",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (treinoInfo.getjTextFieldCargaTreino().getText().isEmpty()) {
                JOptionPane.showMessageDialog(treinoInfo, "Indique a carga do treino",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                treinoInfo.getjTextFieldCargaTreino().requestFocus();
            } else if (treinoInfo.getjTextFieldSeriesTreino().getText().isEmpty()) {
                JOptionPane.showMessageDialog(treinoInfo, "Indique as series",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                treinoInfo.getjTextFieldCargaTreino().requestFocus();
            } else if (treinoInfo.getjTextFieldRepeticaoTreino().getText().isEmpty()) {
                JOptionPane.showMessageDialog(treinoInfo, "Indique as repetições do treino",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                treinoInfo.getjTextFieldRepeticaoTreino().requestFocus();
            } else if (treinoInfo.getjTextFieldTipoTreino().getText().isEmpty()) {
                JOptionPane.showMessageDialog(treinoInfo, "Indique o tipo do treino",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                treinoInfo.getjTextFieldTipoTreino().requestFocus();
            } else if (dataTroca.isEmpty()) {
                JOptionPane.showMessageDialog(treinoInfo, "Selecione a data de previsão de troca de treino",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                treinoInfo.getjDateChooserTrocaTreino().requestFocus();
            } else {
                matriculaCli = Long.parseLong(String.valueOf(tabelaCliEdit.getValueAt(linhaCliEdit, 0)));
                Cliente cli = daoCliente.getCliente(matriculaCli);
                int funcID = Integer.parseInt(util.removeLetras(instrutor));
                int ExercID = Integer.parseInt(util.removeLetras(exerc));

                //Atribuicao
                int idT = Integer.parseInt(treinoInfo.getjLabelStoredID().getText());
                int carga = Integer.parseInt(treinoInfo.getjTextFieldCargaTreino().getText());
                String series = treinoInfo.getjTextFieldSeriesTreino().getText();
                int repeticao = Integer.parseInt(treinoInfo.getjTextFieldRepeticaoTreino().getText());
                String tipoTreino = treinoInfo.getjTextFieldTipoTreino().getText();
                String observacao = treinoInfo.getjTextAreaObservacaoTreino().getText();
                Funcionario func = daoFuncionario.getFuncionario(funcID);
                Exercicios exercicio = daoExercicio.getExercicios(ExercID);
                if (daoTreino.editarTreino(new Treino(idT, Integer.parseInt(ordem), repeticao, carga, series,
                        tipoTreino, observacao, func, cli, exercicio, dataTroca))) {
                    JOptionPane.showMessageDialog(null, "Treino atualizado Alterado "
                            + "com sucesso", "Editar Treino", JOptionPane.INFORMATION_MESSAGE);
                    listarTreinos();
                    treinoInfo.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(treinoInfo, "Selecione o usuário",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Ativa e desativa equipamentos
    private void statusTreino(int controle) {
        JTable tabelaAtivo = treinoCliente.getjTableListTreinosAtivos();
        JTable tabelaDesabilitado = treinoCliente.getjTableListTreinosInativos();
        int linhaAtivo = tabelaAtivo.getSelectedRow();
        int linhaDesabilitado = tabelaDesabilitado.getSelectedRow();

        if (linhaAtivo != -1 && controle == 0) {
            int id = Integer.parseInt(String.valueOf(tabelaAtivo.getValueAt(linhaAtivo, 0)));
            if (daoTreino.statusTraino(id, false)) {
                JOptionPane.showMessageDialog(null, "Treino setado como inativo",
                        "Inativar Treino", JOptionPane.INFORMATION_MESSAGE);
                listarTreinos();
            }
        } else if (linhaDesabilitado != -1 && controle == 1) {
            int id = Integer.parseInt(String.valueOf(tabelaDesabilitado.getValueAt(linhaDesabilitado, 0)));
            if (daoTreino.statusTraino(id, true)) {
                JOptionPane.showMessageDialog(null, "Treino ativado com sucesso",
                        "Ativar Treino", JOptionPane.INFORMATION_MESSAGE);
                listarTreinos();
            }
        } else {
            JOptionPane.showMessageDialog(treinoCliente, "Selecione um exercício",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

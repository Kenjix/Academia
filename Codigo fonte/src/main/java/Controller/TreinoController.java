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
    private final TreinoInfo treinoInfo;
    Util util = new Util();
    ClienteDAO daoCliente = new ClienteDAO();
    ExerciciosDAO daoExercicio = new ExerciciosDAO();
    FuncionarioDAO daoFuncionario = new FuncionarioDAO();
    TreinoDAO daoTreino = new TreinoDAO();

    public TreinoController(TelaPrincipal telaPrincipal, TreinoInfo treinoInfo) {
        this.telaPrincipal = telaPrincipal;
        this.treinoInfo = treinoInfo;
    }

    public void initTreinoController() {
        telaPrincipal.getjButtonCadastrarTreino().addActionListener(e -> inserirDados(0));
        telaPrincipal.getjButtonPesquisarTreino().addActionListener(e -> listarTreinos(telaPrincipal.getjTextFieldPesquisarTreino().getText()));
        telaPrincipal.getjButtonSalvarTreino().addActionListener(e -> cadastrarTreino());
        telaPrincipal.getjButtonPesquisarTreinoCli().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarTreinoCli().getText(), 0));
        telaPrincipal.getjButtonListarTreino().addActionListener(e -> listarTreinos());
        telaPrincipal.getjButtonDesativaTreino().addActionListener(e -> statusTreino(0));
        telaPrincipal.getjButtonAtivarTreino().addActionListener(e -> statusTreino(1));
        telaPrincipal.getjButtonCancelarTreino().addActionListener(e -> telaPrincipal.limparCamposTreinos());
        telaPrincipal.getjButtonEditarTreino().addActionListener(e -> getTreino());
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
            listarClientes(1);
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
        }
    }

    private void listarTreinos() {
        ArrayList<Treino> lista = daoTreino.listarTreino();

        if (lista != null) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableListTreinos().getModel();
            DefaultTableModel modeloInativo = (DefaultTableModel) telaPrincipal.getjTableListTreinosInativos().getModel();
            modeloAtivo.setRowCount(0);
            modeloInativo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).isAtivo()) {
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getCliente().getNome(),
                        lista.get(i).getExercicios().getNome(),
                        lista.get(i).getOrdem() + " ª",
                        lista.get(i).getCarga() + " KG",
                        lista.get(i).getSeries(),
                        lista.get(i).getRepeticao() + " Vezes",});
                } else if (!lista.get(i).isAtivo()) {
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
            util.setColumnWidths(telaPrincipal.getjTableListTreinos(), 40, 450, 450, 50, 50, 200, 70);
        }
    }

    private void listarTreinos(String pesquisa) {
        ArrayList<Treino> lista = daoTreino.listarTreino(pesquisa);
        DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableListTreinos().getModel();
        DefaultTableModel modeloInativo = (DefaultTableModel) telaPrincipal.getjTableListTreinosInativos().getModel();
        modeloAtivo.setRowCount(0);
        modeloInativo.setRowCount(0);
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).isAtivo()) {
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getCliente().getNome(),
                        lista.get(i).getExercicios().getNome(),
                        lista.get(i).getOrdem() + " ª",
                        lista.get(i).getCarga() + " KG",
                        lista.get(i).getSeries(),
                        lista.get(i).getRepeticao() + " Vezes",});
                } else if (!lista.get(i).isAtivo()) {
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
            util.setColumnWidths(telaPrincipal.getjTableListTreinos(), 40, 450, 450, 50, 50, 200, 70);
        }
        if (!telaPrincipal.getjTextFieldPesquisarTreino().getText().isEmpty() && modeloAtivo.getRowCount() > 0) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Deseja gera PDF de exercicíos ?");
            if (showConfirmDialog == 0) {
                util.gerarPDF(lista);
            }
        }
    }

    private void getTreino() {
        listarClientes(1);
        inserirDados(1);
        JTable tabela = telaPrincipal.getjTableListTreinosAtivos();
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
        }
    }

    private void atualizarTreino() {
        JOptionPane.showMessageDialog(treinoInfo, "404     ¯\\_(ツ)_/¯",
                "Erro", JOptionPane.ERROR_MESSAGE);

        /*String exerc = String.valueOf(treinoInfo.getjComboBoxTreinoExercicios().getSelectedItem());
        String ordem = String.valueOf(treinoInfo.getjComboBoxOrdem().getSelectedItem());
        String instrutor = String.valueOf(treinoInfo.getjComboBoxInstrutorTreino().getSelectedItem());
        String dataTroca = null;
        long matriculaCli = 0;
        JTable tabelaCliEdit = treinoInfo.getjTableTreinoClientes();
        int linhaCliEdit = tabelaCliEdit.getSelectedRow();
        if (linhaCliEdit != -1) {
            long matricula = Long.parseLong(String.valueOf(tabelaCliEdit.getValueAt(linhaCliEdit, 0)));
        }
        int idT = Integer.parseInt(treinoInfo.getjLabelStoredID().getText());
        Cliente cli = daoCliente.getCliente(matriculaCli);
        int funcID = Integer.parseInt(util.removeLetras(instrutor));
        int ExercID = Integer.parseInt(util.removeLetras(exerc));
        Funcionario func = daoFuncionario.getFuncionario(funcID);
        Exercicios exercicio = daoExercicio.getExercicios(ExercID);
        int carga = Integer.parseInt(treinoInfo.getjTextFieldCargaTreino().getText());
        String series = treinoInfo.getjTextFieldSeriesTreino().getText();
        int repeticao = Integer.parseInt(treinoInfo.getjTextFieldRepeticaoTreino().getText());
        String tipoTreino = treinoInfo.getjTextFieldTipoTreino().getText();
        String observacao = treinoInfo.getjTextAreaObservacaoTreino().getText();
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        if (treinoInfo.getjDateChooserTrocaTreino().getDate() != null) {
            dataTroca = formatoData.format(treinoInfo.getjDateChooserTrocaTreino().getDate());
        }

        if (daoTreino.editarTreino(new Treino(idT, Integer.parseInt(ordem), repeticao, carga, series,
            tipoTreino, observacao, func, cli, exercicio, dataTroca))) {
            JOptionPane.showMessageDialog(null, "Treino atualizado Alterado "
                    + "com sucesso", "Editar Treino", JOptionPane.INFORMATION_MESSAGE);
            listarTreinos();
            treinoInfo.dispose();
        }*/

    }

    //Ativa e desativa equipamentos
    private void statusTreino(int controle) {
        JTable tabelaAtivo = telaPrincipal.getjTableListTreinos();
        JTable tabelaDesabilitado = telaPrincipal.getjTableListTreinosInativos();
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
        }
    }
}

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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreinoController {

    private final TelaPrincipal telaPrincipal;
    Util util = new Util();
    ClienteDAO daoCliente = new ClienteDAO();
    ExerciciosDAO daoExercicio = new ExerciciosDAO();
    FuncionarioDAO daoFuncionario = new FuncionarioDAO();
    TreinoDAO daoTreino = new TreinoDAO();

    public TreinoController(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void initTreinoController() {
        telaPrincipal.getjButtonCadastrarTreino().addActionListener(e -> inserirDados());
        telaPrincipal.getjButtonPesquisarTreino().addActionListener(e -> listarTreinos(telaPrincipal.getjTextFieldPesquisarTreino().getText()));
        telaPrincipal.getjButtonSalvarTreino().addActionListener(e -> cadastrarTreino());
        telaPrincipal.getjButtonPesquisarTreinoCli().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarTreinoCli().getText()));
        telaPrincipal.getjButtonListarTreino().addActionListener(e -> listarTreinos());

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
                System.out.println(ExercID);
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

    private void inserirDados() {
        listarClientes();
        listarExercicios();
        listarInstrutor();
    }

    private void listarExercicios() {
        ArrayList<Exercicios> listaExerc = daoExercicio.listarExercicios();
        telaPrincipal.getjComboBoxTreinoExercicios().removeAllItems();
        telaPrincipal.getjComboBoxTreinoExercicios().addItem("Selecione");
        for (int i = 0; i < listaExerc.size(); i++) {
            telaPrincipal.getjComboBoxTreinoExercicios().addItem("ID: " + listaExerc.get(i).getId() + " - " + listaExerc.get(i).getNome());
        }
    }

    private void listarInstrutor() {
        ArrayList<Funcionario> listaFunc = daoFuncionario.listarFuncionarios();
        telaPrincipal.getjComboBoxInstrutorTreino().removeAllItems();
        telaPrincipal.getjComboBoxInstrutorTreino().addItem("Selecione");
        for (int i = 0; i < listaFunc.size(); i++) {
            telaPrincipal.getjComboBoxInstrutorTreino().addItem("ID: " + listaFunc.get(i).getId() + " - " + listaFunc.get(i).getNome());
        }
    }

    private void listarClientes() {
        ArrayList<Cliente> lista = daoCliente.listarClientes();
        if (lista != null) {
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
        }
    }

    private void listarClientes(String pesquisa) {
        ArrayList<Cliente> lista = daoCliente.listarClientes(pesquisa);
        if (lista != null) {
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
        }
    }

    private void listarTreinos() {
        ArrayList<Treino> lista = daoTreino.listarTreino();

        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableListTreinos().getModel();
            modelo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getCliente().getNome(),
                    lista.get(i).getExercicios().getNome(),
                    lista.get(i).getOrdem() + " ª",
                    lista.get(i).getCarga() + " KG",
                    lista.get(i).getSeries(),
                    lista.get(i).getRepeticao() + " Vezes",});
            }
            util.setColumnWidths(telaPrincipal.getjTableListTreinos(), 40, 450, 450, 50, 50, 200, 70);
        }
    }

    private void listarTreinos(String pesquisa) {
        ArrayList<Treino> lista = daoTreino.listarTreino(pesquisa);

        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableListTreinos().getModel();
            modelo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getCliente().getNome(),
                    lista.get(i).getExercicios().getNome(),
                    lista.get(i).getOrdem() + " ª",
                    lista.get(i).getCarga() + " KG",
                    lista.get(i).getSeries(),
                    lista.get(i).getRepeticao() + " Vezes",});
            }
            util.setColumnWidths(telaPrincipal.getjTableListTreinos(), 40, 450, 450, 50, 50, 200, 70);
        }
    }
}

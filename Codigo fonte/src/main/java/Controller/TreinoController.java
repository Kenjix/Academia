package Controller;

import Model.Cliente;
import Model.ClienteDAO;
import Model.Equipamento;
import Model.EquipamentoDAO;
import Model.ExercEquip;
import Model.ExercEquipDAO;
import Model.Exercicios;
import Model.ExerciciosDAO;
import Model.Funcionario;
import Model.FuncionarioDAO;
import Model.Treino;
import Model.TreinoDAO;
import View.ExercicioInfo;
import View.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TreinoController {

    private final TelaPrincipal telaPrincipal;
    private final ExercicioInfo exercicioInfo;
    TreinoDAO dao = new TreinoDAO();
    ClienteDAO cliDAO = new ClienteDAO();
    FuncionarioDAO funDAO = new FuncionarioDAO();
    ExerciciosDAO exercDAO = new ExerciciosDAO();

    public TreinoController(TelaPrincipal telaPrincipal, TreinoInfo treinoInfo) {
        this.telaPrincipal = telaPrincipal;
        this.treinoInfo = treinoInfo;
    }

    public void initExerciciosController() {
        //telaPrincipal.getjButtonCadastrarExercicio().addActionListener(e -> listaDadosEquip());
        telaPrincipal.getjButtonSalvarTreino().addActionListener(e -> cadastrarTreino());
        //telaPrincipal.getjButtonListarExercicio().addActionListener(e -> listarTreino());
        //telaPrincipal.getjButtonPesquisarExerc().addActionListener(e -> listarTreino(telaPrincipal.getjTextFieldPesquisarExerc().getText()));
        //telaPrincipal.getjButtonEditarExerc().addActionListener(e -> getTreino());
        //telaPrincipal.getjButtonDeletarExerc().addActionListener(e -> removerTreino());
        //exercicioInfo.getjButtonSalvarExerc().addActionListener(e -> editarTreino());
        //exercicioInfo.getjButtonCancelarExerc().addActionListener(e -> exercicioInfo.dispose());
    }
    
    //Lista clientes Ativos na tabela
    private void listarClientes() {
        ArrayList<Cliente> lista = new ArrayList();
        lista = cliDAO.listarClientes();
        if (lista != null) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modeloAtivo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).isAtivo()) {
                    String cpf = lista.get(i).getCpf();
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                    });
                } 
            }
        }
    }

    private void cadastrarTreino() {
        JTable tabela = telaPrincipal.getjTableTreinoClientes();
        int linha = tabela.getSelectedRow();
        String nome = "";
        if (linha != -1) {
           nome = String.valueOf(tabela.getValueAt(linha, 1));
           
        }
        String exercicio = String.valueOf(telaPrincipal.getjComboBoxExercicios().getSelectedItem());        
        String ordem = String.valueOf(telaPrincipal.getjComboBoxOrdem().getSelectedItem());
        String carga = telaPrincipal.getjTextFieldCargaTreino().getText();
        String numSeries = telaPrincipal.getjTextFieldSeriesTreino().getText();
        String numRep = telaPrincipal.getjTextFieldRepeticaoTreino().getText();
        String instru = String.valueOf(telaPrincipal.getjComboBoxInstrutorTreino().getSelectedItem());        
        String tipoTreino = telaPrincipal.getjTextFieldTipoTreino().getText();
        String observacoes = telaPrincipal.getjTextAreaObservacaoTreino().getText();
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            tabela.requestFocus();
        } else if (exercicio.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o exercicio",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxExercicios().requestFocus();
        } else if (ordem.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione a ordem",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxOrdem().requestFocus();
        } else if (instru.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o instrutor",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxInstrutorTreino().requestFocus();
        } else if (carga.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Carga é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldCargaTreino().requestFocus();
        } else if (numSeries.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de series é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldSeriesTreino().requestFocus();
        } else if (numRep.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de repetição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldRepeticaoTreino().requestFocus();
        } else if (tipoTreino.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Tipo de treino é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldTipoTreino().requestFocus();
        } else if (observacoes.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de repetição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextAreaObserv().requestFocus();
        } 
        else {
            Funcionario fun = funDAO.listarFuncionarios(instru).get(0);
            Exercicios exerc = exercDAO.listarExercicios(exercicio).get(0);
            Cliente cli = cliDAO.listarClientes(nome).get(0);
            if (dao.inserirTreino(new Treino(0, Integer.parseInt(ordem), Integer.parseInt(numRep), Integer.parseInt(carga), 
                    numSeries, tipoTreino, observacoes, fun, cli))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Treino de " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                telaPrincipal.limparCamposExerc();
            }
        }
        listarTreino();
    }

    private void listarTreino() {
        ArrayList<Treino> lista = dao.listarTreino();
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            for (Treino e : lista) {
                modelo.addRow(new Object[]{
                    e.getId(),
                    e.getTipoTreino(),
                    e.getOrdem(),
                    e.getRepeticao(),
                    e.getSeries(),
                    e.getCarga(),
                    e.getObservacao()});
            }
        }
    }

    private void listarTreino(String pesquisa) {
        ArrayList<Treino> lista = dao.listarTreino(pesquisa);
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getTipoTreino(),
                    lista.get(i).getOrdem(),
                    lista.get(i).getRepeticao(),
                    lista.get(i).getSeries(),
                    lista.get(i).getCarga(),
                    lista.get(i).getObservacao()});
            }
        }
    }

    private void getTreino() {
        JTable tabela = telaPrincipal.getjTableTreinoClientes();
        ArrayList<Funcionario> listEquip = funDAO.listarFuncionarios();
        ArrayList<Exercicios> listExerc = exercDAO.listarExercicios();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            Treino treino = dao.getTreino(id);
            treinoInfo.getjLabelStoreTreinoID().setText(String.valueOf(id));
            treinoInfo.getjTextFieldNome().setText(treino.getCliente().getNome());
            String instru = treino.getFuncionario().getNome();
            //Fazer como sera o preenchemento do intrutor
            
            String exerc;
            //Fazer como sera o preenchimento do exercicio
            
            treinoInfo.getjTextFieldCarga().setText(treino.getCarga());
            treinoInfo.getjTextFieldRepeticao().setText(treino.getRepeticao());
            treinoInfo.getjTextFieldSeries().setText(treino.getSeries());
            treinoInfo.getjTextFieldTipoTreino.setText(treino.getTipoTreino());
            treinoInfo.getjTextAreaObservacoes().setText(treino.getObservacao());
            String ordem  = String.valueOf(treino.getOrdem());
                    
            if (ordem.equals("1")) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(1);
            } else if (ordem.equals("2")) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(2);
            } else if ((ordem.equals("3"))) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(3);
            } else if ((ordem.equals("4"))) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(4);
            } else if ((ordem.equals("5"))) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(5);
            } else if ((ordem.equals("6"))) {
                treinoInfo.getjComboBoxOrdem().setSelectedIndex(6);
            }
            
        }
    }

    //Edita equipamento selecionado na tabela
    private void editarTreino() {
        //Atribuicao de dados
        String id = treinoInfo.getjLabelStoreExercID().getText();
        String nome = treinoInfo.getjTextFieldNome().getText();
        String carga = treinoInfo.getjTextFieldCarga().getText();
        String ordem = treinoInfo.getjTextFieldOrdem().getText();
        String repeticao = treinoInfo.getjTextFieldRepeticao().getText();
        String series = treinoInfo.getjTextFieldSeries().getText();
        String tipoTreino = treinoInfo.getjTextFieldTipoTreino().getText();
        String observacoes = String.valueOf(treinoInfo.getjComboBoxOrdem().getSelectedItem());
        String instru = String.valueOf(treinoInfo.getjComboBoxInstrutorTreino().getSelectedItem());
        String exercicio = String.valueOf(treinoInfo.getjComboBoxExercicios().getSelectedItem());

        //Validacao de dados
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextFieldNome().requestFocus();
        } else if (exercicio.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o exercicio",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjComboBoxExercicios().requestFocus();
        } else if (ordem.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione a ordem",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjComboBoxOrdem().requestFocus();
        } else if (instru.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o instrutor",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjComboBoxInstrutorTreino().requestFocus();
        } else if (carga.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Carga é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextFieldCargaTreino().requestFocus();
        } else if (numSeries.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de series é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextFieldSeriesTreino().requestFocus();
        } else if (numRep.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de repetição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextFieldRepeticaoTreino().requestFocus();
        } else if (tipoTreino.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Tipo de treino é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextFieldTipoTreino().requestFocus();
        } else if (observacoes.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Numero de repetição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            treinoInfo.getjTextAreaObserv().requestFocus();
        } 
        else {
            Funcionario fun = funDAO.listarFuncionarios(instru).get(0);
            Exercicios exerc = exercDAO.listarExercicios(exercicio).get(0);
            Cliente cli = cliDAO.listarClientes(nome).get(0);
            if (dao.editarTreino(new Treino(0, Integer.parseInt(ordem), Integer.parseInt(repeticao), Integer.parseInt(carga), 
                    series, tipoTreino, observacoes, fun, cli))) {
                JOptionPane.showMessageDialog(null, "Treino de " + nome
                        + " Alterado com sucesso", "Editar treino", JOptionPane.INFORMATION_MESSAGE);
            }
            telaPrincipal.getjTextFieldPesquisarTreino().setText("");
            listarTreino();
            treinoInfo.dispose();
        } 
    }

    private void removerTreino() {
        JTable tabela = telaPrincipal.getjTableTreinoClientes();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR O TREINO");
            if (showConfirmDialog == 0) {
                if (dao.deletarTreino(id)) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Treino excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    telaPrincipal.getjTextFieldPesquisarTreino().setText("");
                    listarTreino();
                }
            }
        }
    }
}

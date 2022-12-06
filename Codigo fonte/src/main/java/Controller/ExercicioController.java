package Controller;

import Model.Equipamento;
import Model.EquipamentoDAO;
import Model.Exercicios;
import Model.ExerciciosDAO;
import View.ExercicioInfo;
import View.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ExercicioController {

    private final TelaPrincipal telaPrincipal;
    private final ExercicioInfo exercicioInfo;
    ExerciciosDAO dao = new ExerciciosDAO();
    EquipamentoDAO equipDAO = new EquipamentoDAO();

    public ExercicioController(TelaPrincipal telaPrincipal, ExercicioInfo exercicioInfo) {
        this.telaPrincipal = telaPrincipal;
        this.exercicioInfo = exercicioInfo;
    }

    public void initExerciciosController() {
        telaPrincipal.getjButtonCadastrarExercicio().addActionListener(e -> listaDadosComboBox());
        telaPrincipal.getjButtonSalvarExercicio().addActionListener(e -> cadastrarExerc());
        telaPrincipal.getjButtonListarExercicio().addActionListener(e -> listarExerc());
        telaPrincipal.getjButtonPesquisarExerc().addActionListener(e -> listarExerc(telaPrincipal.getjTextFieldPesquisarExerc().getText()));
        telaPrincipal.getjButtonEditarExerc().addActionListener(e -> getExerc());
        telaPrincipal.getjButtonDeletarExerc().addActionListener(e -> removerExercicio());
        exercicioInfo.getjButtonSalvarExerc().addActionListener(e -> editarExerc());
        exercicioInfo.getjButtonCancelarExerc().addActionListener(e -> exercicioInfo.dispose());
    }

    private void cadastrarExerc() {
        String nome = telaPrincipal.getjTextFieldNomeExercicio().getText();
        String grupoMusc = String.valueOf(telaPrincipal.getjComboBoxGrupoMuscExercicio().getSelectedItem());
        String equip = String.valueOf(telaPrincipal.getjComboBoxEquipamentoExercicio().getSelectedItem());

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeExercicio().requestFocus();
        } else if (grupoMusc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Grupo Muscular",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxGrupoMuscExercicio().requestFocus();
        } else if (equip.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o equipamento",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxEquipamentoExercicio().requestFocus();
        } else {
            if (dao.inserirExercicio(new Exercicios(nome, grupoMusc))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Exercicio " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        telaPrincipal.limparCamposExerc();
        listarExerc();
    }

    private void listarExerc() {
        ArrayList<Exercicios> lista = dao.listarExercicios();
        DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
        modelo.setRowCount(0);
        for (Exercicios e : lista) {
            modelo.addRow(new Object[]{
                e.getId(),
                e.getNome(),
                e.getGrupoMuscular()});
        }
    }

    private void getExerc() {
        JTable tabela = telaPrincipal.getjTableExercicio();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            Exercicios exerc = dao.getExercicios(id);

            exercicioInfo.getjLabelStoreExercID().setText(String.valueOf(id));
            exercicioInfo.getjTextFieldNomeExerc().setText(exerc.getNome());
            String grupMusc = exerc.getGrupoMuscular();
            if (grupMusc.equals("Membros Inferiores")) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(1);
            } else if (grupMusc.equals("Peitorais")) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(2);
            } else if ((grupMusc.equals("Dorsais"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(3);
            } else if ((grupMusc.equals("Deltóides/Trapézio"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(3);
            } else if ((grupMusc.equals("Bíceps"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(3);
            } else if ((grupMusc.equals("Tríceps"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(3);
            }
            listaDadosComboBox();
        }
    }

    //Edita equipamento selecionado na tabela
    private void editarExerc() {
        //Atribuicao de dados
        String id = exercicioInfo.getjLabelStoreExercID().getText();
        String nome = exercicioInfo.getjTextFieldNomeExerc().getText();
        String grupoMusc = String.valueOf(exercicioInfo.getjComboBoxGrupoMuscExercicio().getSelectedItem());
        //String equip = String.valueOf(exercicioInfo.getjComboBoxEquipamentoExercicio().getSelectedItem());

        //Validacao de dados
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjTextFieldNomeExerc().requestFocus();
        } else if (grupoMusc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Grupo Muscular",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjComboBoxGrupoMuscExercicio().requestFocus();
        } /*else if (equip.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o equipamento",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjComboBoxEquipamentoExercicio().requestFocus();
        }*/ else {
            //Execucao
            if (dao.editarExercicio(new Exercicios(Integer.parseInt(id), nome, grupoMusc))) {
                JOptionPane.showMessageDialog(null, "Exercício " + nome
                        + " Alterado com sucesso", "Editar exercício", JOptionPane.INFORMATION_MESSAGE);
            }
            telaPrincipal.getjTextFieldPesquisarExerc().setText("");
            listarExerc();
            exercicioInfo.dispose();
        }
    }

    private void removerExercicio() {
        JTable tabela = telaPrincipal.getjTableExercicio();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR O EXERCÍCIO: " + tabela.getValueAt(linha, 1));
            if (showConfirmDialog == 0) {
                if (dao.deletarExercicio(id)) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Exercício excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    telaPrincipal.getjTextFieldPesquisarExerc().setText("");
                    listarExerc();
                }
            }
        }
    }

    private void listarExerc(String pesquisa) {
        ArrayList<Exercicios> lista = dao.listarExercicios(pesquisa);

        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getGrupoMuscular()});
            }
        }
    }

    public void listaDadosComboBox() {
        telaPrincipal.getjComboBoxEquipamentoExercicio().removeAllItems();
        telaPrincipal.getjComboBoxEquipamentoExercicio().addItem("Selecione");

        ArrayList<Equipamento> list = equipDAO.listarEquipamentoComboBox();
        for (int i = 0; i < list.size(); i++) {
            telaPrincipal.getjComboBoxEquipamentoExercicio().addItem(list.get(i).getNome());
            exercicioInfo.getjComboBoxEquipamentoExercicio().addItem(list.get(i).getNome());
        }
    }
}

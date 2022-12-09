package Controller;

import Model.Equipamento;
import Model.EquipamentoDAO;
import Model.ExercEquip;
import Model.ExercEquipDAO;
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
    Util util = new Util();
    ExerciciosDAO dao = new ExerciciosDAO();
    EquipamentoDAO equipDAO = new EquipamentoDAO();
    ExercEquipDAO exercEquipDAO = new ExercEquipDAO();

    public ExercicioController(TelaPrincipal telaPrincipal, ExercicioInfo exercicioInfo) {
        this.telaPrincipal = telaPrincipal;
        this.exercicioInfo = exercicioInfo;
    }

    public void initExerciciosController() {
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
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeExercicio().requestFocus();
        } else if (grupoMusc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Grupo Muscular",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxGrupoMuscExercicio().requestFocus();
        } else {
            if (dao.inserirExercicio(new Exercicios(nome, grupoMusc))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Exercicio " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                telaPrincipal.limparCamposExerc();
            }
        }
        listarExerc();
    }

    private void listarExerc() {
        ArrayList<Exercicios> lista = dao.listarExercicios();
        ArrayList<ExercEquip> listaEquip = exercEquipDAO.listar();
        String equipamentos = "";
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < listaEquip.size(); j++) {
                    if (lista.get(i).getId() == listaEquip.get(j).getFkExerc()) {
                        equipamentos += "[" + listaEquip.get(j).getEquipamento().getNome() + "] ";
                    }
                }

                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getGrupoMuscular(),
                    equipamentos});
                equipamentos = "";
            }
            util.setColumnWidths(telaPrincipal.getjTableExercicio(), 40, 300, 130, 400);
        }
    }

    private void listarExerc(String pesquisa) {
        ArrayList<Exercicios> listaExerc = dao.listarExercicios(pesquisa);
        ArrayList<ExercEquip> listaEquip = exercEquipDAO.listar(pesquisa);
        String equipamentos = "";
        if (listaExerc != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
            modelo.setRowCount(0);

            for (int i = 0; i < listaExerc.size(); i++) {
                for (int j = 0; j < listaEquip.size(); j++) {
                    if (listaExerc.get(i).getId() == listaEquip.get(j).getFkExerc()) {
                        equipamentos += "[" + listaEquip.get(j).getEquipamento().getNome() + "] ";
                    }
                }
                modelo.addRow(new Object[]{
                    listaExerc.get(i).getId(),
                    listaExerc.get(i).getNome(),
                    listaExerc.get(i).getGrupoMuscular(),
                    equipamentos});
                equipamentos = "";
            }
            util.setColumnWidths(telaPrincipal.getjTableExercicio(), 40, 300, 130, 400);
        }
    }

    private void getExerc() {
        JTable tabela = telaPrincipal.getjTableExercicio();
        ArrayList<Equipamento> listEquip = equipDAO.listarEquipamento();
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
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(4);
            } else if ((grupMusc.equals("Bíceps"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(5);
            } else if ((grupMusc.equals("Tríceps"))) {
                exercicioInfo.getjComboBoxGrupoMuscExercicio().setSelectedIndex(6);
            }
            // AQUI VER
            exercicioInfo.getjComboBoxEquipamentoExercicio().removeAllItems();
            exercicioInfo.getjComboBoxEquipamentoExercicio().addItem("Selecione");
            for (int i = 0; i < listEquip.size(); i++) {
                if (listEquip.get(i).isDisponivel()) {
                    exercicioInfo.getjComboBoxEquipamentoExercicio().addItem(listEquip.get(i).getPatrimonio());
                }
            }
        }
    }

    //Edita equipamento selecionado na tabela
    private void editarExerc() {
        //Atribuicao de dados
        String exercId = exercicioInfo.getjLabelStoreExercID().getText();
        String nome = exercicioInfo.getjTextFieldNomeExerc().getText();
        String grupoMusc = String.valueOf(exercicioInfo.getjComboBoxGrupoMuscExercicio().getSelectedItem());
        String patrimonio = String.valueOf(exercicioInfo.getjComboBoxEquipamentoExercicio().getSelectedItem());
        if (patrimonio.equals("Selecione")) {
            JOptionPane.showMessageDialog(exercicioInfo, "Selecione o equipamento",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjComboBoxEquipamentoExercicio().requestFocus();
        } else {
            Equipamento equip = equipDAO.getEquipamento(patrimonio);
            //Validacao de dados
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(exercicioInfo, "O campo Nome é obrigatório",
                        "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                exercicioInfo.getjTextFieldNomeExerc().requestFocus();
            } else if (grupoMusc.equals("Selecione")) {
                JOptionPane.showMessageDialog(exercicioInfo, "Selecione o Grupo Muscular",
                        "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                exercicioInfo.getjComboBoxGrupoMuscExercicio().requestFocus();
            } else if (patrimonio.equals("Selecione")) {
                JOptionPane.showMessageDialog(exercicioInfo, "Selecione o equipamento",
                        "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                exercicioInfo.getjComboBoxEquipamentoExercicio().requestFocus();
            } else if (!equip.isDisponivel()) {
                JOptionPane.showMessageDialog(exercicioInfo, "Equipamento desativado",
                        "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
                exercicioInfo.getjComboBoxEquipamentoExercicio().requestFocus();
            } else {
                //Execucao               
                int equipID = equip.getId();
                Boolean vinculo = false;
                ArrayList<ExercEquip> listaEquip = exercEquipDAO.listar();
                for (int i = 0; i < listaEquip.size(); i++) {
                    if (listaEquip.get(i).getFkEquip() == equipID && listaEquip.get(i).getFkExerc() == Integer.parseInt(exercId)) {
                        vinculo = true;
                    }
                }
                if (!vinculo) {
                    if (dao.editarExercicio(new Exercicios(Integer.parseInt(exercId), nome, grupoMusc))) {
                        exercEquipDAO.cadastrar(Integer.parseInt(exercId), equipID);
                        JOptionPane.showMessageDialog(null, "Exercício " + nome
                                + " Alterado com sucesso", "Editar exercício", JOptionPane.INFORMATION_MESSAGE);
                        telaPrincipal.getjTextFieldPesquisarExerc().setText("");
                        listarExerc();
                        exercicioInfo.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Exercício já vinculado ao equipamento ", "Editar exercício", JOptionPane.ERROR_MESSAGE);
                }
            }
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
}

package Controller;

import Model.EquipamentoDAO;
import Model.Exercicios;
import Model.ExerciciosDAO;
import View.TelaPrincipal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ExercicioController {

    private final TelaPrincipal telaPrincipal;
    ExerciciosDAO dao = new ExerciciosDAO();

    public ExercicioController(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void initExerciciosController() {
        listaDadosComboBox();
        telaPrincipal.getjButtonSalvarExercicio().addActionListener(e -> cadastrarExerc());
        telaPrincipal.getjButtonListarEquipamento().addActionListener(e -> listarExerc());
        /*telaPrincipal.getjButtonPesquisarEquip().addActionListener(e -> listarEquip(telaPrincipal.getjTextFieldPesquisarEquip().getText()));
        telaPrincipal.getjButtonEditarEquip().addActionListener(e -> getEquipamento());
        equipInfo.getjButtonSalvarEditarFunc().addActionListener(e -> editarEquip());
        equipInfo.getjButtonCancelarFuncionario().addActionListener(e -> equipInfo.dispose());
        telaPrincipal.getjButtonDesativaEquip().addActionListener(e -> statusEquip(0));
        telaPrincipal.getjButtonAtivarEquipament().addActionListener(e -> statusEquip(1));
         */
    }

    private void cadastrarExerc() {
        String nome = telaPrincipal.getjTextFieldNomeExercicio().getText();
        String grupoMusc = String.valueOf(telaPrincipal.getjComboBoxGrupoMuscExercicio().getSelectedItem());
        String equip = String.valueOf(telaPrincipal.getjComboBoxEquipamentoExercicio().getSelectedItem());
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeExercicio().requestFocus();
        } 
        
        else if (grupoMusc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Grupo Muscular",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxGrupoMuscExercicio().requestFocus();
        } 
        
        else if (equip.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o equipamento",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxEquipamentoExercicio().requestFocus();
        } 
        
        else {
            if (dao.inserirExercicio(new Exercicios(nome, grupoMusc))){
                JOptionPane.showMessageDialog(telaPrincipal, "Exercicio " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void listarExerc() {
        ArrayList<Exercicios> lista = new ArrayList();
        DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
        modelo.setRowCount(0);

        for (Exercicios e : dao.listarExercicios()) {
            modelo.addRow(new Object[]{
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
                
            exercicioInfo.getjLabelStoreEquipID().setText(String.valueOf(id));
            exercicioInfo.getjTextFieldNomeExercicio().setText(exerc.getNome());
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
            
        }
    }
    
    
    //Edita equipamento selecionado na tabela
    private void editarExerc() {
        //Atribuicao de dados
        String id = exercicioInfo.getjLabelStoreExercID().getText();
        String nome = exercicioInfo.getjTextFieldNomeExercicio().getText();
        String grupoMusc = String.valueOf(exercicioInfo.getjComboBoxGrupoMuscExercicio().getSelectedItem());
        String equip = String.valueOf(exercicioInfo.getjComboBoxEquipamentoExercicio().getSelectedItem());

        //Validacao de dados
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjTextFieldNomeExercicio().requestFocus();
        } 
        
        else if (grupoMusc.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o Grupo Muscular",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjComboBoxGrupoMuscExercicio().requestFocus();
        } 
        
        else if (equip.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o equipamento",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            exercicioInfo.getjComboBoxEquipamentoExercicio().requestFocus();
        } else {
            //Execucao
            if (dao.editarExercicio(new Exercicios(Integer.parseInt(id), nome, grupoMusc))) {
                JOptionPane.showMessageDialog(null, "Funcionário " + nome
                        + " Alterado com sucesso", "Editar funcionário", JOptionPane.INFORMATION_MESSAGE);
            }
            telaPrincipal.getjTextFieldPesquisarExercicio().setText("");
            listarExerc();
            exercicioInfo.dispose();
        }
    }
    
    private void removerExercicio() {
        JTable tabela = telaPrincipal.getjTableExercicio();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR O EXERCíCIOS: " + tabela.getValueAt(linha, 1));
            if (showConfirmDialog == 0) {
                if (dao.deletarExercicio(id)) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Exercício excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    telaPrincipal.getjTextFieldPesquisarExercicio().setText("");
                    listarExerc();
                }
            }
        }
    }
    
    private void listarExerc(String pesquisa) {
        ArrayList<Exercicios> lista = dao.listarExercicios(pesquisa);
        
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableExercicio().getModel();
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getGrupoMuscular()});    
            }
        }
    }

    Vector<Integer> id_equip = new Vector<Integer>();

    public void listaDadosComboBox() {
        try {
            EquipamentoDAO equip = new EquipamentoDAO();
            ResultSet rs = equip.listarEquipamentoComboBox();

            while (rs.next()) {
                id_equip.addElement(rs.getInt(1));
                telaPrincipal.getjComboBoxEquipamentoExercicio().addItem(rs.getString(2));
            }
        } catch (Exception e) {
        }
    }
}

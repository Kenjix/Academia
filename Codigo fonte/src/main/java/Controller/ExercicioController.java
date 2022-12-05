package Controller;

import Model.EquipamentoDAO;
import Model.Exercicios;
import Model.ExerciciosDAO;
import View.TelaPrincipal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
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
    /*
    private void listarEquip(String pesquisa) {
        ArrayList<Equipamento> lista = dao.listarEquip(pesquisa);

        if (lista != null) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableAtivosEquipamento().getModel();
            DefaultTableModel modeloInativo = (DefaultTableModel) telaPrincipal.getjTableInativosEquipamento().getModel();
            modeloAtivo.setRowCount(0);
            modeloInativo.setRowCount(0);
            String aquisicao = "";

            for (int i = 0; i < lista.size(); i++) {
                aquisicao = lista.get(i).getDataAquisicao();
                if (lista.get(i).isDisponivel()) {
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getNome(),
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4)});
                } else if (!lista.get(i).isDisponivel()) {
                    modeloInativo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getNome(),
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4)});
                }
            }
        }
    }

    private void getEquipamento() {
        JTable tabela = telaPrincipal.getjTableAtivosEquipamento();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            try {
                SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
                int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
                Equipamento equip = dao.getEquipamento(id);
                Date dataAquisicao = formatoData.parse(equip.getDataAquisicao());
                if (equip.getDataAquisicao() != null) {
                    dataAquisicao = formatoData.parse(equip.getDataAquisicao());
                }
                equipInfo.getjLabelStoreEquipID().setText(String.valueOf(id));
                equipInfo.getjTextFieldNomeEquip().setText(equip.getNome());
                equipInfo.getjTextAreaEquip().setText(equip.getObservacoes());
                equipInfo.getjDateChooserAquisicaoEquip().setDate(dataAquisicao);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(equipInfo, "Erro ao adiquirir a data de aquisição",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Edita equipamento selecionado na tabela
    private void editarEquip() {
        //Atribuicao de dados
        String id = equipInfo.getjLabelStoreEquipID().getText();
        String nome = equipInfo.getjTextFieldNomeEquip().getText();
        String observacoes = equipInfo.getjTextAreaEquip().getText();
        String dataAquisicao = "";
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

        if (equipInfo.getjDateChooserAquisicaoEquip().getDate() != null) {
            dataAquisicao = formatoData.format(equipInfo.getjDateChooserAquisicaoEquip().getDate());
        }
        //Validacao de dados
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(equipInfo, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            equipInfo.getjTextFieldNomeEquip().requestFocus();
        } else if (dataAquisicao.isEmpty()) {
            JOptionPane.showMessageDialog(equipInfo, "O campo Data de Aquisição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            equipInfo.getjDateChooserAquisicaoEquip().requestFocus();

        } else {
            //Execucao
            if (dao.editarEquipamento(new Equipamento(Integer.parseInt(id), nome, dataAquisicao, observacoes))) {
                JOptionPane.showMessageDialog(null, "Funcionário " + nome
                        + " Alterado com sucesso", "Editar funcionário", JOptionPane.INFORMATION_MESSAGE);
            }
            telaPrincipal.getjTextFieldPesquisarFunc().setText("");
            listarEquip();
            equipInfo.dispose();
        }
    }

    //Ativa e desativa equipamentos
    private void statusEquip(int controle) {
        JTable tabelaAtivo = telaPrincipal.getjTableAtivosEquipamento();
        JTable tabelaDesabilitado = telaPrincipal.getjTableInativosEquipamento();
        int linhaAtivo = tabelaAtivo.getSelectedRow();
        int linhaDesabilitado = tabelaDesabilitado.getSelectedRow();

        if (linhaAtivo != -1 && controle == 0) {
            int id = Integer.parseInt(String.valueOf(tabelaAtivo.getValueAt(linhaAtivo, 0)));
            if (dao.statusEquip(id, false)) {
                JOptionPane.showMessageDialog(null, "Equipamento desativado com sucesso",
                        "Desativar Equipamento", JOptionPane.INFORMATION_MESSAGE);
                listarEquip();
            }
        } else if (linhaDesabilitado != -1 && controle == 1) {
            int id = Integer.parseInt(String.valueOf(tabelaDesabilitado.getValueAt(linhaDesabilitado, 0)));
            if (dao.statusEquip(id, true)) {
                JOptionPane.showMessageDialog(null, "Equipamento ativado com sucesso",
                        "Ativar Equipamento", JOptionPane.INFORMATION_MESSAGE);
                listarEquip();
            }
        }
    }
     */
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

package Controller;

import Model.Equipamento;
import Model.EquipamentoDAO;
import View.EquipInfo;
import View.TelaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EquipamentoController {

    private final TelaPrincipal telaPrincipal;
    private final EquipInfo equipInfo;
    EquipamentoDAO dao = new EquipamentoDAO();

    public EquipamentoController(TelaPrincipal telaPrincipal, EquipInfo equipInfo) {
        this.telaPrincipal = telaPrincipal;
        this.equipInfo = equipInfo;
    }

    public void initEquipamentoController() {
        telaPrincipal.getjButtonSalvarEquipamento().addActionListener(e -> cadastrarEquip());
        telaPrincipal.getjButtonListarEquipamento().addActionListener(e -> listarEquip());
        telaPrincipal.getjButtonPesquisarEquip().addActionListener(e -> listarEquip(telaPrincipal.getjTextFieldPesquisarEquip().getText()));
        telaPrincipal.getjButtonEditarEquip().addActionListener(e -> getEquipamento());
        equipInfo.getjButtonSalvarEditarFunc().addActionListener(e -> editarEquip());
        equipInfo.getjButtonCancelarFuncionario().addActionListener(e -> equipInfo.dispose());
        telaPrincipal.getjButtonDesativaEquip().addActionListener(e -> statusEquip(0));
        telaPrincipal.getjButtonAtivarEquipament().addActionListener(e -> statusEquip(1));
    }

    private void cadastrarEquip() {
        String nome = telaPrincipal.getjTextFieldNomeEquipamento().getText();
        String observacoes = telaPrincipal.getjTextAreaCadastroEquip().getText();
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        String dataAquisicao = "";
        if (telaPrincipal.getjDateChooserDataAquisicao().getDate() != null) {
            dataAquisicao = formatoData.format(telaPrincipal.getjDateChooserDataAquisicao().getDate());
        }
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeEquipamento().requestFocus();
        } else if (dataAquisicao.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Data de Aquisição é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjDateChooserDataAquisicao().requestFocus();
        } else {
            if (dao.inserirEquipamento(new Equipamento(nome, dataAquisicao, observacoes))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Equipamento " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                telaPrincipal.limparCamposEquip();
            }
        }
    }

    private void listarEquip() {
        ArrayList<Equipamento> lista = new ArrayList();
        lista = dao.listarEquipamento();
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
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4),
                        lista.get(i).getPatrimonio()});
                } else if (!lista.get(i).isDisponivel()) {
                    modeloInativo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getNome(),
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4),
                        lista.get(i).getPatrimonio()});
                }
            }
        }
    }

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
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4),
                        lista.get(i).getPatrimonio()});
                } else if (!lista.get(i).isDisponivel()) {
                    modeloInativo.addRow(new Object[]{
                        lista.get(i).getId(),
                        lista.get(i).getNome(),
                        aquisicao.substring(8, 10) + "/" + aquisicao.substring(5, 7) + "/" + aquisicao.substring(0, 4),
                        lista.get(i).getPatrimonio()});
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
}

package Controller;

import Model.Funcionario;
import Model.FuncionarioDAO;
import View.FuncionarioInfo;
import View.TelaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {

    private final TelaPrincipal telaPrincipal;
    private final FuncionarioInfo funcionarioInfo;
    FuncionarioDAO dao = new FuncionarioDAO();

    public FuncionarioController(TelaPrincipal telaPrincipal, FuncionarioInfo funcionarioInfo) {
        this.telaPrincipal = telaPrincipal;
        this.funcionarioInfo = funcionarioInfo;
    }

    public void initFuncionarioController() {
        telaPrincipal.getjButtonSalvarFuncio().addActionListener(e -> CadastrarFuncionario());
        telaPrincipal.getjButtonListarFuncio().addActionListener(e -> listarFuncionarios());
        telaPrincipal.getjButtonEditarFunc().addActionListener(e -> getFuncionario());
        telaPrincipal.getjButtonPesquisarFunc().addActionListener(e -> getFuncionario(telaPrincipal.getjTextFieldPesquisarFunc().getText()));
        telaPrincipal.getjButtonDeletarFunc().addActionListener(e -> removerFuncionario());
        funcionarioInfo.getjButtonSalvarEditarFunc().addActionListener(e -> editarFunc());
    }

    //Cadastra funcionario atraves dos dados dos campos
    private void CadastrarFuncionario() {
        String nome = telaPrincipal.getjTextFieldNomeFuncionario().getText();
        String cpf = String.valueOf(telaPrincipal.getjFormattedTextFieldCpfFuncionario().getValue());
        String dataNasc = "";
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        if (telaPrincipal.getjDateChooserDataNascFuncionario().getDate() != null) {
            dataNasc = formatoData.format(telaPrincipal.getjDateChooserDataNascFuncionario().getDate());
        }
        String peso = telaPrincipal.getjTextFieldPesoFuncionario().getText().replaceAll(",", ".");
        String altura = telaPrincipal.getjTextFieldAlturaFuncionario().getText().replaceAll(",", ".");
        String email = telaPrincipal.getjTextFieldEmailFuncionario().getText();
        String tel = String.valueOf(telaPrincipal.getjFormattedTextFieldTelFuncionario().getValue());
        String cel = String.valueOf(telaPrincipal.getjFormattedTextFieldCelFuncionario().getValue());
        String observacao = telaPrincipal.getjTextAreaObservaFuncionario().getText();
        String especialidade = telaPrincipal.getjTextFieldEspecialidadeFuncionario().getText();
        String turno = String.valueOf(telaPrincipal.getjComboBoxTurnoFuncionario().getSelectedItem());
        int cargaHoraria = 0;
        final boolean editValidCpf = telaPrincipal.getjFormattedTextFieldCpfFuncionario().isEditValid();
        final boolean editValidTel = telaPrincipal.getjFormattedTextFieldTel().isEditValid();
        final boolean editValidCel = telaPrincipal.getjFormattedTextFieldCel().isEditValid();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeFuncionario().requestFocus();
        } else if (!editValidCpf) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo CPF é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjFormattedTextFieldCpfFuncionario().requestFocus();
        } else if (dataNasc.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Data de Nascimento é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjDateChooserDataNascFuncionario().requestFocus();
        } else if (peso.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Peso é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldPesoFuncionario().requestFocus();
        } else if (!peso.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Dados de peso inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldPesoFuncionario().requestFocus();
        } else if (altura.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Altura é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldAlturaFuncionario().requestFocus();
        } else if (!altura.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Dados de altura inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
        } else if (!editValidTel && !editValidCel) {
            JOptionPane.showMessageDialog(telaPrincipal, "Contato obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjFormattedTextFieldTelFuncionario().requestFocus();
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo E-mail é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldEmailFuncionario().requestFocus();
        } else if (!validaEmail(email)) {
            JOptionPane.showMessageDialog(telaPrincipal, "E-mail inválido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldEmailFuncionario().requestFocus();
        } else if (especialidade.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Especialidade é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldEspecialidadeFuncionario().requestFocus();
        } else if (turno.equals("Selecione")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione o turno",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxTurnoFuncionario().requestFocus();
        } else if (!String.valueOf(telaPrincipal.getjComboBoxCargaHorariaFuncionario().getSelectedItem()).matches("[0-9]+")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Selecione a carga horária",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjComboBoxCargaHorariaFuncionario().requestFocus();
        } else {
            cargaHoraria = Integer.parseInt(String.valueOf(telaPrincipal.getjComboBoxCargaHorariaFuncionario().getSelectedItem()));
            if (dao.inserirFuncionario(new Funcionario(especialidade, turno,
                    cargaHoraria, Float.parseFloat(peso), Float.parseFloat(altura),
                    nome, dataNasc, cpf, tel, cel, email, observacao))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Funcionário " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                telaPrincipal.limparCamposFunc();
            }
        }
    }

    //Lista Funcinarios
    private void listarFuncionarios() {
        String contato = "";
        ArrayList<Funcionario> lista = dao.listarFuncionarios();

        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableAtivosFuncionario().getModel();
            modelo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);
                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 6) + "-" + cel.substring(6, 11);
                }
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    contato,
                    lista.get(i).getEspecialidade()});
            }
        }
    }

    //Busca funcionario por id
    private void getFuncionario() {
        JTable tabela = telaPrincipal.getjTableAtivosFuncionario();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            try {
                SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
                int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
                Funcionario func = dao.getFuncionario(id);
                Date dataNasc = formatoData.parse(func.getDataNasc());
                funcionarioInfo.getjLabelStoreFuncID().setText(String.valueOf(func.getId()));
                funcionarioInfo.getjTextFieldNome().setText(func.getNome());
                funcionarioInfo.getjDateChooserDataNasc().setDate(dataNasc);
                funcionarioInfo.getjFormattedTextFieldCpf().setText(func.getCpf());
                funcionarioInfo.getjTextFieldPeso().setText(String.valueOf(func.getPeso()));
                funcionarioInfo.getjTextFieldAltura().setText(String.valueOf(func.getAltura()));
                funcionarioInfo.getjTextFieldEmail().setText(func.getEmail());
                funcionarioInfo.getjFormattedTextFieldTel().setText(func.getTelefone());
                funcionarioInfo.getjFormattedTextFieldCel().setText(func.getCelular());
                funcionarioInfo.getjTextFieldEspecialidade().setText(func.getEspecialidade());
                funcionarioInfo.getjTextAreaObserva().setText(func.getObservacoes());
                String turno = func.getTurno();
                if (turno.equals("Manhã")) {
                    funcionarioInfo.getjComboBoxTurno().setSelectedIndex(1);
                } else if (turno.equals("Tarde")) {
                    funcionarioInfo.getjComboBoxTurno().setSelectedIndex(2);
                } else if ((turno.equals("Noite"))) {
                    funcionarioInfo.getjComboBoxTurno().setSelectedIndex(3);
                }
                int cargaHoraria = func.getCargaHoraria();
                if (cargaHoraria == 4) {
                    funcionarioInfo.getjComboBoxCargaHoraria().setSelectedIndex(1);
                } else if (cargaHoraria == 8) {
                    funcionarioInfo.getjComboBoxCargaHoraria().setSelectedIndex(2);
                } else if (cargaHoraria == 20) {
                    funcionarioInfo.getjComboBoxCargaHoraria().setSelectedIndex(3);
                } else if (cargaHoraria == 40) {
                    funcionarioInfo.getjComboBoxCargaHoraria().setSelectedIndex(4);
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(telaPrincipal, "Erro ao obter data de nascimento\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Busca funcionario por nome
    private void getFuncionario(String pesquisa) {
        ArrayList<Funcionario> lista = dao.listarFuncionarios(pesquisa);
        String contato = "";

        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableAtivosFuncionario().getModel();
            modelo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);
                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 6) + "-" + cel.substring(6, 11);
                }
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    contato,
                    lista.get(i).getEspecialidade()});
            }
        }
    }

    private void editarFunc() {
        //Atribuicao de dados
        String id = funcionarioInfo.getjLabelStoreFuncID().getText();
        String nome = funcionarioInfo.getjTextFieldNome().getText();
        String cpf = String.valueOf(funcionarioInfo.getjFormattedTextFieldCpf().getText());
        String peso = funcionarioInfo.getjTextFieldPeso().getText();
        String altura = funcionarioInfo.getjTextFieldAltura().getText();
        String email = funcionarioInfo.getjTextFieldEmail().getText();
        String tel = String.valueOf(funcionarioInfo.getjFormattedTextFieldTel().getValue());
        String cel = String.valueOf(funcionarioInfo.getjFormattedTextFieldCel().getValue());
        String observacao = funcionarioInfo.getjTextAreaObserva().getText();
        String cargaHoraria = String.valueOf(funcionarioInfo.getjComboBoxCargaHoraria().getSelectedItem());
        String turno = String.valueOf(funcionarioInfo.getjComboBoxTurno().getSelectedItem());
        String especialidade = funcionarioInfo.getjTextFieldEspecialidade().getText();
        String dataNasc = "";
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        if (funcionarioInfo.getjDateChooserDataNasc().getDate() != null) {
            dataNasc = formatoData.format(funcionarioInfo.getjDateChooserDataNasc().getDate());
        }

        //Validacao de dados
        final boolean editValidCpf = funcionarioInfo.getjFormattedTextFieldCpf().isEditValid();
        final boolean editValidTel = telaPrincipal.getjFormattedTextFieldTel().isEditValid();
        final boolean editValidCel = telaPrincipal.getjFormattedTextFieldCel().isEditValid();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldNome().requestFocus();
        } else if (!editValidCpf || cpf.isBlank()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo CPF é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjFormattedTextFieldCpf().requestFocus();
        } else if (dataNasc.isEmpty()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo Data de Nascimento é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjDateChooserDataNasc().requestFocus();
        } else if (peso.isEmpty()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo Peso é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldPeso().requestFocus();
        } else if (!peso.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(funcionarioInfo, "Dados de peso inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldPeso().requestFocus();
        } else if (altura.isEmpty()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo Altura é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldAltura().requestFocus();
        } else if (!altura.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(funcionarioInfo, "Dados de altura inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(funcionarioInfo, "O campo E-mail é obrigatporio",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldEmail().requestFocus();
        } else if (!validaEmail(email)) {
            JOptionPane.showMessageDialog(funcionarioInfo, "E-mail inválido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjTextFieldEmail().requestFocus();
        } else if (!editValidTel && !editValidCel) {
            JOptionPane.showMessageDialog(funcionarioInfo, "Contato obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            funcionarioInfo.getjFormattedTextFieldTel().requestFocus();
        } else {
            //Execucao
            if (dao.editarFuncionario(new Funcionario(especialidade, turno, Integer.parseInt(cargaHoraria), Integer.parseInt(id),
                    Float.parseFloat(peso), Float.parseFloat(altura), nome, dataNasc, cpf, tel, cel, email, observacao))) {
                JOptionPane.showMessageDialog(null, "Funcionário " + nome + " Alterado com sucesso", "Editar funcionário", JOptionPane.INFORMATION_MESSAGE);
            }
            telaPrincipal.getjTextFieldPesquisarFunc().setText("");
            listarFuncionarios();
            funcionarioInfo.dispose();
        }
    }

    private void removerFuncionario() {
        JTable tabela = telaPrincipal.getjTableListarFuncionario();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR O FUNCIONÁRIO: " + tabela.getValueAt(linha, 1));
            if (showConfirmDialog == 0) {
                if (dao.deletarFuncionario(id)) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Funcionário excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    telaPrincipal.getjTextFieldPesquisarFunc().setText("");
                    listarFuncionarios();
                }
            }
        }
    }

    //Valia String com padrao de email
    public boolean validaEmail(String email) {
        final Pattern VALIDA_EMAIL_REGEX
                = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALIDA_EMAIL_REGEX.matcher(email);
        return matcher.find();
    }

}

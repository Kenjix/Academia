package Controller;

import Model.Cliente;
import Model.ClienteDAO;
import Model.Funcionario;
import Model.FuncionarioDAO;
import View.ClienteInfo;
import View.TelaPrincipal;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {

    private final TelaPrincipal telaPrincipal;
    private final ClienteInfo clienteInfo;
    private String imgPath = ".\\src\\main\\resources\\img\\userplaceholder.png";
    FuncionarioDAO dao = new FuncionarioDAO();

    public FuncionarioController(TelaPrincipal telaPrincipal, ClienteInfo clienteInfo) {
        this.telaPrincipal = telaPrincipal;
        this.clienteInfo = clienteInfo;
    }

    public void initClienteController() {
        //telaPrincipal.getjButtonAdicionarFoto().addActionListener(e -> adicionaFotoCli());
        //telaPrincipal.getjButtonRemoverFoto().addActionListener(e -> RemoveFotoCli());
        telaPrincipal.getjButtonSalvarFuncionario().addActionListener(e -> CadastrarFuncionario());
        telaPrincipal.getjButtonListarFuncio().addActionListener(e -> listarFuncionarios());
        telaPrincipal.getjButtonListarFuncio().addActionListener(e -> listarFuncionarios());
        telaPrincipal.getjButtonVisuCompleFuncionario().addActionListener(e -> getFuncionario());
        //telaPrincipal.getjButtonPesquisarFuncionario().addActionListener(e -> getFuncionario(telaPrincipal.getjTextFieldPesquisarFuncionario().getText()));
    }

    //Cadastra cliente atraves dos dados dos campos
    private void CadastrarFuncionario() {
        String nome = telaPrincipal.getjTextFieldNome().getText();
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
        String cel = String.valueOf(telaPrincipal.getjFormattedTextFieldTelFuncionario().getValue());
        String observacao = telaPrincipal.getjTextAreaObservaFuncionario().getText();
        String especialidade = telaPrincipal.getjTextFieldEspecialidadeFuncionario().getText();
        String turno = telaPrincipal.getjComboBoxTurnoFuncionario().getSelectedItem().toString();
        //int cargaHoraria = telaPrincipal.getjComboBoxCargaHorariaFuncionario().getSelectedItem().toString();
        final boolean editValidCpf = telaPrincipal.getjFormattedTextFieldCpfFuncionario().isEditValid();

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
        } else if (!validaEmail(email)) {
            JOptionPane.showMessageDialog(telaPrincipal, "E-mail inválido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldEmailFuncionario().requestFocus();
        } else if (telaPrincipal.getjFormattedTextFieldTel().getValue() == null
                && telaPrincipal.getjFormattedTextFieldCel().getValue() == null) {
            JOptionPane.showMessageDialog(telaPrincipal, "Contato obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjFormattedTextFieldTel().requestFocus();
        } else {
            if (dao.inserirFuncionario(new Funcionario(especialidade, turno,
                    0, 0, Float.parseFloat(peso), Float.parseFloat(altura),
                    nome, dataNasc, cpf, tel, cel, email, observacao))) {
                JOptionPane.showMessageDialog(telaPrincipal, "Usuário " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
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
                    contato = lista.get(i).getTelefone();
                } else if (!lista.get(i).getCelular().contains("null")) {
                    contato = lista.get(i).getCelular();
                }
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getCpf(),
                    contato,
                    lista.get(i).getEmail()});
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

//                funcionarioInfo.getjTextFieldFuncionarioNome().setText(func.getNome());
//                funcionarioInfo.getjDateChooserFuncionarioDataNasc().setDate(dataNasc);
//                funcionarioInfo.getjFormattedTextFieldFuncionarioCpf().setText(func.getCpf());
//                funcionarioInfo.getjTextFieldClienteFuncionarioPeso().setText(String.valueOf(func.getPeso()));
//                funcionarioInfo.getjTextFieldClienteFuncionarioAltura().setText(String.valueOf(func.getAltura()));
//                funcionarioInfo.getjTextFieldClienteFuncionarioEmail().setText(func.getEmail());
//                funcionarioInfo.getjFormattedTextFieldFuncionarioTel().setText(func.getTelefone());
//                funcionarioInfo.getjFormattedTextFieldFuncionarioCel().setText(func.getCelular());
//                funcionarioInfo.getjTextAreaFuncionarioObservacoes().setText(func.getObservacoes());
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
                    contato = lista.get(i).getTelefone();
                } else if (!lista.get(i).getCelular().contains("null")) {
                    contato = lista.get(i).getCelular();
                }
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getCpf(),
                    contato,
                    lista.get(i).getEmail()});
            }
        }

    }

    //Insere foto no label do frame principal
    private void adicionaFotoFun() {
        JFileChooser fc = new JFileChooser("./");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos jpg, png", "jpg", "png");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(filter);
        fc.setDialogTitle("Selecione da foto:");

        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            imgPath = fc.getSelectedFile().toString();
            try {
                InputStream is = new BufferedInputStream(new FileInputStream(imgPath));
                Image image = ImageIO.read(is);
                telaPrincipal.getjLabelFoto().setIcon(new ImageIcon(image));
                is.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar a imagem\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Remover foto do label do frame principal
    private void RemoveFotoFun() {
        imgPath = ".\\src\\main\\resources\\img\\userplaceholder.png";
        telaPrincipal.getjLabelFoto().setIcon(null);
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(imgPath));
            Image image = ImageIO.read(is);
            telaPrincipal.getjLabelFoto().setIcon(new ImageIcon(image));
            is.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar a imagem\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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

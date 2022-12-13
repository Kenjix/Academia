package Controller;

import Model.Cliente;
import Model.ClienteDAO;
import View.ClienteInfo;
import View.TelaPrincipal;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ClienteController {

    private final TelaPrincipal telaPrincipal;
    private final ClienteInfo clienteInfo;
    Util util = new Util();
    ClienteDAO dao = new ClienteDAO();

    public ClienteController(TelaPrincipal telaPrincipal, ClienteInfo clienteInfo) {
        this.telaPrincipal = telaPrincipal;
        this.clienteInfo = clienteInfo;
    }

    public void initClienteController() {
        telaPrincipal.getjButtonAdicionarFoto().addActionListener(e -> adicionaFotoCli(0));
        telaPrincipal.getjButtonRemoverFoto().addActionListener(e -> removeFotoCli());
        telaPrincipal.getjButtonSalvarCliente().addActionListener(e -> CadastrarCliente());
        telaPrincipal.getjButtonListarCliente().addActionListener(e -> listarClientes(0));
        telaPrincipal.getjButtonEditarCliente().addActionListener(e -> getCliente());
        telaPrincipal.getjButtonPesquisarCliente().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarCliente().getText(), 0));
        telaPrincipal.getjButtonPesquisarClienteDel().addActionListener(e -> listarClientes(telaPrincipal.getjTextFieldPesquisarClienteDel().getText(), 1));
        telaPrincipal.getjButtonAtualizar().addActionListener(e -> listarClientes(0));
        telaPrincipal.getjButtonAtivarCliente().addActionListener(e -> ativarCliente());
        telaPrincipal.getjButtonDelCliente().addActionListener(e -> removerCliente());
        telaPrincipal.getjButtonDeletarCliente().addActionListener(e -> listarClientes(1));
        clienteInfo.getjButtonSalvar().addActionListener(e -> editarCliente());
        clienteInfo.getjButtonAdicionarFotoCliEdit().addActionListener(e -> adicionaFotoCli(1));
        clienteInfo.getjButtonRemoverFotoCliEdit().addActionListener(e -> removeFotoCli());
    }

    //Cadastra cliente atraves dos dados dos campos
    private void CadastrarCliente() {
        String nome = telaPrincipal.getjTextFieldNome().getText();
        String cpf = String.valueOf(telaPrincipal.getjFormattedTextFieldCpf().getValue());
        String dataNasc = "";
        String dataMatricula = "";
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        if (telaPrincipal.getjDateChooserDataNasc().getDate() != null) {
            dataNasc = formatoData.format(telaPrincipal.getjDateChooserDataNasc().getDate());
        }
        if (telaPrincipal.getjDateChooserMatricula().getDate() != null) {
            dataMatricula = formatoData.format(telaPrincipal.getjDateChooserMatricula().getDate());
        }
        String peso = telaPrincipal.getjTextFieldPeso().getText().replaceAll(",", ".");
        String altura = telaPrincipal.getjTextFieldAltura().getText().replaceAll(",", ".");
        String email = telaPrincipal.getjTextFieldEmail().getText();
        String tel = String.valueOf(telaPrincipal.getjFormattedTextFieldTel().getValue()).trim();
        String cel = String.valueOf(telaPrincipal.getjFormattedTextFieldCel().getValue()).trim();
        String objetivo = telaPrincipal.getjTextFieldObjetivo().getText();
        String observacao = telaPrincipal.getjTextAreaObserv().getText();
        final boolean editValidCpf = telaPrincipal.getjFormattedTextFieldCpf().isEditValid();
        String path = util.getImage(telaPrincipal.getjLabelFoto().getIcon());
        byte[] foto = null;

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNome().requestFocus();
        } else if (!editValidCpf) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo CPF é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjFormattedTextFieldCpf().requestFocus();
        } else if (dataNasc.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Data de Nascimento é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjDateChooserDataNasc().requestFocus();
        } else if (peso.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Peso é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldPeso().requestFocus();
        } else if (!peso.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Dados de peso inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldPeso().requestFocus();
        } else if (altura.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Altura é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldAltura().requestFocus();
        } else if (!altura.matches("^[0-9]{1,3}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Dados de altura inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
        } else if (dataMatricula.isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "O campo Data de Matrícula é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjDateChooserMatricula().requestFocus();
        } else if (!util.validaEmail(email)) {
            JOptionPane.showMessageDialog(telaPrincipal, "E-mail inválido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldEmail().requestFocus();
        } else if (tel.contains("null") && cel.contains("null")) {
            JOptionPane.showMessageDialog(telaPrincipal, "Contato obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjFormattedTextFieldTel().requestFocus();
        } else {
            if (dao.inserirCliente(new Cliente(dataMatricula, foto, objetivo,
                    Float.parseFloat(peso), Float.parseFloat(altura), nome,
                    dataNasc, cpf, tel, cel, email, observacao), path)) {
                JOptionPane.showMessageDialog(telaPrincipal, "Usuário " + nome
                        + " Cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                telaPrincipal.limparCamposCliente();
                File f = new File(path);
                f.delete();
                removeFotoCli();
            }
        }
    }

    //Lista clientes Ativos e invativos na tabela
    private void listarClientes(int controle) {
        ArrayList<Cliente> lista = new ArrayList();
        String contato = "";
        lista = dao.listarClientes();
        if (lista != null && controle == 0) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableAtivosCliente().getModel();
            DefaultTableModel modeloInativo = (DefaultTableModel) telaPrincipal.getjTableInativosCliente().getModel();
            modeloAtivo.setRowCount(0);
            modeloInativo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);

                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 7) + "-" + cel.substring(7, 11);
                }
                if (lista.get(i).isAtivo()) {
                    String cpf = lista.get(i).getCpf();
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                        contato,
                        lista.get(i).getEmail()});
                } else {
                    String cpf = lista.get(i).getCpf();
                    modeloInativo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                        contato,
                        lista.get(i).getEmail()});
                }
            }
        } else if (lista != null && controle == 1) {
            DefaultTableModel modelodeletar = (DefaultTableModel) telaPrincipal.getjTableDeletar().getModel();
            modelodeletar.setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);
                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 7) + "-" + cel.substring(7, 11);
                }
                String cpf = lista.get(i).getCpf();
                modelodeletar.addRow(new Object[]{
                    lista.get(i).getMatricula(),
                    lista.get(i).getNome(),
                    cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                    contato,
                    lista.get(i).getEmail()});
            }
        }
    }

    //Busca cliente por nome
    private void listarClientes(String pesquisa, int controle) {
        ArrayList<Cliente> lista = new ArrayList();
        String contato = "";
        lista = dao.listarClientes(pesquisa);
        if (lista != null && controle == 0) {
            DefaultTableModel modeloAtivo = (DefaultTableModel) telaPrincipal.getjTableAtivosCliente().getModel();
            DefaultTableModel modeloInativo = (DefaultTableModel) telaPrincipal.getjTableInativosCliente().getModel();
            modeloAtivo.setRowCount(0);
            modeloInativo.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);
                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 7) + "-" + cel.substring(7, 11);
                }

                if (lista.get(i).isAtivo()) {
                    String cpf = lista.get(i).getCpf();
                    modeloAtivo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                        contato,
                        lista.get(i).getEmail()});
                } else {
                    String cpf = lista.get(i).getCpf();
                    modeloInativo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                        contato,
                        lista.get(i).getEmail()});
                }
            }
        } else if (lista != null && controle == 1) {
            DefaultTableModel modeloDeletar = (DefaultTableModel) telaPrincipal.getjTableDeletar().getModel();
            modeloDeletar.setRowCount(0);
            for (int i = 0; i < lista.size(); i++) {
                contato = "";
                if (!lista.get(i).getTelefone().contains("null")) {
                    String tel = lista.get(i).getTelefone();
                    contato = "(" + tel.substring(0, 2) + ")" + tel.substring(2, 6) + "-" + tel.substring(6, 10);
                } else if (!lista.get(i).getCelular().contains("null")) {
                    String cel = lista.get(i).getCelular();
                    contato = "(" + cel.substring(0, 2) + ")" + cel.substring(2, 7) + "-" + cel.substring(7, 11);
                }
                String cpf = lista.get(i).getCpf();
                modeloDeletar.addRow(new Object[]{
                    lista.get(i).getMatricula(),
                    lista.get(i).getNome(),
                    cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11),
                    contato,
                    lista.get(i).getEmail()});
            }
        }
    }

    //Busca cliente por matricula
    private void getCliente() {
        JTable tabela = telaPrincipal.getjTableAtivosCliente();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            try {
                SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
                long matricula = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
                Cliente cli = dao.getCliente(matricula);
                clienteInfo.getjLabelStoreID().setText(String.valueOf(cli.getId()));
                Date dataNasc = formatoData.parse(cli.getDataNasc());
                Date dataMatricula = formatoData.parse(cli.getDataInicio());
                Date dataFimMatricula = null;
                if (cli.getDataFim() != null) {
                    dataFimMatricula = formatoData.parse(cli.getDataFim());
                }
                if(cli.getFoto() != null){
                    clienteInfo.getjLabelClienteFoto().setIcon(new ImageIcon(cli.getFoto()));
                }                
                clienteInfo.getjTextFieldClienteNome().setText(cli.getNome());
                clienteInfo.getjDateChooserDataNasc().setDate(dataNasc);
                clienteInfo.getjDateChooserDataMatricula().setDate(dataMatricula);
                clienteInfo.getjDateChooserEncerraMatricula().setDate(dataFimMatricula);
                clienteInfo.getjFormattedTextFieldCpf().setText(cli.getCpf());
                clienteInfo.getjTextFieldClientePeso().setText(String.valueOf(cli.getPeso()));
                clienteInfo.getjTextFieldClienteAltura().setText(String.valueOf(cli.getAltura()));
                clienteInfo.getjTextFieldClienteEmail().setText(cli.getEmail());
                clienteInfo.getjFormattedTextFieldTel().setText(cli.getTelefone());
                clienteInfo.getjFormattedTextFieldCel().setText(cli.getCelular());
                clienteInfo.getjTextFieldClienteMatricula().setText(String.valueOf(cli.getMatricula()));
                clienteInfo.getjTextFieldClienteObjetivo().setText(cli.getObjetivo());
                clienteInfo.getjTextAreaObservacoes().setText(cli.getObservacoes());
                if (cli.isAtivo()) {
                    clienteInfo.getjRadioButtonAtivo().setSelected(true);
                } else {
                    clienteInfo.getjRadioButtonInativo().setSelected(true);
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(telaPrincipal, "Erro ao obter data de nascimento\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Edita dados de cliente
    private void editarCliente() {
        //Atribuicao de dados        
        String id = clienteInfo.getjLabelStoreID().getText();
        String nome = clienteInfo.getjTextFieldClienteNome().getText();
        String cpf = String.valueOf(clienteInfo.getjFormattedTextFieldCpf().getText());
        String peso = clienteInfo.getjTextFieldClientePeso().getText();
        String altura = clienteInfo.getjTextFieldClienteAltura().getText();
        String email = clienteInfo.getjTextFieldClienteEmail().getText();
        String tel = String.valueOf(clienteInfo.getjFormattedTextFieldTel().getValue()).trim();
        String cel = String.valueOf(clienteInfo.getjFormattedTextFieldCel().getValue()).trim();
        String objetivo = clienteInfo.getjTextFieldClienteObjetivo().getText();
        String observacao = clienteInfo.getjTextAreaObservacoes().getText();
        boolean ativo = clienteInfo.getjRadioButtonAtivo().isSelected();
        byte[] foto = null;
        String dataNasc = "";
        String dataFimMatricula = "";
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        if (clienteInfo.getjDateChooserDataNasc().getDate() != null) {
            dataNasc = formatoData.format(clienteInfo.getjDateChooserDataNasc().getDate());
        }
        if (clienteInfo.getjDateChooserEncerraMatricula().getDate() != null) {
            dataFimMatricula = formatoData.format(clienteInfo.getjDateChooserEncerraMatricula().getDate());
        }

        //Validacao de dados
        final boolean editValidCpf = clienteInfo.getjFormattedTextFieldCpf().isEditValid();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo Nome é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjTextFieldClienteNome().requestFocus();
        } else if (!editValidCpf || cpf.isBlank()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo CPF é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjFormattedTextFieldCpf().requestFocus();
        } else if (dataNasc.isEmpty()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo Data de Nascimento é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjDateChooserDataNascEdit().requestFocus();
        } else if (dataFimMatricula.isEmpty()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo Data de Encerramento de matrícula é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjDateChooserEncerraMatricula().requestFocus();
        } else if (peso.isEmpty()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo Peso é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjTextFieldClientePeso().requestFocus();
        } else if (!peso.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(clienteInfo, "Dados de peso inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjTextFieldClientePeso().requestFocus();
        } else if (altura.isEmpty()) {
            JOptionPane.showMessageDialog(clienteInfo, "O campo Altura é obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjTextFieldClienteAltura().requestFocus();
        } else if (!altura.matches("^[0-9]{1,2}([,.][0-9]{1,2})?$")) {
            JOptionPane.showMessageDialog(clienteInfo, "Dados de altura inválidos",
                    "Campo inválido", JOptionPane.ERROR_MESSAGE);
        } else if (!util.validaEmail(email)) {
            JOptionPane.showMessageDialog(clienteInfo, "E-mail inválido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjTextFieldClienteEmail().requestFocus();
        } else if (tel.contains("null") && cel.contains("null")) {
            JOptionPane.showMessageDialog(clienteInfo, "Contato obrigatório",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            clienteInfo.getjFormattedTextFieldTel().requestFocus();
        } else {
            //Execucao
            String path = util.getImage(clienteInfo.getjLabelClienteFotoEdit().getIcon());
            if (dao.editarCliente(new Cliente(dataFimMatricula, ativo, foto, objetivo, Integer.parseInt(id),
                    Float.parseFloat(peso), Float.parseFloat(altura), nome, dataNasc,
                    cpf, tel, cel, email, observacao), path)) {
                JOptionPane.showMessageDialog(null, "Usuário " + nome + " Alterado com sucesso", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
            listarClientes(0);
            File f = new File(path);
            f.delete();
            clienteInfo.dispose();
        }
    }



    //Ativa um cliente selecionado da tabela
    private void ativarCliente() {
        JTable tabela = telaPrincipal.getjTableInativosCliente();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            long matricula = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            dao.ativarCliente(matricula);
            listarClientes(0);
        }
    }

    //Insere foto do cliente no label do frame principal
    private void adicionaFotoCli(int controle) {
        JFileChooser fc = new JFileChooser("./");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos jpg, png", "jpg", "png");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(filter);
        fc.setDialogTitle("Selecione da foto:");

        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            String imgPath = fc.getSelectedFile().toString();
            try {
                InputStream is = new BufferedInputStream(new FileInputStream(imgPath));
                Image image = ImageIO.read(is);
                if (controle == 0) {
                    telaPrincipal.getjLabelFoto().setIcon(new ImageIcon(image));
                } else if (controle == 1) {
                    clienteInfo.getjLabelClienteFotoEdit().setIcon(new ImageIcon(image));
                }
                is.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar a imagem\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Remover foto docliente no label do frame principal
    private void removeFotoCli() {
        telaPrincipal.getjLabelFoto().setIcon(null);
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(".\\src\\main\\resources\\img\\userplaceholder.png"));
            Image image = ImageIO.read(is);
            telaPrincipal.getjLabelFoto().setIcon(new ImageIcon(image));
            clienteInfo.getjLabelClienteFotoEdit().setIcon(new ImageIcon(image));
            is.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar a imagem\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removerCliente() {
        JTable tabela = telaPrincipal.getjTableDeletar();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            long matricula = Integer.parseInt(String.valueOf(tabela.getValueAt(linha, 0)));
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR O CLIENTE: " + tabela.getValueAt(linha, 1));
            if (showConfirmDialog == 0) {
                if (dao.deletarCliente(matricula)) {
                    JOptionPane.showMessageDialog(telaPrincipal, "Cliente excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    listarClientes(1);
                }
            }
        }
    }

}

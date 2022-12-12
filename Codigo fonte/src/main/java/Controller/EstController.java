package Controller;

import Model.Estabelecimento;
import View.TelaPrincipal;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EstController {

    private final TelaPrincipal telaPrincipal;
    EstDAO estDAO = new EstDAO();
    Util util = new Util();

    public EstController(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        carregaDados();
    }

    public void initEstController() {
        telaPrincipal.getjButtonCarregarLogo().addActionListener(e -> carregarLogoEst());
        telaPrincipal.getjButtonEnviarDados().addActionListener(e -> enviarDados());
    }

    private void enviarDados() {
        if (telaPrincipal.getjTextFieldNomeEst().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "Nome não foi preenchido",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldNomeEst().requestFocus();
        } else if (telaPrincipal.getjTextFieldDescEst().getText().isEmpty()) {
            JOptionPane.showMessageDialog(telaPrincipal, "A descrição não foi preechida",
                    "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
            telaPrincipal.getjTextFieldDescEst().requestFocus();
        } else {
            String nome = telaPrincipal.getjTextFieldNomeEst().getText();
            String descricao = telaPrincipal.getjTextFieldDescEst().getText();
            String imgPath = telaPrincipal.getjTextFieldLogoEst().getText();

            if (estDAO.inserirDados(nome, descricao, imgPath)) {
                JOptionPane.showMessageDialog(telaPrincipal, "Configurações enviadas"
                        + " com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        carregaDados();
    }

    private void carregaDados() {
        ArrayList<Estabelecimento> list = estDAO.getConfig();
        telaPrincipal.getjLabelEstNome().setText(list.get(0).getNome());
        telaPrincipal.getjLabelEstDesc().setText(list.get(0).getDescricao());
        telaPrincipal.getjLabelLogo().setIcon(new ImageIcon(list.get(0).getLogo()));

    }

    private void carregarLogoEst() {
        JFileChooser fc = new JFileChooser("./");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos jpg, png", "jpg", "png");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(filter);
        fc.setDialogTitle("Selecione o logo:");
        String imgPath = "";
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            imgPath = fc.getSelectedFile().toString();
            try {
                InputStream is = new BufferedInputStream(new FileInputStream(imgPath));
                Image image = ImageIO.read(is);
                imgPath = util.getImage(new ImageIcon(image));
                telaPrincipal.getjTextFieldLogoEst().setText(imgPath);
                telaPrincipal.getjLabelLogo().setIcon(new ImageIcon(image));
                is.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(telaPrincipal, "Erro ao carregar a imagem\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

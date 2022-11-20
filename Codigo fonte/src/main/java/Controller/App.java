package Controller;

import View.CadastrarClienteModal;
import View.TelaPrincipal;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        carregarTema();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        CadastrarClienteModal cadastrarClienteModal = new CadastrarClienteModal((JFrame) null, true);

        Controller c = new Controller(telaPrincipal, cadastrarClienteModal);
        c.initController();

    }

    private static void carregarTema() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Falha ao iniciair tema da interface");
        }
    }
}

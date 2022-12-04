package Controller;

import View.ClienteInfo;
import View.TelaPrincipal;
import javax.swing.JFrame;

import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        carregarTema();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        ClienteInfo clienteInfo = new ClienteInfo((JFrame) null, true);

        Controller c = new Controller(telaPrincipal, clienteInfo);
        c.initController();

        ClienteController cli = new ClienteController(telaPrincipal, clienteInfo);
        cli.initClienteController();
    }

    private static void carregarTema() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Falha ao iniciair tema da interface");
        }
    }
}

package Controller;


import View.ClienteInfo;
import View.FuncionarioInfo;
import View.TelaPrincipal;
import javax.swing.JFrame;

import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        carregarTema();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        ClienteInfo clienteInfo = new ClienteInfo((JFrame) null, true);
        FuncionarioInfo funcionarioInfo = new FuncionarioInfo((JFrame) null, true);

        Controller c = new Controller(telaPrincipal, clienteInfo, funcionarioInfo);
        c.initController();

        ClienteController cli = new ClienteController(telaPrincipal, clienteInfo);
        cli.initClienteController();
        
        FuncionarioController fun = new FuncionarioController(telaPrincipal, funcionarioInfo);
        fun.initFuncionarioController();
    }

    private static void carregarTema() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Falha ao iniciair tema da interface");
        }
    }
}

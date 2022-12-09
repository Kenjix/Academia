package Controller;


import View.ClienteInfo;
import View.EquipInfo;
import View.ExercicioInfo;
import View.FuncionarioInfo;
import View.TelaPrincipal;
import View.TreinoInfo;
import javax.swing.JFrame;

import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        carregarTema();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        ClienteInfo clienteInfo = new ClienteInfo((JFrame) null, true);
        FuncionarioInfo funcionarioInfo = new FuncionarioInfo((JFrame) null, true);
        EquipInfo equipInfo = new EquipInfo((JFrame) null, true);
        ExercicioInfo exercicioInfo = new ExercicioInfo((JFrame) null, true);
        TreinoInfo treinoInfo = new TreinoInfo((JFrame) null, true);

        Controller c = new Controller(telaPrincipal, clienteInfo, funcionarioInfo, equipInfo, exercicioInfo, treinoInfo);
        c.initController();

        ClienteController cli = new ClienteController(telaPrincipal, clienteInfo);
        cli.initClienteController();
        
        FuncionarioController fun = new FuncionarioController(telaPrincipal, funcionarioInfo);
        fun.initFuncionarioController();
        
        EquipamentoController equip = new EquipamentoController(telaPrincipal, equipInfo);
        equip.initEquipamentoController();
        
        ExercicioController exerc = new ExercicioController(telaPrincipal, exercicioInfo);
        exerc.initExerciciosController();
        
        TreinoController treino = new TreinoController(telaPrincipal, treinoInfo);
        treino.initTreinoController();
    }

    private static void carregarTema() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Falha ao iniciair tema da interface");
        }
    }
}

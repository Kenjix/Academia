package Controller;

import View.ClienteInfo;
import View.EquipInfo;
import View.ExercicioInfo;
import View.FuncionarioInfo;
import View.TelaPrincipal;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controller {

    private final TelaPrincipal telaPrincipal;
    private final ClienteInfo clienteInfo;
    private final FuncionarioInfo funcionarioInfo;
    private final EquipInfo equipInfo;
    private final ExercicioInfo exercicioInfo;

    public Controller(TelaPrincipal telaPrincipal, ClienteInfo clienteInfo, FuncionarioInfo funcionarioInfo, EquipInfo equipInfo, ExercicioInfo exercicioInfo) {
        this.telaPrincipal = telaPrincipal;
        this.clienteInfo = clienteInfo;
        this.funcionarioInfo = funcionarioInfo;
        this.equipInfo = equipInfo;
        this.exercicioInfo = exercicioInfo;
    }

    public void initController() {
        telaPrincipal.setVisible(true);
        telaPrincipal.getjButtonCadastrarCliente().addActionListener(e -> exibeTela(telaPrincipal.getCRUDClient(), telaPrincipal.getCadCliente()));
        telaPrincipal.getjButtonListarCliente().addActionListener(e -> exibeTela(telaPrincipal.getCRUDClient(), telaPrincipal.getListCliente()));
        telaPrincipal.getjButtonDeletarCliente().addActionListener(e -> exibeTela(telaPrincipal.getCRUDClient(), telaPrincipal.getDelCliente()));

        telaPrincipal.getjButtonCadastrarFuncio().addActionListener(e -> exibeTela(telaPrincipal.getCRUDFuncio(), telaPrincipal.getCadFuncio()));
        telaPrincipal.getjButtonListarFuncio().addActionListener(e -> exibeTela(telaPrincipal.getCRUDFuncio(), telaPrincipal.getListFuncio()));

        telaPrincipal.getjButtonCadastrarEquipamento().addActionListener(e -> exibeTela(telaPrincipal.getCRUDEquipa(), telaPrincipal.getCadEquipa()));
        telaPrincipal.getjButtonListarEquipamento().addActionListener(e -> exibeTela(telaPrincipal.getCRUDEquipa(), telaPrincipal.getListEquipa()));

        telaPrincipal.getjButtonCadastrarExercicio().addActionListener(e -> exibeTela(telaPrincipal.getCRUDExerc(), telaPrincipal.getCadExerc()));
        telaPrincipal.getjButtonListarExercicio().addActionListener(e -> exibeTela(telaPrincipal.getCRUDExerc(), telaPrincipal.getListExerc()));

        telaPrincipal.getjButtonCadastrarTreino().addActionListener(e -> exibeTela(telaPrincipal.getCRUDTreino(), telaPrincipal.getCadTreino()));
        telaPrincipal.getjButtonListarTreino().addActionListener(e -> exibeTela(telaPrincipal.getCRUDTreino(), telaPrincipal.getListTreino()));

        telaPrincipal.getjButtonEditarCliente().addActionListener(e -> exibeCliente());
        telaPrincipal.getjButtonEditarFunc().addActionListener(e -> exibeFuncionario());        
        telaPrincipal.getjButtonEditarEquip().addActionListener(e -> exibeEquip());
        telaPrincipal.getjButtonEditarExerc().addActionListener(e -> exibeExerc());
    }

    private void exibeTela(JPanel panel, JPanel navegacao) {
        panel.removeAll();
        panel.add(navegacao);
        panel.repaint();
        panel.revalidate();
    }

    private void exibeCliente() {
        if (telaPrincipal.getjTableAtivosCliente().getSelectedRow() != -1) {
            clienteInfo.setLocationRelativeTo(telaPrincipal);
            clienteInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            clienteInfo.setVisible(true);
        }
    }

    private void exibeFuncionario() {
        if (telaPrincipal.getjTableAtivosFuncionario().getSelectedRow() != -1) {
            funcionarioInfo.setLocationRelativeTo(telaPrincipal);
            funcionarioInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            funcionarioInfo.setVisible(true);
        }
    }

    private void exibeEquip() {
        if (telaPrincipal.getjTableAtivosEquipamento().getSelectedRow() != -1) {
            equipInfo.setLocationRelativeTo(telaPrincipal);
            equipInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            equipInfo.setVisible(true);
        }
    }
    
    private void exibeExerc() {
        if (telaPrincipal.getjTableExercicio().getSelectedRow() != -1) {
            exercicioInfo.setLocationRelativeTo(telaPrincipal);
            exercicioInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            exercicioInfo.setVisible(true);
        }
    }
}

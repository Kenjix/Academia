package Controller;

import View.CadastrarClienteModal;
import View.TelaPrincipal;
import javax.swing.JFrame;

public class Controller {

    private final TelaPrincipal telaPrincipal;
    private final CadastrarClienteModal cadastrarClienteModal;

    public Controller(TelaPrincipal telaPrincipal, CadastrarClienteModal cadastrarClienteModal) {
        this.telaPrincipal = telaPrincipal;
        this.cadastrarClienteModal = cadastrarClienteModal;
    }


    public void initController() {
        telaPrincipal.setVisible(true);
        telaPrincipal.getjButtonCadastrarCliente().addActionListener(e -> exibeCadastroCiente(telaPrincipal));
    }
    
    private void exibeCadastroCiente(JFrame tela){
            cadastrarClienteModal.setLocationRelativeTo(tela);
            cadastrarClienteModal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastrarClienteModal.setVisible(true);
    }

}

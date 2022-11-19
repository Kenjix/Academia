package Controller;

import View.TelaPrincipal;

public class Controller {

    private final TelaPrincipal telaPrincipal;

    public Controller(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void initController() {
        telaPrincipal.setVisible(true);
    }

}

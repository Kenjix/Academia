package Controller;

import View.TelaPrincipal;

public class App {

    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();

        Controller c = new Controller(telaPrincipal);
        c.initController();
    }
}

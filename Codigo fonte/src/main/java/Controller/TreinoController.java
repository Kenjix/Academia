package Controller;

import Model.Cliente;
import Model.ClienteDAO;
import View.TelaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class TreinoController {

    private final TelaPrincipal telaPrincipal;
    Util util = new Util();
    ClienteDAO daoCliente = new ClienteDAO();

    public TreinoController(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void initTreinoController() {
        telaPrincipal.getjButtonCadastrarTreino().addActionListener(e -> listarClientes());
        telaPrincipal.getjButtonPesquisarTreinoCli().addActionListener(e ->listarClientes(telaPrincipal.getjTextFieldPesquisarTreinoCli().getText()));

    }

    private void cadastrarTreino() {

    }

    private void listarClientes() {
        ArrayList<Cliente> lista = daoCliente.listarClientes();
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
                //util.setColumnWidths(telaPrincipal.getjTableTreinoClientes(), 40, 300, 130, 400);
            }
        }
    }

    private void listarClientes(String pesquisa) {
        ArrayList<Cliente> lista = daoCliente.listarClientes(pesquisa);
        if (lista != null) {
            DefaultTableModel modelo = (DefaultTableModel) telaPrincipal.getjTableTreinoClientes().getModel();
            modelo.setRowCount(0);
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < lista.size(); i++) {
                try {
                    Date dataNasc = formatoData.parse(lista.get(i).getDataNasc());
                    modelo.addRow(new Object[]{
                        lista.get(i).getMatricula(),
                        lista.get(i).getNome(),
                        lista.get(i).getPeso() + " Kilos",
                        lista.get(i).getAltura() + " Metros",
                        util.calculaIdade(dataNasc) + " Anos"});

                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
                //util.setColumnWidths(telaPrincipal.getjTableTreinoClientes(), 40, 300, 130, 400);
            }
        }
    }

}

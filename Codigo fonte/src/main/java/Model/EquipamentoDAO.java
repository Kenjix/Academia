package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EquipamentoDAO {

    public void inserirEquipamento(Equipamento eq) {
        String query = "INSERT INTO equipamento (nome, disponivel)"
                + "values (?, ?);";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, eq.getNome());
            pst.setBoolean(2, eq.isDisponivel());
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {}
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {}
            }
        }
    }

    //Ler informações de equipamentos
    public ArrayList<Equipamento> listarEquipamento() {
        ArrayList<Equipamento> list = new ArrayList();
        String query = "SELECT id, nome, disponivel FROM equipamento;";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                boolean disponivel = rs.getBoolean(3);
                list.add(new Equipamento(id, nome, disponivel));
            }
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            return null;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {}
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {}
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {}
            }
        }
    }

    //UPDATE
    public void editarEquipamento(Equipamento equipamento) {
        String query = "UPDATE equipamento SET  nome = ?, disponivel = ?"
                + "WHERE id = ?;";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, equipamento.getNome());
            pst.setBoolean(2, equipamento.isDisponivel());
            pst.setString(3, String.valueOf(equipamento.getId()));
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {}
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {}
        }
    }

    // DELETE
    public void deletarEquipamento(int id) {
        String query = "DELETE FROM equipamento WHERE Id = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar - código: " + e.getErrorCode());
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {}
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {}
        }
    }
}

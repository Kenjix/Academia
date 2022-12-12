package Controller;

import ConnectionFactory.ConnectionFactory;
import Model.Cliente;
import Model.Estabelecimento;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class EstDAO {

    public boolean inserirDados(String nome, String descricao, String imgPath) {
        String query = "CALL insereEst(?, ?, ?)";
        InputStream is = null;
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);

            pst.setString(1, nome);
            pst.setString(2, descricao);
            is = new FileInputStream(new File(imgPath));
            pst.setBinaryStream(3, is);

            pst.execute();
            is.close();
            return true;
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getErrorCode() + " - CPF já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            }
            return false;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Imagem não foi encontrada",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a imagem",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public ArrayList<Estabelecimento> getConfig() {
        String query = "SELECT nome, descricao, logo FROM estabelecimento WHERE id = 1";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Estabelecimento> list = new ArrayList();
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String nome = rs.getString(1);
                String descricao = rs.getString(2);
                byte[] logo = rs.getBytes(3);
                list.add(new Estabelecimento(nome, descricao, logo));

            }
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getMessage());
            return null;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }

}

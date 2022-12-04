package Model;

import ConnectionFactory.ConnectionFactory;
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
import javax.swing.JOptionPane;

public class ClienteDAO {

    public boolean inserirCliente(Cliente c, String path) {
        String query = "CALL insereCliente(?, ?, ?, ? , ? , ?, ?, ?, ?, ?, ?, ?, ?);";
        InputStream is = null;
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);

            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getDataNasc());
            pst.setString(4, String.valueOf(c.getPeso()));
            pst.setString(5, String.valueOf(c.getAltura()));
            pst.setString(6, c.getDataInicio());
            pst.setString(7, c.getDataFim());
            pst.setString(8, c.getObjetivo());
            is = new FileInputStream(new File(path));
            pst.setBinaryStream(9, is);
            pst.setString(10, c.getEmail());
            pst.setString(11, c.getTelefone());
            pst.setString(12, c.getCelular());
            pst.setString(13, c.getObservacoes());            
            pst.execute();
            is.close();
            return true;
        } catch (SQLException e) {
            if(e.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getErrorCode()+ " - CPF já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            }            
            return false;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Foto não foi encontrado",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a foto",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
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

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> list = new ArrayList();
        String query = "SELECT id, nome, cpf, matricula, dataNasc, peso, altura, "
                + "dataInicio, dataFim, objetivo, ativo, email, telefone,"
                + "celular, observacoes, foto FROM cliente;";
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
                String cpf = rs.getString(3);
                long matricula = Long.parseLong(rs.getString(4));
                String dataNasc = rs.getString(5);
                float peso = Float.parseFloat(rs.getString(6));
                float altura = Float.parseFloat(rs.getString(7));
                String dataInicio = rs.getString(8);
                String dataFim = rs.getString(9);
                String objetivo = rs.getString(10);
                Boolean ativo = rs.getBoolean(11);
                String email = rs.getString(12);
                String telefone = rs.getString(13);
                String celular = rs.getString(14);
                String observacoes = rs.getString(15);
                byte[] foto = rs.getBytes(16);
                list.add(new Cliente(matricula, ativo, dataInicio, dataFim,
                        foto, objetivo, id, peso, altura, nome, dataNasc, cpf,
                        telefone, celular, email, observacoes));
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

    public ArrayList<Cliente> listarClientes(String pesquisa) {
        ArrayList<Cliente> list = new ArrayList();
        String query = "SELECT id, nome, cpf, matricula, dataNasc, peso, altura, "
                + "dataInicio, dataFim, objetivo, ativo, email, telefone,"
                + "celular, observacoes, foto FROM cliente "
                + "WHERE nome LIKE ?;";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, '%' + pesquisa + '%');
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                long matricula = Long.parseLong(rs.getString(4));
                String dataNasc = rs.getString(5);
                float peso = Float.parseFloat(rs.getString(6));
                float altura = Float.parseFloat(rs.getString(7));
                String dataInicio = rs.getString(8);
                String dataFim = rs.getString(9);
                String objetivo = rs.getString(10);
                Boolean ativo = rs.getBoolean(11);
                String email = rs.getString(12);
                String telefone = rs.getString(13);
                String celular = rs.getString(14);
                String observacoes = rs.getString(15);
                byte[] foto = rs.getBytes(16);
                list.add(new Cliente(matricula, ativo, dataInicio, dataFim,
                        foto, objetivo, id, peso, altura, nome, dataNasc, cpf,
                        telefone, celular, email, observacoes));
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

    public Cliente getCliente(long matric) {
        String query = "SELECT id, nome, cpf, matricula, telefone, celular, "
                + "email, dataNasc, peso, altura, dataInicio, dataFim, objetivo,"
                + "ativo, foto, observacoes FROM cliente WHERE matricula = ?";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(matric));
            rs = pst.executeQuery();

            int id = 0;
            String nome = "";
            String cpf = "";
            long matricula = 0;
            String telefone = "";
            String celular = "";
            String email = "";
            String dataNasc = "";
            float peso = 0;
            float altura = 0;
            String dataInicio = "";
            String dataFim = "";
            String objetivo = "";
            Boolean ativo = null;
            byte[] foto = null;
            String observacoes = "";

            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
                nome = rs.getString(2);
                cpf = rs.getString(3);
                matricula = Long.parseLong(rs.getString(4));
                telefone = rs.getString(5);
                celular = rs.getString(6);
                email = rs.getString(7);
                dataNasc = rs.getString(8);
                peso = Float.parseFloat(rs.getString(9));
                altura = Float.parseFloat(rs.getString(10));
                dataInicio = rs.getString(11);
                dataFim = rs.getString(12);
                objetivo = rs.getString(13);
                ativo = rs.getBoolean(14);
                foto = rs.getBytes(15);
                observacoes = rs.getString(16);
            }
            Cliente cli = new Cliente(matricula, ativo, dataInicio, dataFim, foto,
                    objetivo, id, peso, altura, nome, dataNasc, cpf, telefone, celular,
                    email, observacoes);
            return cli;
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
    public boolean editarCliente(Cliente cliente, String path) {
        String query = "UPDATE cliente SET  nome = ?, cpf = ?, dataNasc = ?, "
                + "peso = ?, altura = ?, dataFim = ?, email = ?, "
                + "telefone = ?, celular = ?, objetivo = ?, ativo = ?, "
                + "observacoes = ?, foto = ? WHERE id = ?;";
        InputStream is = null;
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getCpf());
            pst.setString(3, cliente.getDataNasc());
            pst.setString(4, String.valueOf(cliente.getPeso()));
            pst.setString(5, String.valueOf(cliente.getAltura()));
            pst.setString(6, cliente.getDataFim());
            pst.setString(7, cliente.getEmail());
            pst.setString(8, cliente.getTelefone());
            pst.setString(9, cliente.getCelular());
            pst.setString(10, cliente.getObjetivo());
            pst.setBoolean(11, cliente.isAtivo());
            pst.setString(12, cliente.getObservacoes());
            is = new FileInputStream(new File(path));
            pst.setBinaryStream(13, is);
            pst.setString(14, String.valueOf(cliente.getId()));
            pst.execute();
            is.close();
            return true;
        } catch (SQLException e) {
            if(e.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getErrorCode()+ " - CPF já existe");
            } else {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            }
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a foto");
            return false;
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

    public void ativarCliente(long matricula) {
        String query = "UPDATE cliente SET ativo = ? WHERE matricula = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setBoolean(1, true);
            pst.setString(2, String.valueOf(matricula));
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

    // DELETE
    public boolean deletarCliente(long matricula) {
        String query = "DELETE FROM cliente WHERE matricula = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(matricula));
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            return false;
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
}

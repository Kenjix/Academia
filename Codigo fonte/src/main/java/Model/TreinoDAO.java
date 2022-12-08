package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TreinoDAO {

    public boolean inserirTreino(Treino tr) {
        String query = "INSERT INTO treino (ordem, repeticao, carga, series, "
                + "tipoTreino, observacao, funcionario, cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(tr.getOrdem()));
            pst.setString(2, String.valueOf(tr.getRepeticao()));
            pst.setString(3, String.valueOf(tr.getCarga()));
            pst.setString(4, String.valueOf(tr.getSeries()));
            pst.setString(5, tr.getTipoTreino());
            pst.setString(6, tr.getObservacao());
            pst.setString(7, tr.getFuncionario().getNome());
            pst.setString(8, tr.getCliente().getNome());
            pst.execute();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e);
            return false;
        }
    }

    public ArrayList<Treino> listarTreino() {
        ArrayList<Treino> list = new ArrayList();
        String query = "SELECT id, tipoTreino, ordem, repeticao, carga, series, observacao FROM treino;";
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String tipoTreino = rs.getString(2);
                int ordem = Integer.parseInt(rs.getString(3));
                int repeticao = Integer.parseInt(rs.getString(4));
                int carga = Integer.parseInt(rs.getString(5));
                String series = rs.getString(6);
                String observacao = rs.getString(7);
                list.add(new Treino(id, ordem, repeticao, carga, series,
                        tipoTreino, observacao));
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList<Treino> listarTreino(String pesquisa) {
        ArrayList<Treino> list = new ArrayList();
        String query = "SELECT id, tipoTreino, ordem, repeticao, carga, series, observacao FROM treino Where cliente LIKE ?;";
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            pst.setString(1, pesquisa);
            
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String tipoTreino = rs.getString(2);
                int ordem = Integer.parseInt(rs.getString(3));
                int repeticao = Integer.parseInt(rs.getString(4));
                int carga = Integer.parseInt(rs.getString(5));
                String series = rs.getString(6);
                String observacao = rs.getString(7);
                list.add(new Treino(id, ordem, repeticao, carga, series,
                        tipoTreino, observacao));
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public Treino getTreino(int id) {
        FuncionarioDAO funDAO = new FuncionarioDAO();
        ClienteDAO cliDAO = new ClienteDAO();
        String query = "SELECT id, tipoTreino, ordem, repeticao, carga, series, observacao, funcionario, cliente FROM treino Where id = ?;";
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            pst.setString(1, String.valueOf(id));
            
            int id2 = 0;
            String tipoTreino = "";
            int ordem = 0;
            int repeticao = 0;
            int carga = 0;
            String series = "";
            String observacao = "";
            Funcionario func = new Funcionario();
            Cliente cli = new Cliente();
            
            while (rs.next()) {
                id2 = Integer.parseInt(rs.getString(1));
                tipoTreino = rs.getString(2);
                ordem = Integer.parseInt(rs.getString(3));
                repeticao = Integer.parseInt(rs.getString(4));
                carga = Integer.parseInt(rs.getString(5));
                series = rs.getString(6);
                observacao = rs.getString(7);
                func = funDAO.listarFuncionarios(rs.getString(8)).get(0);
                cli = cliDAO.listarClientes(rs.getString(9)).get(0);
            }
            
            Treino treino = new Treino(id2, ordem, repeticao, carga, series, tipoTreino, observacao, func, cli);
            return treino;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
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

    public boolean editarTreino(Treino tr) {
        String query = "UPDATE treino SET ordem = ?, repeticao = ?, carga = ?, "
                + "series = ?, tipoTreino = ?, observacao = ?, funcionario = ?, "
                + "cliente = ? WHERE id = ?;";
                
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(tr.getOrdem()));
            pst.setString(2, String.valueOf(tr.getRepeticao()));
            pst.setString(3, String.valueOf(tr.getCarga()));
            pst.setString(4, tr.getSeries());
            pst.setString(5, tr.getTipoTreino());
            pst.setString(6, tr.getObservacao());
            pst.setString(7, String.valueOf(tr.getFuncionario().getId()));
            pst.setString(8, String.valueOf(tr.getCliente().getId()));
            pst.setString(9, String.valueOf(tr.getId()));
            pst.execute();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("ERRO AO ALTERAR: " + e);
            return false;
        }
    }

    public boolean deletarTreino(int id) {
        String query = "DELETE FROM treino WHERE Id = ?;";  
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));

            pst.execute();
            System.out.println("DELETEANDO");
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("ERRO AO DELETAR: " + e);
            return false;
        }
    }
}

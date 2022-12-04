package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TreinoDAO {

    public void inserirTreino(Treino tr) {
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
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e);
        }
    }

    public ArrayList<Treino> listarTreino() {
        ArrayList<Treino> list = new ArrayList();
        String query = "SELECT tipoTreino, ordem, repeticao, carga, series, observacao FROM treino;";
        
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

    public void editarTreino(Treino tr) {
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
        } catch (SQLException e) {
            System.out.println("ERRO AO ALTERAR: " + e);
        }
    }

    public void deletarTreino(int id) {
        String query = "DELETE FROM treino WHERE Id = ?;";  
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));

            pst.execute();
            System.out.println("DELETEANDO");
            con.close();
        } catch (SQLException e) {
            System.out.println("ERRO AO DELETAR: " + e);
        }
    }
}

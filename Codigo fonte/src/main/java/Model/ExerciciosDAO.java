package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExerciciosDAO {

    public void inserirExercicio(Exercicios ex) {
        String query = "insert into exercicios (nome,grupoMuscular)"
                + "values (? , ?);";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, ex.getNome());
            pst.setString(2, ex.getGrupoMuscular());

            pst.execute();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getErrorCode());
        }
    }

    //Ler informações de Funcionarios
    public ArrayList<Exercicios> listarExercicios() {
        ArrayList<Exercicios> list = new ArrayList();
        String query = "SELECT * FROM exercicios;";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                String grupoMuscular = rs.getString(3);
                list.add(new Exercicios(id, nome, grupoMuscular));
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //UPDATE
    public void editarExercicio(Exercicios exercicios) {
        String query = "UPDATE exercicio SET  nome = ?, grupoMuscular = ?"
                + "Where id = ?;";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, exercicios.getNome());
            pst.setString(2, exercicios.getGrupoMuscular());

            pst.execute();
            con.close();
        } catch (SQLException e) {
            System.out.println("ERRO AO ALTERAR: " + e);
        }
    }

    // DELETE
    public void deletarExercicio(int id) {
        String query = "DELETE FROM exercicios Where Id = ?;";       

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

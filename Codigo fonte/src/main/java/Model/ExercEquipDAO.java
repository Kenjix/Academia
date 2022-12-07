package Model;

import ConnectionFactory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercEquipDAO {

    public void cadastrar(int exer, int equip) {
        String query = "INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES (?, ?)";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(equip));
            pst.setString(2, String.valueOf(exer));
            pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro - código: " + e.getErrorCode());
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

    public void editar() {
        String query = "UPDATE exerc_equip ";
    }

    public ArrayList<ExercEquip> listar() {
        String query = "SELECT equipamento.id, equipamento.nome, equipamento.dataAquisicao, "
                + "equipamento.disponivel, equipamento.observacoes, exercicios.id, "
                + "exercicios.nome, exercicios.grupoMuscular, FK_equipamento, "
                + "FK_exercicios FROM exercicios INNER JOIN exerc_equip "
                + "ON exercicios.id = exerc_equip.FK_exercicios INNER JOIN equipamento "
                + "ON equipamento.id = exerc_equip.FK_equipamento;";
        ArrayList<ExercEquip> list = new ArrayList();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            int idExerc;
            String nomeExerc;
            String grupoMuscular;
            int fkExerc;
            int idEquip;
            String nomeEquip;
            String dataAquisicao;
            Boolean disponivel;
            String observacoes;
            int fkEquip;

            while (rs.next()) {
                idEquip = rs.getInt(1);
                nomeEquip = rs.getString(2);
                dataAquisicao = rs.getString(3);
                disponivel = rs.getBoolean(4);
                observacoes = rs.getString(5);
                idExerc = rs.getInt(6);
                nomeExerc = rs.getString(7);
                grupoMuscular = rs.getString(8);
                fkEquip = rs.getInt(9);
                fkExerc = rs.getInt(10);

                Exercicios exerc = new Exercicios(idExerc, nomeExerc, grupoMuscular);
                Equipamento equip = new Equipamento(idEquip, nomeEquip, dataAquisicao, disponivel, observacoes);
                list.add(new ExercEquip(equip, exerc, fkEquip, fkExerc));
            }
            return list;
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
}

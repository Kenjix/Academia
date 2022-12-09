package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TreinoDAO {

    ClienteDAO daoCliente = new ClienteDAO();
    ExerciciosDAO daoExercicio = new ExerciciosDAO();

    public boolean inserirTreino(Treino tr) {
        String query = "INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, "
                + "observacao, FK_cliente, FK_funcionario, FK_exercicios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(tr.getOrdem()));
            pst.setString(4, String.valueOf(tr.getSeries()));
            pst.setString(2, String.valueOf(tr.getRepeticao()));
            pst.setString(3, String.valueOf(tr.getCarga()));
            pst.setString(5, tr.getTipoTreino());
            pst.setString(6, tr.getDataTrocaTreino());
            pst.setString(7, tr.getObservacao());
            pst.setString(8, String.valueOf(tr.getCliente().getId()));
            pst.setString(9, String.valueOf(tr.getFuncionario().getId()));
            pst.setString(10, String.valueOf(tr.getExercicios().getId()));
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
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

    public ArrayList<Treino> listarTreino() {
        ArrayList<Treino> list = new ArrayList();
        String query = "SELECT idTreino, ordem, carga, series, ativo, repeticao, fk_cliente, fk_exercicios FROM view_treinos_cliente;";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                int idTreino = Integer.parseInt(rs.getString(1));
                int ordem = Integer.parseInt(rs.getString(2));
                int carga = Integer.parseInt(rs.getString(3));
                String series = rs.getString(4);
                boolean ativo = rs.getBoolean(5);
                int repeticao = rs.getInt(6);
                int fkCliente = rs.getInt(7);
                int fkExercicio = rs.getInt(8);
                Cliente cli = daoCliente.getCliente(fkCliente);
                Exercicios exerc = daoExercicio.getExercicios(fkExercicio);
                list.add(new Treino(idTreino, ordem, carga, series, repeticao, ativo, cli, exerc));
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

    public ArrayList<Treino> listarTreino(String pesquisa) {
        ArrayList<Treino> list = new ArrayList();
        String query = "SELECT idTreino, ordem, carga, series, ativo, repeticao, fk_cliente, fk_exercicios FROM view_treinos_cliente WHERE clienteNome LIKE ?;";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, '%' + pesquisa + '%');
            rs = pst.executeQuery();

            while (rs.next()) {
                int idTreino = Integer.parseInt(rs.getString(1));
                int ordem = Integer.parseInt(rs.getString(2));
                int carga = Integer.parseInt(rs.getString(3));
                String series = rs.getString(4);
                boolean ativo = rs.getBoolean(5);
                int repeticao = rs.getInt(6);
                int fkCliente = rs.getInt(7);
                int fkExercicio = rs.getInt(8);
                Cliente cli = daoCliente.getCliente(fkCliente);
                Exercicios exerc = daoExercicio.getExercicios(fkExercicio);
                list.add(new Treino(idTreino, ordem, carga, series, repeticao, ativo, cli, exerc));
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

    public boolean statusTraino(int id, boolean controle) {
        String query = "UPDATE treinos SET ativo = ? WHERE id = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setBoolean(1, controle);
            pst.setString(2, String.valueOf(id));
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getMessage());
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

    // DELETE
    public void deletarTreino(int id) {
        String query = "DELETE FROM treinos WHERE Id = ?;";
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

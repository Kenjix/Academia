package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExerciciosDAO {

    public boolean inserirExercicio(Exercicios ex) {
        String query = "INSERT INTO exercicios (nome, grupoMuscular)"
                + "VALUES (?, ?);";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);

            pst.setString(1, ex.getNome());
            pst.setString(2, ex.getGrupoMuscular());
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

    //Ler informações de Funcionarios
    public ArrayList<Exercicios> listarExercicios() {
        ArrayList<Exercicios> list = new ArrayList();
        String query = "SELECT * FROM exercicios;";

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
                String grupoMuscular = rs.getString(3);
                list.add(new Exercicios(id, nome, grupoMuscular));
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

    //UPDATE
    public boolean editarExercicio(Exercicios exercicios) {
        String query = "UPDATE exercicios SET  nome = ?, grupoMuscular = ?"
                + "WHERE id = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, exercicios.getNome());
            pst.setString(2, exercicios.getGrupoMuscular());
            pst.setString(3, String.valueOf(exercicios.getId()));
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

    // DELETE
    public boolean deletarExercicio(int id) {
        String query = "DELETE FROM exercicios WHERE Id = ?;";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));

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

    public Exercicios getExercicios(int id) {
        String query = "SELECT id, nome, grupoMuscular FROM exercicios WHERE id = ?;";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));
            rs = pst.executeQuery();

            int idE = 0;
            String nome = "";
            String grupMusc = "";

            while (rs.next()) {
                idE = rs.getInt(1);
                nome = rs.getString(2);
                grupMusc = rs.getString(3);
            }
            Exercicios exerc = new Exercicios(idE, nome, grupMusc);
            return exerc;
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

    //Ler informações de Funcionarios
    public ArrayList<Exercicios> listarExercicios(String pesquisa) {
        ArrayList<Exercicios> list = new ArrayList();
        String query = "SELECT id, nome, grupoMuscular FROM exercicios WHERE nome LIKE ?;";

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
                String grupoMuscular = rs.getString(3);
                list.add(new Exercicios(id, nome, grupoMuscular));
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

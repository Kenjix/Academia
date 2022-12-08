package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EquipamentoDAO {

    public boolean inserirEquipamento(Equipamento eq) {
        String query = "CALL insereExercicio(?, ?, ?);";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, eq.getNome());
            pst.setString(2, eq.getDataAquisicao());
            pst.setString(3, eq.getObservacoes());
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

    //Ler informações de equipamentos
    public ArrayList<Equipamento> listarEquipamento() {
        ArrayList<Equipamento> list = new ArrayList();
        String query = "SELECT id, nome, dataAquisicao, disponivel, observacoes, patrimonio FROM equipamento;";
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
                String dataAquisicao = rs.getString(3);
                boolean disponivel = rs.getBoolean(4);
                String observacoes = rs.getString(5);
                String patrimonio = rs.getString(6);
                list.add(new Equipamento(id, nome, dataAquisicao, disponivel, observacoes, patrimonio));
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

    //Ler informações de Equipamento por nome
    public ArrayList<Equipamento> listarEquip(String pesquisa) {
        ArrayList<Equipamento> list = new ArrayList();
        String query = "SELECT id, nome, dataAquisicao, disponivel, observacoes, patrimonio FROM equipamento WHERE nome LIKE ?;";
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
                String dataAquisicao = rs.getString(3);
                Boolean dispoviel = rs.getBoolean(4);
                String observacoes = rs.getString(5);
                String patrimonio = rs.getString(6);
                list.add(new Equipamento(id, nome, dataAquisicao, dispoviel, observacoes, patrimonio));
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
    public boolean editarEquipamento(Equipamento equipamento) {
        String query = "UPDATE equipamento SET  nome = ?, dataAquisicao = ?,"
                + "observacoes = ? WHERE id = ?;";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, equipamento.getNome());
            pst.setString(2, equipamento.getDataAquisicao());
            pst.setString(3, equipamento.getObservacoes());
            pst.setString(4, String.valueOf(equipamento.getId()));
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

    public boolean statusEquip(int id, boolean controle) {
        String query = "UPDATE equipamento SET disponivel = ? WHERE id = ?;";
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

    public Equipamento getEquipamento(int id) {
        String query = "SELECT id, nome, dataAquisicao, disponivel, observacoes, patrimonio FROM equipamento WHERE id = ?;";

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
            String dataAquisicao = "";
            Boolean dispovivel = null;
            String observacoes = "";
            String patrimonio = "";

            while (rs.next()) {
                idE = rs.getInt(1);
                nome = rs.getString(2);
                dataAquisicao = rs.getString(3);
                dispovivel = rs.getBoolean(4);
                observacoes = rs.getString(5);
                patrimonio = rs.getString(6);

            }
            Equipamento equip = new Equipamento(idE, nome, dataAquisicao, dispovivel, observacoes, patrimonio);
            return equip;
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
    
        public Equipamento getEquipamento(String patrimonio) {
        String query = "SELECT id, nome, dataAquisicao, disponivel, observacoes FROM equipamento WHERE patrimonio = ?;";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, patrimonio);
            rs = pst.executeQuery();

            int idE = 0;
            String nome = "";
            String dataAquisicao = "";
            Boolean dispovivel = null;
            String observacoes = "";

            while (rs.next()) {
                idE = rs.getInt(1);
                nome = rs.getString(2);
                dataAquisicao = rs.getString(3);
                dispovivel = rs.getBoolean(4);
                observacoes = rs.getString(5);

            }
            Equipamento equip = new Equipamento(idE, nome, dataAquisicao, dispovivel, observacoes, patrimonio);
            return equip;
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

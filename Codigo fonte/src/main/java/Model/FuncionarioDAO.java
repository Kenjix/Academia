package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    public boolean inserirFuncionario(Funcionario f) {
        String query = "CALL insereFunc(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);

            pst.setString(1, f.getNome());
            pst.setString(2, f.getCpf());
            pst.setString(3, f.getTelefone());
            pst.setString(4, f.getCelular());
            pst.setString(5, f.getEmail());            
            pst.setString(6, f.getDataNasc());
            pst.setString(7, String.valueOf(f.getPeso()));
            pst.setString(8, String.valueOf(f.getAltura()));
            pst.setString(9, f.getObservacoes());
            pst.setString(10, String.valueOf(f.getCargaHoraria()));
            pst.setString(11, f.getTurno());       
            pst.setString(12, f.getEspecialidade());
            pst.execute();            
            return true;
        } catch (SQLException e) {
            if(e.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Erro: " + e.getErrorCode()+ " - CPF já existe");
            } else {
                JOptionPane.showMessageDialog(null, "Erro código: " + e.getErrorCode());
            } 
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


//Ler informações de Funcionarios
public ArrayList<Funcionario> listarFuncionarios(){
        ArrayList<Funcionario> list = new ArrayList();
        String query = "SELECT id, nome, cpf, dataNasc, email, telefone, celular,"
                + "peso, altura, observacoes, cargahoraria, turno, especialidade "
                + "FROM funcionario;";
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();            
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1)) ;
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String dataNasc = rs.getString(4);
                String email = rs.getString(5);
                String telefone = rs.getString(6);
                String celular = rs.getString(7);
                float peso = Float.parseFloat(rs.getString(8));
                float altura = Float.parseFloat(rs.getString(9));
                String observacoes = rs.getString(10);
                int cargaHoraria = Integer.parseInt(rs.getString(11));
                String turno = rs.getString(12);
                String especialidade = rs.getString(13);
                list.add(new Funcionario(especialidade, turno, cargaHoraria, id,
                        peso, altura, nome, dataNasc, cpf, telefone, celular, 
                        email, observacoes));  
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
    
    //Ler informações de Funcionarios
    public ArrayList<Funcionario> listarFuncionarios(String pesquisa){
        ArrayList<Funcionario> list = new ArrayList();
        String query = "SELECT id, nome, cpf, dataNasc, email, telefone, celular,"
                + "peso, altura, observacoes, cargahoraria, turno, especialidade "
                + "FROM funcionario WHERE nome LIKE ?;";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, '%' + pesquisa + '%');
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1)) ;
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String dataNasc = rs.getString(4);
                String email = rs.getString(5);
                String telefone = rs.getString(6);
                String celular = rs.getString(7);
                float peso = Float.parseFloat(rs.getString(8));
                float altura = Float.parseFloat(rs.getString(9));
                String observacoes = rs.getString(10);
                int cargaHoraria = Integer.parseInt(rs.getString(11));
                String turno = rs.getString(12);
                String especialidade = rs.getString(13);
                list.add(new Funcionario(especialidade, turno, cargaHoraria, id,
                        peso, altura, nome, dataNasc, cpf, telefone, celular, 
                        email, observacoes));  
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
    
    public Funcionario getFuncionario(int id){
        String query = "SELECT id, nome, cpf, dataNasc, email, telefone, celular,"
                + "peso, altura, observacoes, cargahoraria, turno, especialidade "
                + "FROM funcionario WHERE id = ?;";
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;        
        try{
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(id));
            rs = pst.executeQuery();
                        
            String nome = "";
            String cpf = "";
            String dataNasc = "";
            String email = "";
            String telefone = "";
            String celular = "";
            float peso = 0;
            float altura = 0;
            String observacoes = "";
            int cargaHoraria = 0;
            String turno = "";
            String especialidade = ""; 
            int idF = 0;
            
            while(rs.next()){  
                idF = rs.getInt(1);
                nome = rs.getString(2);
                cpf = rs.getString(3);
                dataNasc = rs.getString(4);
                email = rs.getString(5);
                telefone = rs.getString(6);
                celular = rs.getString(7);
                peso = Float.parseFloat(rs.getString(8));
                altura = Float.parseFloat(rs.getString(9));
                observacoes = rs.getString(10);
                cargaHoraria = Integer.parseInt(rs.getString(11));
                turno = rs.getString(12);
                especialidade = rs.getString(13);  
            }
            Funcionario func = new Funcionario(especialidade, turno, cargaHoraria, idF,
                        peso, altura, nome, dataNasc, cpf, telefone, celular, 
                        email, observacoes);            
            return func;
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
    public boolean editarFuncionario(Funcionario funcionario){
        String query = "UPDATE funcionario SET  nome = ?, cpf = ?,  dataNasc = ?, peso = ?, altura = ?, "
                + " observacoes = ?, cargaHoraria = ?, turno = ?, especialidade = ?, email = ?, telefone = ?, celular = ? "
                + "WHERE id = ?;";       
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getDataNasc());
            pst.setString(4, String.valueOf(funcionario.getPeso()));
            pst.setString(5, String.valueOf(funcionario.getAltura()));
            pst.setString(6, funcionario.getObservacoes());
            pst.setString(7, String.valueOf(funcionario.getCargaHoraria()));
            pst.setString(8, funcionario.getTurno());
            pst.setString(9, funcionario.getEspecialidade());
            pst.setString(10, funcionario.getEmail());
            pst.setString(11, funcionario.getTelefone());
            pst.setString(12, funcionario.getCelular());
            pst.setString(13, String.valueOf(funcionario.getId()));                        
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro código: " + e.getMessage()); 
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
    
    // DELETE
    public boolean deletarFuncionario(int id){
        String query = "DELETE FROM funcionario WHERE Id = ?;";
        Connection con = null;
        PreparedStatement pst = null;
        
        try{
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(query);
            pst.setString(1,  String.valueOf(id));            
            pst.execute();
            return true;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar - código: " + e.getErrorCode());
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

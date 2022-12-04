
package Model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EquipamentoDAO {
    
    public void inserirEquipamento(Equipamento eq){
        String query = "insert into funcionario (nome,disponivel)" +
                        "values (? , ?);";
        
        
        try{    
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
              
            pst.setString(1, eq.getNome());
            int disponivelB;
            if(eq.isDisponivel()){
                disponivelB = 1;
            }
            else{
                disponivelB = 0;
            }
            pst.setString(2, disponivelB+"");
          
            pst.execute();
            con.close();
        }
        catch(Exception e){
            System.out.println("Erro de conexão: " + e);
           
        }
    }   
    
    //Ler informações de Funcionarios
    public ArrayList<Equipamento> listarEquipamento(){
        ArrayList<Equipamento> list = new ArrayList();
        String query = "SELECT * FROM equipamento;";
        
        try{
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                int id = Integer.parseInt(rs.getString(1)) ;
                String nome = rs.getString(2);
                
                boolean disponivel;
                
                if(Integer.parseInt(rs.getString(3)) == 1){
                    disponivel = true;
                }
                else{
                    disponivel = false;
                }
               
                list.add(new Equipamento(id, nome, disponivel));
            }
            con.close();
            return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }  
    }
    
    //UPDATE
    public void editarEquipamento(Equipamento equipamento){
        String query = "UPDATE equipamento SET  nome = ?, disponivel = ?"
                + "Where id = ?;";
        
        
        try{
            Connection con = new ConnectionFactory().getConnection();
            int disponivelB;
            if(equipamento.isDisponivel()){
                disponivelB = 1;
            }
            else{
                disponivelB = 0;
            }
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,equipamento.getNome());
            pst.setString(2,disponivelB+"");            
            
            pst.execute();
        }
        catch(SQLException e){
            System.out.println("ERRO AO ALTERAR: " + e);
        }
    }
    
    // DELETE
    public void deletarEquipamento(int id){
        String query = "DELETE FROM equipamento Where Id = ?;";
        
        try{
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,  id+"");
            
            pst.execute();
            System.out.println("DELETEANDO");
            con.close();
        }
        catch(SQLException e){
            System.out.println("ERRO AO DELETAR: " + e);
        }
    }
}

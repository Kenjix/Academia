
package Model;

public class Funcionario extends Pessoa{    
    private final String especialidade;
    private final String turno;
    private final int cargaHoraria;

    public Funcionario(String especialidade, String turno, int cargaHoraria, int id, 
            float peso, float altura, String nome, String dataNasc, String cpf, 
            String telefone, String celular, String email, String observacoes) {
        super(id, peso, altura, nome, dataNasc, cpf, telefone, celular, email, observacoes);
        this.especialidade = especialidade;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(String especialidade, String turno, int cargaHoraria, 
            float peso, float altura, String nome, String dataNasc, String cpf, 
            String telefone, String celular, String email, String observacoes) {
        super(peso, altura, nome, dataNasc, cpf, telefone, celular, email, observacoes);
        this.especialidade = especialidade;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public String getTurno() {
        return turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}


package Model;

public class Exercicios {
    private int id;
    private final String nome;
    private final String grupoMuscular;

    public Exercicios(int id, String nome, String grupoMuscular) {
        this.id = id;
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
    }

    public Exercicios(String nome, String grupoMuscular) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
    }
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }
}

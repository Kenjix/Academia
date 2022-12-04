
package Model;

public class Equipamento {
    private final int id ;
    private final String nome;
    private final boolean disponivel;

    public Equipamento(int id, String nome, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}

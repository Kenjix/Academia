
package Model;

public class Equipamento {
    private int id ;
    private final String nome;
    private String dataAquisicao;
    private boolean disponivel;
    private String observacoes;

    public Equipamento(int id, String nome, String dataAquisicao, boolean disponivel, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.disponivel = disponivel;
        this.observacoes = observacoes;
    }
    
    public Equipamento(String nome, String dataAquisicao, String observacoes) {
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.observacoes = observacoes;
    }
    
    public Equipamento(int id, String nome, String dataAquisicao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.observacoes = observacoes;
    }
        
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getObservacoes() {
        return observacoes;
    }  
}


package Model;

public class Pessoa {
    private final int id;
    private final float peso;
    private final float altura;
    private final String nome;
    private final String dataNasc;
    private final String cpf;
    private final String observacoes;

    public Pessoa(int id, float peso, float altura, String nome, String dataNasc, 
            String cpf, String observacoes) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getObservacoes() {
        return observacoes;
    }
}

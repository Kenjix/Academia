package Model;

public class Estabelecimento {

    private final String nome;
    private final String descricao;
    private final byte[] logo;

    public Estabelecimento(String nome, String descricao, byte[] logo) {
        this.nome = nome;
        this.descricao = descricao;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public byte[] getLogo() {
        return logo;
    }
}

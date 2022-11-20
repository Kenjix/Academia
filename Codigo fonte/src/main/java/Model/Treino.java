
package Model;

public class Treino {
    private final int id;
    private final int ordem;
    private final int repeticao;
    private final int carga;
    private final String series;
    private final String tipo_treino;
    private final String observacao;

    public Treino(int id, int ordem, int repeticao, int carga, String series, String tipo_treino, String observacao) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipo_treino = tipo_treino;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public int getOrdem() {
        return ordem;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public int getCarga() {
        return carga;
    }

    public String getSeries() {
        return series;
    }

    public String getTipo_treino() {
        return tipo_treino;
    }

    public String getObservacao() {
        return observacao;
    }
}

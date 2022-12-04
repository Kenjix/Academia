package Model;

public class Treino {

    private final int id;
    private final int ordem;
    private final int repeticao;
    private final int carga;
    private final String series;
    private final String tipoTreino;
    private final String observacao;
    private Funcionario funcionario;
    private Cliente cliente;

    public Treino(int id, int ordem, int repeticao, int carga, String series,
            String tipoTreino, String observacao, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipoTreino = tipoTreino;
        this.observacao = observacao;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public Treino(int id, int ordem, int repeticao, int carga, String series,
            String tipoTreino, String observacao) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipoTreino = tipoTreino;
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

    public String getTipoTreino() {
        return tipoTreino;
    }

    public String getObservacao() {
        return observacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

}

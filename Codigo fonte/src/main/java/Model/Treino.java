package Model;

public class Treino {

    private int id;
    private final int ordem;
    private final int repeticao;
    private final int carga;
    private final String series;
    private String tipoTreino;
    private String observacao;
    private boolean ativo;
    private Funcionario funcionario;
    private Cliente cliente;
    private Exercicios exercicios;
    private String dataTrocaTreino;
  
    public Treino(int id, int ordem, int repeticao, int carga, String series,
            String tipoTreino, String observacao, Funcionario funcionario,
            Cliente cliente, Exercicios exercicios, String dataTrocaTreino) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipoTreino = tipoTreino;
        this.observacao = observacao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.exercicios = exercicios;
        this.dataTrocaTreino = dataTrocaTreino;
    }
    
        public Treino(int ordem, int repeticao, int carga, String series,
            String tipoTreino, String observacao, Funcionario funcionario,
            Cliente cliente, Exercicios exercicios, String dataTrocaTreino) {
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipoTreino = tipoTreino;
        this.observacao = observacao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.exercicios = exercicios;
        this.dataTrocaTreino = dataTrocaTreino;
    }
    
    public Treino(int id, int ordem, int repeticao, int carga, String series,
            String tipoTreino, String observacao, Exercicios exercicios, String dataTrocaTreino) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.tipoTreino = tipoTreino;
        this.observacao = observacao;
        this.exercicios = exercicios;
        this.dataTrocaTreino = dataTrocaTreino;
    }

    public Treino(int ordem, int repeticao, int carga, String series, Cliente cliente, Exercicios exercicios) {
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.cliente = cliente;
        this.exercicios = exercicios;
    }
    public Treino(int id, int ordem, int carga, String series,  int repeticao, boolean ativo, Cliente cliente, Exercicios exercicios) {
        this.id = id;
        this.ordem = ordem;
        this.repeticao = repeticao;
        this.carga = carga;
        this.series = series;
        this.ativo = ativo;
        this.cliente = cliente;
        this.exercicios = exercicios;
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

    public Exercicios getExercicios() {
        return exercicios;
    }

    public String getDataTrocaTreino() {
        return dataTrocaTreino;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
}

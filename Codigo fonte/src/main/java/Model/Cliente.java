
package Model;

public class Cliente extends Pessoa{
    private final long matricula;
    private final boolean ativo;
    private final String dataInicio;
    private final String dataFim;
    private final String dataTroca;
    private final String objetivo;

    public Cliente(long matricula, boolean ativo, String dataInicio, String dataFim, 
            String dataTroca, String objetivo, int id, float peso, float altura, 
            String nome, String dataNasc, String cpf, String observacoes) {
        super(id, peso, altura, nome, dataNasc, cpf, observacoes);
        this.matricula = matricula;
        this.ativo = ativo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataTroca = dataTroca;
        this.objetivo = objetivo;
    }

    public long getMatricula() {
        return matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getDataTroca() {
        return dataTroca;
    }

    public String getObjetivo() {
        return objetivo;
    }
}

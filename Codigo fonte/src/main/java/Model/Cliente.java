package Model;

public class Cliente extends Pessoa {

    private long matricula;
    private String dataInicio;  
    private String dataFim;
    private boolean ativo;  
    private final byte[] foto;
    private final String objetivo;

    public Cliente(long matricula, boolean ativo, String dataInicio, String dataFim, 
            byte[] foto, String objetivo, int id, float peso,float altura, String nome, 
            String dataNasc, String cpf, String telefone, String celular, String email, 
            String observacoes) {
        super(id, peso, altura, nome, dataNasc, cpf, telefone, celular, email, observacoes);
        this.matricula = matricula;
        this.ativo = ativo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.foto = foto;
        this.objetivo = objetivo;
    }
    
        public Cliente(String dataInicio, byte[] foto, String objetivo, 
            float peso, float altura, String nome, String dataNasc, String cpf, 
            String telefone, String celular, String email, String observacoes) {
        super(peso, altura, nome, dataNasc, cpf, telefone, celular, email, observacoes);
        this.dataInicio = dataInicio;
        this.foto = foto;
        this.objetivo = objetivo;
    }

    public Cliente(String dataFim, boolean ativo, byte[] foto, String objetivo, 
            int id, float peso, float altura, String nome, String dataNasc, String cpf, 
            String telefone, String celular, String email, String observacoes) {
        super(id, peso, altura, nome, dataNasc, cpf, telefone, celular, email, observacoes);
        this.dataFim = dataFim;
        this.ativo = ativo;
        this.foto = foto;
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

    public byte[] getFoto() {
        return foto;
    }

    public String getObjetivo() {
        return objetivo;
    }
}

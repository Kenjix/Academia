
package Model;

public class ExercEquip {
    private final Equipamento equipamento;
    private final Exercicios exercicio;
    private final int fkEquip;
    private final int fkExerc;


    public ExercEquip(Equipamento equipamento, Exercicios exercicio, int fkEquip, int fkexerc) {
        this.equipamento = equipamento;
        this.exercicio = exercicio;
        this.fkEquip = fkEquip;
        this.fkExerc = fkexerc;
    }
    
    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Exercicios getExercicio() {
        return exercicio;
    }
    
    public int getFkEquip() {
        return fkEquip;
    }

    public int getFkExerc() {
        return fkExerc;
    }    
}

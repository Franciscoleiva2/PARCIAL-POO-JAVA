/**
 * Write a description of class Advanced here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public class Advanced extends Atleta
{
    private int bar_muscle_ups;
    public Advanced(int p_id, String p_nombre, double p_kilos, int p_bar_muscle_ups){
        super(p_id, p_nombre, p_kilos);
        this.setBarMuscleUps(p_bar_muscle_ups);
    }

    private void setBarMuscleUps(int p_bar_muscle_ups){
        this.bar_muscle_ups = p_bar_muscle_ups;
    }

    public int getBarMuscleUps(){
        return this.bar_muscle_ups;
    }

    public String imprimirTipo(){
        return "(Advanced)";
    }

    public String mostrarDatos(){
        return super.mostrarDatos() + " ** Bar Muscle Ups realizados: " + this.getBarMuscleUps() + " " + this.imprimirTipo();
    }
}

/**
 * Write a description of class Rx here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public class Rx extends Atleta
{
    private int ring_muscle_ups;
    public Rx(int p_id, String p_nombre, double p_kilos, int p_rings){
        super(p_id, p_nombre, p_kilos);
        this.setRings(p_rings);
    }

    private void setRings(int p_rings){
        this.ring_muscle_ups = p_rings;
    }

    public int getRings(){
        return this.ring_muscle_ups;
    }

    public String imprimirTipo(){
        return "(RX)";
    }

    public String mostrarDatos(){
        return super.mostrarDatos() + " ** Ring Muscle Ups realizados: " + this.getRings() + " " + this.imprimirTipo();
    }
}

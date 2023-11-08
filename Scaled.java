/**
 * Write a description of class Scaled here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public class Scaled extends Atleta
{
    private int pull_ups;
    public Scaled(int p_id, String p_nombre, double p_kilos, int p_pullUps){
        super(p_id, p_nombre, p_kilos);
        this.setPullUps(p_pullUps);
    }

    private void setPullUps(int p_pullUps){
        this.pull_ups = p_pullUps;
    }

    public int getPullUps(){
        return this.pull_ups;
    }

    public String imprimirTipo(){
        return "(Scaled)";
    }

    public String mostrarDatos(){
        return super.mostrarDatos() + " ** Pullups realizados: " + this.getPullUps() + " " + this.imprimirTipo();
    }
}

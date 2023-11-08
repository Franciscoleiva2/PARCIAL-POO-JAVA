import java.util.*;

/**
 * Write a description of class Campeonato here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public class Campeonato
{
    private ArrayList<Equipo> equipos;
    private String nombre;

    public Campeonato(String p_nombre, ArrayList<Equipo> p_equipos){
        this.setNombre(p_nombre);
        this.setEquipos(p_equipos);
    }
    public Campeonato(String p_nombre, Equipo p_equipo){
        this.setNombre(p_nombre);
        this.setEquipos(new ArrayList<Equipo>());
        this.agregar(p_equipo);
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setEquipos(ArrayList<Equipo> p_equipos){
            this.equipos = p_equipos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }

    public void determinarGanador(){
        int equipoGanador = 0;
        for(int i = 0; i < this.getEquipos().size(); i++){
            if(this.getEquipos().get(i).totalKilos() > this.getEquipos().get(equipoGanador).totalKilos()){
                equipoGanador = i;
            }
        }

        System.out.println(this.getEquipos().get(equipoGanador).getNombre() + " con " + this.getEquipos().get(equipoGanador).totalKilos() + " kilos --> Equipo ganador del " + this.getNombre());
    }

    public boolean agregar(Equipo p_equipo){
        return this.getEquipos().add(p_equipo);
    }
    public boolean quitar(Equipo p_equipo){
        return this.getEquipos().remove(p_equipo);
    }
}

import java.util.*;

/**
 * Write a description of class Equipo here.
 * 
 * @author (Leiva Francisco) 
 * @version (31/10/23)
 */
public class Equipo
{
    private ArrayList<Atleta> atletas;
    private String nombre;
    private String procedencia;

    public Equipo(String p_nombre, String p_procedencia, Atleta p_atleta){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);

        ArrayList<Atleta> p_atletas = new ArrayList<Atleta>();
        p_atletas.add(p_atleta);

        this.setAtletas(p_atletas);
    }
    public Equipo(String p_nombre, String p_procedencia, ArrayList<Atleta> p_atletas){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);
        this.setAtletas(p_atletas);
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProcedencia(String p_procedencia){
        this.procedencia = p_procedencia;
    }
    private void setAtletas(ArrayList<Atleta> p_atletas){
            this.atletas = p_atletas;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getProcedencia(){
        return this.procedencia;
    }
    public ArrayList<Atleta> getAtletas(){
        return this.atletas;
    }

    public void listarEquipo(){
        System.out.println("********** Detalle **********");
        for(Atleta unAtleta : this.getAtletas()){
            System.out.println(unAtleta.mostrarDatos());
        }
        System.out.println("Cantidad de integrantes: " + this.cantidadIntegrantes());
        System.out.println("Puntaje total del equipo: " + this.totalKilos());
    }

    public void mostrar(){
        System.out.println("Nombre del equipo = " + this.getNombre());
        System.out.println("Procedencia = " + this.getProcedencia());
    }

    public double totalKilos(){
        double totalKilos = 0;
        for(Atleta unAtleta : this.getAtletas()){
            totalKilos += unAtleta.getKilos();
        }
        return totalKilos;
    }

    public int cantidadIntegrantes(){
        return this.getAtletas().size();
    }
}

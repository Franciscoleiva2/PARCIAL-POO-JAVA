/**
 * Write a description of class Atleta here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public abstract class Atleta
{
    private int identificador;
    private String nombre;
    private double kilos;
    
    public Atleta(int p_id, String p_nombre, double p_kilos){
        this.setIdentificador(p_id);
        this.setNombre(p_nombre);
        this.setKilos(p_kilos);
    }

    /**
     * A partir de este bloque los setters
     */

    /**
     * Setter de atributo identificador
     * @param (p_identificador)
     */
    private void setIdentificador(int p_identificador){
        this.identificador = p_identificador;
    }
    /**
     * Setter de atributo nombre
     * @param (p_nombre)
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Setter de atributo kilos
     * @param (p_kilos)
     */
    private void setKilos(double p_kilos){
        this.kilos = p_kilos;
    }
    
    /**
     * A partir de este bloque los getters
     */
    /**
     * Getter del atributo identificador
     * @return (identificador)
     */
    public int getIdentificador(){
        return this.identificador;
    }
    /**
     * Getter del atributo nombre
     * @return (nombre)
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Getter del atributo kilos
     * @return (kilos)
     */
    public double getKilos(){
        return this.kilos;
    }
    /**
     * Metodo abstracto imprimirTipo()
     * @return (Tipo del atleta)
     */
    public abstract String imprimirTipo();
    
    /**
     * Metodo mostrarDatos()
     * @return ()
     */
    public String mostrarDatos(){
        return "Atleta: " + this.getIdentificador() + " - " + this.getNombre() + " - Kilos movidos: " + this.getKilos();
    }
}

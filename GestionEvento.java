import java.util.*;

/**
 * Write a description of class GestionEvento here.
 * 
 * @author (Francisco Leiva) 
 * @version (31/10/23)
 */
public class GestionEvento
{
    public static void main(){
        Atleta unAtleta1 = new Rx(123, "Pedro Juarez", 100.0, 3);
        Atleta unAtleta2 = new Advanced(145, "Victor Lopez", 200.0, 2);
        Atleta unAtleta3 = new Scaled(157, "Lucas Vargas", 270.0, 4);
        ArrayList<Atleta> atletas_1 = new ArrayList<Atleta>();
        atletas_1.add(unAtleta1);
        atletas_1.add(unAtleta2);
        atletas_1.add(unAtleta3);
        Equipo equipo_1 = new Equipo("Fuerza Bruta", "Corrientes", atletas_1);

        Atleta unAtleta4 = new Rx(321, "Francisco Leiva", 40.0, 3);
        Atleta unAtleta5 = new Advanced(430, "Andres Sena", 80.0, 2);
        Atleta unAtleta6 = new Scaled(603, "Other Sportist", 56.0, 4);
        ArrayList<Atleta> atletas_2 = new ArrayList<Atleta>();
        atletas_2.add(unAtleta4);
        atletas_2.add(unAtleta5);
        atletas_2.add(unAtleta6);
        Equipo equipo_2 = new Equipo("Fuerza Pesada", "Chaco", atletas_2);

        Campeonato unCampeonato = new Campeonato("XV Torneo Nacional de Crossfit", equipo_1);
        unCampeonato.agregar(equipo_2);
        equipo_1.listarEquipo();
        equipo_1.mostrar();

        unCampeonato.determinarGanador();
    }
}

package resolucion_uefa;

import java.util.ArrayList;

public class Sistema {

    
    public static void cargarDatos(ArrayList<Club> clubes, ArrayList<Arbitro> arbitros)
    {
        Entrenador e = new Entrenador("Marcelino Garcia Toral",63);
        Estadio s = new Estadio("Estadi de Mestalla",46500, "Av. Suecia");
        Club c = new Club(39,e,"Valencia CF", s);
        Jugador j = new Jugador(10, "Daniel Parejo");
        c.addJugadores(j);
        j = new Jugador(22, "Santi Mina");
        c.addJugadores(j);
        clubes.add(c);
        
        e = new Entrenador("Zinedine Zidane",46);
        s = new Estadio("Santiago Bernabeu",81044, "Av. Concha Espina");
        c = new Club(1,e,"Real Madrid FC", s);
        j = new Jugador(22, "Isco Alarcon");
        c.addJugadores(j);
        j = new Jugador(20, "Marco Asensio");
        c.addJugadores(j);
        clubes.add(c);
        
        e = new Entrenador("Massimilliano Allegri",51);
        s = new Estadio("Juventus Stadium",41507, "Piazzo Torino");
        c = new Club(2,e,"Juventus", s);
        j = new Jugador(7, "Cristiano Ronaldo");
        c.addJugadores(j);
        j = new Jugador(10, "Pablo Dybala");
        c.addJugadores(j);
        clubes.add(c);
        
        e = new Entrenador("Ernesto Valverde",55);
        s = new Estadio("Camp Nou",95354, "C. d'Arístides Maillol");
        c = new Club(2,e,"FC Barcelona", s);
        j = new Jugador(10, "Lionel Messi");
        c.addJugadores(j);
        j = new Jugador(5, "Sergio Busquets");
        c.addJugadores(j);
        clubes.add(c);
        
        Arbitro a = new Arbitro("Javier Alberola Rojas","Comite Castellano-Manchego");
        arbitros.add(a);
        
        a = new Arbitro("Jesus Gil Manzano","Comite Extremeño");
        arbitros.add(a);
        
        a = new Arbitro("Mario Melero Lopez","Comite Andaluz");
        arbitros.add(a);
        
        a = new Arbitro("Antonio Mateu Lahoz","Comite Valenciano");
        arbitros.add(a);
    }
    public static void main(String[] args) {
        ArrayList<Club> clubes = new ArrayList<>();
        ArrayList<Arbitro> arbitros = new ArrayList<>();
        cargarDatos(clubes,arbitros);
        Vista v = new Vista(clubes, arbitros);
        v.setVisible(true);
    }

}

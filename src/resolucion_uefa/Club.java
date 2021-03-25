package resolucion_uefa;

import java.util.ArrayList;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Club {
    
    private int IdUEFA;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Entrenador entrenador;
    private String nombreClub;
    private Estadio estadio;

    public Club(int IdUEFA, Entrenador entrenador, String nombreClub, Estadio estadio) {
        this.IdUEFA = IdUEFA;
        this.entrenador = entrenador;
        this.nombreClub = nombreClub;
        this.estadio = estadio;
    }

    public int getIdUEFA() {
        return IdUEFA;
    }

    public void setIdUEFA(int IdUEFA) {
        this.IdUEFA = IdUEFA;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void addJugadores(Jugador j) {
        jugadores.add(j);
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    @Override
    public String toString()
    {
        return nombreClub;
    }
    
}

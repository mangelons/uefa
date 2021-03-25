package resolucion_uefa;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class PartidoFinalizado extends Partido{

    private int golesLocales;
    private int golesVisitantes;
    
    public PartidoFinalizado(Club local, Club visitante, Arbitro arbitro, int golesLocales, int golesVisitantes) {
        super(local, visitante, arbitro);
        this.golesLocales = golesLocales;
        this.golesVisitantes = golesVisitantes;
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitantes() {
        return golesVisitantes;
    }

    public void setGolesVisitantes(int golesVisitantes) {
        this.golesVisitantes = golesVisitantes;
    }
    
    public Club obtenerClubGanador()
    {
        if(golesLocales > golesVisitantes)
        {
            return local;
        }
        else if(golesLocales < golesVisitantes)
        {
            return visitante;
        }
        else
            return null;
    }
    
    @Override
    public String toString()
    {
        String resultado ="";
        Club ganador = this.obtenerClubGanador();
        if(ganador == null)
        {
            resultado = "EMPATE";
        }
        else
        {
            resultado = ganador.getNombreClub();
        }
        return resultado + " ---- "+fecha.toString()+" "+local.toString()+" "+golesLocales+"-"+golesVisitantes+" "+visitante.toString()+" Estadio: "+local.getEstadio();
    }

}

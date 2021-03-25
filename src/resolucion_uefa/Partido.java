package resolucion_uefa;

import java.util.Date;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Partido {
    
    protected Club local;
    protected Club visitante;
    protected Estadio estadio;
    protected Date fecha;
    protected Arbitro arbitro;

    public Partido(Club local, Club visitante, Arbitro arbitro) {
        fecha = new Date();
        this.local = local;
        this.visitante = visitante;
        estadio = local.getEstadio();
        this.arbitro = arbitro;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Club getLocal() {
        return local;
    }

    public void setLocal(Club local) {
        this.local = local;
    }

    public Club getVisitante() {
        return visitante;
    }

    public void setVisitante(Club visitante) {
        this.visitante = visitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString()
    {
        return fecha.toString()+" "+local.toString()+"-"+visitante.toString()+" Estadio: "+estadio.toString();
    }
    

}

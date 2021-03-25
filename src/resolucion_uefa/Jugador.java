package resolucion_uefa;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Jugador {

    private int dorsal;
    private String nombre;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private boolean sancionado;

    public Jugador(int dorsal, String nombre) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        tarjetasAmarillas = 0;
        tarjetasRojas = 0;
        sancionado = false;
    }
    public void addTarjetaAmarilla()
    {
        tarjetasAmarillas++;
        if(tarjetasAmarillas % 5 == 0)
            sancionado = true; //Cumple ciclo de sancion
    }
    
    public void addDobleTarjetaAmarilla()
    {
        tarjetasAmarillas+=2;
        sancionado = true;
    }
    
    public void addTarjetaRoja()
    {
        tarjetasRojas++;
        sancionado = true;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    
    public void quitarSancion()
    {
        sancionado = false;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public boolean isSancionado() {
        return sancionado;
    }
    

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}

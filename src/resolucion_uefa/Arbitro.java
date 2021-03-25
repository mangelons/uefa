package resolucion_uefa;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Arbitro {
    private String nombre;
    private String comite;

    public Arbitro(String nombre, String comite) {
        this.nombre = nombre;
        this.comite = comite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComite() {
        return comite;
    }

    public void setComite(String comite) {
        this.comite = comite;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}

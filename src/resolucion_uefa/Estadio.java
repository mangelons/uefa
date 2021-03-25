package resolucion_uefa;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Estadio {
    
    private String nombre;
    private int capacidad;
    private String ubicacion;

    public Estadio(String nombre, int capacidad, String ubicacion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }

}

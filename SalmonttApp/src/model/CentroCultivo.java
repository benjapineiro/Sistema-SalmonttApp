package model;
/**
 * Representa un centro de cultivo dentro del sistema.
 * Contiene información básica como nombre, comuna y producción.
 */
public class CentroCultivo {

    private String nombre;
    private String comuna;
    private double produccion;

    public CentroCultivo(String nombre, String comuna, double produccion) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccion = produccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getProduccion() {
        return produccion;
    }

    public void setProduccion(double produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", produccion=" + produccion +
                '}';
    }
}






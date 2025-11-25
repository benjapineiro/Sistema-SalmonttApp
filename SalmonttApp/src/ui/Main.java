package ui;
import java.util.ArrayList;
import data.GestorDatos;
import model.CentroCultivo;

 /**
 * Clase principal del sistema.
 * Se encarga de ejecutar el programa.
 */


public class Main {
    public static void main(String[] args) {

        // Crea una instancia del gestor que cargara los datos
        GestorDatos gd = new GestorDatos();
        ArrayList<CentroCultivo> lista = gd.cargarCentros();

        // Lista de centros de cultivos completa
        System.out.println("Lista de Centros de Cultivo");
        for (CentroCultivo c : lista) {
            System.out.println(c);
        }

        ArrayList<CentroCultivo> filtrados = new ArrayList<>();

        for (CentroCultivo c : lista) {
            if (c.getProduccion() >= 1000) {
                filtrados.add(c);
            }
        }

        // Lista de centros de cultivo con produccion mayor o igual a 1000 toneladas
        System.out.println("\n Centros de cultivo con produccion mayor o igual a 1000");
        for (CentroCultivo c : filtrados) {
            System.out.println(c);
        }
    }
}
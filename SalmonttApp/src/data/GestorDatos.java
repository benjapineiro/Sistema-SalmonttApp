package data;
import model.CentroCultivo;
import util.LectorArchivo;
import java.util.ArrayList;

public class GestorDatos {

    /**
     * Carga los centros de cultivo desde un archivo externo (.txt)
     * y los convierte en objetos CentroCultivo.
     */

    public ArrayList<CentroCultivo> cargarCentros() {

        ArrayList<CentroCultivo> lista = new ArrayList<>();

        // Leemos las líneas desde el archivo
        ArrayList<String> lineas = LectorArchivo.leerLineas("C:\\Users\\admin\\IdeaProjects\\SalmonttApp\\resources\\centrosDeCultivo");

        // Recorrre cada linea del archivo
        for (String linea : lineas) {

            String[] partes = linea.split(";");

            // Valida la cantidad de atributos de la linea
            if (partes.length != 3) {
                System.out.println("Línea inválida: " + linea);
                continue;
            }

            try {
                String nombre = partes[0];
                String comuna = partes[1];
                double produccion = Double.parseDouble(partes[2]);

                CentroCultivo c = new CentroCultivo(nombre, comuna, produccion);
                lista.add(c);

            } catch (NumberFormatException e) {
                System.out.println("Error en número en línea: " + linea);
            }
        }

        return lista;
    }
}










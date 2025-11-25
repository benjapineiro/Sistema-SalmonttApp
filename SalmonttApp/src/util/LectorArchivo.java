package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivo {

    /**
     * Lee un archivo de texto línea por línea y devuelve
     * una lista con cada línea encontrada.
     */
    public static ArrayList<String> leerLineas(String nombreArchivo) {

        ArrayList<String> lineas = new ArrayList<>();

        // Abre el archivo y hace que el lector se cierre automaticamente al terminar
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            // Devuelve la siguiente linea del archivo o null si ya no hay mas
            String linea;
            while ((linea = br.readLine()) != null) {

                // Se ignoran líneas vacías y se agregan las validas
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea);
                }
            }

       // Captura de errores
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return lineas;
    }
}
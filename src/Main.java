import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            

            // Leer archivo y analizarlo
            BufferedReader reader = Files.newBufferedReader(Paths.get("burbuja.txt"));

            // Crear analizador lexico
            AnalizadorLexico lexer = new AnalizadorLexico(reader);

            // Crear parser
            Parser parser = new Parser(lexer);

            // Ejecutar análisis
            System.out.println("Iniciando análisis del código...");
            parser.parse();
            System.out.println("¡Análisis completado exitosamente!");
            System.out.println("El código del algoritmo burbuja es sintácticamente correcto.");

            reader.close();

        } catch (Exception e) {
            System.err.println("Error durante el análisis: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

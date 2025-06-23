import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear archivo de prueba si no existe
            String codigoPrueba = 
                "inicio\n" +
                "    entero arr, n, i, j;\n" +
                "    \n" +
                "    leer(n);\n" +
                "    \n" +
                "    i = 0;\n" +
                "    mientras (i < n) {\n" +
                "        leer(arr);\n" +
                "        i = i + 1;\n" +
                "    }\n" +
                "    \n" +
                "    i = 0;\n" +
                "    mientras (i < n - 1) {\n" +
                "        j = 0;\n" +
                "        mientras (j < n - i - 1) {\n" +
                "            si (arr > arr) {\n" +
                "                intercambiar(arr, arr);\n" +
                "            }\n" +
                "            j = j + 1;\n" +
                "        }\n" +
                "        i = i + 1;\n" +
                "    }\n" +
                "    \n" +
                "    i = 0;\n" +
                "    mientras (i < n) {\n" +
                "        imprimir(arr);\n" +
                "        i = i + 1;\n" +
                "    }\n" +
                "fin\n";
            
            // Escribir código de prueba a archivo
            
            //ESTA PARTE SE USA SI SE QUIERE CREAR UN ARCHIVO DE PRUEBA Y LEERLO DIRECTAMENTE (SE DEBE COMENTAR LA LINEA QUE LEE example.txt)

            // FileWriter writer = new FileWriter("test_burbuja.txt");
            // writer.write(codigoPrueba);
            // writer.close();
            // FileReader reader = new FileReader("example.txt");


            // Leer archivo y analizarlo
            FileReader reader = new FileReader("example.txt");
            
            // Crear analizador léxico
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

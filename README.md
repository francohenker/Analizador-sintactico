# Analizador-sintactico
Analizador sintactico para la catedra Teoria de la Computacion

Este proyecto analiza el algoritmo de burbuja creado en `burbuja.txt` usando la gramatica definida dentro de `src/Analizador.flex`

## Ejecucion VSCode
1. Descargar el proyecto con `git clone https://github.com/francohenker/Analizador-sintactico`
2. `cd Analizador-sintactico`
3. `code .`
4. Ejecutar `Main.java` con run java


## Ejecucion Bash Desde 
1. Descargar el proyecto con `git clone https://github.com/francohenker/Analizador-sintactico`
2. `cd Analizador-sintactico`
3. Deben estar todos los archivos dentro de la misma carpeta (los archivos de `src` y `lib`)
4. Generar el analizador léxico
   ```java 
   java -jar jflex-full-1.8.2.jar Analizador.flex
   ```
5. Generar el parser
    ```java 
   java -jar java-cup-11b.jar -parser Parser Analizador.cup
   ```

6. Compilar todos los archivos Java (si estas en windows cambia : por ;)
   ```java 
   javac -cp java-cup-11b.jar:. *.java
   ```
7. Ejecutar el programa (si estas en windows cambia : por ;)
   ```java 
   java -cp java-cup-11b.jar:. Main
   ```

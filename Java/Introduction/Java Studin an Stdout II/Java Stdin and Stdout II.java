import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Creamos una instancia de Scanner
        Scanner scan = new Scanner(System.in);

        // leemos el dato Entero desde la entrada
        int i = scan.nextInt();

        // leemos el dato Fracional desde la entrada
        double d = scan.nextDouble();

        // Eliminar la nueva línea después de leer el dato Fracional 
        scan.nextLine();

        // leemos el dato del tipo cadena de texto
        String s = scan.nextLine();

        // Cerrar el Scanner
        scan.close();

        /* Imprimir los valores leídos */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
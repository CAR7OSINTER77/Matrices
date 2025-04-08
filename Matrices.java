// Autor: Carlos M. Rivera Gonzalez y Olga Acosta Fernandez
// Date: 4/8/2025
// Class: 2315 Structured Programming
// Description: Este programa le permite al usuario que acepte el tamaño y los elementos de una matriz y los muestra.

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Entrada: Tamaño de la matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear: Matriz
        int[][] matriz = new int[filas][columnas];

        // Ingreso: Elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar: Matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Asegúrate de que esta línea esté fuera del bucle interno
        }
    }
}

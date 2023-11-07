/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia4arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa). */

        
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        int[][] matriz = new int[N][N];
        int[][] matrizTranspuesta = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese el valor de [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        // esto genera la transpuesta en negativo, la antisimetrica
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizTranspuesta[i][j] = -(matriz[j][i]);
            }
        }
        // aca comparo
        int coincidencia = 0;
        int diferencia = 0;
        boolean completo = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (matriz[i][j] == -(matriz[j][i])) {
                    coincidencia++;
                    completo = true;
                } else {
                    diferencia--;
                    completo = false;
                }
            }
        }
        System.out.println("iguales " + coincidencia);
        System.out.println("distintos " + diferencia);
        System.out.println("el booleano quedo " + completo);
        //
        String aux = "";
        System.out.println("La original: ");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        System.out.println("La transpuesta: ");
        for (int[] fila : matrizTranspuesta) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
    }
    
}

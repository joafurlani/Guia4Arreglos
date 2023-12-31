/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia4arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicioExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
     Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
        a medida que el usuario las va ingresando, construya una “sopa de letras
        para niños”de tamaño de 20 x 20 caracteres. 
         Las palabras se ubicarán todas en orden horizontal en una fila que será
        seleccionada de manera aleatoria. 
          Una vez concluida la ubicación de las palabras, rellene los espacios no
        utilizados con un número aleatorio del 0 al 9. 
         Finalmente imprima por pantalla la sopa de letras creada. 
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java substring(), Length() y Math.random().*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char[][] matriz = new char[20][20];
        String palabra;
        Random random = new Random();
        int aleatorio;

        //pide palabras y las ingresa a la matriz
        for (int i = 0; i < 5; i++) {
            aleatorio = random.nextInt(20);
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() > 5 || palabra.length() < 3);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[aleatorio][j] = palabra.charAt(0);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == '\u0000') {
                    matriz[i][j] = (char) ('0' + Math.random() * 10);
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        
    }
    
}

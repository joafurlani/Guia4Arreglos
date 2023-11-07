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
public class Guia4ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido*/
        int N;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el tamaño del vector");
        N = leer.nextInt();
        
        double [] vector = new double [N];
        
        for(int i = 0; i < vector.length; i++){
            vector [i]= Math.floor(Math.random() * 10);
            
        }
        
        String aux = "";
        
        for(double d : vector){
            aux+= "" + d;
        }
        System.out.println(aux);
        
        double adivinado = 0;
        boolean gano= false;
        System.out.println("Adivine de 0 a 10");
        double respuesta = leer.nextDouble();
        for(int i = 0; i < vector.length; i ++){
            if (vector[i] == respuesta){
                adivinado++;
                gano= true;
            }
        }
        System.out.println("Adivino: " + gano);
        System.out.println("Una cantidad de: " + adivinado + " veces");
    }
    
}

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
public class Guia4ejercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).*/
        
        //Creamos vectores
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int N = leer.nextInt();
        int [] vector1 = new int [N];
        int [] vector2 = new int [N];
        
        //llenamos el vector 1
        System.out.println("Primer vector");
        for (int i = 0; i < vector1.length; i++){
            System.out.println("Posicion " + i);
            vector1[i] = leer.nextInt();
        }
        
        //mostramos vector 1
        String aux = " ";
        for(int i : vector1){
            aux += " " + i;
        }
        System.out.println("Vector 1: " + aux);
        
        //llenamos vector dos
        System.out.println("Segundo vector");
        for (int i = 0; i < vector2.length; i++){
            System.out.println("Posicion " + i);
            vector2[i] = leer.nextInt();
        }
    
        //mostramos vector 2
        
        for(int i : vector2){
            aux += " " + i;
        }
        System.out.println("Vector 2: " + aux);
         
        //comparamos vectores
        
         int coincidencia = 0;
        for (int i = 0; i < N; i++) {
            if (vector1[i] == vector2[i]) {
                coincidencia++;
                continue;
            } else {
                break;
            }
        }
        if (coincidencia == N) {
            System.out.println("Vector1 y Vector2 Son Iguales ");
        } else {
            System.out.println("Los vectores NO son iguales");
        }
    
    }
    
    
}

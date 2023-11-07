/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia4arreglos;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
        
        int[] vector = new int[100];
        for (int i = 1; i < vector.length - 1; i++) {
            vector[i] = i;
        }
        String aux = "";
        for (int i = 1; i < vector.length; i++) {
            aux += " " + i;
        }
        System.out.println(aux);
            
        }
    }
    
    

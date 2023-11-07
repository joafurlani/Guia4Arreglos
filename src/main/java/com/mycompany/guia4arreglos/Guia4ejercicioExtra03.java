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
public class Guia4ejercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int N;
        System.out.println("Ingresa el tamaño del vector");
        N=leer.nextInt();
        double [] vector = new double [N];
        mostrador(vector);
        rellenador (vector);
        mostrador (vector);
    }
    
    public static double [] rellenador(double [] vector){
        for(int i = 0; i < vector.length; i++){
           vector[i] = Math.floor(Math.random() * 10);
        }
        return vector;
    } 
    
    public static void mostrador(double[] vector){
        String aux= " ";
        for(double d : vector){
           aux += " " + d;
        }
        System.out.println(aux);
    } 
            
}

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
public class Guia4ejercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cardinalidad del vector: ");
        int N = leer.nextInt();
        int [] vector = new int [N];
        
        //llenar vector
        System.out.println("Ingrese los numeros del vector");
        for(int i = 0; i < vector.length; i++){
            vector[i]=leer.nextInt();
        }
        
        //mostrar vector
        String aux= "";
        for (int i = 0; i < vector.length;i++){
            aux += "Posicion [" + i +"]"+"["+ vector[i]+"]";
        }
        System.out.println(aux);
    
        
        // sumar elementos
        System.out.println("Sumamos los elementos");
        int Suma= 0;
        for(int i = 0; i < vector.length; i ++){
            Suma+= vector[i];
        }
        System.out.println("La suma del vector es: " + Suma);
   }
    
}

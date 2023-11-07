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
public class Guia4ejercicioExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.*/
        Scanner leer = new Scanner(System.in);
        int N, M;
        System.out.println("Ingresa el tamaño de la matriz");
        System.out.println("Tamaño de N: ");
        N=leer.nextInt();
        System.out.println("Tamaño de M");
        M=leer.nextInt();
        
        double [][] matriz = new double [N][M];
        
        for (int i = 0; i < N; i++){
            for (int j= 0; j < M; j++){
                matriz[i][j]= Math.floor(Math.random() * 10);
            }
        }
        // Lo muestra
        String aux= "";
        for (double [] fila : matriz){
            aux = "";
            for (double elemento : fila){
            aux += " " + elemento;
            }
            System.out.println(aux);
            }
        // La suma
        
        double suma = 0;
        for (int i = 0; i < N; i++){
            for (int j= 0; j < M; j++){
            suma += matriz[i][j];
            }
            
            }
        System.out.println("La suma es " + suma);
    }
    
}

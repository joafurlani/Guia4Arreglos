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
public class Guia4ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
        la suma de sus filas, sus columnas y sus diagonales son idénticas. 
         Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
               El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.*/
        
        
        Scanner leer= new Scanner(System.in);
        int [][] matriz = new int [3][3];
        for(int i =0; i < matriz[0].length; i++){
            for(int j =0; j < matriz[0].length; j++){
                System.out.println("Ingrese un valor para la posicion [" +i+"]["+j+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
        
        // imprimir matriz
        
        String aux= "";
        System.out.println("La original: ");
        for(int []fila:matriz){
            aux= "";
            for(int elemento : fila){
                aux += " "+ elemento;
            }
            System.out.println(aux);
        }
        
        // suma filas
        int sumaFila;
        int [] sumadosF = new int[3];
        for(int i = 0; i < matriz[0].length; i++){
        sumaFila=0;
        for (int j= 0; j < matriz[0].length; j++){
            sumaFila += matriz[i][j];
        }
        sumadosF[i]= sumaFila;
    }
        
        //Compara los sumados
        boolean igualesFilas= false;
        if((sumadosF[0] == sumadosF[1])&& (sumadosF[1]== sumadosF[2])){
            igualesFilas= true;
        }
        
        //Suma columnas
        int sumaColumnas;
        int [] sumadosC= new int[3];
        for(int i= 0; i< matriz[0].length; i++){
            sumaColumnas= 0;
            for(int j=0; j< matriz[0].length; j++){
                sumaColumnas += matriz[i][j];
                
            }
            sumadosC[i]= sumaColumnas;
        }
        
        //Compara los sumados Columnas
        boolean igualesColumnas = false;
        if((sumadosC[0] == sumadosC[1])&&(sumadosC[1]== sumadosC[2])){
            igualesColumnas = true;
        }
        int sumaDiagonal1= 0;
        for (int i=0; i< matriz[0].length;i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (i == j){
                    sumaDiagonal1 += matriz[i][j];
                }
            }
        }
        // suma diagonal secundaria
        int auxiliarParaCol = 2;
        int sumaDiagonal2= 0;
        for (int i = 0; i < matriz[0].length; i++){
            sumaDiagonal2 += matriz[i][auxiliarParaCol];
            auxiliarParaCol --;
        }
        
        //
        boolean magica = false;
        if (igualesFilas && igualesColumnas){
            if ((sumadosF[0]== sumaDiagonal1) && (sumaDiagonal1 == sumaDiagonal2)){
                magica = true;
            }
        }
        System.out.println("Es una Matriz Magica: " +magica);
    }
    
}

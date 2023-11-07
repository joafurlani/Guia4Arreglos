/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia4arreglos;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Guia4ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        
        Random random = new Random();
        
        int[] vec = new int [10];
        
        //Llenar vector
        
        for (int i = 0; i < vec.length; i++){
            vec[i]= random.nextInt(10000 - 1 + 1);
        }
    
        //Mostrar vector
        for (int i = 0; i < vec.length; i ++){
            System.out.println(vec[i] + " - ");
        }
        
        //CUANTOS DE 1,2,3,4,5 DIGITOS
        String numApalabra;
        int unDig = 0;
        int dosDig = 0;
        int tresDig = 0;
        int cuatroDig = 0;
        int cincoDig = 0;
        
        for (int i=0; i< vec.length; i++){
            numApalabra = String.valueOf(vec[i]);
            switch(numApalabra.length()){
                case 1 :
                    unDig++;
                    break;
                case 2 :
                    dosDig+=1;
                    break;
                case 3:
                    tresDig+=1;
                    break;
                case 4 :
                    cuatroDig+=1;
                    break;
                case 5:
                    cincoDig+=1;
                    break;
            }
        }
        System.out.println("");
        System.out.println("Un digito " + unDig);
        System.out.println("Dos digitos " + dosDig);
        System.out.println("Tres digitos " +tresDig);
        System.out.println("Cuatro digitos " +cuatroDig);
        System.out.println("Cinco digitos " +cincoDig);
    }
    
    
}

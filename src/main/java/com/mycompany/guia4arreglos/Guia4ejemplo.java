/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia4arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia4ejemplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String [] equipo = new String [5];
        
        for (int i = 0; i < 5; i++){
            equipo[i]= leer.next();
        }
        
        for(int i = 0; i <5 ; i++){
        System.out.println("[" + equipo[i] + "]");
    }
    }
}

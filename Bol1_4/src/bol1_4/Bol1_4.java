/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_4;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe el primero número:");
        Scanner numero1= new Scanner (System.in);
        float num1 = numero1.nextFloat();
        System.out.println("Escribe el segundo número:");
        Scanner numero2= new Scanner (System.in);
        float num2 = numero2.nextFloat();
        
        System.out.println("Suma = "+ (num1 + num2));
        System.out.println("Resta = "+ (num1 - num2));
        System.out.println("Multiplicación = "+ (num1*num2));
        System.out.println("División = "+ (num1/num2));
        
    }
    
}

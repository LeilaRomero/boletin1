/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_3;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Añade una cantidad de Euros: ");
        Scanner euro= new Scanner (System.in);
        float euros =  euro.nextFloat();
        System.out.println("Añade una cantidad de Dolares: ");
        Scanner dolares= new Scanner (System.in);
        float dolar = dolares.nextFloat();
        System.out.println("Cambio = "+ euros*dolar);
        
        

        
    }
    
}

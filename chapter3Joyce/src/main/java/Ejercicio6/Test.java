/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Que quieres hacer convertir a pulgadas[0] o  a galones[1]");
        int decide = pen.nextInt();
        System.out.println("Dame el numero que quieres convetir:");
        MetricConversion pulga = new MetricConversion(pen.nextInt());
        if(decide==1){
            System.out.println(pulga.conversionGalon());
        }else{
            System.out.println(pulga.conversionPulgada());
        }
        
    }
}

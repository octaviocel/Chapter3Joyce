/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
       
        Scanner pen =new  Scanner(System.in);
        System.out.println("Dame los tres parametros de cuarto longitud/ancho/alto");
        PaintCalculator room = new PaintCalculator(pen.nextDouble(),pen.nextDouble(),pen.nextDouble());
        
        System.out.println(room.needGallons());
        System.out.println(room.price());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        ArithmeticMethods objeto = new ArithmeticMethods(20);
        
        System.out.println(objeto.displayNumberPlus10());
        System.out.println(objeto.displayNumberPlus100());
        System.out.println(objeto.displayNumberPlus1000());
        
        Scanner pen = new Scanner(System.in);
        System.out.println("\n\nDame dos numeros para hacer los metodos");
        ArithmeticMethods2 obj = new ArithmeticMethods2(pen.nextInt(),pen.nextInt());
        System.out.println(obj.displayNumberPlus10());
        System.out.println(obj.displayNumberPlus100());
        System.out.println(obj.displayNumberPlus1000());
    }
}

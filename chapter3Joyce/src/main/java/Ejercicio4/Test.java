/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Percentages p = new Percentages(20.0, 100.0);
        System.out.println("El porcentaje de los primeros digitos es: " + p.computePercent());

        System.out.println("Dame dos dijitos ");
        Percentages2 p2 = new Percentages2(pen.nextDouble(), pen.nextDouble());
        System.out.println("El porcentaje es: " + p2.computePercent());
    }
}

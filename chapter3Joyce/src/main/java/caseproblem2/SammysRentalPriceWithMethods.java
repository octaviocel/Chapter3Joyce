/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SammysRentalPriceWithMethods {
    
    public static void main(String[] args) {
        
        logo();
        pago(renta());
    }
    
    public static void logo(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<   Sammy’s Seashore   <");
        System.out.println("< Rents Beach Equipmen <");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
    }
    
    public static Integer renta(){
        Scanner pen = new Scanner(System.in);
        System.out.println("Dame los minutos que rentas");        
        return  pen.nextInt();
    }
    
    public static void pago(Integer min){
        
        System.out.println("Horas completas: " + min / 60);
        System.out.println("Minutos: " + min % 60);
        System.out.println("Precio: $" + ((min / 60) * 40) + (min % 60));
    }
    
    public static void mostrar(Rental re){
        System.out.println(String.format("Renta No. %s\nHoras: %d\nMinutos: %d\nCosto total: $%d", re.getContrato(),re.getHoras(),re.getMin(),re.getPrecio()));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CarlysEventPriceWithMethods {
    public static void main(String[] args) {
        
        logo();
        costo(solicitudUsuario());
        
        
    }
    
    public static Integer solicitudUsuario(){
        Scanner pen = new Scanner(System.in);
        System.out.println("Dame el numero de invitados: ");
        
        return pen.nextInt();
    }
    
    public static void logo(){
        System.out.println("----------------------");
        System.out.println("-  Carly’s Catering  -");
        System.out.println("-    party foods     -");
        System.out.println("----------------------");
    }
    
    public static void costo(Integer a){
        System.out.println("Precio por invitado $35");
        if(a >= 50){
            System.out.println("Evento grande");
        }else{
            System.out.println("Evento chico");
        }
    }
}

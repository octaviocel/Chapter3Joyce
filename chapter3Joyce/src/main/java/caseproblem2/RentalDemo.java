/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class RentalDemo {
    public static void main(String[] args) {
        
        Rental ren=new Rental();
        
        SammysRentalPriceWithMethods.logo();
        ren.setContrato("K2836");
        ren.setHorasAndMin(48, 12);
        
        SammysRentalPriceWithMethods.mostrar(ren);
    }
}

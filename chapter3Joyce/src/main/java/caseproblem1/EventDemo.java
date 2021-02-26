/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class EventDemo {
    public static void main(String[] args) {
        
        Event eve = new Event();
        CarlysEventPriceWithMethods.logo();
        eve.setEvento("M284");
        eve.setInvitados(754);
        System.out.println(String.format("Evento No. %s\nNo. de invitados %d\nCosto del evento: $%d", eve.getNevento(),eve.getInvitados(),eve.getPrecio()));
        CarlysEventPriceWithMethods.costo(eve.getInvitados());
        
    }
}

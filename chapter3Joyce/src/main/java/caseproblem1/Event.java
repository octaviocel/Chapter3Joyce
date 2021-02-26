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
public class Event {
    private final static int precioinvitado = 35;
    private final static int tipoevento = 50;
    
    private String nevento;
    private Integer invitados;
    private Integer precio;

    public void setEvento(String nevento) {
        this.nevento = nevento;
    }

    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
        this.precio= invitados*precioinvitado;
    }

    public String getNevento() {
        return nevento;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrecio() {
        return precio;
    }


    
    
}

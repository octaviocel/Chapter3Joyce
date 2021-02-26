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
public class Rental {

    private final static int hora = 60;
    private final static int rentahora = 40;
    
    private String contrato;
    private Integer horas;
    private Integer min;
    private Integer precio;

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setHorasAndMin(Integer horas, Integer min) {
        this.horas = horas;
        this.min=min;
        this.precio=(this.horas*rentahora)+this.min;
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    
    
}

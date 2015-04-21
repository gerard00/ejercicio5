/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import fecha.Fecha;

/**
 *
 * @author 203pc1
 */
public class Evento {
    private Fecha dia;
    private int hora;
    private String evento;

    public Evento(Fecha dia, int hora, String evento) {
        this.dia = dia;
        this.hora = hora;
        this.evento = evento;
    }
    
    
    
}

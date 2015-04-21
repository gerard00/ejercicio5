/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author 203pc1
 */
public class Usuario {
    private String login;
    private String usuario;
    private String contra;
    private int tipoUsuario;
    private int identificador;
    ArrayList<Evento> agenda;
    
    public Usuario(String login, String usuario, String contra, int tipoUsuario,int identificador) {
        this.login = login;
        this.usuario = usuario;
        this.contra = contra;
        this.tipoUsuario= tipoUsuario;
        this.identificador=identificador;
        agenda=new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public int getIdentificador() {
        return identificador;
    }

    public ArrayList<Evento> getAgenda() {
        return agenda;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }
    
    
    
}

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
public class Agendas {
   ArrayList <Usuario>  usuarios;

    public Agendas() {
        
        usuarios=new ArrayList<>();
        Usuario u = new Usuario("maria", "maria pardo", "pardo",0,1);
        Usuario e = new Usuario("gerardo", "Gerardo Moral", "moral",1,2);
        usuarios.add(u);
        usuarios.add(e);
    }
    
    public int Buscar(String l, String c){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<usuarios.size()){
            if(usuarios.get(pos).getLogin().equals(l)&& usuarios.get(pos).getContra().equals(c))
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
   
    public ArrayList<Usuario> getMisUsuarios() {
        return usuarios;
    }
    public int tipo(int pos){
         return  usuarios.get(pos).getTipoUsuario();
        
   }
     public int BuscarUsuario(String l){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<usuarios.size()){
            if(usuarios.get(pos).getLogin().equals(l))
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
     
      public void anadir (Usuario e){
       usuarios.add(e);
   }
      
      public int BuscarIdentificador(int l){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<usuarios.size()){
            if(usuarios.get(pos).getIdentificador()==l)
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
    public int identificador(int i){
       return usuarios.get(i).getIdentificador();
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Datos.Agendas;
import javax.swing.JFrame;

/**
 *
 * @author 203pc1
 */
public class VentanaUsuario extends javax.swing.JFrame {
    pnlModificaciones pnlModifi;
    pnlAlta palta;
   Agendas agenda;
   int usuarioValidado;
    public VentanaUsuario() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }
    
    public VentanaUsuario(Agendas agenda, int usuarioValidado) {
        this.agenda=agenda;
        this.usuarioValidado=usuarioValidado;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }
    
    private void quitarPaneles(){
    try{
        // GUARDAR EMAIL ANTES DE BORRAR PANEL PARA GUARDAR CAMBIOS
        // CON PANELES NO HACE FALTA POR SER UN OBJETO SI ES UN PRIMITIVO SSSIII
       this.agenda = palta.getAgenda();
       this.remove(palta);
    }catch(Exception e){}
    try{
        // GUARDAR EMAIL ANTES DE BORRAR PANEL PARA GUARDAR CAMBIOS
        // CON PANELES NO HACE FALTA POR SER EMAIL UN OBJETO SI ES UN PRIMITIVO SSII
      this.agenda = pnlModifi.agenda;
       this.remove(pnlModifi);
    }catch(Exception e){}
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("USUARIOS");
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jMenuItem1.setText("Desconectar");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}

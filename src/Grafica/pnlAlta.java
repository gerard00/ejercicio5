/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Datos.Agendas;
import Datos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author 203pc1
 */
public class pnlAlta extends javax.swing.JPanel {
    Agendas agenda;
    /**
     * Creates new form pnlAlta
     */
    public pnlAlta(Agendas agenda) {
        this.agenda=agenda;
        initComponents();
    }

    public Agendas getAgenda() {
        return agenda;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox();
        pwdContra = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pwdContra1 = new javax.swing.JPasswordField();
        btnGrabar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();

        jLabel1.setText("Usuario");

        jLabel2.setText("Login");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Tipo usuario");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Alta nuevo usuario");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuario" }));

        jLabel7.setText("Repetir contraseña");

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jLabel6.setText("Identificador");

        txtIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGrabar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pwdContra1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtLogin))
                                .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdContra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        
        String login=txtLogin.getText();
        String contra=new String(pwdContra.getPassword());
        String contra2=new String(pwdContra1.getPassword());
        int tipo=cmbTipoUsuario.getSelectedIndex();
        
        boolean correcto=true;
        int identificador=0;
        try {
           identificador= Integer.parseInt(txtIdentificador.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "EL IDENTIFICADOR DEBE SER UN NUMERO","ERROR", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            correcto=false;
        }
        //COMPROBAR CONTRASEÑAS NO COINCIDEN (DEBE COINCIDIR MAYUSCULAS Y MINUSCULAS
        if(!contra.equals(contra2)){
            JOptionPane.showMessageDialog(this, "LAS CONTRASEÑAS NO COINCIDEN","ERROR", JOptionPane.ERROR_MESSAGE);
            pwdContra.setText("");
            pwdContra1.setText("");
            correcto=false;
        }
        // COMPROBAR NO EXISTA EL LOGIN (METODO EN EMPRESA
         else if (agenda.BuscarUsuario(login)!=-1){
            JOptionPane.showMessageDialog(this, "YA EXISTE EL USUARIO","ERROR", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            correcto=false;
         }
        else if (agenda.BuscarIdentificador(identificador)!=-1){
            JOptionPane.showMessageDialog(this, "YA EXISTE EL IDENTIFICADOR","ERROR", JOptionPane.ERROR_MESSAGE);
            txtIdentificador.setText("");
            correcto=false;
        } 
        if (correcto) {
            Usuario e=new Usuario(login, txtUsuario.getText(), contra, tipo, identificador);
            agenda.anadir(e);
            pwdContra.setText("");
            pwdContra1.setText("");
            txtIdentificador.setText("");
            txtUsuario.setText("");
            txtLogin.setText("");
            JOptionPane.showMessageDialog(this, "Usuario creado");
        }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbTipoUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JPasswordField pwdContra1;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

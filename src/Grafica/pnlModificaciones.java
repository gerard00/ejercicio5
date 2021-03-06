/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Datos.Agendas;
import Datos.Usuario;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author 203pc1
 */
public class pnlModificaciones extends javax.swing.JPanel {

   Agendas agenda;
   VentanaAdministrador ventana;
   //para el jlist
   private DefaultListModel modelo;
    public pnlModificaciones(Agendas agenda) {
        this.agenda=agenda;
        initComponents();
    }
    
    public pnlModificaciones( Agendas agenda, VentanaAdministrador administrador) {
       //INSTANCIAR MODELOS SIIEMMPRREEE
        modelo= new DefaultListModel();
        this.agenda = agenda;
        //para volver a administrador al cancelar
        this.ventana = administrador;
        
        initComponents();
        
        
        // SE RELLENA DEBAJO DE INICIAR SINO NO HABRIA COMPONENTE PARA MOSTRARLOS
        cargaEmpleados();
    }
    
    private void cargaEmpleados(){
        ArrayList<Usuario> misUsuarios=agenda.getMisUsuarios();
        // AÑADIR TODOS LOS DATOS DE LA COLECCION MIS EMPLEADOS
        for (int i=0; i<misUsuarios.size(); i++){
            modelo.addElement(misUsuarios.get(i).getUsuario());
        }
         //ASI SOLO MUESTRA LA DIRECCION NO LOS DATOS
        
       lstUsuarios.setModel(modelo);
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();
        pwdContra = new javax.swing.JPasswordField();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lstUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MODIFICACION USUARIO");

        jLabel2.setText("IDENTIFICADOR");

        jLabel3.setText("USUARIO");

        jLabel4.setText("CONTRASEÑA");

        jLabel5.setText("NOMBRE");

        jLabel6.setText("TIPO USUARIO");

        txtIdentificador.setEnabled(false);

        txtLogin.setEnabled(false);
        txtLogin.setPreferredSize(new java.awt.Dimension(15, 20));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGrabar.setText("Grabar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(txtIdentificador)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(pwdContra, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                    .addComponent(txtNombre)))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrabar)
                                .addGap(32, 32, 32)
                                .addComponent(btnCancelar)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGrabar)
                            .addComponent(btnCancelar))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void lstUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUsuariosValueChanged
        // TODO add your handling code here:
        //txtLogin.setText(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getLogin());
        txtNombre.setText(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getUsuario());
       txtLogin.setText(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getLogin());
       pwdContra.setText(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getContra());
       txtIdentificador.setText(String.valueOf(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getIdentificador()));
       cmbTipo.setSelectedIndex(agenda.getMisUsuarios().get(lstUsuarios.getSelectedIndex()).getTipoUsuario()-1);
    }//GEN-LAST:event_lstUsuariosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstUsuarios;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

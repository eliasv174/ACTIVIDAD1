/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author ELIAS VILLATORO
 */
public class frm_personas extends javax.swing.JFrame {

    /**
     * Creates new form frm_personas
     */
    public frm_personas() {
        initComponents();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_principal = new javax.swing.JTabbedPane();
        pnl_clientes = new javax.swing.JPanel();
        lbl_titulo_clientes = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_nacimiento = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_nacimiento1 = new javax.swing.JTextField();
        lbl_nacimiento1 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        lbl_telefono1 = new javax.swing.JLabel();
        txt_direccion1 = new javax.swing.JTextField();
        lbl_direccion1 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        lbl_apellidos1 = new javax.swing.JLabel();
        txt_nombres1 = new javax.swing.JTextField();
        lbl_nombres1 = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();
        lbl_nit1 = new javax.swing.JLabel();
        lbl_nit2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_titulo_clientes1 = new javax.swing.JLabel();
        btn_crearEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo_clientes.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lbl_titulo_clientes.setForeground(new java.awt.Color(0, 102, 0));
        lbl_titulo_clientes.setText("FORMULARIO CLIENTES");

        lbl_nit.setText("Nit:");

        lbl_nombres.setText("Nombres:");

        lbl_apellidos.setText("Apellidos:");

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        lbl_direccion.setText("Direccion:");

        lbl_telefono.setText("Telefono:");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        lbl_nacimiento.setText("Nacimiento:");

        btn_crear.setBackground(new java.awt.Color(0, 51, 0));
        btn_crear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(153, 255, 102));
        btn_crear.setText("CREAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_clientesLayout = new javax.swing.GroupLayout(pnl_clientes);
        pnl_clientes.setLayout(pnl_clientesLayout);
        pnl_clientesLayout.setHorizontalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_clientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo_clientes)
                .addGap(202, 202, 202))
            .addGroup(pnl_clientesLayout.createSequentialGroup()
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btn_crear))
                    .addGroup(pnl_clientesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_nit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_nombres, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apellidos)
                            .addComponent(txt_nombres)
                            .addComponent(txt_nit)
                            .addComponent(txt_direccion)
                            .addComponent(txt_telefono)
                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        pnl_clientesLayout.setVerticalGroup(
            pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo_clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nacimiento))
                .addGap(13, 13, 13)
                .addComponent(btn_crear)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tp_principal.addTab("Clientes", pnl_clientes);

        lbl_nacimiento1.setText("Nacimiento:");

        txt_telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono1ActionPerformed(evt);
            }
        });

        lbl_telefono1.setText("Telefono:");

        lbl_direccion1.setText("Direccion:");

        txt_apellidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidos1ActionPerformed(evt);
            }
        });

        lbl_apellidos1.setText("Apellidos:");

        txt_nombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres1ActionPerformed(evt);
            }
        });

        lbl_nombres1.setText("Nombres:");

        lbl_nit1.setText("Puesto:");

        lbl_nit2.setText("ID empleado:");

        lbl_titulo_clientes1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lbl_titulo_clientes1.setForeground(new java.awt.Color(0, 102, 0));
        lbl_titulo_clientes1.setText("FORMULARIO EMPLEADO");

        btn_crearEmpleado.setBackground(new java.awt.Color(0, 51, 0));
        btn_crearEmpleado.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_crearEmpleado.setForeground(new java.awt.Color(153, 255, 102));
        btn_crearEmpleado.setText("CREAR");
        btn_crearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_nit2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_nombres1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_apellidos1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_direccion1))
                                        .addComponent(lbl_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_nacimiento1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_apellidos1)
                                        .addComponent(txt_nombres1)
                                        .addComponent(txt_direccion1)
                                        .addComponent(txt_telefono1)
                                        .addComponent(txt_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(lbl_nit1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btn_crearEmpleado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lbl_titulo_clientes1)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo_clientes1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nit2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres1)
                    .addComponent(txt_nombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono1)
                    .addComponent(txt_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nacimiento1)
                    .addComponent(btn_crearEmpleado))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tp_principal.addTab("Empleado", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        // TODO add your handling code here:
        Cliente obj_cliente = new Cliente();
        obj_cliente.setNit(this.txt_nit.getText());
        obj_cliente.setNombres(this.txt_nombres.getText());
        obj_cliente.setApellidos(this.txt_apellidos.getText());
        obj_cliente.setDireccion(this.txt_direccion.getText());
        obj_cliente.setTelefono(this.txt_telefono.getText());
        obj_cliente.setFecha_nacimiento(this.txt_nacimiento.getText());
        
        obj_cliente.crear();
    }//GEN-LAST:event_btn_crearActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono1ActionPerformed

    private void txt_apellidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidos1ActionPerformed

    private void txt_nombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres1ActionPerformed

    private void btn_crearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEmpleadoActionPerformed
        // TODO add your handling code here:
        Empleado obj_empleado = new Empleado();
        
        obj_empleado.setId(this.txt_id.getText());
        obj_empleado.setNombres(this.txt_nombres1.getText());
        obj_empleado.setApellidos(this.txt_apellidos1.getText());
        obj_empleado.setDireccion(this.txt_direccion1.getText());
        obj_empleado.setTelefono(this.txt_telefono1.getText());
        obj_empleado.setFecha_nacimiento(this.txt_nacimiento1.getText());
        
        obj_empleado.crear();
    }//GEN-LAST:event_btn_crearEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_personas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_crearEmpleado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_apellidos1;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_direccion1;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nacimiento1;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nit1;
    private javax.swing.JLabel lbl_nit2;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nombres1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_telefono1;
    private javax.swing.JLabel lbl_titulo_clientes;
    private javax.swing.JLabel lbl_titulo_clientes1;
    private javax.swing.JPanel pnl_clientes;
    private javax.swing.JTabbedPane tp_principal;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_direccion1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nacimiento1;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_nombres1;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables
}

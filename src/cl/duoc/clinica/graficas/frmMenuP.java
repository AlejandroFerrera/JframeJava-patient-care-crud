/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.duoc.clinica.graficas;

import java.awt.Color;

/**
 *
 * @author Esteb
 */
public class frmMenuP extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public frmMenuP() {
        initComponents();
        frmMantenedorAtenciones ma = new frmMantenedorAtenciones();
        ma.setSize(600, 410);
        ma.setLocation(0,0);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mmBackGround = new javax.swing.JPanel();
        menuBackGround = new javax.swing.JPanel();
        titletxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        atencionesButton = new javax.swing.JPanel();
        atencionesButton_txt = new javax.swing.JLabel();
        especialidadesButton = new javax.swing.JPanel();
        especialidadesButton_txt1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JPanel();
        txtCerrarSesion = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mmBackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBackGround.setBackground(new java.awt.Color(0, 135, 193));

        titletxt.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        titletxt.setForeground(new java.awt.Color(255, 255, 255));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("MENU PRINCIPAL");

        atencionesButton.setBackground(new java.awt.Color(0, 0, 255));
        atencionesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atencionesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atencionesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atencionesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atencionesButtonMouseExited(evt);
            }
        });

        atencionesButton_txt.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        atencionesButton_txt.setForeground(new java.awt.Color(255, 255, 255));
        atencionesButton_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atencionesButton_txt.setText("MANTENEDOR ATENCIONES");

        javax.swing.GroupLayout atencionesButtonLayout = new javax.swing.GroupLayout(atencionesButton);
        atencionesButton.setLayout(atencionesButtonLayout);
        atencionesButtonLayout.setHorizontalGroup(
            atencionesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atencionesButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atencionesButton_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        atencionesButtonLayout.setVerticalGroup(
            atencionesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atencionesButton_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        especialidadesButton.setBackground(new java.awt.Color(0, 0, 255));
        especialidadesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        especialidadesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                especialidadesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                especialidadesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                especialidadesButtonMouseExited(evt);
            }
        });

        especialidadesButton_txt1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        especialidadesButton_txt1.setForeground(new java.awt.Color(255, 255, 255));
        especialidadesButton_txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        especialidadesButton_txt1.setText("MANTENEDOR ESPECIALIDADES");

        javax.swing.GroupLayout especialidadesButtonLayout = new javax.swing.GroupLayout(especialidadesButton);
        especialidadesButton.setLayout(especialidadesButtonLayout);
        especialidadesButtonLayout.setHorizontalGroup(
            especialidadesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(especialidadesButton_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        especialidadesButtonLayout.setVerticalGroup(
            especialidadesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(especialidadesButton_txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        loginButton.setBackground(new java.awt.Color(204, 0, 153));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

        txtCerrarSesion.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        txtCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrarSesion.setText("CERRAR SESION");

        javax.swing.GroupLayout loginButtonLayout = new javax.swing.GroupLayout(loginButton);
        loginButton.setLayout(loginButtonLayout);
        loginButtonLayout.setHorizontalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginButtonLayout.setVerticalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuBackGroundLayout = new javax.swing.GroupLayout(menuBackGround);
        menuBackGround.setLayout(menuBackGroundLayout);
        menuBackGroundLayout.setHorizontalGroup(
            menuBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atencionesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuBackGroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(menuBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titletxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(especialidadesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuBackGroundLayout.setVerticalGroup(
            menuBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBackGroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(atencionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(especialidadesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        mmBackGround.add(menuBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 410));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/Clinica San Buenaventura.png"))); // NOI18N

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
        );

        mmBackGround.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 520, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mmBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atencionesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionesButtonMouseEntered
        atencionesButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_atencionesButtonMouseEntered

    private void atencionesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionesButtonMouseExited
        atencionesButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_atencionesButtonMouseExited

    private void especialidadesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especialidadesButtonMouseEntered
        especialidadesButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_especialidadesButtonMouseEntered

    private void especialidadesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especialidadesButtonMouseExited
        especialidadesButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_especialidadesButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(204,0,153));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        frmLogin log = new frmLogin();
        log.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_loginButtonMouseClicked

    private void especialidadesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especialidadesButtonMouseClicked
        frmMantenedorEspecialidades me = new frmMantenedorEspecialidades();
        me.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_especialidadesButtonMouseClicked

    private void atencionesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionesButtonMouseClicked
        frmMantenedorAtenciones ma = new frmMantenedorAtenciones();
        ma.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_atencionesButtonMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel atencionesButton;
    private javax.swing.JLabel atencionesButton_txt;
    private javax.swing.JPanel especialidadesButton;
    private javax.swing.JLabel especialidadesButton_txt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginButton;
    private javax.swing.JPanel menuBackGround;
    private javax.swing.JPanel mmBackGround;
    private javax.swing.JLabel titletxt;
    private javax.swing.JLabel txtCerrarSesion;
    // End of variables declaration//GEN-END:variables
}

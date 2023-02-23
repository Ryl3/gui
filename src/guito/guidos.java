/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guito;

import java.awt.Color;
import internalpacks.*;

public class guidos extends javax.swing.JFrame {

    /**
     * Creates new form guidos
     */
    public guidos() {
        initComponents();
    }

    Color navc = new Color(0,51,204);
    Color headerc = new Color(0,255,255);
    Color bodyc = new Color(0,102,255);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        dashboardpanel = new javax.swing.JPanel();
        dash = new javax.swing.JLabel();
        userp = new javax.swing.JPanel();
        yuser = new javax.swing.JLabel();
        reprts = new javax.swing.JPanel();
        rep = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        body = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        nav.setBackground(new java.awt.Color(0, 51, 204));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardpanel.setBackground(new java.awt.Color(0, 51, 204));
        dashboardpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardpanelMouseExited(evt);
            }
        });
        dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dash.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        dash.setForeground(new java.awt.Color(240, 240, 240));
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setText("Dashboard");
        dashboardpanel.add(dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        nav.add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, 50));

        userp.setBackground(new java.awt.Color(0, 51, 204));
        userp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpMouseExited(evt);
            }
        });
        userp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yuser.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        yuser.setForeground(new java.awt.Color(240, 240, 240));
        yuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yuser.setText("User Page");
        userp.add(yuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        nav.add(userp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 50));

        reprts.setBackground(new java.awt.Color(0, 51, 204));
        reprts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reprtsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reprtsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reprtsMouseExited(evt);
            }
        });
        reprts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        rep.setForeground(new java.awt.Color(240, 240, 240));
        rep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rep.setText("Reports");
        reprts.add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        nav.add(reprts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 50));

        jPanel1.add(nav);
        nav.setBounds(0, 0, 120, 450);

        header.setBackground(new java.awt.Color(0, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel2.setText("Welcome to the Almighty Crib");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(109, 109, 109))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header);
        header.setBounds(120, 0, 730, 70);

        body.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel1.setText("also known as \"insert cool name here\"");

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel3.setText("sir Cuuks Allote created and started a new ");

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel4.setText("a long time ago, there was a shortage");

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setText("of quality good food thats why our hero");

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel6.setText("twist into attracting customers and it ");

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel7.setText("boomed like a nuclear bomb and since ");

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel8.setText("then it became a household name. whoosh!");

        body.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        body.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(body);
        body.setBounds(120, 70, 730, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardpanelMouseEntered
        dashboardpanel.setBackground(bodyc);
    }//GEN-LAST:event_dashboardpanelMouseEntered

    private void dashboardpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardpanelMouseExited
        dashboardpanel.setBackground(navc);
    }//GEN-LAST:event_dashboardpanelMouseExited

    private void userpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpMouseEntered
        userp.setBackground(bodyc);
    }//GEN-LAST:event_userpMouseEntered

    private void userpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpMouseExited
        userp.setBackground(navc);
    }//GEN-LAST:event_userpMouseExited

    private void reprtsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseEntered
        reprts.setBackground(bodyc);
    }//GEN-LAST:event_reprtsMouseEntered

    private void reprtsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseExited
       reprts.setBackground(navc);
    }//GEN-LAST:event_reprtsMouseExited

    private void userpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpMouseClicked
        settings shet = new settings();
        body.add(shet).setVisible(true);
    }//GEN-LAST:event_userpMouseClicked

    private void dashboardpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardpanelMouseClicked
        dass des = new dass();
        body.add(des).setVisible(true);
    }//GEN-LAST:event_dashboardpanelMouseClicked

    private void reprtsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseClicked
        syap bai = new syap();
        body.add(bai).setVisible(true);
    }//GEN-LAST:event_reprtsMouseClicked

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
            java.util.logging.Logger.getLogger(guidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane body;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel rep;
    private javax.swing.JPanel reprts;
    private javax.swing.JPanel userp;
    private javax.swing.JLabel yuser;
    // End of variables declaration//GEN-END:variables
}

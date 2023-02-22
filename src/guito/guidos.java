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
        Settings = new javax.swing.JPanel();
        sett = new javax.swing.JLabel();
        Shop = new javax.swing.JPanel();
        shop = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        body = new javax.swing.JDesktopPane();

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

        Settings.setBackground(new java.awt.Color(0, 51, 204));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sett.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        sett.setForeground(new java.awt.Color(240, 240, 240));
        sett.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sett.setText("Settings");
        Settings.add(sett, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        nav.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 50));

        Shop.setBackground(new java.awt.Color(0, 51, 204));
        Shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShopMouseExited(evt);
            }
        });
        Shop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shop.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        shop.setForeground(new java.awt.Color(240, 240, 240));
        shop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shop.setText("Shop");
        Shop.add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        nav.add(Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 50));

        jPanel1.add(nav);
        nav.setBounds(0, 0, 120, 450);

        header.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(header);
        header.setBounds(120, 0, 730, 70);

        body.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
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

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setBackground(bodyc);
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        Settings.setBackground(navc);
    }//GEN-LAST:event_SettingsMouseExited

    private void ShopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseEntered
        Shop.setBackground(bodyc);
    }//GEN-LAST:event_ShopMouseEntered

    private void ShopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseExited
       Shop.setBackground(navc);
    }//GEN-LAST:event_ShopMouseExited

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        settings shet = new settings();
        body.add(shet).setVisible(true);
    }//GEN-LAST:event_SettingsMouseClicked

    private void dashboardpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardpanelMouseClicked
        dass des = new dass();
        body.add(des).setVisible(true);
    }//GEN-LAST:event_dashboardpanelMouseClicked

    private void ShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseClicked
        syap bai = new syap();
        body.add(bai).setVisible(true);
    }//GEN-LAST:event_ShopMouseClicked

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
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Shop;
    private javax.swing.JDesktopPane body;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel sett;
    private javax.swing.JLabel shop;
    // End of variables declaration//GEN-END:variables
}

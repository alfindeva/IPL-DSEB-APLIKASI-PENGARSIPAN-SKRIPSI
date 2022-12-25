/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan_skripsi;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

/*
 *
 * @author  3411201085 Adhani Mulianti
            3411201089 Rayi Syifa Adriana Firmansyah
            3411201090 Adisti Dwi Susanti
            3411201094 Alfin Gerliandeva
 */
public class Form_mainMenu extends javax.swing.JFrame {

   /**
     * Creates new form Form_mainMenu
     */
    public Form_mainMenu() {
        initComponents();
        initUI();
    }
    
    private void initUI(){
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jP_menu2 = new javax.swing.JPanel();
        btn_mahasiswa = new javax.swing.JButton();
        btn_dosen = new javax.swing.JButton();
        btn_skripsi = new javax.swing.JButton();
        btn_kategori_skripsi = new javax.swing.JButton();
        btn_cari_skripsi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1180, 720));
        setResizable(false);

        jP_menu.setBackground(new java.awt.Color(74, 101, 114));
        jP_menu.setPreferredSize(new java.awt.Dimension(912, 142));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU UTAMA");

        javax.swing.GroupLayout jP_menuLayout = new javax.swing.GroupLayout(jP_menu);
        jP_menu.setLayout(jP_menuLayout);
        jP_menuLayout.setHorizontalGroup(
            jP_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_menuLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addGap(450, 450, 450))
        );
        jP_menuLayout.setVerticalGroup(
            jP_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_menuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
        );

        jP_menu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 101, 114)));

        btn_mahasiswa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_mahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/user-graduate-solid.png"))); // NOI18N
        btn_mahasiswa.setText("DATA MAHASISWA");
        btn_mahasiswa.setPreferredSize(new java.awt.Dimension(215, 135));
        btn_mahasiswa.setRolloverEnabled(false);
        btn_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahasiswaActionPerformed(evt);
            }
        });

        btn_dosen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_dosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/user-tie-solid.png"))); // NOI18N
        btn_dosen.setText("DATA DOSEN");
        btn_dosen.setPreferredSize(new java.awt.Dimension(215, 135));
        btn_dosen.setRolloverEnabled(false);
        btn_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosenActionPerformed(evt);
            }
        });

        btn_skripsi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_skripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/book-solid.png"))); // NOI18N
        btn_skripsi.setText("DATA SKRIPSI");
        btn_skripsi.setPreferredSize(new java.awt.Dimension(215, 135));
        btn_skripsi.setRolloverEnabled(false);
        btn_skripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_skripsiActionPerformed(evt);
            }
        });

        btn_kategori_skripsi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_kategori_skripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/book-open-solid.png"))); // NOI18N
        btn_kategori_skripsi.setText("DATA KATEGORI SKRIPSI");
        btn_kategori_skripsi.setPreferredSize(new java.awt.Dimension(215, 135));
        btn_kategori_skripsi.setRolloverEnabled(false);
        btn_kategori_skripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kategori_skripsiActionPerformed(evt);
            }
        });

        btn_cari_skripsi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cari_skripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/search-solid.png"))); // NOI18N
        btn_cari_skripsi.setText("DATA PENCARIAN SKRIPSI");
        btn_cari_skripsi.setPreferredSize(new java.awt.Dimension(215, 135));
        btn_cari_skripsi.setRolloverEnabled(false);
        btn_cari_skripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_skripsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_menu2Layout = new javax.swing.GroupLayout(jP_menu2);
        jP_menu2.setLayout(jP_menu2Layout);
        jP_menu2Layout.setHorizontalGroup(
            jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_menu2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_kategori_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(btn_mahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(btn_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(btn_cari_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jP_menu2Layout.setVerticalGroup(
            jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_menu2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_skripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jP_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cari_skripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kategori_skripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(jP_menu2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btn_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jP_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jP_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahasiswaActionPerformed
        // TODO add your handling code here:
        new Form_dataMahasiswa().setVisible(true);
    }//GEN-LAST:event_btn_mahasiswaActionPerformed

    private void btn_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosenActionPerformed
        // TODO add your handling code here:
        new Form_dataDosen().setVisible(true);
    }//GEN-LAST:event_btn_dosenActionPerformed

    private void btn_kategori_skripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kategori_skripsiActionPerformed
        // TODO add your handling code here:
        new Form_kategoriSkripsi().setVisible(true);
    }//GEN-LAST:event_btn_kategori_skripsiActionPerformed

    private void btn_cari_skripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_skripsiActionPerformed
        // TODO add your handling code here:
        new Pencarian_Skripsi().setVisible(true);
    }//GEN-LAST:event_btn_cari_skripsiActionPerformed

    private void btn_skripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_skripsiActionPerformed
        // TODO add your handling code here:
        new Form_dataSkripsi().setVisible(true);
    }//GEN-LAST:event_btn_skripsiActionPerformed

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
            java.util.logging.Logger.getLogger(Form_mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari_skripsi;
    private javax.swing.JButton btn_dosen;
    private javax.swing.JButton btn_kategori_skripsi;
    private javax.swing.JButton btn_mahasiswa;
    private javax.swing.JButton btn_skripsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jP_menu;
    private javax.swing.JPanel jP_menu2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan_skripsi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 *
 * @author  3411201085 Adhani Mulianti
            3411201089 Rayi Syifa Adriana Firmansyah
            3411201090 Adisti Dwi Susanti
            3411201094 Alfin Gerliandeva
 */
public class Form_dataSkripsi extends javax.swing.JFrame {
    
    pengarsipan_skripsi.Koneksi konek = new pengarsipan_skripsi.Koneksi();
    /**
     * Creates new form Form_dataSkripsi
     */
    public Form_dataSkripsi() {
        initComponents();
        initUI();
        GetData();
        BtnEnabled(false);
        btn_simpan.setText("SIMPAN");
        Tampil();
        Tampil2();
        Tampil3();
    }
    
    private void initUI(){
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);   
    }
    
     private void TxtClear(){
        tf_id.setText("");
        cb_kode_skripsi.setSelectedIndex(0);
        tf_judul_skripsi.setText("");
        cb_nim_mahasiswa.setSelectedIndex(0);
        cb_nid_dosen.setSelectedIndex(0);
        cb_tahun.setSelectedIndex(0);
        tf_id.setVisible(false);
    }

    private void GetData(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT t_data_skripsi.id, t_data_skripsi.kode_skripsi, t_data_skripsi.judul, t_data_skripsi.nim, t_data_skripsi.nid, t_data_skripsi.tahun FROM t_data_skripsi");
            t_data_skripsi.setModel(DbUtils.resultSetToTableModel(sql));
            t_data_skripsi.getColumnModel().getColumn(0);
            t_data_skripsi.getColumnModel().getColumn(1);
            t_data_skripsi.getColumnModel().getColumn(2);
            t_data_skripsi.getColumnModel().getColumn(3);
            t_data_skripsi.getColumnModel().getColumn(4);
            t_data_skripsi.getColumnModel().getColumn(5);

            String count_rows = String.valueOf(t_data_skripsi.getRowCount());
            lbl_jumdata.setText("Jumlah Data : " + count_rows);
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void BtnEnabled(boolean x){
        btn_edit.setEnabled(x);
        btn_hapus.setEnabled(x);
    }
    
    private void GetData_View(){
        int row = t_data_skripsi.getSelectedRow();
        String row_id = (t_data_skripsi.getModel().getValueAt(row, 0).toString());
        tf_id.setText(row_id);
        BtnEnabled(true);
    }
    
    private void Tampil(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT t_kategori_skripsi.kode_skripsi FROM t_kategori_skripsi");
            
            while(sql.next()) {
                cb_kode_skripsi.addItem(sql.getString("kode_skripsi"));
            }
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Tampil2(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT t_data_mahasiswa.nim FROM t_data_mahasiswa");
            
            while(sql.next()) {
                cb_nim_mahasiswa.addItem(sql.getString("nim"));
            }
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Tampil3(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT t_data_dosen.nid FROM t_data_dosen");
            
            while(sql.next()) {
                cb_nid_dosen.addItem(sql.getString("nid"));
            }
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_id = new javax.swing.JTextField();
        jP_menu = new javax.swing.JPanel();
        lbl_data_skripsi = new javax.swing.JLabel();
        lbl_tambahdata = new javax.swing.JLabel();
        lbl_kode_skripsi = new javax.swing.JLabel();
        lbl_nim_mahasiswa = new javax.swing.JLabel();
        lbl_nid_dosen = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        t_skripsi = new javax.swing.JScrollPane();
        t_data_skripsi = new javax.swing.JTable();
        lbl_jumdata = new javax.swing.JLabel();
        lbl_judul_skripsi = new javax.swing.JLabel();
        tf_judul_skripsi = new javax.swing.JTextField();
        lbl_tahun = new javax.swing.JLabel();
        cb_kode_skripsi = new javax.swing.JComboBox<>();
        cb_nim_mahasiswa = new javax.swing.JComboBox<>();
        cb_nid_dosen = new javax.swing.JComboBox<>();
        cb_tahun = new javax.swing.JComboBox<>();

        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        setResizable(false);

        jP_menu.setBackground(new java.awt.Color(74, 101, 114));

        lbl_data_skripsi.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_data_skripsi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_data_skripsi.setText("DATA SKRIPSI");

        javax.swing.GroupLayout jP_menuLayout = new javax.swing.GroupLayout(jP_menu);
        jP_menu.setLayout(jP_menuLayout);
        jP_menuLayout.setHorizontalGroup(
            jP_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_data_skripsi)
                .addGap(315, 315, 315))
        );
        jP_menuLayout.setVerticalGroup(
            jP_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_data_skripsi)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        lbl_tambahdata.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_tambahdata.setText("Tambah Data");

        lbl_kode_skripsi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_kode_skripsi.setText("KODE SKRIPSI          :");

        lbl_nim_mahasiswa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_nim_mahasiswa.setText("NIM MAHASISWA       :");

        lbl_nid_dosen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_nid_dosen.setText("NID DOSEN                : ");

        btn_simpan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/save-solid.png"))); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/backward-solid.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_tambah.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/plus-solid.png"))); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/pen-solid.png"))); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/trash-solid.png"))); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pengarsipan_skripsi.assets/recycle-solid.png"))); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        t_data_skripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "KODE SKRIPSI", "JUDUL SKRIPSI", "NIM MAHASISWA", "NID DOSEN", "TAHUN DIBUAT"
            }
        ));
        t_data_skripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_data_skripsiMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                t_data_skripsiMouseReleased(evt);
            }
        });
        t_data_skripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_data_skripsiKeyReleased(evt);
            }
        });
        t_skripsi.setViewportView(t_data_skripsi);

        lbl_jumdata.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_jumdata.setText("Jumlah Data : ");

        lbl_judul_skripsi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_judul_skripsi.setText("JUDUL SKRIPSI        :");

        tf_judul_skripsi.setMaximumSize(new java.awt.Dimension(7, 20));
        tf_judul_skripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_judul_skripsiActionPerformed(evt);
            }
        });

        lbl_tahun.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_tahun.setText("TAHUN DIBUAT         : ");

        cb_kode_skripsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Skripsi" }));

        cb_nim_mahasiswa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM" }));

        cb_nid_dosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NID" }));

        cb_tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--TAHUN--", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tambahdata)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_nid_dosen)
                                .addComponent(lbl_nim_mahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_judul_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_tahun)
                            .addComponent(lbl_kode_skripsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tf_judul_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_kode_skripsi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_nim_mahasiswa, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_nid_dosen, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_tahun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(t_skripsi))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_jumdata)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jP_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lbl_tambahdata)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_edit)
                            .addComponent(btn_hapus)
                            .addComponent(btn_refresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_kode_skripsi)
                            .addComponent(lbl_kode_skripsi))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_judul_skripsi)
                            .addComponent(tf_judul_skripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nim_mahasiswa)
                            .addComponent(cb_nim_mahasiswa))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nid_dosen)
                            .addComponent(cb_nid_dosen))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tahun)
                            .addComponent(cb_tahun))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addComponent(t_skripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lbl_jumdata, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String row_id = tf_id.getText();
        String row_kode_skripsi = (String) cb_kode_skripsi.getSelectedItem();
        String row_judul_skripsi = tf_judul_skripsi.getText();
        String row_nim_mahasiswa = (String) cb_nim_mahasiswa.getSelectedItem();
        String row_nid_dosen = (String) cb_nid_dosen.getSelectedItem();
        String row_tahun = (String) cb_tahun.getSelectedItem();
        int c_kode = 0;

        if(!"".equals(row_kode_skripsi) && !"".equals(row_judul_skripsi) && !"".equals(row_nim_mahasiswa) && !"".equals(row_nid_dosen) && !"".equals(row_tahun)){
            try {
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT COUNT(t_data_skripsi.id) as count FROM t_data_skripsi WHERE t_data_skripsi.kode_skripsi='"+row_kode_skripsi+"'");
                sql.next();
                c_kode = sql.getInt("count");
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
            }

            if("".equals(row_id)){
                if(c_kode == 0)
                {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("INSERT INTO t_data_skripsi(kode_skripsi, judul, nim, nid, tahun) VALUES ('" + row_kode_skripsi + "', '" + row_judul_skripsi + "' , '" + row_nim_mahasiswa+ "', '" + row_nid_dosen+ "', '" + row_tahun+ "')");
                        JOptionPane.showMessageDialog(null, "Berhasil menyimpan data.");
                        btn_tambah.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kode Skripsi sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                if(c_kode == 0 || row_kode_skripsi.equals(row_kode_skripsi))
                {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("UPDATE t_data_skripsi SET kode_skripsi='" + row_kode_skripsi + "', judul='" + row_judul_skripsi + "' , nim='" + row_nim_mahasiswa + "', nid='" + row_nid_dosen + "', tahun='" + row_tahun + "' WHERE id = '" + row_id + "'");
                        JOptionPane.showMessageDialog(null, "Berhasil mengubah data.");
                        btn_tambah.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kode Skripsi sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong.");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        btn_tambah.doClick();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        lbl_tambahdata.setForeground(Color.black);
        lbl_tambahdata.setText("Tambah Data");
        t_data_skripsi.clearSelection();
        TxtClear();
        BtnEnabled(false);
        btn_simpan.setText("SIMPAN");
        cb_kode_skripsi.requestFocus();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        String row_id = tf_id.getText();
        if(!"0".equals(row_id)){
            try {
                btn_simpan.setText("SIMPAN");
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT t_data_skripsi.id, t_data_skripsi.kode_skripsi, t_data_skripsi.judul, t_data_skripsi.nim, t_data_skripsi.nid, t_data_skripsi.tahun FROM t_data_skripsi WHERE t_data_skripsi.id='"+row_id+"'");
                if(sql.next()){
                    String kode = sql.getString("kode_skripsi");
                    lbl_tambahdata.setText("Edit Data | " + kode);
                    tf_id.setText(sql.getString("id"));
                    cb_kode_skripsi.setSelectedItem(kode);
                    tf_judul_skripsi.setText(sql.getString("judul"));
                    cb_nim_mahasiswa.setSelectedItem(sql.getString("nim"));
                    cb_nid_dosen.setSelectedItem(sql.getString("nid"));
                    cb_tahun.setSelectedItem(sql.getString("tahun"));
                    cb_kode_skripsi.requestFocus();
                }
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan id null!");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(ok==0) {
            try {
                String row_id = tf_id.getText();
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM t_data_skripsi WHERE id = '" + row_id + "'");
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data.");
                btn_tambah.doClick();
                konek.closekoneksi();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_dataSkripsi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        GetData();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void t_data_skripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_data_skripsiMouseClicked
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_t_data_skripsiMouseClicked

    private void t_data_skripsiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_data_skripsiMouseReleased
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_t_data_skripsiMouseReleased

    private void t_data_skripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_data_skripsiKeyReleased
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_t_data_skripsiKeyReleased

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void tf_judul_skripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_judul_skripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_judul_skripsiActionPerformed

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
            java.util.logging.Logger.getLogger(Form_dataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_dataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_dataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_dataSkripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_dataSkripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cb_kode_skripsi;
    private javax.swing.JComboBox<String> cb_nid_dosen;
    private javax.swing.JComboBox<String> cb_nim_mahasiswa;
    private javax.swing.JComboBox<String> cb_tahun;
    private javax.swing.JPanel jP_menu;
    private javax.swing.JLabel lbl_data_skripsi;
    private javax.swing.JLabel lbl_judul_skripsi;
    private javax.swing.JLabel lbl_jumdata;
    private javax.swing.JLabel lbl_kode_skripsi;
    private javax.swing.JLabel lbl_nid_dosen;
    private javax.swing.JLabel lbl_nim_mahasiswa;
    private javax.swing.JLabel lbl_tahun;
    private javax.swing.JLabel lbl_tambahdata;
    private javax.swing.JTable t_data_skripsi;
    private javax.swing.JScrollPane t_skripsi;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_judul_skripsi;
    // End of variables declaration//GEN-END:variables
}

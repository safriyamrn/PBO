/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Safriya Murni
 */
public class TampilanBuku extends javax.swing.JFrame {
    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<BukuPOJO> dataPerpustakaan;
    
//insert 
    private int masukkanData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO buku (isbn, judul_buku, tahun_terbit, penerbit) VALUES(?, ?, ?, ?)");
        pst.setString(1, isbn);
        pst.setString(2, judul_buku);
        pst.setString(3, tahun_terbit);
        pst.setString(4, penerbit);
        return pst.executeUpdate();
    }
//update

    private int perbaruiData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("UPDATE buku SET judul_buku=?, tahun_terbit=?,penerbit=? WHERE isbn=?");
        pst.setString(1, judul_buku);
        pst.setString(2, tahun_terbit);
        pst.setString(3, penerbit);
        pst.setString(4, isbn);
        return pst.executeUpdate();
    }
//delete

    private int hapusData(Connection conn, String isbn) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("DELETE FROM buku WHERE isbn=?");
        pst.setString(1, isbn);
        return pst.executeUpdate();
    }
    
    

    private void tampil(Connection conn) {
        dataPerpustakaan.clear();
        try {
            String sql = "select * from buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BukuPOJO data = new BukuPOJO();
                data.setIsbn(String.valueOf(rs.getObject(1)));
                data.setJudulBuku(String.valueOf(rs.getObject(2)));
                data.setTahunTerbit(String.valueOf(rs.getObject(3)));
                data.setPenerbit(String.valueOf(rs.getObject(4)));
                dataPerpustakaan.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTableRecord.getModel();
            model.setRowCount(0);
            for (BukuPOJO data : dataPerpustakaan) {

                Object[] baris = new Object[5];
                baris[0] = data.getIsbn();
                baris[1] = data.getJudulBuku();
                baris[2] = data.getTahunTerbit();
                baris[3] = data.getPenerbit();

                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TampilanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * Creates new form TampilanBuku
     */
    
    //refresh
    private Timer refreshTimer;
    public TampilanBuku() {
        try {
            dataPerpustakaan = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/buku", "postgres", "bismillah@");
            tampil(conn);
            
            // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
        refreshTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampil(conn);
            }
        });
        refreshTimer.start();
        } catch (SQLException ex) {
            Logger.getLogger(TampilanBuku.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanelAtas = new javax.swing.JPanel();
        jLabel1Judul = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRecord = new javax.swing.JTable();
        jButtonSimpan = new javax.swing.JButton();
        jButton3Delete = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jButton2Update = new javax.swing.JButton();
        jLabelISBN = new javax.swing.JLabel();
        jLabelJudulBuku = new javax.swing.JLabel();
        jLabel1Tahun = new javax.swing.JLabel();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jTextFieldPenerbit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAtas.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1Judul.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1Judul.setText("DATA PERPUSTAKAAN TADIKA MESRA ");

        javax.swing.GroupLayout jPanelAtasLayout = new javax.swing.GroupLayout(jPanelAtas);
        jPanelAtas.setLayout(jPanelAtasLayout);
        jPanelAtasLayout.setHorizontalGroup(
            jPanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtasLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1Judul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAtasLayout.setVerticalGroup(
            jPanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1Judul)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jTableRecord.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTableRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTableRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRecord);

        jButtonSimpan.setBackground(new java.awt.Color(153, 255, 153));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButton3Delete.setBackground(new java.awt.Color(255, 0, 0));
        jButton3Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3Delete.setText("Delete");
        jButton3Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3DeleteActionPerformed(evt);
            }
        });

        jButtonCetak.setBackground(new java.awt.Color(0, 0, 153));
        jButtonCetak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jButton2Update.setBackground(new java.awt.Color(102, 102, 255));
        jButton2Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2Update.setText("Update");
        jButton2Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2UpdateActionPerformed(evt);
            }
        });

        jLabelISBN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelISBN.setText("ISBN");

        jLabelJudulBuku.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelJudulBuku.setText("Judul Buku");

        jLabel1Tahun.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1Tahun.setText("Tahun Terbit");

        jLabelPenerbit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelPenerbit.setText("Penerbit");

        jTextFieldISBN.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jTextFieldJudulBuku.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldTahunTerbit.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });

        jTextFieldPenerbit.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Tahun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJudulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(135, 135, 135))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3Delete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2Update))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelISBN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelJudulBuku))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1Tahun)
                            .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPenerbit)
                            .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSimpan)
                            .addComponent(jButton3Delete)
                            .addComponent(jButton2Update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCetak)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldISBN.getText().trim();
        String judulBuku = jTextFieldJudulBuku.getText();
        String tahunTerbit = jTextFieldTahunTerbit.getText();
        String penerbit = jTextFieldPenerbit.getText();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTSPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = new Buku();
        
        b.setIsbn(isbn);
        b.setJudulBuku(judulBuku);
        b.setPenerbit(penerbit);
        b.setTahunTerbit(tahunTerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        entityManager.close();
        //Akhir Persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTableRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordMouseClicked
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/buku", "postgres", "bismillah@");
            int row = jTableRecord.getSelectedRow();
            String tabel_klik = (jTableRecord.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM buku WHERE isbn='" + tabel_klik + "'");
            if (sql.next()) {
                String isbn = sql.getString("isbn");
                jTextFieldISBN.setText(isbn);
                String judul_buku = sql.getString("judul_buku");
                jTextFieldJudulBuku.setText(judul_buku);
                String tahun_terbit = sql.getString("tahun_terbit");
                jTextFieldTahunTerbit.setText(tahun_terbit);
                String penerbit = sql.getString("penerbit");
                jTextFieldPenerbit.setText(penerbit);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableRecordMouseClicked

    private void jButton2UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2UpdateActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldISBN.getText().trim();
        String judulBuku = jTextFieldJudulBuku.getText();
        String tahunTerbit = jTextFieldTahunTerbit.getText();
        String penerbit = jTextFieldPenerbit.getText();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTSPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class,isbn );
        b.setIsbn(isbn);
        b.setJudulBuku(judulBuku);
        b.setPenerbit(penerbit);
        b.setTahunTerbit(tahunTerbit);
        entityManager.persist(b );
        entityManager.getTransaction().commit();
        //Akhir Persistence
        
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButton2UpdateActionPerformed

    private void jButton3DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3DeleteActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldISBN.getText().trim();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("UTSPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class,isbn );
        b.setIsbn(isbn);
        entityManager.remove(b );
        entityManager.getTransaction().commit();
        entityManager.close();

        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButton3DeleteActionPerformed

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        // TODO add your handling code here:
        String reportPath = "src/uts/reportBuku.jrxml";
        //awal persistence 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UTSPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery (Buku.class);
        Root<Buku> bok = cq.from(Buku.class);
        cq.select(bok);
        
        TypedQuery<Buku> q = em.createQuery(cq); 
        Query query = em.createQuery("SELECT b FROM Buku b");
        List<Buku> result = query.getResultList();
        
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource (result);
        
        
        try {
            // TODO add your handling code here:
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, dataSource);
            JasperViewer vw = new JasperViewer (jp, false);
            vw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(TampilanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Update;
    private javax.swing.JButton jButton3Delete;
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1Judul;
    private javax.swing.JLabel jLabel1Tahun;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAtas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRecord;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables
}

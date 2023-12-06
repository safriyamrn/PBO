/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Safriya Murni
 */
public class MenuKategori extends javax.swing.JPanel {

    ArrayList<Kategori> dataKategori;

    private void tampilKategori() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT k FROM Kategori k");
        List<Kategori> results = query.getResultList();
        entityManager.getTransaction().commit();
        DefaultTableModel tbl = (DefaultTableModel) jTableRecordKategori.getModel();
        tbl.setRowCount(0);
        for (Kategori k : results) {
            Object[] ob = new Object[2];
            ob[0] = k.getIdkategori();
            ob[1] = k.getNamakategori();
            tbl.addRow(ob);
        }
        entityManager.close();
    }

    private String idkategori;

    public MenuKategori() {

        dataKategori = new ArrayList<>();
        initComponents();
        tampilKategori();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelView = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelDataBuku = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRecordKategori = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDKategori = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNamaKategori = new javax.swing.JTextField();
        jButtonuUbah = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("UTAMA > Kategori");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("KATEGORI BUKU");

        jTableRecordKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Kategori", "Nama Kategori"
            }
        ));
        jTableRecordKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordKategoriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecordKategori);

        jButtonTambah.setBackground(new java.awt.Color(51, 153, 255));
        jButtonTambah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTambah.setText("TAMBAH");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonHapus.setBackground(new java.awt.Color(255, 51, 51));
        jButtonHapus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonHapus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("ID Kategori");

        jLabel2.setText("Nama Kategori");

        jButtonuUbah.setBackground(new java.awt.Color(0, 153, 51));
        jButtonuUbah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonuUbah.setForeground(new java.awt.Color(255, 255, 255));
        jButtonuUbah.setText("UBAH");
        jButtonuUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonuUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                        .addComponent(jLabelDataBuku)
                        .addGap(650, 913, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNamaKategori, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jButtonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldIDKategori))))
                .addGap(50, 50, 50))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jLabelDataBuku))
                .addGap(31, 31, 31)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIDKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNamaKategori))
                .addGap(33, 33, 33)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanelMain.add(jPanelView, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        String idKategori = jTextFieldIDKategori.getText().trim();
        String namaKategori = jTextFieldNamaKategori.getText();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Kategori k = new Kategori();
        
        k.setIdkategori(idKategori);
        k.setNamakategori(namaKategori);
        entityManager.persist(k);
        entityManager.getTransaction().commit();
        entityManager.close();
        
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");
        
        //Akhir Persistence
        jTextFieldIDKategori.setText("");
        jTextFieldNamaKategori.setText("");
        
        tampilKategori();

    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        deleteData();
        tampilKategori();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTableRecordKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordKategoriMouseClicked


        try {
            // Buat EntityManagerFactory sesuai dengan nama persistence unit Anda
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            int row = jTableRecordKategori.getSelectedRow();
            String idKategori = (jTableRecordKategori.getModel().getValueAt(row, 0).toString());

            // Gunakan EntityManager untuk mengambil data dari database
            Kategori kategori = em.find(Kategori.class, idKategori);

            if (kategori != null) {
                // Set nilai-nilai yang diambil dari database ke JTextField
                jTextFieldIDKategori.setText(kategori.getIdkategori());
                jTextFieldNamaKategori.setText(kategori.getNamakategori());
            }
            // Tutup EntityManager setelah digunakan
            em.close();
            emf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTableRecordKategoriMouseClicked

    private void jButtonuUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonuUbahActionPerformed
        String idKategori = jTextFieldIDKategori.getText().trim();
        String namaKategori = jTextFieldNamaKategori.getText();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Kategori k = entityManager.find(Kategori.class,idKategori );
        k.setIdkategori(idKategori);
        k.setNamakategori(namaKategori);
        entityManager.persist(k );
        entityManager.getTransaction().commit();
        
        JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
        //Akhir Persistence
        
        jTextFieldIDKategori.setText("");
        jTextFieldNamaKategori.setText("");
        
        tampilKategori();
    }//GEN-LAST:event_jButtonuUbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonuUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordKategori;
    private javax.swing.JTextField jTextFieldIDKategori;
    private javax.swing.JTextField jTextFieldNamaKategori;
    // End of variables declaration//GEN-END:variables

    void ambildata() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Peminjaman> peminjamanRoot = cq.from(Peminjaman.class);
        Join<Peminjaman, Book> bukuJoin = peminjamanRoot.join("isbn", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Peminjaman_1

        cq.multiselect(
                peminjamanRoot.get("idpinjam"),
                peminjamanRoot.get("namapeminjam"),
                peminjamanRoot.get("prodi"),
                peminjamanRoot.get("semester"),
                peminjamanRoot.get("angkatan"),
                bukuJoin.get("isbn"),
                bukuJoin.get("judul"),
                peminjamanRoot.get("tglpinjam"),
                peminjamanRoot.get("tglkembali")
        );

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordKategori.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    private void deleteData() {
        String idKategori = jTextFieldIDKategori.getText().trim();
        
        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Kategori k = entityManager.find(Kategori.class,idKategori );
        k.setIdkategori(idKategori);
        entityManager.remove(k );
        entityManager.getTransaction().commit();
        entityManager.close();
        
       JOptionPane.showMessageDialog(null, "Berhasil dihapus");

        jTextFieldIDKategori.setText("");
        jTextFieldNamaKategori.setText("");
    }
}

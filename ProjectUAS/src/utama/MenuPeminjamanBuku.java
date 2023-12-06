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
public class MenuPeminjamanBuku extends javax.swing.JPanel {

    ArrayList<Peminjaman> dataPeminjaman;

    private void tampilkan() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        EntityManager em = emf.createEntityManager();
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

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordPeminjaman.getModel();
        tbl.setRowCount(0);
        for (Object[] row : results) {
            tbl.addRow(row);
        }

        em.close();
        emf.close();

    }

    private String isbn;

    public MenuPeminjamanBuku() {

        dataPeminjaman = new ArrayList<>();
        initComponents();
        ambildata();
        tampilkan();
        loadData();
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
        jTableRecordPeminjaman = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDPeminjam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNamaPeminjam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldProdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSemester = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAngkatan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxJudulBuku = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jDateChooserPinjam = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooserKembali = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("UTAMA > Peminjaman Buku");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("DATA PEMINJAMAN BUKU ISCO");

        jTableRecordPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Peminjaman", "Nama Peminjam", "Prodi", "Semester", "Angkatan", "Isbn", "Judul Buku", "Tgl Pinjam", "Tgl Kembali"
            }
        ));
        jTableRecordPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecordPeminjaman);

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

        jTextFieldSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearch.setText("Search");
        jTextFieldSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusLost(evt);
            }
        });
        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jComboBoxSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBoxSearch.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Angkatan" }));
        jComboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchActionPerformed(evt);
            }
        });

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/search.png"))); // NOI18N
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonBatal.setBackground(new java.awt.Color(255, 153, 0));
        jButtonBatal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonBatal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBatal.setText("BATAL");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("ID Peminjaman");

        jLabel2.setText("Nama Peminjam");

        jLabel3.setText("Prodi");

        jLabel4.setText("Semester");

        jLabel5.setText("Angkatan");

        jLabel6.setText("Judul Buku");

        jComboBoxJudulBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Tgl Pinjam");

        jLabel14.setText("Tgl Kembali");

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataBuku)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooserPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jComboBoxJudulBuku, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAngkatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSemester, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProdi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNamaPeminjam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIDPeminjam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelViewLayout.createSequentialGroup()
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(240, 240, 240))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelDataBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIDPeminjam, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNamaPeminjam))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldProdi))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldSemester))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldAngkatan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(198, Short.MAX_VALUE))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanelMain.add(jPanelView, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        try {
            String idPeminjaman = jTextFieldIDPeminjam.getText().trim();
            String nama = jTextFieldNamaPeminjam.getText();
            String prodi = jTextFieldProdi.getText();
            String semester = jTextFieldSemester.getText();
            String angkatan = jTextFieldAngkatan.getText();
            String judulBuku = jComboBoxJudulBuku.getSelectedItem().toString(); // Ambil judul buku dari ComboBox

            // Mengambil tanggal dari jDateChooserPinjam
            Date tanggalPeminjamanDate = jDateChooserPinjam.getDate();
            java.sql.Date tanggalPeminjaman = null;
            if (tanggalPeminjamanDate != null) {
                tanggalPeminjaman = new java.sql.Date(tanggalPeminjamanDate.getTime());
            }

            // Mengambil tanggal dari jDateChooserKembali
            Date tanggalPengembalianDate = jDateChooserKembali.getDate();
            java.sql.Date tanggalPengembalian = null;
            if (tanggalPengembalianDate != null) {
                tanggalPengembalian = new java.sql.Date(tanggalPengembalianDate.getTime());
            }

            // awal persistence
            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();

            // Query untuk mendapatkan data buku berdasarkan ISBN
            Query bukuQuery = entityManager.createQuery("SELECT b FROM Book b WHERE b.judul = :judul");
            bukuQuery.setParameter("judul", judulBuku);
            Book buku = (Book) bukuQuery.getSingleResult();

            // Membuat objek entitas Peminjaman_1
            Peminjaman peminjaman = new Peminjaman();
            peminjaman.setIdpinjam(idPeminjaman);
            peminjaman.setNamapeminjam(nama);
            peminjaman.setProdi(prodi);
            peminjaman.setSemester(semester);
            peminjaman.setAngkatan(angkatan);
            peminjaman.setTglpinjam(tanggalPeminjaman);
            peminjaman.setTglkembali(tanggalPengembalian);

            // Set objek Buku_1 ke peminjaman
            Book judul = new Book();
            judul.setIsbn(isbn);
            peminjaman.setIsbn(judul);

            // Simpan peminjaman ke database
            entityManager.persist(peminjaman);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");

            // akhir persistence
            jTextFieldIDPeminjam.setText("");
            jTextFieldNamaPeminjam.setText("");
            jTextFieldProdi.setText("");
            jTextFieldSemester.setText("");
            jTextFieldAngkatan.setText("");
            jComboBoxJudulBuku.setSelectedItem("Pilih Judul Buku");
            jDateChooserPinjam.setDate(null);
            jDateChooserKembali.setDate(null);

            tampilkan(); // Fungsi untuk refresh data pada tabel

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        deleteData();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

    private void jTableRecordPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordPeminjamanMouseClicked
        try {
            // Buat EntityManagerFactory sesuai dengan nama persistence unit Anda
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            int row = jTableRecordPeminjaman.getSelectedRow();
            String idPeminjaman = (jTableRecordPeminjaman.getModel().getValueAt(row, 0).toString());

            // Gunakan EntityManager untuk mengambil data dari database
            Peminjaman peminjaman = em.find(Peminjaman.class, idPeminjaman);

            if (peminjaman != null) {
                // Set nilai-nilai yang diambil dari database ke JTextField
                jTextFieldIDPeminjam.setText(peminjaman.getIdpinjam());
                jTextFieldNamaPeminjam.setText(peminjaman.getNamapeminjam());
                jTextFieldProdi.setText(peminjaman.getProdi());
                jTextFieldSemester.setText(peminjaman.getSemester());
                jTextFieldAngkatan.setText(peminjaman.getAngkatan());

                // Dapatkan judul buku dari relasi
                String judulBuku = peminjaman.getIsbn().getJudul();

                // Set nilai ComboBox judul buku
                jComboBoxJudulBuku.setSelectedItem(judulBuku);

                // Set tanggal peminjaman
                Date tanggalPeminjamanDate = peminjaman.getTglpinjam();
                jDateChooserPinjam.setDate(tanggalPeminjamanDate);

                // Set tanggal pengembalian
                Date tanggalPengembalianDate = peminjaman.getTglkembali();
                jDateChooserKembali.setDate(tanggalPengembalianDate);

            }

            // Tutup EntityManager setelah digunakan
            em.close();
            emf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTableRecordPeminjamanMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String s = jTextFieldSearch.getText();
        switch (jComboBoxSearch.getSelectedIndex()) {
            case 0:
                getdataAngkatan(s);
                break;
//            case 1:
//                getdataJudul(s);
//                break;
//            case 2:
//                getdataKategori(s);
//                break;
//            case 3:
//                getdataPengarang(s);
//                break;
//            case 4:
//                getdataPenerbit(s);
//                break;
//            case 5:
//                getdataTahunTerbit(s);
//                break;
//            case 6:
//                getdataJumlahHalaman(s);
//                break;

        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusGained
        String s = jTextFieldSearch.getText();
        if (s.equals("Search")) {
            jTextFieldSearch.setText("");
        }
    }//GEN-LAST:event_jTextFieldSearchFocusGained

    private void jTextFieldSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusLost
        String s = jTextFieldSearch.getText();
        if (s.equals("")) {
            jTextFieldSearch.setText("Search");
        }
    }//GEN-LAST:event_jTextFieldSearchFocusLost

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(new MenuPeminjamanBuku());
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jButtonBatalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JComboBox<String> jComboBoxJudulBuku;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private com.toedter.calendar.JDateChooser jDateChooserKembali;
    private com.toedter.calendar.JDateChooser jDateChooserPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordPeminjaman;
    private javax.swing.JTextField jTextFieldAngkatan;
    private javax.swing.JTextField jTextFieldIDPeminjam;
    private javax.swing.JTextField jTextFieldNamaPeminjam;
    private javax.swing.JTextField jTextFieldProdi;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSemester;
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

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordPeminjaman.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    private void deleteData() {
        String idPeminjaman = jTextFieldIDPeminjam.getText().trim();

// Awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();

// Mencari data peminjaman berdasarkan idPeminjaman
        Peminjaman peminjaman = entityManager.find(Peminjaman.class, idPeminjaman);

        if (peminjaman != null) {
            // Jika data peminjaman ditemukan, hapus data dari database
            entityManager.remove(peminjaman);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data peminjaman berhasil dihapus.");
        } else {
            // Jika data peminjaman tidak ditemukan, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(null, "Data peminjaman dengan ID " + idPeminjaman + " tidak ditemukan.");
        }

// Akhir persistence
        jTextFieldIDPeminjam.setText("");
        jTextFieldNamaPeminjam.setText("");
        jTextFieldProdi.setText("");
        jTextFieldSemester.setText("");
        jTextFieldAngkatan.setText("");
        jComboBoxJudulBuku.setSelectedItem("Pilih Judul Buku");
        jDateChooserPinjam.setDate(null);
        jDateChooserKembali.setDate(null);

// Refresh data setelah menghapus
        tampilkan();
    }

    private void loadData() {
        getJudulBuku();

    }

    private void getJudulBuku() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Judul Buku");

            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT b.judul FROM Book b");
            List<String> listIsbn = query.getResultList();

            for (String judul : listIsbn) {
                model.addElement(judul);
            }

            em.getTransaction().commit();
            em.close();

            jComboBoxJudulBuku.setModel(model);
            jComboBoxJudulBuku.addActionListener(e -> {
                int selectedIndex = jComboBoxJudulBuku.getSelectedIndex();

                if (selectedIndex > 0) {
                    try {
                        EntityManager emSelect = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
                        emSelect.getTransaction().begin();

                        Query selectQuery = emSelect.createQuery("SELECT b.isbn FROM Book b WHERE b.judul = :judul");
                        selectQuery.setParameter("judul", model.getElementAt(selectedIndex));
                        String isbn = (String) selectQuery.getSingleResult();

                        emSelect.getTransaction().commit();
                        emSelect.close();

                        this.isbn = isbn;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getdataAngkatan(String angkatan) {
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

        cq.where(cb.like(cb.lower(peminjamanRoot.get("angkatan")), "%" + angkatan.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordPeminjaman.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }
}

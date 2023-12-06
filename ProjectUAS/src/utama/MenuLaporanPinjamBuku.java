/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
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
public class MenuLaporanPinjamBuku extends javax.swing.JPanel {

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

    /**
     * Creates new form MenuBuku
     */
    // private Timer refreshTimer;
    public MenuLaporanPinjamBuku() {
        initComponents();
        tampilkan();
        //ambildata();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelView = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelDataBuku = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jButtonJumlahBukuDipinjam = new javax.swing.JButton();
        jButtonKategoriTerbanyakDipinjam = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRecordPeminjaman = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CETAK LAPORAN > Pinjam Buku");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("LAPORAN PEMINJAMAN BUKU ISCO");

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

        jButtonCetak.setBackground(new java.awt.Color(51, 102, 255));
        jButtonCetak.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jButtonJumlahBukuDipinjam.setBackground(new java.awt.Color(51, 102, 255));
        jButtonJumlahBukuDipinjam.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonJumlahBukuDipinjam.setForeground(new java.awt.Color(255, 255, 255));
        jButtonJumlahBukuDipinjam.setText("JUMLAH BUKU DIPINJAM");
        jButtonJumlahBukuDipinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJumlahBukuDipinjamActionPerformed(evt);
            }
        });

        jButtonKategoriTerbanyakDipinjam.setBackground(new java.awt.Color(51, 102, 255));
        jButtonKategoriTerbanyakDipinjam.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonKategoriTerbanyakDipinjam.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKategoriTerbanyakDipinjam.setText("KATEGORI TERBANYAK DIPINJAM");
        jButtonKategoriTerbanyakDipinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKategoriTerbanyakDipinjamActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataBuku)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonJumlahBukuDipinjam)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonKategoriTerbanyakDipinjam)))
                        .addGap(143, 301, Short.MAX_VALUE)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jLabelDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJumlahBukuDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKategoriTerbanyakDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelView, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

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
//                getdataPenulis(s);
//                break;
//            case 3:
//                getdataTahunTerbit(s);
//                break;
//            case 4:
//                getdataJumlahHalaman(s);
//                break;
//
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

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        try {
            String reportPath = "src/utama/reportPeminjamanBuku.jrxml";
            String searchTerm = jTextFieldSearch.getText().trim();
            String selection = (String) jComboBoxSearch.getSelectedItem();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Peminjaman p WHERE ";

            String s = jTextFieldSearch.getText();
            switch (jComboBoxSearch.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(p.angkatan) LIKE LOWER(:searchTerm)";
                    break;
            }

//            switch (jComboBoxSearch.getSelectedIndex()) {
//                case 0:
//                    queryString += "LOWER(s.idskripsi) LIKE LOWER(:searchTerm)";
//                    break;
//                case 1:
//                    queryString += "LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
//                    break;
//                case 2:
//                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
//                    break;
//                case 3:
//                    queryString += "LOWER(s.tahunskripsi) LIKE LOWER (:searchTerm)";
//                case 4:
//                    queryString += "LOWER(s.halamanskripsi) LIKE LOWER (:searchTerm)";
//                default:
//                    throw new IllegalArgumentException("Invalid search criteria selected.");
//            }
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            // Creating a CriteriaBuilder instance to create the query
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Peminjaman> cq = cb.createQuery(Peminjaman.class);
            Root<Peminjaman> PeminjamanRoot = cq.from(Peminjaman.class);
            cq.select(PeminjamanRoot);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Peminjaman> query = em.createQuery(queryString, Peminjaman.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");
            List<Peminjaman> results = query.getResultList();

            em.getTransaction().commit();
            em.close();
            emf.close();

            // Prepare data for the report
            List<Object[]> data = new ArrayList<>();
            for (Peminjaman result : results) {
                Object[] rowData = {
                    result.getIdpinjam(),
                    result.getNamapeminjam(),
                    result.getProdi(),
                    result.getSemester(),
                    result.getIsbn(),
                    result.getTglpinjam(),
                    result.getTglkembali()

                };
                data.add(rowData);
            }

            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);

            // Create a JRBeanCollectionDataSource for JasperReports from the search results data
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Load the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException | IllegalArgumentException ex) {
            Logger.getLogger(MenuLaporanPinjamBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jButtonJumlahBukuDipinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJumlahBukuDipinjamActionPerformed
        try {
            String selection = (String) jComboBoxSearch.getSelectedItem();
            String reportPath = "src/utama/reportJumlahPeminjamanBuku.jrxml";
            String searchTerm = jTextFieldSearch.getText().trim();

            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("-");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
            Root<Peminjaman> peminjamanRoot = cq.from(Peminjaman.class);
            Join<Peminjaman, Book> bukuJoin = peminjamanRoot.join("isbn", JoinType.INNER);

            cq.multiselect(
                    bukuJoin.get("isbn"),
                    bukuJoin.get("judul"),
                    cb.count(peminjamanRoot.get("idpinjam")).alias("jumlah_peminjaman")
            );

            cq.groupBy(bukuJoin.get("isbn"), bukuJoin.get("judul"));
            cq.orderBy(cb.desc(cb.count(peminjamanRoot.get("idpinjam"))));

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();

            em.close();
            emf.close();

            // Mapping hasil query ke dalam parameter JasperReport
            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                String isbn = (String) result[0];
                String judul = (String) result[1];
                Long jumlahPeminjaman = (Long) result[2];

                map.put("isbn", isbn);
                map.put("judul", judul);
                map.put("jumlah_peminjaman", jumlahPeminjaman);
                mappedResults.add(map);
            }

            // Creating a JasperReports data source from the mapped results
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            // Loading the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(MenuLaporanPinjamBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonJumlahBukuDipinjamActionPerformed

    private void jTableRecordPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordPeminjamanMouseClicked
//        try {
//            // Buat EntityManagerFactory sesuai dengan nama persistence unit Anda
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
//            EntityManager em = emf.createEntityManager();
//
//            int row = jTableRecordPeminjaman.getSelectedRow();
//            String idPeminjaman = (jTableRecordPeminjaman.getModel().getValueAt(row, 0).toString());
//
//            // Gunakan EntityManager untuk mengambil data dari database
//            Peminjaman peminjaman = em.find(Peminjaman.class, idPeminjaman);
//
//            if (peminjaman != null) {
//                // Set nilai-nilai yang diambil dari database ke JTextField
//                jTextFieldIDPeminjam.setText(peminjaman.getIdpinjam());
//                jTextFieldNamaPeminjam.setText(peminjaman.getNamapeminjam());
//                jTextFieldProdi.setText(peminjaman.getProdi());
//                jTextFieldSemester.setText(peminjaman.getSemester());
//                jTextFieldAngkatan.setText(peminjaman.getAngkatan());
//
//                // Dapatkan judul buku dari relasi
//                String judulBuku = peminjaman.getIsbn().getJudul();
//
//                // Set nilai ComboBox judul buku
//                jComboBoxJudulBuku.setSelectedItem(judulBuku);
//
//                // Set tanggal peminjaman
//                Date tanggalPeminjamanDate = peminjaman.getTglpinjam();
//                jDateChooserPinjam.setDate(tanggalPeminjamanDate);
//
//                // Set tanggal pengembalian
//                Date tanggalPengembalianDate = peminjaman.getTglkembali();
//                jDateChooserKembali.setDate(tanggalPengembalianDate);
//
//            }
//
//            // Tutup EntityManager setelah digunakan
//            em.close();
//            emf.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jTableRecordPeminjamanMouseClicked

    private void jButtonKategoriTerbanyakDipinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKategoriTerbanyakDipinjamActionPerformed
        try {
            String selection = (String) jComboBoxSearch.getSelectedItem();
            String reportPath = "src/utama/reportKategoriTerbanyak.jrxml";
            String searchTerm = jTextFieldSearch.getText().trim();

            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("-");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
            Root<Peminjaman> peminjamanRoot = cq.from(Peminjaman.class);
            Join<Peminjaman, Book> bukuJoin = peminjamanRoot.join("isbn", JoinType.INNER);
            Join<Book, Kategori> kategoriJoin = bukuJoin.join("idkategori", JoinType.INNER);

            cq.multiselect(
                    kategoriJoin.get("namakategori"),
                    cb.count(peminjamanRoot.get("idpinjam")).alias("jumlah_peminjaman")
            );

            cq.groupBy(kategoriJoin.get("namakategori"));
            cq.orderBy(cb.desc(cb.count(peminjamanRoot.get("idpinjam"))));

            TypedQuery<Object[]> query = em.createQuery(cq);
            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();

            em.close();
            emf.close();

            // Mapping hasil query ke dalam parameter JasperReport
            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                String nama = (String) result[0];
                Long jumlahPeminjaman = (Long) result[1];

                map.put("namakategori", nama); // Sesuaikan dengan atribut yang sesuai pada kelas Kategori_1
                map.put("jumlah_peminjaman", jumlahPeminjaman);
                mappedResults.add(map);
            }

            // Creating a JasperReports data source from the mapped results
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            // Loading the report design file (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(MenuLaporanPinjamBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonKategoriTerbanyakDipinjamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonJumlahBukuDipinjam;
    private javax.swing.JButton jButtonKategoriTerbanyakDipinjam;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordPeminjaman;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

//    void ambildata() {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
//        Root<Peminjamanskripsi> peminjamanRoot = cq.from(Peminjamanskripsi.class);
//        Join<Peminjamanskripsi, Skripsi> skripsiJoin = peminjamanRoot.join("idskripsi", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Peminjaman_1
//
//        cq.multiselect(
//                peminjamanRoot.get("idpinjam"),
//                peminjamanRoot.get("nama"),
//                peminjamanRoot.get("prodi"),
//                peminjamanRoot.get("semester"),
//                peminjamanRoot.get("angkatan"),
//                skripsiJoin.get("idskripsi"),
//                skripsiJoin.get("judulskripsi"),
//                peminjamanRoot.get("tglpinjam"),
//                peminjamanRoot.get("tglkembali")
//        );
//
//        List<Object[]> results = em.createQuery(cq).getResultList();
//        em.getTransaction().commit();
//        em.close();
//
//        DefaultTableModel tbl = (DefaultTableModel) jTableRecordPeminjamanSkripsi.getModel();
//        tbl.setRowCount(0);
//        int i = 1;
//        for (Object[] row : results) {
//            tbl.addRow(row);
//            i++;
//        }
//    }
//    void getdataJudul(String judulSkripsi) {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.judulskripsi) LIKE :judulskripsi");
//        query.setParameter("judulskripsi", "%" + judulSkripsi.toLowerCase() + "%");
//        List<Skripsi> list = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
//        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
//        tb.setRowCount(0);
//        for (Skripsi s : list) {
//             Object[] ob = new Object[5];
//            ob[0] = s.getIdskripsi();
//            ob[1] = s.getJudulskripsi();
//            ob[2] = s.getPenulis();
//            ob[3] = s.getTahunskripsi();
//            ob[4] = s.getHalamanskripsi();
//            tb.addRow(ob);
//        }
//    }
//    void getdataPenulis(String penulis) {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.penulis) LIKE :penulis");
//        query.setParameter("pengarang", "%" + penulis.toLowerCase() + "%");
//        List<Skripsi> list = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
//        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
//        tb.setRowCount(0);
//        for (Skripsi s : list) {
//            Object[] ob = new Object[5];
//            ob[0] = s.getIdskripsi();
//            ob[1] = s.getJudulskripsi();
//            ob[2] = s.getPenulis();
//            ob[3] = s.getTahunskripsi();
//            ob[4] = s.getHalamanskripsi();
//            tb.addRow(ob);
//        }
//    }
//    void getdataTahunTerbit(String tahunTerbit) {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.tahunskripsi) LIKE :tahunskripsi");
//        query.setParameter("tahunskripsi", "%" + tahunTerbit.toLowerCase() + "%");
//        List<Skripsi> list = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
//        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
//        tb.setRowCount(0);
//        for (Skripsi s : list) {
//            Object[] ob = new Object[5];
//            ob[0] = s.getIdskripsi();
//            ob[1] = s.getJudulskripsi();
//            ob[2] = s.getPenulis();
//            ob[3] = s.getTahunskripsi();
//            ob[4] = s.getHalamanskripsi();
//            tb.addRow(ob);
//        }
//    }
//    void getdataJumlahHalaman(String jumlahHalaman) {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.halamanskripsi) LIKE :halamanskripsi");
//        query.setParameter("halamanskripsi", "%" + jumlahHalaman.toLowerCase() + "%");
//        List<Skripsi> list = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
//        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
//        tb.setRowCount(0);
//        for (Skripsi s : list) {
//            Object[] ob = new Object[5];
//            ob[0] = s.getIdskripsi();
//            ob[1] = s.getJudulskripsi();
//            ob[2] = s.getPenulis();
//            ob[3] = s.getTahunskripsi();
//            ob[4] = s.getHalamanskripsi();
//            tb.addRow(ob);
//        }
//    }
//    private void getdataID(String idSkripsi) {
//        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//        em.getTransaction().begin();
//        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER (s.idskripsi) = :idskripsi");
//        query.setParameter("idskripsi", "%" + idSkripsi.toLowerCase() + "%");
//        List<Skripsi> list = query.getResultList();
//        em.getTransaction().commit();
//        em.close();
//        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
//        tb.setRowCount(0);
//        for (Skripsi s : list) {
//            Object[] ob = new Object[5];
//            ob[0] = s.getIdskripsi();
//            ob[1] = s.getJudulskripsi();
//            ob[2] = s.getPenulis();
//            ob[3] = s.getTahunskripsi();
//            ob[4] = s.getHalamanskripsi();
//            tb.addRow(ob);
//        }
//    }
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

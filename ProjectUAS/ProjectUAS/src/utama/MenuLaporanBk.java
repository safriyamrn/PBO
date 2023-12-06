/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
public class MenuLaporanBk extends javax.swing.JPanel {

    ArrayList<Book> dataBuku;

    private void tampilkan() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Buku_1

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"),
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
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
    public MenuLaporanBk() {
        initComponents();
        tampilkan();
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
        jTableRecordBuku = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CETAK LAPORAN > Buku");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("LAPORAN DATA BUKU ISCO");

        jTableRecordBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "ID Kategori", "Kategori", "Pengarang", "Penerbit", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        jTableRecordBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecordBuku);

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
        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul Buku", "Kategori", "Pengarang", "Penerbit", "Tahun Terbit", "Jumlah Halaman" }));
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

        jButtonCetak.setBackground(new java.awt.Color(51, 51, 255));
        jButtonCetak.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jLabelDataBuku)
                                .addGap(143, 514, Short.MAX_VALUE)
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
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
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
                .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jTableRecordBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordBukuMouseClicked

//        try {
//            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//            entityManager.getTransaction().begin();
//
//            int row = jTableRecordBuku.getSelectedRow();
//            String tabel_klik = (jTableRecordBuku.getModel().getValueAt(row, 0).toString());
//
//            // Ubah kode di bawah ini untuk mencari data yang diinginkan
//            Book z = entityManager.find(Book.class, tabel_klik);
//            if (z != null) {
//                String isbn = z.getIsbn();
//                String judulBuku = z.getJudul();
//                String kategori = z.ge();
//                String pengarang = z.getPengarang();
//                String penerbit = z.getPenerbit();
//                String tahunTerbit = z.gettahun_terbit();
//                String jumlahHalaman = z.getjumlah_halaman();
//            }
//
//            entityManager.getTransaction().commit();
//        } catch (Exception e) {
//            // Handle exceptions appropriately
//        }
    }//GEN-LAST:event_jTableRecordBukuMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String s = jTextFieldSearch.getText();
        switch (jComboBoxSearch.getSelectedIndex()) {
            case 0:
                getdataIsbn(s);
                break;
            case 1:
                getdataJudul(s);
                break;
            case 2:
                getdataKategori(s);
                break;
            case 3:
                getdataPengarang(s);
                break;
            case 4:
                getdataPenerbit(s);
                break;
            case 5:
                getdataTahunTerbit(s);
                break;
            case 6:
                getdataJumlahHalaman(s);
                break;
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
            String reportPath = "src/utama/ReportBuku.jrxml";
            String searchTerm = jTextFieldSearch.getText().trim();
            String selection = (String) jComboBoxSearch.getSelectedItem();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Book b WHERE ";

            switch (jComboBoxSearch.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.idkategori) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                case 5:
                    queryString += "LOWER(b.tahun) LIKE LOWER (:searchTerm)";
                case 6:
                    queryString += "LOWER(b.halamanbuku) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            // Creating a CriteriaBuilder instance to create the query
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Book> cq = cb.createQuery(Book.class);
            Root<Book> bookRoot = cq.from(Book.class);
            cq.select(bookRoot);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Book> query = em.createQuery(queryString, Book.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");
            List<Book> results = query.getResultList();

            em.getTransaction().commit();
            em.close();
            emf.close();

            // Prepare data for the report
            List<Object[]> data = new ArrayList<>();
            for (Book result : results) {
                Object[] rowData = {
                    result.getIsbn(),
                    result.getJudul(),
                    result.getIdkategori(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahun(),
                    result.getHalamanbuku()
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
            java.util.logging.Logger.getLogger(MenuLaporanBk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordBuku;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    void ambildata() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Buku_1

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"), // Mengakses atribut nama dari objek Kategori_1
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataIsbn(String isbn) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Buku_1

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"), // Mengakses atribut nama dari objek Kategori_1
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("isbn")), "%" + isbn.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataJudul(String judul) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Buku_1

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"), // Mengakses atribut nama dari objek Kategori_1
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("judul")), "%" + judul.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataPengarang(String pengarang) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"),
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("pengarang")), "%" + pengarang.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataPenerbit(String penerbit) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"),
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("penerbit")), "%" + penerbit.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataTahunTerbit(String tahun) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"),
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("tahun")), "%" + tahun.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    void getdataJumlahHalaman(String halamanbuku) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER);

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"),
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(bukuRoot.get("halamanbuku")), "%" + halamanbuku.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

    private void getdataKategori(String kategori) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Book> bukuRoot = cq.from(Book.class);
        Join<Book, Kategori> kategoriJoin = bukuRoot.join("idkategori", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Buku

        cq.multiselect(
                bukuRoot.get("isbn"),
                bukuRoot.get("judul"),
                kategoriJoin.get("idkategori"),
                kategoriJoin.get("namakategori").alias("kategori"), // Mengakses atribut nama dari objek Kategori
                bukuRoot.get("pengarang"),
                bukuRoot.get("penerbit"),
                bukuRoot.get("tahun"),
                bukuRoot.get("halamanbuku")
        );

        cq.where(cb.like(cb.lower(kategoriJoin.get("namakategori")), "%" + kategori.toLowerCase() + "%"));

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.close();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (Object[] row : results) {
            tbl.addRow(row);
            i++;
        }
    }

}

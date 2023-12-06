/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
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
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Safriya Murni
 */
public class MenuLaporanSkripsi extends javax.swing.JPanel {

    ArrayList<Skripsi> dataSkripsi;

    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT s FROM Skripsi s");
        List<Skripsi> results = query.getResultList();
        entityManager.getTransaction().commit();
        DefaultTableModel tbl = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tbl.setRowCount(0);
        for (Skripsi s : results) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            
            tbl.addRow(ob);
        }
        entityManager.close();
    }

    /**
     * Creates new form MenuBuku
     */
    // private Timer refreshTimer;
    public MenuLaporanSkripsi() {
        //        try {
//            dataBuku = new ArrayList<>();
        initComponents();
//            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login", "postgres", "bismillah@");
        tampilkan();
//            
//            // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
//        refreshTimer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                tampilkan();
//            }
//        });
//        refreshTimer.start();
//        } catch (SQLException ex) {
//            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        jTableRecordLaporanSkripsi = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CETAK LAPORAN > Skripsi");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("LAPORAN DATA SKRIPSI ISCO");

        jTableRecordLaporanSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Skripsi", "Judul Skripsi", "Penulis", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        jTableRecordLaporanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordLaporanSkripsiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecordLaporanSkripsi);

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
        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Skripsi", "Judul Skripsi", "Penulis", "Tahun Terbit", "Jumlah Halaman" }));
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
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataBuku)
                            .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 487, Short.MAX_VALUE)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTableRecordLaporanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordLaporanSkripsiMouseClicked

//        try {
//            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//            entityManager.getTransaction().begin();
//
//            int row = jTableRecordLaporanSkripsi.getSelectedRow();
//            String tabel_klik = (jTableRecordLaporanSkripsi.getModel().getValueAt(row, 0).toString());
//
//            // Ubah kode di bawah ini untuk mencari data yang diinginkan
//            Buku z = entityManager.find(Buku.class, tabel_klik);
//            if (z != null) {
//                String isbn = z.getIsbn();
//                String judulBuku = z.getjudul_buku();
//                String subJudul = z.getsub_judul();
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
    }//GEN-LAST:event_jTableRecordLaporanSkripsiMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String s = jTextFieldSearch.getText();
        switch (jComboBoxSearch.getSelectedIndex()) {
            case 0:
                getdataID(s);
                break;
            case 1:
                getdataJudul(s);
                break;
            case 2:
                getdataPenulis(s);
                break;
            case 3:
                getdataTahunTerbit(s);
                break;
            case 4:
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
            String reportPath = "src/utama/reportSkripsi.jrxml";
            String searchTerm = jTextFieldSearch.getText().trim();
            String selection = (String) jComboBoxSearch.getSelectedItem();   

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s WHERE ";

            switch (jComboBoxSearch.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(s.idskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(s.tahunskripsi) LIKE LOWER (:searchTerm)";
                case 4:
                    queryString += "LOWER(s.halamanskripsi) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            // Creating a CriteriaBuilder instance to create the query
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
            Root<Skripsi> bookRoot = cq.from(Skripsi.class);
            cq.select(bookRoot);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Skripsi> query = em.createQuery(queryString, Skripsi.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");
            List<Skripsi> results = query.getResultList();

            em.getTransaction().commit();
            em.close();
            emf.close();

            // Prepare data for the report
            List<Object[]> data = new ArrayList<>();
            for (Skripsi result : results) {
                Object[] rowData = {
                    result.getIdskripsi(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getTahunskripsi(),
                    result.getHalamanskripsi(),
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
            Logger.getLogger(MenuLaporanSkripsi.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTable jTableRecordLaporanSkripsi;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    void ambildata() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }

    void getdataJudul(String judulSkripsi) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.judulskripsi) LIKE :judulskripsi");
        query.setParameter("judulskripsi", "%" + judulSkripsi.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
             Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }

    void getdataPenulis(String penulis) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.penulis) LIKE :penulis");
        query.setParameter("penulis", "%" + penulis.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }

    void getdataTahunTerbit(String tahunTerbit) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.tahunskripsi) LIKE :tahunskripsi");
        query.setParameter("tahunskripsi", "%" + tahunTerbit.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }

    void getdataJumlahHalaman(String jumlahHalaman) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.halamanskripsi) LIKE :halamanskripsi");
        query.setParameter("halamanskripsi", "%" + jumlahHalaman.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }

    private void getdataID(String idSkripsi) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER (s.idskripsi) = :idskripsi");
        query.setParameter("idskripsi", "%" + idSkripsi.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordLaporanSkripsi.getModel();
        tb.setRowCount(0);
        for (Skripsi s : list) {
            Object[] ob = new Object[5];
            ob[0] = s.getIdskripsi();
            ob[1] = s.getJudulskripsi();
            ob[2] = s.getPenulis();
            ob[3] = s.getTahunskripsi();
            ob[4] = s.getHalamanskripsi();
            tb.addRow(ob);
        }
    }
}

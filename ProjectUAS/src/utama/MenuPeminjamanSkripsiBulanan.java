/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
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
public class MenuPeminjamanSkripsiBulanan extends javax.swing.JPanel {

    ArrayList<Peminjamanskripsi> dataPeminjaman;

    private void tampilkan() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<Peminjamanskripsi> peminjamanRoot = cq.from(Peminjamanskripsi.class);
        Join<Peminjamanskripsi, Skripsi> skripsiJoin = peminjamanRoot.join("idskripsi", JoinType.INNER); // Sesuaikan dengan nama atribut di entitas Peminjaman_1

        cq.multiselect(
                peminjamanRoot.get("idpinjam"),
                peminjamanRoot.get("nama"),
                peminjamanRoot.get("prodi"),
                peminjamanRoot.get("semester"),
                peminjamanRoot.get("angkatan"),
                skripsiJoin.get("idskripsi"),
                skripsiJoin.get("judulskripsi"),
                peminjamanRoot.get("tglpinjam"),
                peminjamanRoot.get("tglkembali")
        );

        List<Object[]> results = em.createQuery(cq).getResultList();
        em.getTransaction().commit();

        DefaultTableModel tbl = (DefaultTableModel) jTableRecordPeminjamanSkripsi.getModel();
        tbl.setRowCount(0);
        for (Object[] row : results) {
            tbl.addRow(row);
        }

        em.close();
        emf.close();

    }

    private String idskripsi;

    public MenuPeminjamanSkripsiBulanan() {

        dataPeminjaman = new ArrayList<>();
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
        jButtonCetak = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooserMulai = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooserSampai = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRecordPeminjamanSkripsi = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelView.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CETAK LAPORAN > Pinjam Skripsi Bulanan");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("DATA PEMINJAMAN SKRIPSI BULANAN");

        jButtonCetak.setBackground(new java.awt.Color(51, 153, 255));
        jButtonCetak.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jLabel9.setText("Mulai Dari");

        jLabel14.setText("Sampai");

        jTableRecordPeminjamanSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Peminjaman", "Nama Peminjam", "Prodi", "Semester", "Angkatan", "ID Skripsi", "Judul Skripsi", "Tgl Pinjam", "Tgl Kembali"
            }
        ));
        jTableRecordPeminjamanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecordPeminjamanSkripsiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecordPeminjamanSkripsi);

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataBuku))
                        .addGap(429, 429, 429)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooserSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataBuku)
                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jDateChooserMulai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelView, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        try {
            String reportPath = "src/utama/reportSkripsiBulanan.jrxml";
            Date tanggalAwal = (Date) jDateChooserMulai.getDate();
            Date tanggalAkhir = (Date) jDateChooserSampai.getDate();

 
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
            Root<Peminjamanskripsi> peminjamanskripsiRoot = criteriaQuery.from(Peminjamanskripsi.class);
            Join<Peminjamanskripsi, Skripsi> skripsiJoin = peminjamanskripsiRoot.join("idskripsi", JoinType.INNER);

            List<Predicate> predicates = new ArrayList<>();

            if (tanggalAwal != null && tanggalAkhir != null) {
                predicates.add(criteriaBuilder.between(peminjamanskripsiRoot.get("tglpinjam"), tanggalAwal, tanggalAkhir));
            }

            criteriaQuery.multiselect(
                    peminjamanskripsiRoot.get("idpinjam"),
                    peminjamanskripsiRoot.get("nama"),
                    peminjamanskripsiRoot.get("prodi"),
                    peminjamanskripsiRoot.get("semester"),
                    peminjamanskripsiRoot.get("angkatan"),
                    skripsiJoin.get("idskripsi"),
                    skripsiJoin.get("judulskripsi"),
                    peminjamanskripsiRoot.get("tglpinjam"),
                    peminjamanskripsiRoot.get("tglkembali")
            );

            if (!predicates.isEmpty()) {
                criteriaQuery.where(predicates.toArray(new Predicate[0]));
            }

            TypedQuery<Object[]> query = em.createQuery(criteriaQuery);

            // Set parameter tanggal jika dimasukkan
            if (tanggalAwal != null && tanggalAkhir != null) {
                query.setParameter("tanggalAwal", tanggalAwal);
                query.setParameter("tanggalAkhir", tanggalAkhir);
            }

            List<Object[]> results = query.getResultList();
            em.getTransaction().commit();
            em.close();
            emf.close();

            List<Map<String, Object>> mappedResults = new ArrayList<>();
            for (Object[] result : results) {
                Map<String, Object> map = new HashMap<>();
                map.put("idpinjam", result[0]);
                map.put("nama", result[1]);
                map.put("prodi", result[2]);
                map.put("semester", result[3]);
                map.put("angkatan", result[4]);
                map.put("idskripsi", result[5]);
                map.put("judulskripsi", result[6]);
                map.put("tglpinjam", new java.sql.Date(((Date) result[7]).getTime()));
                map.put("tglkembali", new java.sql.Date(((Date) result[8]).getTime()));
                mappedResults.add(map);
            }

            Map<String, Object> parameter = new HashMap<>();
            parameter.put("tanggalAwal", tanggalAwal);
            parameter.put("tanggalAkhir", tanggalAkhir);

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mappedResults);

            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException | NumberFormatException ex) {
            java.util.logging.Logger.getLogger(MenuPeminjamanSkripsiBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jTableRecordPeminjamanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordPeminjamanSkripsiMouseClicked
        //        try {
        //            // Buat EntityManagerFactory sesuai dengan nama persistence unit Anda
        //            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
        //            EntityManager em = emf.createEntityManager();
        //
        //            int row = jTableRecordPeminjamanSkripsi.getSelectedRow();
        //            String idPeminjaman = (jTableRecordPeminjamanSkripsi.getModel().getValueAt(row, 0).toString());
        //
        //            // Gunakan EntityManager untuk mengambil data dari database
        //            Peminjamanskripsi peminjaman = em.find(Peminjamanskripsi.class, idPeminjaman);
        //
        //            if (peminjaman != null) {
        //                // Set nilai-nilai yang diambil dari database ke JTextField
        //                jTextFieldIDPeminjam.setText(peminjaman.getIdpinjam());
        //                jTextFieldNamaPeminjam.setText(peminjaman.getNama());
        //                jTextFieldProdi.setText(peminjaman.getProdi());
        //                jTextFieldSemester.setText(peminjaman.getSemester());
        //                jTextFieldAngkatan.setText(peminjaman.getAngkatan());
        //
        //                // Dapatkan judul buku dari relasi
        //                String judulskripsi = peminjaman.getIdskripsi().getJudulskripsi();
        //
        //                // Set nilai ComboBox judul buku
        //                jComboBoxJudulSkripsi.setSelectedItem(judulskripsi);
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
    }//GEN-LAST:event_jTableRecordPeminjamanSkripsiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private com.toedter.calendar.JDateChooser jDateChooserMulai;
    private com.toedter.calendar.JDateChooser jDateChooserSampai;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordPeminjamanSkripsi;
    // End of variables declaration//GEN-END:variables

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utama;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author Safriya Murni
 */
public class MenuBuku extends javax.swing.JPanel {

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

    private String idkategori;

    public MenuBuku() {
        initComponents();
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
        jTableRecordBuku = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonCSV = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jPanelAdd = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTambahData = new javax.swing.JLabel();
        jButtonSimpan = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelISBN = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelJudulBuku = new javax.swing.JLabel();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jLabelPengarang = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jLabelTahunTerbit = new javax.swing.JLabel();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldJumlahHalaman = new javax.swing.JTextField();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jLabelJumlahHalaman2 = new javax.swing.JLabel();
        jPanelUbah = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelPerbarui = new javax.swing.JLabel();
        jButtonPerbarui = new javax.swing.JButton();
        jButtonCancel1 = new javax.swing.JButton();
        jLabelISBN1 = new javax.swing.JLabel();
        jTextFieldISBN1 = new javax.swing.JTextField();
        jLabelJudulBuku1 = new javax.swing.JLabel();
        jTextFieldJudulBuku1 = new javax.swing.JTextField();
        jLabelPengarang1 = new javax.swing.JLabel();
        jTextFieldPengarang1 = new javax.swing.JTextField();
        jLabelPenerbit1 = new javax.swing.JLabel();
        jTextFieldPenerbit1 = new javax.swing.JTextField();
        jLabelTahunTerbit1 = new javax.swing.JLabel();
        jTextFieldTahunTerbit1 = new javax.swing.JTextField();
        jLabelJumlahHalaman1 = new javax.swing.JLabel();
        jTextFieldJumlahHalaman1 = new javax.swing.JTextField();
        jComboBoxKategori1 = new javax.swing.JComboBox<>();
        jLabelJumlahHalaman3 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("UTAMA > Buku");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDataBuku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelDataBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDataBuku.setText("DATA BUKU ISCO");

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

        jButtonBatal.setBackground(new java.awt.Color(255, 153, 0));
        jButtonBatal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonBatal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBatal.setText("BATAL");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonCSV.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCSV.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCSV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCSV.setText("Impor File");
        jButtonCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSVActionPerformed(evt);
            }
        });

        jButtonUbah.setBackground(new java.awt.Color(0, 153, 102));
        jButtonUbah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonUbah.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUbah.setText("UBAH");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

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
                                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonCSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(346, 488, Short.MAX_VALUE)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelViewLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelViewLayout.createSequentialGroup()
                                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCSV))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelView, "card2");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("UTAMA > Buku");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelTambahData.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTambahData.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTambahData.setText("DATA BUKU ISCO");

        jButtonSimpan.setBackground(new java.awt.Color(51, 153, 255));
        jButtonSimpan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 153, 51));
        jButtonCancel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("BATAL");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelISBN.setBackground(new java.awt.Color(255, 255, 255));
        jLabelISBN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelISBN.setForeground(new java.awt.Color(153, 153, 153));
        jLabelISBN.setText("ISBN");

        jTextFieldISBN.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabelJudulBuku.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJudulBuku.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJudulBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJudulBuku.setText("JUDUL BUKU");

        jTextFieldJudulBuku.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBukuActionPerformed(evt);
            }
        });

        jLabelPengarang.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPengarang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPengarang.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPengarang.setText("PENGARANG");

        jTextFieldPengarang.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarangActionPerformed(evt);
            }
        });

        jLabelPenerbit.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPenerbit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPenerbit.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPenerbit.setText("PENERBIT");

        jTextFieldPenerbit.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });

        jLabelTahunTerbit.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTahunTerbit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelTahunTerbit.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTahunTerbit.setText("TAHUN TERBIT");

        jTextFieldTahunTerbit.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });

        jLabelJumlahHalaman.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJumlahHalaman.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJumlahHalaman.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJumlahHalaman.setText("JUMLAH HALAMAN");

        jTextFieldJumlahHalaman.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldJumlahHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahHalamanActionPerformed(evt);
            }
        });

        jLabelJumlahHalaman2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJumlahHalaman2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJumlahHalaman2.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJumlahHalaman2.setText("KATEGORI");

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                        .addComponent(jLabelTambahData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addComponent(jTextFieldJudulBuku)
                    .addComponent(jTextFieldISBN)
                    .addComponent(jComboBoxKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldJumlahHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                    .addComponent(jTextFieldTahunTerbit)
                    .addComponent(jTextFieldPenerbit)
                    .addComponent(jTextFieldPengarang)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelISBN)
                            .addComponent(jLabelJudulBuku)
                            .addComponent(jLabelJumlahHalaman2)
                            .addComponent(jLabelPengarang)
                            .addComponent(jLabelPenerbit)
                            .addComponent(jLabelTahunTerbit)
                            .addComponent(jLabelJumlahHalaman)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(jLabelTambahData))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJudulBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJumlahHalaman2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPengarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPenerbit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTahunTerbit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJumlahHalaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJumlahHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanelMain.add(jPanelAdd, "card2");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("UTAMA > Buku");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelPerbarui.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelPerbarui.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPerbarui.setText("PERBARUI DATA BUKU ISCO");

        jButtonPerbarui.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPerbarui.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonPerbarui.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerbarui.setText("SIMPAN");
        jButtonPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerbaruiActionPerformed(evt);
            }
        });

        jButtonCancel1.setBackground(new java.awt.Color(255, 153, 51));
        jButtonCancel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonCancel1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel1.setText("BATAL");
        jButtonCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel1ActionPerformed(evt);
            }
        });

        jLabelISBN1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelISBN1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelISBN1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelISBN1.setText("ISBN");

        jTextFieldISBN1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBN1ActionPerformed(evt);
            }
        });

        jLabelJudulBuku1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJudulBuku1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJudulBuku1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJudulBuku1.setText("JUDUL BUKU");

        jTextFieldJudulBuku1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldJudulBuku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBuku1ActionPerformed(evt);
            }
        });

        jLabelPengarang1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPengarang1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPengarang1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPengarang1.setText("PENGARANG");

        jTextFieldPengarang1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldPengarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarang1ActionPerformed(evt);
            }
        });

        jLabelPenerbit1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPenerbit1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPenerbit1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPenerbit1.setText("PENERBIT");

        jTextFieldPenerbit1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldPenerbit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbit1ActionPerformed(evt);
            }
        });

        jLabelTahunTerbit1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTahunTerbit1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelTahunTerbit1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTahunTerbit1.setText("TAHUN TERBIT");

        jTextFieldTahunTerbit1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldTahunTerbit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbit1ActionPerformed(evt);
            }
        });

        jLabelJumlahHalaman1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJumlahHalaman1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJumlahHalaman1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJumlahHalaman1.setText("JUMLAH HALAMAN");

        jTextFieldJumlahHalaman1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldJumlahHalaman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahHalaman1ActionPerformed(evt);
            }
        });

        jLabelJumlahHalaman3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJumlahHalaman3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelJumlahHalaman3.setForeground(new java.awt.Color(153, 153, 153));
        jLabelJumlahHalaman3.setText("KATEGORI");

        javax.swing.GroupLayout jPanelUbahLayout = new javax.swing.GroupLayout(jPanelUbah);
        jPanelUbah.setLayout(jPanelUbahLayout);
        jPanelUbahLayout.setHorizontalGroup(
            jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUbahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUbahLayout.createSequentialGroup()
                        .addComponent(jLabelPerbarui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addComponent(jTextFieldJudulBuku1)
                    .addComponent(jTextFieldISBN1)
                    .addComponent(jComboBoxKategori1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldJumlahHalaman1, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
                    .addComponent(jTextFieldTahunTerbit1)
                    .addComponent(jTextFieldPenerbit1)
                    .addComponent(jTextFieldPengarang1)
                    .addGroup(jPanelUbahLayout.createSequentialGroup()
                        .addGroup(jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUbahLayout.createSequentialGroup()
                                .addComponent(jButtonPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelISBN1)
                            .addComponent(jLabelJudulBuku1)
                            .addComponent(jLabelJumlahHalaman3)
                            .addComponent(jLabelPengarang1)
                            .addComponent(jLabelPenerbit1)
                            .addComponent(jLabelTahunTerbit1)
                            .addComponent(jLabelJumlahHalaman1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanelUbahLayout.setVerticalGroup(
            jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUbahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(jLabelPerbarui))
                .addGap(18, 18, 18)
                .addGroup(jPanelUbahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelISBN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJudulBuku1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJudulBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJumlahHalaman3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPengarang1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPengarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPenerbit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPenerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTahunTerbit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTahunTerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelJumlahHalaman1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJumlahHalaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanelMain.add(jPanelUbah, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelAdd);
        jPanelMain.repaint();
        jPanelMain.revalidate();

//        if (jButtonTambah.getText().equals("UBAH")) {
//            dataTabel();
//            jButtonSimpan.setText("UBAH");
//        }
//        tampilkan();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        deleteData();
        tampilkan();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        if (jButtonSimpan.getText().equals("TAMBAH")) {
            jButtonSimpan.setText("SIMPAN");
        } else if (jButtonSimpan.getText().equals("SIMPAN")) {
            ambildata();
        }
//        } else if (jButtonSimpan.getText().equals("UBAH")) {
//            updateData();
//        }
        try {
            String isbn = jTextFieldISBN.getText().trim();
            String judul = jTextFieldJudulBuku.getText();
            String namaKategori = jComboBoxKategori.getSelectedItem().toString();
            String pengarang = jTextFieldPengarang.getText();
            String penerbit = jTextFieldPenerbit.getText();
            String tahun = jTextFieldTahunTerbit.getText();
            String jumlah_halaman = jTextFieldJumlahHalaman.getText();

            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();

            // Query untuk mendapatkan idKategori berdasarkan namaKategori
            Query kategoriQuery = entityManager.createQuery("SELECT k.idkategori FROM Kategori k WHERE k.namakategori = :kategori");
            kategoriQuery.setParameter("kategori", namaKategori);
            String idKategori = (String) kategoriQuery.getSingleResult();

            Book buku = new Book();
            buku.setIsbn(isbn);
            buku.setJudul(judul);
            buku.setPengarang(pengarang);
            buku.setPenerbit(penerbit);
            buku.setTahun(tahun);
            buku.setHalamanbuku(jumlah_halaman);

            // Set idKategori ke buku
            Kategori kategori = new Kategori();
            kategori.setIdkategori(idKategori);
            buku.setIdkategori(kategori);

            entityManager.persist(buku);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");

            jTextFieldISBN.setText("");
            jTextFieldJudulBuku.setText("");
            jComboBoxKategori.setSelectedItem("Pilih Kategori");
            jTextFieldPengarang.setText("");
            jTextFieldPenerbit.setText("");
            jTextFieldTahunTerbit.setText("");
            jTextFieldJumlahHalaman.setText("");

            tampilkan();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
        }
//        } else {
//            updateData();
//        
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelView);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBukuActionPerformed

    private void jTextFieldPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarangActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    private void jTextFieldJumlahHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahHalamanActionPerformed

    private void jTableRecordBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecordBukuMouseClicked
      //  if (jButtonTambah.getText().equals("TAMBAH")) {
           // jButtonUbah.getText().equals("UBAH");
//            jButtonUbah.setVisible(true);
//            jButtonBatal.setVisible(true);
        //}

        try {
            // Buat EntityManagerFactory sesuai dengan nama persistence unit Anda
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectUASPU");
            EntityManager em = emf.createEntityManager();

            int row = jTableRecordBuku.getSelectedRow();
            String tabel_klik = (jTableRecordBuku.getModel().getValueAt(row, 0).toString());

            // Gunakan EntityManager untuk mengambil data dari database
            Book buku = em.find(Book.class, tabel_klik);

            if (buku != null) {
                // Set nilai-nilai yang diambil dari database ke JTextField
                jTextFieldISBN1.setText(buku.getIsbn());
                jTextFieldJudulBuku1.setText(buku.getJudul());
                jTextFieldPengarang1.setText(buku.getPengarang());
                jTextFieldPenerbit1.setText(buku.getPenerbit());
                jTextFieldTahunTerbit1.setText(buku.getTahun());
                jTextFieldJumlahHalaman1.setText(buku.getHalamanbuku());

                // Dapatkan nama kategori dari relasi
                String namaKategori = buku.getIdkategori().getNamakategori();

                // Set nilai ComboBox kategori
                jComboBoxKategori1.setSelectedItem(namaKategori);
            }

            // Tutup EntityManager setelah digunakan
            em.close();
            emf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(new MenuBuku());
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSVActionPerformed
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();

            //Parsing Data CSV
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            // Deklarasi bukuRoot
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
            Root<Book> bukuRoot = criteriaQuery.from(Book.class);

            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);

                for (CSVRecord csvRecord : csvParser) {
                    Book b = new Book();
                    b.setIsbn(csvRecord.get(0));
                    b.setJudul(csvRecord.get(1));
                    b.setPengarang(csvRecord.get(3));
                    b.setPenerbit(csvRecord.get(4));
                    b.setTahun(csvRecord.get(5));
                    b.setHalamanbuku(csvRecord.get(6));

                    // Menggunakan join dengan kategori
                    String Kategori = csvRecord.get(2);  // Ambil nama kategori dari CSV

                    CriteriaQuery<Kategori> kategoriQuery = criteriaBuilder.createQuery(Kategori.class);
                    Root<Kategori> kategoriRoot = kategoriQuery.from(Kategori.class);
                    kategoriQuery.select(kategoriRoot);
                    kategoriQuery.where(criteriaBuilder.equal(kategoriRoot.get("namakategori"), Kategori));

                    TypedQuery<Kategori> kategoriTypedQuery = entityManager.createQuery(kategoriQuery);
                    Kategori kategori = kategoriTypedQuery.getSingleResult();

                    b.setIdkategori(kategori);  // Set ID Kategori pada Buku

                    entityManager.persist(b);
                }

                // Commit hanya jika tidak ada exception
                entityManager.getTransaction().commit();

                // Menampilkan pesan sukses
                JOptionPane.showMessageDialog(null, "File berhasil diupload.");

                // Refresh data setelah mengunggah
                tampilkan();
            } catch (Exception ex) {
                // Menampilkan pesan gagal
                JOptionPane.showMessageDialog(null, "File gagal diupload. Error: " + ex.getMessage());

                // Rollback transaksi jika terjadi exception
                entityManager.getTransaction().rollback();

                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonCSVActionPerformed

    private void jButtonPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerbaruiActionPerformed
       try {
            String isbn = jTextFieldISBN1.getText().trim();
            String judul = jTextFieldJudulBuku1.getText();
            String namaKategori = jComboBoxKategori1.getSelectedItem().toString(); // Ambil nama kategori dari combo box
            String pengarang = jTextFieldPengarang1.getText();
            String penerbit = jTextFieldPenerbit1.getText();
            String tahun = jTextFieldTahunTerbit1.getText();
            String jumlah_halaman = jTextFieldJumlahHalaman1.getText();

            // awal persistence
            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();
            
            // Query untuk mendapatkan idKategori berdasarkan namaKategori
            Query kategoriQuery = entityManager.createQuery("SELECT k.idkategori FROM Kategori k WHERE k.namakategori = :kategori");
            kategoriQuery.setParameter("kategori", namaKategori);

            try {
                String idKategori = (String) kategoriQuery.getSingleResult();

                // Mencari buku berdasarkan ISBN
                Book buku = entityManager.find(Book.class, isbn);

                if (buku != null) {
                    // Set nilai atribut buku dengan nilai baru
                    buku.setJudul(judul);
                    buku.setPengarang(pengarang);
                    buku.setPenerbit(penerbit);
                    buku.setTahun(tahun);
                    buku.setHalamanbuku(jumlah_halaman);

                    // Set objek Kategori_1 ke buku
                    Kategori kategori = new  Kategori();
                    kategori.setIdkategori(idKategori);
                    buku.setIdkategori(kategori);

                    // Commit perubahan
                    entityManager.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Data berhasil diedit.");
                } else {
                    JOptionPane.showMessageDialog(null, "Data dengan ISBN " + isbn + " tidak ditemukan.");
                }

            } catch (NoResultException e) {
                JOptionPane.showMessageDialog(null, "Kategori dengan nama " + namaKategori + " tidak ditemukan.");
            }

            // akhir persistence
            jTextFieldISBN1.setText("");
            jTextFieldJudulBuku1.setText("");
            jComboBoxKategori1.setSelectedItem("Pilih Kategori");
            jTextFieldPengarang1.setText("");
            jTextFieldPenerbit1.setText("");
            jTextFieldTahunTerbit1.setText("");
            jTextFieldJumlahHalaman1.setText("");
            
            tampilkan(); // Fungsi untuk refresh data pada tabel
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPerbaruiActionPerformed

    private void jButtonCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancel1ActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelView);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }//GEN-LAST:event_jButtonCancel1ActionPerformed

    private void jTextFieldISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBN1ActionPerformed

    private void jTextFieldJudulBuku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBuku1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBuku1ActionPerformed

    private void jTextFieldPengarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarang1ActionPerformed

    private void jTextFieldPenerbit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbit1ActionPerformed

    private void jTextFieldTahunTerbit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbit1ActionPerformed

    private void jTextFieldJumlahHalaman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahHalaman1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahHalaman1ActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelUbah);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }//GEN-LAST:event_jButtonUbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCSV;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonPerbarui;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JComboBox<String> jComboBoxKategori1;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelISBN1;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelJudulBuku1;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelJumlahHalaman1;
    private javax.swing.JLabel jLabelJumlahHalaman2;
    private javax.swing.JLabel jLabelJumlahHalaman3;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelPenerbit1;
    private javax.swing.JLabel jLabelPengarang;
    private javax.swing.JLabel jLabelPengarang1;
    private javax.swing.JLabel jLabelPerbarui;
    private javax.swing.JLabel jLabelTahunTerbit;
    private javax.swing.JLabel jLabelTahunTerbit1;
    private javax.swing.JLabel jLabelTambahData;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelUbah;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldISBN1;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldJudulBuku1;
    private javax.swing.JTextField jTextFieldJumlahHalaman;
    private javax.swing.JTextField jTextFieldJumlahHalaman1;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldPenerbit1;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldPengarang1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    private javax.swing.JTextField jTextFieldTahunTerbit1;
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

//    private void dataTabel() {
//        jPanelView.setVisible(false);
//        jPanelAdd.setVisible(true);
//
//        int row = jTableRecordBuku.getSelectedRow();
//        jLabelTambahData.setText("Perbarui Data Buku ISCO ");
//
//        jTextFieldISBN.setEnabled(false);
//
//        jTextFieldISBN.setText(jTableRecordBuku.getValueAt(row, 0).toString());
//        jTextFieldJudulBuku.setText(jTableRecordBuku.getValueAt(row, 1).toString());
//        jTextFieldPengarang.setText(jTableRecordBuku.getValueAt(row, 2).toString());
//        //jComboBoxKategori.setSelectedItem(jTableRecordBuku.getValueAt(row, 3).toString());
//        jTextFieldPenerbit.setText(jTableRecordBuku.getValueAt(row, 3).toString());
//        jTextFieldTahunTerbit.setText(jTableRecordBuku.getValueAt(row, 4).toString());
//        jTextFieldJumlahHalaman.setText(jTableRecordBuku.getValueAt(row, 5).toString());
    // }
//    private void updateData() {
//        try {
//            String isbn = jTextFieldISBN.getText().trim();
//            String judul = jTextFieldJudulBuku.getText();
//            String namaKategori = jComboBoxKategori.getSelectedItem().toString(); // Ambil nama kategori dari combo box
//            String pengarang = jTextFieldPengarang.getText();
//            String penerbit = jTextFieldPenerbit.getText();
//            String tahun = jTextFieldTahunTerbit.getText();
//            String halamanbuku = jTextFieldJumlahHalaman.getText();
//
//            // awal persistence
//            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
//            entityManager.getTransaction().begin();
//
//            // Query untuk mendapatkan idKategori berdasarkan namaKategori
//            Query kategoriQuery = entityManager.createQuery("SELECT k.idkategori FROM Kategori k WHERE k.namakategori = :kategori");
//            kategoriQuery.setParameter("kategori", namaKategori);
//
//            try {
//                String idkategori = (String) kategoriQuery.getSingleResult();
//
//                // Mencari buku berdasarkan ISBN
//                Book buku = entityManager.find(Book.class, isbn);
//
//                if (buku != null) {
//                    // Set nilai atribut buku dengan nilai baru
//                    buku.setJudul(judul);
//                    buku.setPengarang(pengarang);
//                    buku.setPenerbit(penerbit);
//                    buku.setTahun(tahun);
//                    buku.setHalamanbuku(halamanbuku);
//
//                    // Set objek Kategori_1 ke buku
//                    Kategori kategori = new Kategori();
//                    kategori.setIdkategori(idkategori);
//                    buku.setIdkategori(kategori);
//
//                    // Commit perubahan
//                    entityManager.getTransaction().commit();
//                    JOptionPane.showMessageDialog(null, "Data berhasil diedit.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data dengan ISBN " + isbn + " tidak ditemukan.");
//                }
//
//            } catch (NoResultException e) {
//                JOptionPane.showMessageDialog(null, "Kategori dengan nama " + namaKategori + " tidak ditemukan.");
//            }
//
//            // akhir persistence
//            jTextFieldISBN.setText("");
//            jTextFieldJudulBuku.setText("");
//            jComboBoxKategori.setSelectedItem("Pilih Kategori");
//            jTextFieldPengarang.setText("");
//            jTextFieldPenerbit.setText("");
//            jTextFieldTahunTerbit.setText("");
//            jTextFieldJumlahHalaman.setText("");
//
//            tampilkan(); // Fungsi untuk refresh data pada tabel
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
//        }
//    }
    private void deleteData() {
        String isbn = jTextFieldISBN.getText().trim();

        // Awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Book b = entityManager.find(Book.class, isbn);

        if (b != null) {
            entityManager.remove(b);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan ISBN " + isbn + " tidak ditemukan.");
        }

        // Akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jComboBoxKategori.setSelectedItem("Pilih Kategori");
        jTextFieldPengarang.setText("");
        jTextFieldPenerbit.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldJumlahHalaman.setText("");

        // Refresh data setelah menghapus
        tampilkan();
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

    private void loadData() {
        getKategori();
        getKategoriUbah();
        
    }

    private void getKategori() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Kategori");

            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT k.namakategori FROM Kategori k");
            List<String> listKategori = query.getResultList();

            for (String namakategori : listKategori) {
                model.addElement(namakategori);
            }

            em.getTransaction().commit();
            em.close();

            jComboBoxKategori.setModel(model);
            jComboBoxKategori.addActionListener(e -> {
                int selectedIndex = jComboBoxKategori.getSelectedIndex();

                if (selectedIndex > 0) {
                    try {
                        EntityManager emSelect = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
                        emSelect.getTransaction().begin();

                        Query selectQuery = emSelect.createQuery("SELECT k.idkategori FROM Kategori k WHERE k.namakategori = :kategori");
                        selectQuery.setParameter("kategori", model.getElementAt(selectedIndex));
                        String idkategori = (String) selectQuery.getSingleResult();

                        emSelect.getTransaction().commit();
                        emSelect.close();

                        this.idkategori = idkategori;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void getKategoriUbah() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Kategori");

            EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT k.namakategori FROM Kategori k");
            List<String> listKategori = query.getResultList();

            for (String namakategori : listKategori) {
                model.addElement(namakategori);
            }

            em.getTransaction().commit();
            em.close();

            jComboBoxKategori1.setModel(model);
            jComboBoxKategori1.addActionListener(e -> {
                int selectedIndex = jComboBoxKategori1.getSelectedIndex();

                if (selectedIndex > 0) {
                    try {
                        EntityManager emSelect = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
                        emSelect.getTransaction().begin();

                        Query selectQuery = emSelect.createQuery("SELECT k.idkategori FROM Kategori k WHERE k.namakategori = :kategori");
                        selectQuery.setParameter("kategori", model.getElementAt(selectedIndex));
                        String idkategori = (String) selectQuery.getSingleResult();

                        emSelect.getTransaction().commit();
                        emSelect.close();

                        this.idkategori = idkategori;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

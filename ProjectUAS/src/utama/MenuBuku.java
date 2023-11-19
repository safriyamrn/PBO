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
import java.util.List;
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
public class MenuBuku extends javax.swing.JPanel {

    ArrayList<Buku> dataBuku;

    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT b FROM Buku b");
        List<Buku> results = query.getResultList();
        entityManager.getTransaction().commit();
        DefaultTableModel tbl = (DefaultTableModel) jTableRecordBuku.getModel();
        jButtonHapus.setVisible(false);
        jButtonBatal.setVisible(false);
        tbl.setRowCount(0);
        for (Buku bk : results) {
            Object[] ob = new Object[7];
            ob[0] = bk.getIsbn();
            ob[1] = bk.getjudul_buku();
            ob[2] = bk.getsub_judul();
            ob[3] = bk.getPengarang();
            ob[4] = bk.getPenerbit();
            ob[5] = bk.gettahun_terbit();
            ob[6] = bk.getjumlah_halaman();
            tbl.addRow(ob);
        }
        entityManager.close();
    }

    /**
     * Creates new form MenuBuku
     */
    // private Timer refreshTimer;
    public MenuBuku() {
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
        jTableRecordBuku = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jComboBoxSearch = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
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
        jLabelSubJudul = new javax.swing.JLabel();
        jTextFieldSubJudul = new javax.swing.JTextField();
        jLabelPengarang = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jLabelTahunTerbit = new javax.swing.JLabel();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldJumlahHalaman = new javax.swing.JTextField();

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Sub Judul ", "Pengarang", "Penerbit", "Tahun Terbit", "Jumlah Halaman"
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
        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul Buku", "Sub Judul", "Pengarang", "Penerbit", "Tahun Terbit" }));
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
                                .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 547, Short.MAX_VALUE)
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
                        .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelView, "card2");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("UTAMA > Skripsi");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelTambahData.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTambahData.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTambahData.setText("TAMBAH DATA BUKU ISCO");

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

        jLabelSubJudul.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSubJudul.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelSubJudul.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSubJudul.setText("SUB JUDUL");

        jTextFieldSubJudul.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jTextFieldSubJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubJudulActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addComponent(jLabelTambahData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 745, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldJumlahHalaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
                    .addComponent(jTextFieldTahunTerbit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPenerbit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPengarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSubJudul, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldJudulBuku, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddLayout.createSequentialGroup()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddLayout.createSequentialGroup()
                                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelISBN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJudulBuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSubJudul, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPengarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPenerbit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTahunTerbit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJumlahHalaman, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
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
                .addComponent(jLabelSubJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSubJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelAdd, "card2");

        add(jPanelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        jPanelMain.removeAll();
        jPanelMain.add(jPanelAdd);
        jPanelMain.repaint();
        jPanelMain.revalidate();

        if (jButtonTambah.getText().equals("UBAH")) {
            dataTabel();
            jButtonSimpan.setText("UPDATE");
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

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        if (jButtonSimpan.getText().equals("TAMBAH")) {

            String isbn = jTextFieldISBN.getText().trim();
            String judulBuku = jTextFieldJudulBuku.getText();
            String subJudul = jTextFieldSubJudul.getText();
            String pengarang = jTextFieldPengarang.getText();
            String penerbit = jTextFieldPenerbit.getText();
            String tahunTerbit = jTextFieldTahunTerbit.getText();
            String jumlahHalaman = jTextFieldJumlahHalaman.getText();

            //Awal Persistence 
            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();
            Buku b = new Buku();
            b.setIsbn(isbn);

            if (b != null) {
                b.setJudulBuku(judulBuku);
                b.setSubJudul(subJudul);
                b.setPengarang(pengarang);
                b.setPenerbit(penerbit);
                b.setTahunTerbit(tahunTerbit);
                b.setJumlahHalaman(jumlahHalaman);
                entityManager.persist(b);
                entityManager.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");

                new MenuBuku().setVisible(true);
            }

            //Akhir Persistence
            jTextFieldISBN.setText("");
            jTextFieldJudulBuku.setText("");
            jTextFieldSubJudul.setText("");
            jTextFieldPengarang.setText("");
            jTextFieldPenerbit.setText("");
            jTextFieldTahunTerbit.setText("");
            jTextFieldJumlahHalaman.setText("");
        } else {
            updateData();
        }

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

    private void jTextFieldSubJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubJudulActionPerformed

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
        if (jButtonTambah.getText().equals("TAMBAH")) {
            jButtonTambah.setText("UBAH");
            jButtonHapus.setVisible(true);
            jButtonBatal.setVisible(true);
        }
        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
            entityManager.getTransaction().begin();

            int row = jTableRecordBuku.getSelectedRow();
            String tabel_klik = (jTableRecordBuku.getModel().getValueAt(row, 0).toString());

            // Ubah kode di bawah ini untuk mencari data yang diinginkan
            Buku z = entityManager.find(Buku.class, tabel_klik);
            if (z != null) {
                String isbn = z.getIsbn();
                String judulBuku = z.getjudul_buku();
                String subJudul = z.getsub_judul();
                String pengarang = z.getPengarang();
                String penerbit = z.getPenerbit();
                String tahunTerbit = z.gettahun_terbit();
                String jumlahHalaman = z.getjumlah_halaman();
            }

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // Handle exceptions appropriately
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
                getdataSubJudul(s);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JComboBox<String> jComboBoxSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataBuku;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelPengarang;
    private javax.swing.JLabel jLabelSubJudul;
    private javax.swing.JLabel jLabelTahunTerbit;
    private javax.swing.JLabel jLabelTambahData;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRecordBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldJumlahHalaman;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSubJudul;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables

    void ambildata() {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataIsbn(String isbn) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.isbn) = :isbn");
        query.setParameter("isbn", "%" + isbn.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataJudul(String judulBuku) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.judulBuku) LIKE :judulBuku");
        query.setParameter("judulBuku", "%" + judulBuku.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataSubJudul(String subJudul) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.subJudul) LIKE :subJudul");
        query.setParameter("subJudul", "%" + subJudul.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataPengarang(String pengarang) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.pengarang) LIKE :pengarang");
        query.setParameter("pengarang", "%" + pengarang.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataPenerbit(String penerbit) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.penerbit) LIKE :penerbit");
        query.setParameter("penerbit", "%" + penerbit.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
        }
    }

    void getdataTahunTerbit(String tahunTerbit) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.tahunTerbit) LIKE :tahunTerbit");
        query.setParameter("tahunTerbit", "%" + tahunTerbit.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        int i = 1;
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
            i++;
        }
    }

    void getdataJumlahHalaman(String jumlahHalaman) {
        EntityManager em = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.jumlahHalaman) LIKE :jumlahHalaman");
        query.setParameter("jumlahHalaman", "%" + jumlahHalaman.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableRecordBuku.getModel();
        tb.setRowCount(0);
        int i = 1;
        for (Buku b : list) {
            Object[] ob = new Object[7];
            ob[0] = b.getIsbn();
            ob[1] = b.getjudul_buku();
            ob[2] = b.getsub_judul();
            ob[3] = b.getPengarang();
            ob[4] = b.getPenerbit();
            ob[5] = b.gettahun_terbit();
            ob[6] = b.getjumlah_halaman();
            tb.addRow(ob);
            i++;
        }
    }

    private void dataTabel() {
        jPanelView.setVisible(false);
        jPanelAdd.setVisible(true);

        int row = jTableRecordBuku.getSelectedRow();
        jLabelTambahData.setText("Perbarui Data Buku ISCO ");

        jTextFieldISBN.setEnabled(false);

        jTextFieldISBN.setText(jTableRecordBuku.getValueAt(row, 0).toString());
        jTextFieldJudulBuku.setText(jTableRecordBuku.getValueAt(row, 1).toString());
        jTextFieldSubJudul.setText(jTableRecordBuku.getValueAt(row, 2).toString());
        jTextFieldPengarang.setText(jTableRecordBuku.getValueAt(row, 3).toString());
        jTextFieldPenerbit.setText(jTableRecordBuku.getValueAt(row, 4).toString());
        jTextFieldTahunTerbit.setText(jTableRecordBuku.getValueAt(row, 5).toString());
        jTextFieldJumlahHalaman.setText(jTableRecordBuku.getValueAt(row, 6).toString());
    }

    private void updateData() {
        String isbn = jTextFieldISBN.getText().trim();
        String judulBuku = jTextFieldJudulBuku.getText();
        String subJudul = jTextFieldSubJudul.getText();
        String pengarang = jTextFieldPengarang.getText();
        String penerbit = jTextFieldPenerbit.getText();
        String tahunTerbit = jTextFieldTahunTerbit.getText();
        String jumlahHalaman = jTextFieldJumlahHalaman.getText();

        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = new Buku();
        b.setIsbn(isbn);

        if (b != null) {
            b.setJudulBuku(judulBuku);
            b.setSubJudul(subJudul);
            b.setPengarang(pengarang);
            b.setPenerbit(penerbit);
            b.setTahunTerbit(tahunTerbit);
            b.setJumlahHalaman(jumlahHalaman);
            entityManager.merge(b);

            JOptionPane.showMessageDialog(null, "Data Berhasil diperbarui");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal diperbarui");

        }
        entityManager.getTransaction().commit();
        new MenuBuku().setVisible(true);

        //Akhir Persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldSubJudul.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldPenerbit.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldJumlahHalaman.setText("");

    }

    private void deleteData() {
       
        String isbn = jTableRecordBuku.getValueAt(jTableRecordBuku.getSelectedRow(), 0).toString();

        //Awal Persistence 
        EntityManager entityManager = Persistence.createEntityManagerFactory("ProjectUASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, isbn);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        entityManager.close();
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");

        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldSubJudul.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldPenerbit.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldJumlahHalaman.setText("");

    }
}

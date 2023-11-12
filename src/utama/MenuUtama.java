package utama;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Safriya Murni
 */
public class MenuUtama extends javax.swing.JFrame {
    

    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelkiri = new javax.swing.JPanel();
        jLabelISCO = new javax.swing.JLabel();
        jLabelKepanjangan = new javax.swing.JLabel();
        jLabelUtama = new javax.swing.JLabel();
        jPanelDashboard = new javax.swing.JPanel();
        jPanelLine = new javax.swing.JPanel();
        jLabelIconDashboard = new javax.swing.JLabel();
        jLabelDashboard = new javax.swing.JLabel();
        jPanelBuku = new javax.swing.JPanel();
        jPanelLineBuku = new javax.swing.JPanel();
        jLabelIconBuku = new javax.swing.JLabel();
        jLabelBuku = new javax.swing.JLabel();
        jPanelSkripsi = new javax.swing.JPanel();
        jPanelLineSkripsi = new javax.swing.JPanel();
        jLabelIconSkripsi = new javax.swing.JLabel();
        jLabelSkripsi = new javax.swing.JLabel();
        jLabelTransaksi = new javax.swing.JLabel();
        jPanelPeminjaman = new javax.swing.JPanel();
        jPanelLinePeminjaman = new javax.swing.JPanel();
        jLabelIconPeminjaman = new javax.swing.JLabel();
        jLabelPeminjaman = new javax.swing.JLabel();
        jPanelPengembalian = new javax.swing.JPanel();
        jPanelLinePengembalian = new javax.swing.JPanel();
        jLabelIconPengembalian = new javax.swing.JLabel();
        jLabelPengembalian = new javax.swing.JLabel();
        jPanelLaporan = new javax.swing.JPanel();
        jPanelLineLaporan = new javax.swing.JPanel();
        jLabelIconDashboard2 = new javax.swing.JLabel();
        jLabelDashboard2 = new javax.swing.JLabel();
        jLabelLaporan = new javax.swing.JLabel();
        jPanelkanan = new javax.swing.JPanel();
        jPanelNavbar = new javax.swing.JPanel();
        jPanelDasar = new javax.swing.JPanel();
        jPanelUtama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelkiri.setBackground(new java.awt.Color(0, 204, 204));
        jPanelkiri.setPreferredSize(new java.awt.Dimension(190, 771));

        jLabelISCO.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelISCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelISCO.setText("ISCO");

        jLabelKepanjangan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelKepanjangan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKepanjangan.setText("Information System Cloud");

        jLabelUtama.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUtama.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelUtama.setForeground(new java.awt.Color(153, 153, 153));
        jLabelUtama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUtama.setText("Dashboard");

        jPanelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDashboard.setPreferredSize(new java.awt.Dimension(100, 35));

        jPanelLine.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLine.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLayout = new javax.swing.GroupLayout(jPanelLine);
        jPanelLine.setLayout(jPanelLineLayout);
        jPanelLineLayout.setHorizontalGroup(
            jPanelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLayout.setVerticalGroup(
            jPanelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard_1.png"))); // NOI18N

        jLabelDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelDashboard.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDashboard.setText("Dashboard ");
        jLabelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLine, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconDashboard)
                    .addComponent(jPanelLine, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanelBuku.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBuku.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBukuMouseClicked(evt);
            }
        });

        jPanelLineBuku.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineBuku.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineBukuLayout = new javax.swing.GroupLayout(jPanelLineBuku);
        jPanelLineBuku.setLayout(jPanelLineBukuLayout);
        jPanelLineBukuLayout.setHorizontalGroup(
            jPanelLineBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineBukuLayout.setVerticalGroup(
            jPanelLineBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/book (1).png"))); // NOI18N

        jLabelBuku.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelBuku.setText("Buku ");
        jLabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBukuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBukuLayout = new javax.swing.GroupLayout(jPanelBuku);
        jPanelBuku.setLayout(jPanelBukuLayout);
        jPanelBukuLayout.setHorizontalGroup(
            jPanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBukuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelIconBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );
        jPanelBukuLayout.setVerticalGroup(
            jPanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIconBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        jPanelSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));

        jPanelLineSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineSkripsiLayout = new javax.swing.GroupLayout(jPanelLineSkripsi);
        jPanelLineSkripsi.setLayout(jPanelLineSkripsiLayout);
        jPanelLineSkripsiLayout.setHorizontalGroup(
            jPanelLineSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineSkripsiLayout.setVerticalGroup(
            jPanelLineSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconSkripsi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconSkripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/jurnal.png"))); // NOI18N

        jLabelSkripsi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelSkripsi.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSkripsi.setText("Skripsi");
        jLabelSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSkripsiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSkripsiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSkripsiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSkripsiLayout = new javax.swing.GroupLayout(jPanelSkripsi);
        jPanelSkripsi.setLayout(jPanelSkripsiLayout);
        jPanelSkripsiLayout.setHorizontalGroup(
            jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSkripsiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelIconSkripsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSkripsiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );
        jPanelSkripsiLayout.setVerticalGroup(
            jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIconSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addGroup(jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSkripsiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jLabelTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTransaksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelTransaksi.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTransaksi.setText("TRANSAKSI");

        jPanelPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPeminjaman.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPeminjamanMouseClicked(evt);
            }
        });

        jPanelLinePeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLinePeminjaman.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLinePeminjamanLayout = new javax.swing.GroupLayout(jPanelLinePeminjaman);
        jPanelLinePeminjaman.setLayout(jPanelLinePeminjamanLayout);
        jPanelLinePeminjamanLayout.setHorizontalGroup(
            jPanelLinePeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLinePeminjamanLayout.setVerticalGroup(
            jPanelLinePeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconPeminjaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/4213459-common-door-exit-logout-out-signout_115411 1 (2).png"))); // NOI18N

        jLabelPeminjaman.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPeminjaman.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPeminjaman.setText("Peminjaman");
        jLabelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelPeminjamanLayout = new javax.swing.GroupLayout(jPanelPeminjaman);
        jPanelPeminjaman.setLayout(jPanelPeminjamanLayout);
        jPanelPeminjamanLayout.setHorizontalGroup(
            jPanelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLinePeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );
        jPanelPeminjamanLayout.setVerticalGroup(
            jPanelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconPeminjaman)
                    .addComponent(jPanelLinePeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanelPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPengembalian.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPengembalianMouseClicked(evt);
            }
        });

        jPanelLinePengembalian.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLinePengembalian.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLinePengembalianLayout = new javax.swing.GroupLayout(jPanelLinePengembalian);
        jPanelLinePengembalian.setLayout(jPanelLinePengembalianLayout);
        jPanelLinePengembalianLayout.setHorizontalGroup(
            jPanelLinePengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLinePengembalianLayout.setVerticalGroup(
            jPanelLinePengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconPengembalian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/inbox_icon-icons 1 (1).png"))); // NOI18N

        jLabelPengembalian.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelPengembalian.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPengembalian.setText("Pengembalian");
        jLabelPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPengembalianMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelPengembalianLayout = new javax.swing.GroupLayout(jPanelPengembalian);
        jPanelPengembalian.setLayout(jPanelPengembalianLayout);
        jPanelPengembalianLayout.setHorizontalGroup(
            jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLinePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );
        jPanelPengembalianLayout.setVerticalGroup(
            jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconPengembalian)
                    .addComponent(jPanelLinePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanelLaporan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporan.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanMouseClicked(evt);
            }
        });

        jPanelLineLaporan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporan.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanLayout = new javax.swing.GroupLayout(jPanelLineLaporan);
        jPanelLineLaporan.setLayout(jPanelLineLaporanLayout);
        jPanelLineLaporanLayout.setHorizontalGroup(
            jPanelLineLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanLayout.setVerticalGroup(
            jPanelLineLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconDashboard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconDashboard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelDashboard2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelDashboard2.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDashboard2.setText("Cetak");
        jLabelDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDashboard2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDashboard2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanLayout = new javax.swing.GroupLayout(jPanelLaporan);
        jPanelLaporan.setLayout(jPanelLaporanLayout);
        jPanelLaporanLayout.setHorizontalGroup(
            jPanelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLineLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );
        jPanelLaporanLayout.setVerticalGroup(
            jPanelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconDashboard2)
                    .addComponent(jPanelLineLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelDashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabelLaporan.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLaporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelLaporan.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLaporan.setText("LAPORAN");

        javax.swing.GroupLayout jPanelkiriLayout = new javax.swing.GroupLayout(jPanelkiri);
        jPanelkiri.setLayout(jPanelkiriLayout);
        jPanelkiriLayout.setHorizontalGroup(
            jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkiriLayout.createSequentialGroup()
                .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelkiriLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelKepanjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelkiriLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabelUtama))))
                        .addGroup(jPanelkiriLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLaporan)
                                .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jPanelBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jPanelSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabelTransaksi)
                                    .addComponent(jPanelPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jPanelLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jPanelPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelISCO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelkiriLayout.setVerticalGroup(
            jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkiriLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelISCO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKepanjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUtama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelkiri, java.awt.BorderLayout.LINE_START);

        jPanelkanan.setLayout(new java.awt.BorderLayout());

        jPanelNavbar.setBackground(new java.awt.Color(204, 255, 255));
        jPanelNavbar.setPreferredSize(new java.awt.Dimension(1066, 70));

        javax.swing.GroupLayout jPanelNavbarLayout = new javax.swing.GroupLayout(jPanelNavbar);
        jPanelNavbar.setLayout(jPanelNavbarLayout);
        jPanelNavbarLayout.setHorizontalGroup(
            jPanelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        jPanelNavbarLayout.setVerticalGroup(
            jPanelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanelkanan.add(jPanelNavbar, java.awt.BorderLayout.PAGE_START);

        jPanelDasar.setBackground(new java.awt.Color(250, 250, 250));

        jPanelUtama.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUtama.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanelUtama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanelDasarLayout = new javax.swing.GroupLayout(jPanelDasar);
        jPanelDasar.setLayout(jPanelDasarLayout);
        jPanelDasarLayout.setHorizontalGroup(
            jPanelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanelDasarLayout.setVerticalGroup(
            jPanelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDasarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanelkanan.add(jPanelDasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelkanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboardMouseEntered
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelDashboardMouseEntered

    private void jLabelDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboardMouseExited
        jPanelDashboard.setBackground(new Color(255, 255, 255));
        jPanelLine.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelDashboardMouseExited

    private void jLabelBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBukuMouseEntered
        jPanelBuku.setBackground(new Color(250, 250, 250));
        jPanelLineBuku.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelBukuMouseEntered

    private void jLabelBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBukuMouseExited
        jPanelBuku.setBackground(new Color(255, 255, 255));
        jPanelLineBuku.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelBukuMouseExited

    private void jLabelSkripsiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkripsiMouseEntered
        jPanelSkripsi.setBackground(new Color(250, 250, 250));
        jPanelLineSkripsi.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelSkripsiMouseEntered

    private void jLabelSkripsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkripsiMouseExited
        jPanelSkripsi.setBackground(new Color(255, 255, 255));
        jPanelLineSkripsi.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelSkripsiMouseExited

    private void jLabelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboardMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuDashboard());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelDashboardMouseClicked

    private void jPanelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBukuMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuBuku());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jPanelBukuMouseClicked

    private void jLabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBukuMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuBuku());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelBukuMouseClicked

    private void jLabelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPeminjamanMouseClicked

    private void jLabelPeminjamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanMouseEntered
        jPanelPeminjaman.setBackground(new Color(250, 250, 250));
        jPanelLinePeminjaman.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelPeminjamanMouseEntered

    private void jLabelPeminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanMouseExited
        jPanelPeminjaman.setBackground(new Color(255, 255, 255));
        jPanelLinePeminjaman.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelPeminjamanMouseExited

    private void jPanelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPeminjamanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPeminjamanMouseClicked

    private void jLabelDashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboard2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelDashboard2MouseClicked

    private void jLabelDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboard2MouseEntered
        jPanelLaporan.setBackground(new Color(250, 250, 250));
        jPanelLineLaporan.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelDashboard2MouseEntered

    private void jLabelDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboard2MouseExited
        jPanelLaporan.setBackground(new Color(255, 255, 255));
        jPanelLineLaporan.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelDashboard2MouseExited

    private void jPanelLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanMouseClicked

    private void jLabelPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPengembalianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPengembalianMouseClicked

    private void jLabelPengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPengembalianMouseEntered
        jPanelPengembalian.setBackground(new Color(250, 250, 250));
        jPanelLinePengembalian.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelPengembalianMouseEntered

    private void jLabelPengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPengembalianMouseExited
        jPanelPengembalian.setBackground(new Color(255, 255, 255));
        jPanelLinePengembalian.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelPengembalianMouseExited

    private void jPanelPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPengembalianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPengembalianMouseClicked

    private void jLabelSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkripsiMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuSkripsi());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelSkripsiMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBuku;
    private javax.swing.JLabel jLabelDashboard;
    private javax.swing.JLabel jLabelDashboard2;
    private javax.swing.JLabel jLabelISCO;
    private javax.swing.JLabel jLabelIconBuku;
    private javax.swing.JLabel jLabelIconDashboard;
    private javax.swing.JLabel jLabelIconDashboard2;
    private javax.swing.JLabel jLabelIconPeminjaman;
    private javax.swing.JLabel jLabelIconPengembalian;
    private javax.swing.JLabel jLabelIconSkripsi;
    private javax.swing.JLabel jLabelKepanjangan;
    private javax.swing.JLabel jLabelLaporan;
    private javax.swing.JLabel jLabelPeminjaman;
    private javax.swing.JLabel jLabelPengembalian;
    private javax.swing.JLabel jLabelSkripsi;
    private javax.swing.JLabel jLabelTransaksi;
    private javax.swing.JLabel jLabelUtama;
    private javax.swing.JPanel jPanelBuku;
    private javax.swing.JPanel jPanelDasar;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelLaporan;
    private javax.swing.JPanel jPanelLine;
    private javax.swing.JPanel jPanelLineBuku;
    private javax.swing.JPanel jPanelLineLaporan;
    private javax.swing.JPanel jPanelLinePeminjaman;
    private javax.swing.JPanel jPanelLinePengembalian;
    private javax.swing.JPanel jPanelLineSkripsi;
    private javax.swing.JPanel jPanelNavbar;
    private javax.swing.JPanel jPanelPeminjaman;
    private javax.swing.JPanel jPanelPengembalian;
    private javax.swing.JPanel jPanelSkripsi;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JPanel jPanelkanan;
    private javax.swing.JPanel jPanelkiri;
    // End of variables declaration//GEN-END:variables
}

package utama;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        jLabelPeminjamanSkripsi = new javax.swing.JLabel();
        jLabelIconPeminjaman1 = new javax.swing.JLabel();
        jPanelLaporanDataBuku = new javax.swing.JPanel();
        jPanelLineLaporan = new javax.swing.JPanel();
        jLabelIconDashboard2 = new javax.swing.JLabel();
        jLabelLaporanBuku = new javax.swing.JLabel();
        jLabelLaporan = new javax.swing.JLabel();
        jPanelLaporanSkripsi = new javax.swing.JPanel();
        jPanelLineLaporanSkripsi = new javax.swing.JPanel();
        jLabelIconLaporanSkripsi = new javax.swing.JLabel();
        jLabelLaporanSkripsi = new javax.swing.JLabel();
        jPanelLaporanPinjamBuku = new javax.swing.JPanel();
        jPanelLineLaporanPinjamBuku = new javax.swing.JPanel();
        jLabelIconDashboard3 = new javax.swing.JLabel();
        jLabelLaporanPinjamBuku = new javax.swing.JLabel();
        jPanelLaporanPinjamSkripsi = new javax.swing.JPanel();
        jPanelLineLaporanPinjamSkripsi = new javax.swing.JPanel();
        jLabelIconLaporanSkripsi1 = new javax.swing.JLabel();
        jLabelLaporanPinjamSkripsi = new javax.swing.JLabel();
        jPanelKategori = new javax.swing.JPanel();
        jPanelLineKategori = new javax.swing.JPanel();
        jLabelIconKategori = new javax.swing.JLabel();
        jLabelKategoriBuku = new javax.swing.JLabel();
        jPanelLaporanPinjamBukuBulanan = new javax.swing.JPanel();
        jPanelLineLaporanPinjamBukuBulanan = new javax.swing.JPanel();
        jLabelIconLaporanSkripsi2 = new javax.swing.JLabel();
        jLabelLaporanPinjamBukuBulanan = new javax.swing.JLabel();
        jPanelLogout = new javax.swing.JPanel();
        jLabelLogout = new javax.swing.JLabel();
        jPanelLaporanPinjamSkripsiBulanan = new javax.swing.JPanel();
        jPanelLineLaporanPinjamSkripsiBulanan = new javax.swing.JPanel();
        jLabelIconLaporanSkripsi3 = new javax.swing.JLabel();
        jLabelLaporanPinjamSkripsiBulanan = new javax.swing.JLabel();
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

        jLabelDashboard.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelLine, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabelBuku.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBukuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIconBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBukuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
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

        jLabelSkripsi.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
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
                .addComponent(jLabelSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSkripsiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );
        jPanelSkripsiLayout.setVerticalGroup(
            jPanelSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIconSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabelSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabelPeminjaman.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelPeminjaman.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPeminjaman.setText("Peminjaman Buku");
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
                .addComponent(jLabelPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabelPeminjamanSkripsi.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelPeminjamanSkripsi.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPeminjamanSkripsi.setText("Peminjaman Skripsi");
        jLabelPeminjamanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanSkripsiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanSkripsiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPeminjamanSkripsiMouseExited(evt);
            }
        });

        jLabelIconPeminjaman1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPeminjaman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/4213459-common-door-exit-logout-out-signout_115411 1 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanelPengembalianLayout = new javax.swing.GroupLayout(jPanelPengembalian);
        jPanelPengembalian.setLayout(jPanelPengembalianLayout);
        jPanelPengembalianLayout.setHorizontalGroup(
            jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLinePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconPeminjaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelPeminjamanSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPengembalianLayout.setVerticalGroup(
            jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPeminjamanSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addGroup(jPanelPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconPeminjaman1)
                    .addComponent(jPanelLinePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelLaporanDataBuku.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanDataBuku.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanDataBukuMouseClicked(evt);
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

        jLabelLaporanBuku.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelLaporanBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanBuku.setText("Buku");
        jLabelLaporanBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanBukuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanDataBukuLayout = new javax.swing.GroupLayout(jPanelLaporanDataBuku);
        jPanelLaporanDataBuku.setLayout(jPanelLaporanDataBukuLayout);
        jPanelLaporanDataBukuLayout.setHorizontalGroup(
            jPanelLaporanDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanDataBukuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelLineLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporanBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLaporanDataBukuLayout.setVerticalGroup(
            jPanelLaporanDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanDataBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanDataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconDashboard2)
                    .addComponent(jPanelLineLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelLaporanBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabelLaporan.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLaporan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabelLaporan.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLaporan.setText("CETAK LAPORAN");

        jPanelLaporanSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanSkripsiMouseClicked(evt);
            }
        });

        jPanelLineLaporanSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporanSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanSkripsiLayout = new javax.swing.GroupLayout(jPanelLineLaporanSkripsi);
        jPanelLineLaporanSkripsi.setLayout(jPanelLineLaporanSkripsiLayout);
        jPanelLineLaporanSkripsiLayout.setHorizontalGroup(
            jPanelLineLaporanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanSkripsiLayout.setVerticalGroup(
            jPanelLineLaporanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconLaporanSkripsi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconLaporanSkripsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelLaporanSkripsi.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelLaporanSkripsi.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanSkripsi.setText("Skripsi");
        jLabelLaporanSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanSkripsiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanSkripsiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanSkripsiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanSkripsiLayout = new javax.swing.GroupLayout(jPanelLaporanSkripsi);
        jPanelLaporanSkripsi.setLayout(jPanelLaporanSkripsiLayout);
        jPanelLaporanSkripsiLayout.setHorizontalGroup(
            jPanelLaporanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanSkripsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLineLaporanSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconLaporanSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporanSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLaporanSkripsiLayout.setVerticalGroup(
            jPanelLaporanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanSkripsiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconLaporanSkripsi)
                    .addComponent(jPanelLineLaporanSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jLabelLaporanSkripsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelLaporanPinjamBuku.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanPinjamBuku.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanPinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanPinjamBukuMouseClicked(evt);
            }
        });

        jPanelLineLaporanPinjamBuku.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporanPinjamBuku.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanPinjamBukuLayout = new javax.swing.GroupLayout(jPanelLineLaporanPinjamBuku);
        jPanelLineLaporanPinjamBuku.setLayout(jPanelLineLaporanPinjamBukuLayout);
        jPanelLineLaporanPinjamBukuLayout.setHorizontalGroup(
            jPanelLineLaporanPinjamBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanPinjamBukuLayout.setVerticalGroup(
            jPanelLineLaporanPinjamBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconDashboard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconDashboard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelLaporanPinjamBuku.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelLaporanPinjamBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanPinjamBuku.setText("Pinjam Buku");
        jLabelLaporanPinjamBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanPinjamBukuLayout = new javax.swing.GroupLayout(jPanelLaporanPinjamBuku);
        jPanelLaporanPinjamBuku.setLayout(jPanelLaporanPinjamBukuLayout);
        jPanelLaporanPinjamBukuLayout.setHorizontalGroup(
            jPanelLaporanPinjamBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamBukuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelLineLaporanPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconDashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporanPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLaporanPinjamBukuLayout.setVerticalGroup(
            jPanelLaporanPinjamBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanPinjamBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconDashboard3)
                    .addComponent(jPanelLineLaporanPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabelLaporanPinjamBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanelLaporanPinjamSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanPinjamSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanPinjamSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanPinjamSkripsiMouseClicked(evt);
            }
        });

        jPanelLineLaporanPinjamSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporanPinjamSkripsi.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanPinjamSkripsiLayout = new javax.swing.GroupLayout(jPanelLineLaporanPinjamSkripsi);
        jPanelLineLaporanPinjamSkripsi.setLayout(jPanelLineLaporanPinjamSkripsiLayout);
        jPanelLineLaporanPinjamSkripsiLayout.setHorizontalGroup(
            jPanelLineLaporanPinjamSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanPinjamSkripsiLayout.setVerticalGroup(
            jPanelLineLaporanPinjamSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconLaporanSkripsi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconLaporanSkripsi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelLaporanPinjamSkripsi.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelLaporanPinjamSkripsi.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanPinjamSkripsi.setText("Pinjam Skripsi");
        jLabelLaporanPinjamSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanPinjamSkripsiLayout = new javax.swing.GroupLayout(jPanelLaporanPinjamSkripsi);
        jPanelLaporanPinjamSkripsi.setLayout(jPanelLaporanPinjamSkripsiLayout);
        jPanelLaporanPinjamSkripsiLayout.setHorizontalGroup(
            jPanelLaporanPinjamSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamSkripsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLineLaporanPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconLaporanSkripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporanPinjamSkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLaporanPinjamSkripsiLayout.setVerticalGroup(
            jPanelLaporanPinjamSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamSkripsiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanPinjamSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconLaporanSkripsi1)
                    .addComponent(jPanelLineLaporanPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jLabelLaporanPinjamSkripsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelKategori.setBackground(new java.awt.Color(255, 255, 255));
        jPanelKategori.setPreferredSize(new java.awt.Dimension(100, 35));

        jPanelLineKategori.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineKategori.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineKategoriLayout = new javax.swing.GroupLayout(jPanelLineKategori);
        jPanelLineKategori.setLayout(jPanelLineKategoriLayout);
        jPanelLineKategoriLayout.setHorizontalGroup(
            jPanelLineKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineKategoriLayout.setVerticalGroup(
            jPanelLineKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconKategori.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/book (1).png"))); // NOI18N

        jLabelKategoriBuku.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelKategoriBuku.setForeground(new java.awt.Color(153, 153, 153));
        jLabelKategoriBuku.setText("Kategori Buku");
        jLabelKategoriBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelKategoriBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelKategoriBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelKategoriBukuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelKategoriLayout = new javax.swing.GroupLayout(jPanelKategori);
        jPanelKategori.setLayout(jPanelKategoriLayout);
        jPanelKategoriLayout.setHorizontalGroup(
            jPanelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKategoriLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelIconKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );
        jPanelKategoriLayout.setVerticalGroup(
            jPanelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelKategoriBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabelIconKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelLineKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanelLaporanPinjamBukuBulanan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanPinjamBukuBulanan.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanPinjamBukuBulanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanPinjamBukuBulananMouseClicked(evt);
            }
        });

        jPanelLineLaporanPinjamBukuBulanan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporanPinjamBukuBulanan.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanPinjamBukuBulananLayout = new javax.swing.GroupLayout(jPanelLineLaporanPinjamBukuBulanan);
        jPanelLineLaporanPinjamBukuBulanan.setLayout(jPanelLineLaporanPinjamBukuBulananLayout);
        jPanelLineLaporanPinjamBukuBulananLayout.setHorizontalGroup(
            jPanelLineLaporanPinjamBukuBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanPinjamBukuBulananLayout.setVerticalGroup(
            jPanelLineLaporanPinjamBukuBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconLaporanSkripsi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconLaporanSkripsi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelLaporanPinjamBukuBulanan.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabelLaporanPinjamBukuBulanan.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanPinjamBukuBulanan.setText("Pinjam Buku Bulanan");
        jLabelLaporanPinjamBukuBulanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuBulananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuBulananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamBukuBulananMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanPinjamBukuBulananLayout = new javax.swing.GroupLayout(jPanelLaporanPinjamBukuBulanan);
        jPanelLaporanPinjamBukuBulanan.setLayout(jPanelLaporanPinjamBukuBulananLayout);
        jPanelLaporanPinjamBukuBulananLayout.setHorizontalGroup(
            jPanelLaporanPinjamBukuBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamBukuBulananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLineLaporanPinjamBukuBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconLaporanSkripsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporanPinjamBukuBulanan, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );
        jPanelLaporanPinjamBukuBulananLayout.setVerticalGroup(
            jPanelLaporanPinjamBukuBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamBukuBulananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanPinjamBukuBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconLaporanSkripsi2)
                    .addComponent(jPanelLineLaporanPinjamBukuBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jLabelLaporanPinjamBukuBulanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelLogout.setBackground(new java.awt.Color(0, 102, 102));
        jPanelLogout.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabelLogout.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogout.setText("LOGOUT");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoutLayout = new javax.swing.GroupLayout(jPanelLogout);
        jPanelLogout.setLayout(jPanelLogoutLayout);
        jPanelLogoutLayout.setHorizontalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanelLogoutLayout.setVerticalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanelLaporanPinjamSkripsiBulanan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLaporanPinjamSkripsiBulanan.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanelLaporanPinjamSkripsiBulanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLaporanPinjamSkripsiBulananMouseClicked(evt);
            }
        });

        jPanelLineLaporanPinjamSkripsiBulanan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLineLaporanPinjamSkripsiBulanan.setPreferredSize(new java.awt.Dimension(100, 35));

        javax.swing.GroupLayout jPanelLineLaporanPinjamSkripsiBulananLayout = new javax.swing.GroupLayout(jPanelLineLaporanPinjamSkripsiBulanan);
        jPanelLineLaporanPinjamSkripsiBulanan.setLayout(jPanelLineLaporanPinjamSkripsiBulananLayout);
        jPanelLineLaporanPinjamSkripsiBulananLayout.setHorizontalGroup(
            jPanelLineLaporanPinjamSkripsiBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanelLineLaporanPinjamSkripsiBulananLayout.setVerticalGroup(
            jPanelLineLaporanPinjamSkripsiBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabelIconLaporanSkripsi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconLaporanSkripsi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print_1.png"))); // NOI18N

        jLabelLaporanPinjamSkripsiBulanan.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabelLaporanPinjamSkripsiBulanan.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLaporanPinjamSkripsiBulanan.setText("Pinjam Skripsi Bulanan");
        jLabelLaporanPinjamSkripsiBulanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiBulananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiBulananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLaporanPinjamSkripsiBulananMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLaporanPinjamSkripsiBulananLayout = new javax.swing.GroupLayout(jPanelLaporanPinjamSkripsiBulanan);
        jPanelLaporanPinjamSkripsiBulanan.setLayout(jPanelLaporanPinjamSkripsiBulananLayout);
        jPanelLaporanPinjamSkripsiBulananLayout.setHorizontalGroup(
            jPanelLaporanPinjamSkripsiBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamSkripsiBulananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLineLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconLaporanSkripsi3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        jPanelLaporanPinjamSkripsiBulananLayout.setVerticalGroup(
            jPanelLaporanPinjamSkripsiBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLaporanPinjamSkripsiBulananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLaporanPinjamSkripsiBulananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconLaporanSkripsi3)
                    .addComponent(jPanelLineLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jLabelLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelkiriLayout = new javax.swing.GroupLayout(jPanelkiri);
        jPanelkiri.setLayout(jPanelkiriLayout);
        jPanelkiriLayout.setHorizontalGroup(
            jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkiriLayout.createSequentialGroup()
                .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelKepanjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelISCO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLaporan)
                            .addComponent(jLabelTransaksi)
                            .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanelPeminjaman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jPanelPengembalian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanelLaporanSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanelLaporanDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelLaporanPinjamBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanelLaporanPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLaporanPinjamBukuBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelUtama))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jPanelSkripsi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jPanelKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(jPanelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelkiriLayout.setVerticalGroup(
            jPanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkiriLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelISCO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKepanjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUtama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanPinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanPinjamSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanPinjamBukuBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLaporanPinjamSkripsiBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDasarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
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
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuPeminjamanBuku());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
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

    private void jLabelLaporanBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanBukuMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuLaporanBk());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanBukuMouseClicked

    private void jLabelLaporanBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanBukuMouseEntered
        jPanelLaporanDataBuku.setBackground(new Color(250, 250, 250));
        jPanelLineLaporan.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanBukuMouseEntered

    private void jLabelLaporanBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanBukuMouseExited
        jPanelLaporanDataBuku.setBackground(new Color(255, 255, 255));
        jPanelLineLaporan.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanBukuMouseExited

    private void jPanelLaporanDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanDataBukuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanDataBukuMouseClicked

    private void jLabelPeminjamanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanSkripsiMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuPeminjamanSkripsi());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelPeminjamanSkripsiMouseClicked

    private void jLabelPeminjamanSkripsiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanSkripsiMouseEntered
        jPanelPengembalian.setBackground(new Color(250, 250, 250));
        jPanelLinePengembalian.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelPeminjamanSkripsiMouseEntered

    private void jLabelPeminjamanSkripsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeminjamanSkripsiMouseExited
        jPanelPengembalian.setBackground(new Color(255, 255, 255));
        jPanelLinePengembalian.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelPeminjamanSkripsiMouseExited

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

    private void jLabelLaporanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanSkripsiMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuLaporanSkripsi());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanSkripsiMouseClicked

    private void jLabelLaporanSkripsiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanSkripsiMouseEntered
        jPanelLaporanSkripsi.setBackground(new Color(250, 250, 250));
        jPanelLineLaporanSkripsi.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanSkripsiMouseEntered

    private void jLabelLaporanSkripsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanSkripsiMouseExited
        jPanelLaporanSkripsi.setBackground(new Color(255, 255, 255));
        jPanelLineLaporanSkripsi.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanSkripsiMouseExited

    private void jPanelLaporanSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanSkripsiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanSkripsiMouseClicked

    private void jLabelLaporanPinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuLaporanPinjamBuku());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanPinjamBukuMouseClicked

    private void jLabelLaporanPinjamBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuMouseEntered
        jPanelLaporanPinjamBuku.setBackground(new Color(250, 250, 250));
        jPanelLineLaporanPinjamBuku.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanPinjamBukuMouseEntered

    private void jLabelLaporanPinjamBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuMouseExited
        jPanelLaporanPinjamBuku.setBackground(new Color(255, 255, 255));
        jPanelLineLaporanPinjamBuku.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanPinjamBukuMouseExited

    private void jPanelLaporanPinjamBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanPinjamBukuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanPinjamBukuMouseClicked

    private void jLabelLaporanPinjamSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuLaporanPinjamSkripsi());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiMouseClicked

    private void jLabelLaporanPinjamSkripsiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiMouseEntered
        jPanelLaporanPinjamSkripsi.setBackground(new Color(250, 250, 250));
        jPanelLineLaporanPinjamSkripsi.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiMouseEntered

    private void jLabelLaporanPinjamSkripsiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiMouseExited
        jPanelLaporanPinjamSkripsi.setBackground(new Color(255, 255, 255));
        jPanelLineLaporanPinjamSkripsi.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiMouseExited

    private void jPanelLaporanPinjamSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanPinjamSkripsiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanPinjamSkripsiMouseClicked

    private void jLabelKategoriBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKategoriBukuMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuKategori());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelKategoriBukuMouseClicked

    private void jLabelKategoriBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKategoriBukuMouseEntered
        jPanelKategori.setBackground(new Color(250, 250, 250));
        jPanelLineKategori.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelKategoriBukuMouseEntered

    private void jLabelKategoriBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelKategoriBukuMouseExited
        jPanelKategori.setBackground(new Color(255, 255, 255));
        jPanelLineKategori.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelKategoriBukuMouseExited

    private void jLabelLaporanPinjamBukuBulananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuBulananMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuPeminjamanBukuBulanan());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanPinjamBukuBulananMouseClicked

    private void jLabelLaporanPinjamBukuBulananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuBulananMouseEntered
        jPanelLaporanPinjamBukuBulanan.setBackground(new Color(250, 250, 250));
        jPanelLineLaporanPinjamBukuBulanan.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanPinjamBukuBulananMouseEntered

    private void jLabelLaporanPinjamBukuBulananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamBukuBulananMouseExited
        jPanelLaporanPinjamBukuBulanan.setBackground(new Color(255, 255, 255));
        jPanelLineLaporanPinjamBukuBulanan.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanPinjamBukuBulananMouseExited

    private void jPanelLaporanPinjamBukuBulananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanPinjamBukuBulananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanPinjamBukuBulananMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
//          
        int confirmLogout = JOptionPane.showConfirmDialog(MenuUtama.this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        // Memeriksa hasil dari dialog konfirmasi
        if (confirmLogout == JOptionPane.YES_OPTION) {
            // Aksi yang dilakukan jika pengguna memilih "Ya"
            // Misalnya, kembali ke frame login atau jalankan logika logout Anda
            LoginFrame loginFrame = new LoginFrame();  // Gantilah LoginFrame dengan nama kelas frame login Anda
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setVisible(true);

            // Menutup frame saat ini (frame utama)
            dispose();
        } else {
            // Aksi yang dilakukan jika pengguna memilih "Tidak" atau menutup dialog
            // Misalnya, tidak melakukan apa-apa atau melanjutkan aplikasi
        }


    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jLabelLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelLogoutMouseEntered

    private void jLabelLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelLogoutMouseExited

    private void jLabelLaporanPinjamSkripsiBulananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiBulananMouseClicked
        jPanelDashboard.setBackground(new Color(250, 250, 250));
        jPanelLine.setBackground(new Color(0, 204, 204));

        jPanelUtama.removeAll();
        jPanelUtama.add(new MenuPeminjamanSkripsiBulanan());
        jPanelUtama.repaint();
        jPanelUtama.revalidate();
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiBulananMouseClicked

    private void jLabelLaporanPinjamSkripsiBulananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiBulananMouseEntered
        jPanelLaporanPinjamSkripsiBulanan.setBackground(new Color(250, 250, 250));
        jPanelLineLaporanPinjamSkripsiBulanan.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiBulananMouseEntered

    private void jLabelLaporanPinjamSkripsiBulananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanPinjamSkripsiBulananMouseExited
        jPanelLaporanPinjamSkripsiBulanan.setBackground(new Color(255, 255, 255));
        jPanelLineLaporanPinjamSkripsiBulanan.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelLaporanPinjamSkripsiBulananMouseExited

    private void jPanelLaporanPinjamSkripsiBulananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLaporanPinjamSkripsiBulananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLaporanPinjamSkripsiBulananMouseClicked

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
    private javax.swing.JLabel jLabelISCO;
    private javax.swing.JLabel jLabelIconBuku;
    private javax.swing.JLabel jLabelIconDashboard;
    private javax.swing.JLabel jLabelIconDashboard2;
    private javax.swing.JLabel jLabelIconDashboard3;
    private javax.swing.JLabel jLabelIconKategori;
    private javax.swing.JLabel jLabelIconLaporanSkripsi;
    private javax.swing.JLabel jLabelIconLaporanSkripsi1;
    private javax.swing.JLabel jLabelIconLaporanSkripsi2;
    private javax.swing.JLabel jLabelIconLaporanSkripsi3;
    private javax.swing.JLabel jLabelIconPeminjaman;
    private javax.swing.JLabel jLabelIconPeminjaman1;
    private javax.swing.JLabel jLabelIconSkripsi;
    private javax.swing.JLabel jLabelKategoriBuku;
    private javax.swing.JLabel jLabelKepanjangan;
    private javax.swing.JLabel jLabelLaporan;
    private javax.swing.JLabel jLabelLaporanBuku;
    private javax.swing.JLabel jLabelLaporanPinjamBuku;
    private javax.swing.JLabel jLabelLaporanPinjamBukuBulanan;
    private javax.swing.JLabel jLabelLaporanPinjamSkripsi;
    private javax.swing.JLabel jLabelLaporanPinjamSkripsiBulanan;
    private javax.swing.JLabel jLabelLaporanSkripsi;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelPeminjaman;
    private javax.swing.JLabel jLabelPeminjamanSkripsi;
    private javax.swing.JLabel jLabelSkripsi;
    private javax.swing.JLabel jLabelTransaksi;
    private javax.swing.JLabel jLabelUtama;
    private javax.swing.JPanel jPanelBuku;
    private javax.swing.JPanel jPanelDasar;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelKategori;
    private javax.swing.JPanel jPanelLaporanDataBuku;
    private javax.swing.JPanel jPanelLaporanPinjamBuku;
    private javax.swing.JPanel jPanelLaporanPinjamBukuBulanan;
    private javax.swing.JPanel jPanelLaporanPinjamSkripsi;
    private javax.swing.JPanel jPanelLaporanPinjamSkripsiBulanan;
    private javax.swing.JPanel jPanelLaporanSkripsi;
    private javax.swing.JPanel jPanelLine;
    private javax.swing.JPanel jPanelLineBuku;
    private javax.swing.JPanel jPanelLineKategori;
    private javax.swing.JPanel jPanelLineLaporan;
    private javax.swing.JPanel jPanelLineLaporanPinjamBuku;
    private javax.swing.JPanel jPanelLineLaporanPinjamBukuBulanan;
    private javax.swing.JPanel jPanelLineLaporanPinjamSkripsi;
    private javax.swing.JPanel jPanelLineLaporanPinjamSkripsiBulanan;
    private javax.swing.JPanel jPanelLineLaporanSkripsi;
    private javax.swing.JPanel jPanelLinePeminjaman;
    private javax.swing.JPanel jPanelLinePengembalian;
    private javax.swing.JPanel jPanelLineSkripsi;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelNavbar;
    private javax.swing.JPanel jPanelPeminjaman;
    private javax.swing.JPanel jPanelPengembalian;
    private javax.swing.JPanel jPanelSkripsi;
    private javax.swing.JPanel jPanelUtama;
    private javax.swing.JPanel jPanelkanan;
    private javax.swing.JPanel jPanelkiri;
    // End of variables declaration//GEN-END:variables
}

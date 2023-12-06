/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Safriya Murni
 */
@Entity
@Table(name = "peminjamanskripsi")
@NamedQueries({
    @NamedQuery(name = "Peminjamanskripsi.findAll", query = "SELECT p FROM Peminjamanskripsi p"),
    @NamedQuery(name = "Peminjamanskripsi.findByIdpinjam", query = "SELECT p FROM Peminjamanskripsi p WHERE p.idpinjam = :idpinjam"),
    @NamedQuery(name = "Peminjamanskripsi.findByNama", query = "SELECT p FROM Peminjamanskripsi p WHERE p.nama = :nama"),
    @NamedQuery(name = "Peminjamanskripsi.findByProdi", query = "SELECT p FROM Peminjamanskripsi p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjamanskripsi.findBySemester", query = "SELECT p FROM Peminjamanskripsi p WHERE p.semester = :semester"),
    @NamedQuery(name = "Peminjamanskripsi.findByAngkatan", query = "SELECT p FROM Peminjamanskripsi p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjamanskripsi.findByTglpinjam", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tglpinjam = :tglpinjam"),
    @NamedQuery(name = "Peminjamanskripsi.findByTglkembali", query = "SELECT p FROM Peminjamanskripsi p WHERE p.tglkembali = :tglkembali")})
public class Peminjamanskripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpinjam")
    private String idpinjam;
    @Column(name = "nama")
    private String nama;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "semester")
    private String semester;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "tglpinjam")
    @Temporal(TemporalType.DATE)
    private Date tglpinjam;
    @Column(name = "tglkembali")
    @Temporal(TemporalType.DATE)
    private Date tglkembali;
    @JoinColumn(name = "idskripsi", referencedColumnName = "idskripsi")
    @ManyToOne
    private Skripsi idskripsi;

    public Peminjamanskripsi() {
    }

    public Peminjamanskripsi(String idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getIdpinjam() {
        return idpinjam;
    }

    public void setIdpinjam(String idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public Date getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(Date tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public Date getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(Date tglkembali) {
        this.tglkembali = tglkembali;
    }

    public Skripsi getIdskripsi() {
        return idskripsi;
    }

    public void setIdskripsi(Skripsi idskripsi) {
        this.idskripsi = idskripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpinjam != null ? idpinjam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjamanskripsi)) {
            return false;
        }
        Peminjamanskripsi other = (Peminjamanskripsi) object;
        if ((this.idpinjam == null && other.idpinjam != null) || (this.idpinjam != null && !this.idpinjam.equals(other.idpinjam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Peminjamanskripsi[ idpinjam=" + idpinjam + " ]";
    }
    
}

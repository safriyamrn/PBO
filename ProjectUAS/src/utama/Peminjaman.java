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
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdpinjam", query = "SELECT p FROM Peminjaman p WHERE p.idpinjam = :idpinjam"),
    @NamedQuery(name = "Peminjaman.findByNamapeminjam", query = "SELECT p FROM Peminjaman p WHERE p.namapeminjam = :namapeminjam"),
    @NamedQuery(name = "Peminjaman.findByProdi", query = "SELECT p FROM Peminjaman p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjaman.findBySemester", query = "SELECT p FROM Peminjaman p WHERE p.semester = :semester"),
    @NamedQuery(name = "Peminjaman.findByAngkatan", query = "SELECT p FROM Peminjaman p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjaman.findByTglpinjam", query = "SELECT p FROM Peminjaman p WHERE p.tglpinjam = :tglpinjam"),
    @NamedQuery(name = "Peminjaman.findByTglkembali", query = "SELECT p FROM Peminjaman p WHERE p.tglkembali = :tglkembali")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpinjam")
    private String idpinjam;
    @Column(name = "namapeminjam")
    private String namapeminjam;
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
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne
    private Book isbn;

    public Peminjaman() {
    }

    public Peminjaman(String idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getIdpinjam() {
        return idpinjam;
    }

    public void setIdpinjam(String idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getNamapeminjam() {
        return namapeminjam;
    }

    public void setNamapeminjam(String namapeminjam) {
        this.namapeminjam = namapeminjam;
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

    public Book getIsbn() {
        return isbn;
    }

    public void setIsbn(Book isbn) {
        this.isbn = isbn;
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
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.idpinjam == null && other.idpinjam != null) || (this.idpinjam != null && !this.idpinjam.equals(other.idpinjam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Peminjaman[ idpinjam=" + idpinjam + " ]";
    }
    
}

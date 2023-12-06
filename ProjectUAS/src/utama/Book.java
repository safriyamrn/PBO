/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Safriya Murni
 */
@Entity
@Table(name = "book")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book.findByJudul", query = "SELECT b FROM Book b WHERE b.judul = :judul"),
    @NamedQuery(name = "Book.findByPengarang", query = "SELECT b FROM Book b WHERE b.pengarang = :pengarang"),
    @NamedQuery(name = "Book.findByPenerbit", query = "SELECT b FROM Book b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "Book.findByTahun", query = "SELECT b FROM Book b WHERE b.tahun = :tahun"),
    @NamedQuery(name = "Book.findByHalamanbuku", query = "SELECT b FROM Book b WHERE b.halamanbuku = :halamanbuku")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "halamanbuku")
    private String halamanbuku;
    @JoinColumn(name = "idkategori", referencedColumnName = "idkategori")
    @ManyToOne
    private Kategori idkategori;
    @OneToMany(mappedBy = "isbn")
    private Collection<Peminjaman> peminjamanCollection;

    public Book() {
    }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getHalamanbuku() {
        return halamanbuku;
    }

    public void setHalamanbuku(String halamanbuku) {
        this.halamanbuku = halamanbuku;
    }

    public Kategori getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Kategori idkategori) {
        this.idkategori = idkategori;
    }

    public Collection<Peminjaman> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<Peminjaman> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Book[ isbn=" + isbn + " ]";
    }
    
}

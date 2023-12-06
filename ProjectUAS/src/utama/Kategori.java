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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Safriya Murni
 */
@Entity
@Table(name = "kategori")
@NamedQueries({
    @NamedQuery(name = "Kategori.findAll", query = "SELECT k FROM Kategori k"),
    @NamedQuery(name = "Kategori.findByIdkategori", query = "SELECT k FROM Kategori k WHERE k.idkategori = :idkategori"),
    @NamedQuery(name = "Kategori.findByNamakategori", query = "SELECT k FROM Kategori k WHERE k.namakategori = :namakategori")})
public class Kategori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idkategori")
    private String idkategori;
    @Column(name = "namakategori")
    private String namakategori;
    @OneToMany(mappedBy = "idkategori")
    private Collection<Book> bookCollection;

    public Kategori() {
    }

    public Kategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamakategori() {
        return namakategori;
    }

    public void setNamakategori(String namakategori) {
        this.namakategori = namakategori;
    }

    public Collection<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Collection<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkategori != null ? idkategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategori)) {
            return false;
        }
        Kategori other = (Kategori) object;
        if ((this.idkategori == null && other.idkategori != null) || (this.idkategori != null && !this.idkategori.equals(other.idkategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Kategori[ idkategori=" + idkategori + " ]";
    }
    
}

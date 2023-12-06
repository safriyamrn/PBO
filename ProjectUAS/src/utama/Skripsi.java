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
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findByIdskripsi", query = "SELECT s FROM Skripsi s WHERE s.idskripsi = :idskripsi"),
    @NamedQuery(name = "Skripsi.findByJudulskripsi", query = "SELECT s FROM Skripsi s WHERE s.judulskripsi = :judulskripsi"),
    @NamedQuery(name = "Skripsi.findByPenulis", query = "SELECT s FROM Skripsi s WHERE s.penulis = :penulis"),
    @NamedQuery(name = "Skripsi.findByTahunskripsi", query = "SELECT s FROM Skripsi s WHERE s.tahunskripsi = :tahunskripsi"),
    @NamedQuery(name = "Skripsi.findByHalamanskripsi", query = "SELECT s FROM Skripsi s WHERE s.halamanskripsi = :halamanskripsi")})
public class Skripsi implements Serializable {

    @OneToMany(mappedBy = "idskripsi")
    private Collection<Peminjamanskripsi> peminjamanskripsiCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idskripsi")
    private String idskripsi;
    @Column(name = "judulskripsi")
    private String judulskripsi;
    @Column(name = "penulis")
    private String penulis;
    @Column(name = "tahunskripsi")
    private String tahunskripsi;
    @Column(name = "halamanskripsi")
    private String halamanskripsi;

    public Skripsi() {
    }

    public Skripsi(String idskripsi) {
        this.idskripsi = idskripsi;
    }

    public String getIdskripsi() {
        return idskripsi;
    }

    public void setIdskripsi(String idskripsi) {
        this.idskripsi = idskripsi;
    }

    public String getJudulskripsi() {
        return judulskripsi;
    }

    public void setJudulskripsi(String judulskripsi) {
        this.judulskripsi = judulskripsi;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getTahunskripsi() {
        return tahunskripsi;
    }

    public void setTahunskripsi(String tahunskripsi) {
        this.tahunskripsi = tahunskripsi;
    }

    public String getHalamanskripsi() {
        return halamanskripsi;
    }

    public void setHalamanskripsi(String halamanskripsi) {
        this.halamanskripsi = halamanskripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idskripsi != null ? idskripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.idskripsi == null && other.idskripsi != null) || (this.idskripsi != null && !this.idskripsi.equals(other.idskripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Skripsi[ idskripsi=" + idskripsi + " ]";
    }

    public Collection<Peminjamanskripsi> getPeminjamanskripsiCollection() {
        return peminjamanskripsiCollection;
    }

    public void setPeminjamanskripsiCollection(Collection<Peminjamanskripsi> peminjamanskripsiCollection) {
        this.peminjamanskripsiCollection = peminjamanskripsiCollection;
    }
    
}

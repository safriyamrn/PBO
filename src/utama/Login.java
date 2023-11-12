/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Safriya Murni
 */
@Entity
@Table(name = "login")
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByNomorInduk", query = "SELECT l FROM Login l WHERE l.nomorInduk = :nomorInduk"),
    @NamedQuery(name = "Login.findByNama", query = "SELECT l FROM Login l WHERE l.nama = :nama"),
    @NamedQuery(name = "Login.findByUsername", query = "SELECT l FROM Login l WHERE l.username = :username"),
    @NamedQuery(name = "Login.findByPassword", query = "SELECT l FROM Login l WHERE l.password = :password")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomor_induk")
    private String nomorInduk;
    @Column(name = "nama")
    private String nama;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public Login() {
    }

    public Login(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomorInduk != null ? nomorInduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.nomorInduk == null && other.nomorInduk != null) || (this.nomorInduk != null && !this.nomorInduk.equals(other.nomorInduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utama.Login[ nomorInduk=" + nomorInduk + " ]";
    }
    
}

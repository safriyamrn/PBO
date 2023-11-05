/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo2;

/**
 *
 * @author Safriya Murni
 */
public class Hewan {

    //atribut
    protected String nama;
    protected String jenisTulang;
    protected String jenisMakanan;
    protected int jumlahKaki;

    //method
    protected String makan() {
        return "semua hewan membutuhkan makan";
    }

    //contructor
    public Hewan(String jenisTulang) {

        this.jenisTulang = jenisTulang;
    }

    public Hewan(String jenisMakanan, String nama) {
        this.jenisMakanan = jenisMakanan;
        this.nama = nama;
    }

    public Hewan(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNama() {
        this.nama = nama;
    }

    /**
     * @return the jenisTulang
     */
    public String getJenisTulang() {
        return jenisTulang;
    }

    /**
     * @param jenisTulang the jenisTulang to set
     */
    public void setJenisTulang(String jenisTulang) {
        this.jenisTulang = jenisTulang;
    }

    public void setJenisTulang() {
        this.jenisTulang = jenisTulang;
    }

    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public void setJumlahKaki() {
        this.jumlahKaki = jumlahKaki;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Safriya Murni
 */
public class Orang {
private String tempatTinggal = "Dunia";
private String Bahasa;
private String Cuaca;

//overload
public String Bekerja(){
    return " pada jam 8 AM hingga jam 4 PM";
}
public String Bekerja(String waktu){
    return " pada " + "waktu " + waktu;
}
public String Bekerja(int waktu){
    return " pada " + "jam " + String.valueOf(waktu);
}

    /**
     * @return the tempatTinggal
     */
    public String getTempatTinggal() {
        return tempatTinggal;
    }

    /**
     * @param tempatTinggal the tempatTinggal to set
     */
    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    
    /**
     * @return the Cuaca
     */
    public String getCuaca() {
        return Cuaca;
    }

    /**
     * @param Cuaca the Cuaca to set
     */
    public void setCuaca(String Cuaca) {
        this.Cuaca = Cuaca;
    }

    /**
     * @return the Bahasa
     */
    public String getBahasa() {
        return Bahasa;
    }

    /**
     * @param Bahasa the Bahasa to set
     */
    public void setBahasa(String Bahasa) {
        this.Bahasa = Bahasa;
    }
    
}

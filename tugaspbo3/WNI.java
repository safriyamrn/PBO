/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Safriya Murni
 */
public class WNI extends Orang implements PNS, Fotografer, Pedagang {

    @Override
    public void ngantor() {
        System.out.println("Joko bekerja sebagai PNS");
    }

    @Override
    public void memotret() {
        System.out.println("Joko bekerja sampingan sebagai Photografer");
    }
    
    @Override
    public void berjualan(){
        System.out.println("Joko berjualan dirumah");
    }

    @Override
    public void setTempatTinggal(String tempatTinggal) {
        super.setTempatTinggal("Indonesia");
    }

    public WNI() {
        this.setTempatTinggal(""); 
    }
}

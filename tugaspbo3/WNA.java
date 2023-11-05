/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Safriya Murni
 */
public class WNA extends Orang implements PengusahaCoffee, Konsultan, VirtualAssistant {
    
    @Override
    public void melayaniAdministrasi(){
        System.out.println("Alexandra sebagai VirtualAssistant");
    }

    @Override
    public void memantauPegawai() {
        System.out.println("Alexandra sebagai pemilik CoffeeShop");
    }

    @Override
    public void melayaniKlien() {
        System.out.println("Alexandra sebagai konsultan");
    }

    @Override
    public void setTempatTinggal(String tempatTinggal) {
        super.setTempatTinggal("Luar Negeri");
    }

    public WNA() {
        this.setTempatTinggal(" ");
    }

}

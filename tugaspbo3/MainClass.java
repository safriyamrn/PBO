/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

import tugas3.Orang;
import tugas3.WNI;
import tugas3.WNA;

/**
 *
 * @author Safriya Murni
 */
public class MainClass {

    public static void main(String[] args) {
        WNI JokoSamudro = new WNI();
        System.out.println("Joko Samudro tinggal di " + JokoSamudro.getTempatTinggal());
        JokoSamudro.ngantor();
        System.out.println("Joko berangkat ngantor " + JokoSamudro.Bekerja(8));
        JokoSamudro.memotret();
        System.out.println("Joko memotret " + JokoSamudro.Bekerja("Malam Hari"));
        JokoSamudro.berjualan();
        System.out.println("Joko berjualan " + JokoSamudro.Bekerja("hari libur"));
        System.out.println();
        System.out.println("----------------------------------------");

        WNA Alexandra = new WNA();
        System.out.println("Alexandra tinggal di " + Alexandra.getTempatTinggal());
        Alexandra.melayaniKlien();
        System.out.println("Alexandra memulai melayani klien " + Alexandra.Bekerja(10));
        Alexandra.memantauPegawai();
        System.out.println("Alexandra memantau Cafe" + Alexandra.Bekerja("Malam hari"));
        Alexandra.melayaniAdministrasi();
        System.out.println("Alexandra membantu klien dalam masalah administrasi bisnis " + Alexandra.Bekerja("jam kosong"));

        System.out.println("----------------------------------------");

        Orang umum = new Orang();
        System.out.println("Semua orang tinggal di " + umum.getTempatTinggal());
        System.out.println("Mayoritas orang bekerja " + umum.Bekerja());

    }
}

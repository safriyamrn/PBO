/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import tugaspbo2.Hewan;
import tugaspbo2.Vertebrata;
import tugaspbo2.Invertebrata;
import tugaspbo2.Aves;
import tugaspbo2.Pisces;

/**
 *
 * @author Safriya Murni
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Vertebrata hewan1 = new Vertebrata();
        hewan1.setNama("Neon Tetra");
        hewan1.setJenisMakanan("pelet");
        Invertebrata hewan2 = new Invertebrata("Invertebrata");
        hewan2.setNama("siput");
        hewan2.setJenisTulang();
        hewan2.setJenisMakanan("cacing");
        Hewan kupuKupu = new Hewan("Invertebrata");
        kupuKupu.setNama("kupu-kupu");
        kupuKupu.setJumlahKaki(6);
        kupuKupu.setJenisTulang();
        kupuKupu.setJenisMakanan("nektar");

        System.out.println("nama hewan: " + hewan1.getNama()
                + " \nmakan " + hewan1.getJenisMakanan()
                + " \nmemiliki jenis tulang " + hewan1.getJenisTulang()
                + " \nmemiliki kaki sebanyak " + hewan1.getJumlahKaki());
        System.out.println("\nnama hewan: " + hewan2.getNama()
                + " \nmakan " + hewan2.getJenisMakanan()
                + " \nmemiliki jenis tulang " + hewan2.getJenisTulang()
                + " \nmemiliki kaki sebanyak " + hewan2.getJumlahKaki());
        System.out.println("\nnama hewan: " + kupuKupu.getNama()
                + " \nmakan " + kupuKupu.getJenisMakanan()
                + " \nmemiliki jenis tulang " + kupuKupu.getJenisTulang()
                + " \nmemiliki kaki sebanyak " + kupuKupu.getJumlahKaki());
    }
}

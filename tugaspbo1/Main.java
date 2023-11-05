/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1;

/**
 *
 * @author Safriya Murni
 */
public class Main {
    public static void main(String[] args) {
        Tumbuhan anggrek = new Tumbuhan();
        anggrek.setNamaTumbuhan ("Anggrek");
        anggrek.setWarnaBunga("Putih");
        anggrek.setJenisdaun("Memanjang oval");
        
        System.out.println("Nama tumbuhan itu adalah: " + anggrek.getNamaTumbuhan());
        System.out.println("Warna bungan itu adalah: " + anggrek.getWarnaBunga());
        System.out.println("Jenis daun tanaman tersebut adalah: " + anggrek.getJenisdaun());
    }
}

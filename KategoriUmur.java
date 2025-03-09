/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author AGUS
 */
import java.util.Scanner;

public class KategoriUmur {
   
    public static void tentukanKategori(String nama, int umur) {
        String kategori = null;
        
        if (umur < 5) {
            kategori = "balita";
        } else if (umur >= 5 && umur < 12) {
            kategori = "anak";
        } else if (umur >= 12 && umur < 18) {
            kategori = "remaja";
        } else if (umur >= 18 && umur < 40) {
            kategori = "dewasa";
        } else if (umur >= 40 && umur < 60) {
            kategori = "paruhbaya";
        } else if (umur >= 60 ) {
            kategori = "lanjut usia";
        }
        
        System.out.println("\n--- Informasi Kategori Umur ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Kategori: " + kategori);

    }
    
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine(); 
        
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        
        tentukanKategori(nama, umur);
        tentukanKategori("Miroku", 12);
        tentukanKategori("Kafka Hibino", 39);
        tentukanKategori("Saitama", 20);
    }  
}
        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerKeyborad;

/**
 *
 * @author AGUS
 */
import java.util.Scanner;
public class Pajak1 {

    public String vendor;
    public String tipe;
    public double harga;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
      public double hitungPPN() {
        if (harga > 4500000) {
            return harga * 0.05;
        } else if (harga > 4200000 && harga <= 4500000) {
            return harga * 0.02;
        } else if (harga > 4000000) {
            return harga * 0.01;
        } else {
            return harga * 0.005;
        }
    }
    
    public double hargaSetelahPPN() {
        return harga + hitungPPN();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pajak pajak = new Pajak ();
        
        System.out.print("Masukkan Vendor: ");
        pajak.setVendor(scanner.nextLine());
        
        System.out.print("Masukkan Tipe: ");
        pajak.setTipe(scanner.nextLine());
        
        System.out.print("Masukkan Harga: Rp ");
        pajak.setHarga(scanner.nextDouble());
        
        System.out.println("\nInformasi Pajak:");
        pajak.tampilkanInfo();
        
        scanner.close();
        
        pajak.setVendor("Samsung");
        pajak.setTipe("A53");
        pajak.setHarga(4500000);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
        
        pajak.setVendor("Oppo");
        pajak.setTipe("Reno 8");
        pajak.setHarga(3680505);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
          
        pajak.setVendor("POCO");
        pajak.setTipe("F 5");
        pajak.setHarga(6299000);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
        
        
    }
}
  

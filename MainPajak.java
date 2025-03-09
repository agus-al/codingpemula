/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi2;

/**
 *
 * @author AGUS
 */
public class MainPajak {
    public static void main(String[] args) {
        Pajak pajak = new Pajak ();
        pajak.setVendor("Samsung");
        pajak.setTipe("A54");
        pajak.setHarga(4500000);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
        
        System.out.println("Vendor \t= "+pajak.getVendor());
        System.out.println("Tipe \t= "+pajak.getTipe());
        System.out.println("Harga \t= Rp "+pajak.getHarga());
        System.out.println("PPN \t= Rp "+pajak.hitungPPN());
        System.out.println("Harga Setelah PPN \t= Rp "+pajak.hargaSetelahPPN()); 
        
        pajak.setVendor("Oppo");
        pajak.setTipe("Reno 8");
        pajak.setHarga(3680505);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
        
        System.out.println("Vendor \t= "+pajak.getVendor());
        System.out.println("Tipe \t= "+pajak.getTipe());
        System.out.println("Harga \t= Rp "+pajak.getHarga());
        System.out.println("PPN \t= Rp "+pajak.hitungPPN());
        System.out.println("Harga Setelah PPN \t= Rp "+pajak.hargaSetelahPPN());
        
        pajak.setVendor("POCO");
        pajak.setTipe("F 5");
        pajak.setHarga(6299000);
        pajak.hitungPPN();
        pajak.hargaSetelahPPN();
        
        System.out.println("Vendor \t= "+pajak.getVendor());
        System.out.println("Tipe \t= "+pajak.getTipe());
        System.out.println("Harga \t= Rp "+pajak.getHarga());
        System.out.println("PPN \t= Rp "+pajak.hitungPPN());
        System.out.println("Harga Setelah PPN \t= Rp "+pajak.hargaSetelahPPN());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulassi;

/**
 *
 * @author AGUS
 */

public class MainKinetic {
    public String MainKinetic;
    
  private double massa;
    private double kecepatan;

    // Setter untuk massa
    public void setMassa(double massa) {
        if (massa > 0) {
            this.massa = massa;
        } else {
            System.out.println("Massa harus lebih dari 0!");
        }
    }

    // Getter untuk massa
    public double getMassa() {
        return massa;
    }

    // Setter untuk kecepatan
    public void setKecepatan(double kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak boleh negatif!");
        }
    }

    // Getter untuk kecepatan
    public double getKecepatan() {
        return kecepatan;
    }

    // Method untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * kecepatan * kecepatan;
    }


    public static void main(String[] args) {
        MainKinetic kinetic = new MainKinetic();
        kinetic.setMassa(20); // Massa sepeda Andika
        kinetic.setKecepatan(3); // Kecepatan sepeda Andika

        double energiKinetik = kinetic.hitungEnergiKinetik();
        System.out.println("Energi Kinetik: " + energiKinetik + " Joule");
    }
}

  

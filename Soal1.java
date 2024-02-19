/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;
/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner; 
public class Soal1 {

    public static void main(String[] args) {
        Scanner pecahan = new Scanner(System.in);
        
        // Input pecahan pertama
        System.out.println("Masukkan pecahan pertama (numerator/denominator):");
        int num1 = pecahan.nextInt();
        int den1 = pecahan.nextInt();
        
        // Input pecahan kedua
        System.out.println("Masukkan pecahan kedua (numerator/denominator):");
        int num2 = pecahan.nextInt();
        int den2 = pecahan.nextInt();
        
        // Input pecahan ketiga
        System.out.println("Masukkan pecahan ketiga (numerator/denominator):");
        int num3 = pecahan.nextInt();
        int den3 = pecahan.nextInt();
        
        // Temukan KPK dari penyebut (denominator) dari setiap pecahan
        int commonDenominator = kpk(den1, den2, den3);
        
        // Operasi Penjumlahan dengan KPK sebagai penyebut
        int jumlah = (num1 * (commonDenominator / den1)) + 
                     (num2 * (commonDenominator / den2)) + 
                     (num3 * (commonDenominator / den3));
        
        // Operasi Pengurangan dengan KPK sebagai penyebut
        int kurang = (num1 * (commonDenominator / den1)) - 
                     (num2 * (commonDenominator / den2)) - 
                     (num3 * (commonDenominator / den3));
        
         // Operasi Perkalian
        int kalipem = num1 * num2 * num3;
        int kalipen = den1 * den2 * den3;
        
        // Operasi Pembagian
        int bagipem = num1 * den2 * den3;
        int bagipen = den1 * num2 * num3;
        
        // Tampilkan hasil operasi
        System.out.println("\nHasil Penjumlahan: " + jumlah + "/" + commonDenominator);
        System.out.println("Hasil Pengurangan: " + kurang + "/" + commonDenominator);
        System.out.println("Hasil Perkalian: " + kalipem + "/" + kalipen);
        System.out.println("Hasil Pembagian: " + bagipem + "/" + bagipen);
        
        pecahan.close();
    }

    // Method untuk mencari KPK (Kelipatan Persekutuan Kecil)
    public static int kpk(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int commonMultiple = max;
        while (true) {
            if (commonMultiple % a == 0 && commonMultiple % b == 0 && commonMultiple % c == 0) {
                return commonMultiple;
            }
            commonMultiple += max;
        }
    }
}
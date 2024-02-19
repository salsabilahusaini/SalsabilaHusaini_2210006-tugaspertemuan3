/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner;
public class Soal2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pecahan = new Scanner(System.in);

        // Input tabungan
        System.out.print("Masukkan jumlah tabungan Anda (dalam juta rupiah): ");
        double tabungan = pecahan.nextDouble();

        // Input status calon pasangan
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = pecahan.nextBoolean();

        // Ekspresi untuk menentukan apakah akan nikah
        boolean nikah = (tabungan > 100000000) && calonPasangan;

        // Output
        if (nikah) {
            System.out.println("Anda akan menikah karena memiliki tabungan lebih dari 100 juta dan sudah punya calon pasangan.");
        } else {
            System.out.println("Anda belum bisa menikah karena belum memenuhi syarat.");
        }

        pecahan.close();
    }
}

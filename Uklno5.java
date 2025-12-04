/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno5;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class uklno5{
    public static void main(String[] args) {
        // Inisialisasi objek
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // ArrayList untuk menyimpan riwayat lemparan
        ArrayList<Integer> komputerLemparan = new ArrayList<>();
        ArrayList<Integer> pemainLemparan = new ArrayList<>();
        
        // Variabel untuk menghitung kemenangan
        int komputerMenang = 0;
        int pemainMenang = 0;
        
        // Loop permainan sampai salah satu mencapai 5 kemenangan
        while (komputerMenang < 5 && pemainMenang < 5) {
            // Komputer melempar dadu
            int daduKomputer = random.nextInt(6) + 1; // Angka acak 1-6
            komputerLemparan.add(daduKomputer);
            
            // Pemain memasukkan input untuk melempar dadu
            System.out.println("Tekan enter atau masukkan angka apa saja untuk melempar dadu:");
            scanner.nextLine(); // Menunggu input pemain
            
            // Pemain melempar dadu (acak 1-6)
            int daduPemain = random.nextInt(6) + 1;
            pemainLemparan.add(daduPemain);
            
            // Tampilkan nilai dadu
            System.out.println("Nilai dadu komputer: " + daduKomputer);
            System.out.println("Nilai dadu pemain: " + daduPemain);
            
            // Tentukan hasil ronde
            if (daduKomputer > daduPemain) {
                System.out.println("Komputer menang di ronde ini");
                komputerMenang++;
            } else if (daduPemain > daduKomputer) {
                System.out.println("Pemain menang di ronde ini");
                pemainMenang++;
            } else {
                System.out.println("Seri");
            }
            
            // Tampilkan skor sementara
            System.out.println("Skor sementara - Komputer: " + komputerMenang + ", Pemain: " + pemainMenang);
            System.out.println("-----------------------------------");
        }
        
        // Tentukan pemenang
        String pemenang;
        if (komputerMenang == 5) {
            pemenang = "Komputer";
        } else {
            pemenang = "Pemain";
        }
        
        // Tampilkan hasil akhir
        System.out.println("Permainan selesai, pemenangnya adalah " + pemenang);
        
        // Rekap semua lemparan
        System.out.println("\nRekap lemparan:");
        System.out.println("Riwayat lemparan komputer: " + komputerLemparan);
        System.out.println("Riwayat lemparan pemain: " + pemainLemparan);
        
        // Total kemenangan
        System.out.println("Total kemenangan komputer: " + komputerMenang);
        System.out.println("Total kemenangan pemain: " + pemainMenang);
        
        // Tutup scanner
        scanner.close();
    }
}

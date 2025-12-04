/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class uklno6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data peminjam
        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        
        System.out.print("Masukkan kategori buku (A, B, atau C): ");
        char kategori = input.next().charAt(0);
        
        System.out.print("Masukkan lama peminjaman (hari): ");
        int lama = input.nextInt();
        
        // Tarif per hari berdasarkan kategori
        int tarif = 0;
        if (kategori == 'A') {
            tarif = 2000;
        } else if (kategori == 'B') {
            tarif = 1500;
        } else if (kategori == 'C') {
            tarif = 1000;
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }
        
        // Hitung biaya peminjaman awal
        int biayaAwal = tarif * lama;
        
        // Hitung denda jika lama > 7 hari
        int denda = 0;
        if (lama > 7) {
            denda = 500 * (lama - 7);
        }
        
        // Hitung total biaya
        int totalBiaya = biayaAwal + denda;
        
        // Output
        System.out.println("\n=== Rincian Peminjaman Buku ===");
        System.out.println("Nama peminjam: " + nama);
        System.out.println("Judul buku: " + judul);
        System.out.println("Kategori buku: " + kategori);
        System.out.println("Lama peminjaman: " + lama + " hari");
        System.out.println("Biaya peminjaman awal: Rp " + biayaAwal);
        if (denda > 0) {
            System.out.println("Denda keterlambatan: Rp " + denda);
        } else {
            System.out.println("Denda keterlambatan: Rp 0");
        }
        System.out.println("Total biaya akhir: Rp " + totalBiaya);
        
        input.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno7;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

class Cookie {
    String nama;
    int hargaProduksi, hargaJual, jumlahTerjual;
    long totalBiaya, totalPendapatan, labaRugi;
    String status;

    public Cookie(String nama, int hp, int hj, int jt, long tb, long tp, long lr, String s) {
        this.nama = nama;
        this.hargaProduksi = hp;
        this.hargaJual = hj;
        this.jumlahTerjual = jt;
        this.totalBiaya = tb;
        this.totalPendapatan = tp;
        this.labaRugi = lr;
        this.status = s;
    }
}

public class uklno7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cookie> cookies = new ArrayList<>();

        System.out.print("Masukkan jumlah jenis cookies: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Cookies ke-" + (i + 1) + ":");
            System.out.print("Nama cookies: ");
            String nama = sc.next();
            System.out.print("Harga produksi per bungkus: ");
            int prod = sc.nextInt();
            System.out.print("Harga jual per bungkus: ");
            int jual = sc.nextInt();
            System.out.print("Jumlah terjual: ");
            int jumlah = sc.nextInt();

            long biaya = (long) prod * jumlah;
            long pendapatan = (long) jual * jumlah;
            long laba = pendapatan - biaya;
            String status;
            if (laba > 0) {
                status = "Laba";
            } else if (laba < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }

            cookies.add(new Cookie(nama, prod, jual, jumlah, biaya, pendapatan, laba, status));
        }

        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nama Cookies    | Total Biaya    | Total Pendapatan | Laba/Rugi     | Status");
        System.out.println("-----------------------------------------------------------");

        long totalLaba = 0;
        String maxNama = "";
        long maxLaba = Long.MIN_VALUE;

        for (Cookie c : cookies) {
            System.out.printf("%-15s | Rp%,-11d | Rp%,-15d | Rp%,-11d | %s%n",
                    c.nama, c.totalBiaya, c.totalPendapatan, c.labaRugi, c.status);
            totalLaba += c.labaRugi;
            if (c.labaRugi > maxLaba) {
                maxLaba = c.labaRugi;
                maxNama = c.nama;
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + String.format("%,d", totalLaba));
        if (maxLaba > 0) {
            System.out.println("Cookies dengan Laba Tertinggi: " + maxNama + " (Rp" + String.format("%,d", maxLaba) + ")");
        } else {
            System.out.println("Tidak ada cookies yang laba.");
        }

        sc.close();
    }
}

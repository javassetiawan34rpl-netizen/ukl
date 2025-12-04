/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno1.pkg4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Random;

public class uklno14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Menu utama
            System.out.println("\nPilih program yang mau dijalankan:");
            System.out.println("1. Cek Bilangan Prima");
            System.out.println("2. Hitung Pecahan Uang");
            System.out.println("3. Kuis Matematika");
            System.out.println("4. Cek Duplikat Array");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan (0-4): ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 0) {
                System.out.println("Cihuy!");
                break;
            }
            
            switch (pilihan) {
                case 1:
                    // Program 1: Cek Bilangan Prima (diganti dengan kode baru)
                    System.out.print("Masukkan bilangan: ");
                    int bilangan = scanner.nextInt();
                    
                    // Validasi range: hanya menerima 1000 sampai 5000
                    if (bilangan < 1000 || bilangan > 5000) {
                        System.out.println("Bilangan harus antara 1000 dan 5000.");
                        break; // Keluar dari case jika tidak valid (sesuai konteks menu)
                    }
                    
                    // Logika cek prima seperti kode asli
                    if (bilangan <= 1) {
                        System.out.println(bilangan + " bukan prima.");
                    } else {
                        boolean isPrima = true;
                        for (int i = 2; i < bilangan; i++) {
                            if (bilangan % i == 0) {
                                isPrima = false;
                                break;
                            }
                        }
                        System.out.println(isPrima ? bilangan + " prima." : bilangan + " bukan prima.");
                    }
                    break;
                    
                case 2:
                    // Program 2: Hitung Pecahan Uang
                    System.out.print("Masukkan jumlah uang: ");
                    int jumlah = scanner.nextInt();
                    int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
                    for (int p : pecahan) {
                        if (jumlah >= p) {
                            int lembar = jumlah / p;
                            System.out.println(lembar + " Lembar " + p);
                            jumlah %= p;
                        }
                    }
                    break;
                    
                case 3:
                    // Program 3: Kuis Matematika
                    Random random = new Random();
                    int a = random.nextInt(10) + 1;
                    int b = random.nextInt(10) + 1;
                    int pilihanOp = random.nextInt(3);
                    char operator;
                    if (pilihanOp == 0) operator = '*';
                    else if (pilihanOp == 1) { operator = '/'; b = random.nextInt(9) + 1; }
                    else { operator = '%'; b = random.nextInt(9) + 1; }
                    
                    System.out.print(a + " " + operator + " " + b + " = ");
                    int jawabanUser = scanner.nextInt();
                    
                    int jawabanBenar = 0;
                    if (operator == '*') jawabanBenar = a * b;
                    else if (operator == '/') jawabanBenar = a / b;
                    else jawabanBenar = a % b;
                    
                    System.out.println(jawabanUser == jawabanBenar ? "Benar!" : "Salah. Jawaban: " + jawabanBenar);
                    break;
                    
                case 4:
                    // Program 4: Cek Duplikat Array
                    int[] array = {1, 2, 3, 4, 2, 5};  // Contoh array (ubah kalau mau)
                    boolean adaDuplikat = false;
                    int duplikat = -1;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                            if (array[i] == array[j]) {
                                adaDuplikat = true;
                                duplikat = array[i];
                                break;
                            }
                        }
                        if (adaDuplikat) break;
                    }
                    System.out.println(adaDuplikat ? "Ada duplikat: " + duplikat : "Gak ada duplikat.");
                    break;
                    
                default:
                    System.out.println("Pilihan gak valid, coba lagi.");
            }
        }
        
        scanner.close();
    }
}

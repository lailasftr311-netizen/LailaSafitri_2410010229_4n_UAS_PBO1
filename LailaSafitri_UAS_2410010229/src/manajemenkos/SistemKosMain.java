package manajemenkos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemKosMain {
    public static void main(String[] args) {
        // 12. IO Sederhana
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistem Manajemen Kos Banjarmasin ===");
        
        // 14. Error Handling (Try-Catch)
        try {
            System.out.print("Masukkan jumlah data penyewa yang ingin diinput: ");
            int jumlahData = scanner.nextInt();
            
            // 13. Array (Array of Objects)
            SewaDetail[] dataSewa = new SewaDetail[jumlahData];
            
            // 11. Perulangan (For loop untuk input)
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("\nData Penyewa ke-" + (i + 1));
                
                System.out.print("No Kamar (misal: A1): ");
                String no = scanner.next();
                
                System.out.print("Tipe Kamar (Standar/VIP): ");
                String tipe = scanner.next();
                
                System.out.print("Harga Bulanan Dasar (misal: 500000): ");
                double harga = scanner.nextDouble();
                
                // Membersihkan buffer scanner
                scanner.nextLine(); 
                
                System.out.print("Nama Penyewa: ");
                String nama = scanner.nextLine();
                
                System.out.print("Lama Sewa (Bulan): ");
                int lama = scanner.nextInt();
                
                System.out.print("Tambah Fasilitas AC? (true/false): ");
                boolean ac = scanner.nextBoolean();
                
                // 2. Object (Instansiasi objek dimasukkan ke array)
                dataSewa[i] = new SewaDetail(no, tipe, harga, nama, lama, ac);
            }
            
            System.out.println("\n=== REKAP DATA PENYEWAAN KOS ===");
            // Perulangan untuk menampilkan output
            for (int i = 0; i < dataSewa.length; i++) {
                System.out.println("--------------------------------");
                System.out.println("Data ke-" + (i + 1));
                System.out.println(dataSewa[i].displayInfo());
            }
            System.out.println("--------------------------------");
            
        } catch (InputMismatchException e) {
            System.out.println("Terjadi Kesalahan: Input tidak sesuai tipe data (misal diminta angka, tapi diinput huruf).");
            System.out.println("Silakan jalankan ulang program.");
        } finally {
            scanner.close();
        }
    }
}
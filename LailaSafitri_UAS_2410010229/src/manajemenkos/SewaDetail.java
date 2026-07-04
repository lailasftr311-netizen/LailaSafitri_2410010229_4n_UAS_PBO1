package manajemenkos;

// 8. Inheritance (WAJIB menggunakan 'extends Kamar' agar terhubung ke class induk)
public class SewaDetail extends Kamar {
    private String namaPenyewa;
    private int lamaSewa; // dalam bulan
    private boolean tambahAC; // fasilitas tambahan

    // Constructor Subclass
    public SewaDetail(String noKamar, String tipeKamar, double hargaBulanan, String namaPenyewa, int lamaSewa, boolean tambahAC) {
        super(noKamar, tipeKamar, hargaBulanan); // Memanggil constructor dari class Kamar
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
        this.tambahAC = tambahAC;
    }

    // Accessor & Mutator khusus subclass
    public String getNamaPenyewa() { return namaPenyewa; }
    public void setNamaPenyewa(String namaPenyewa) { this.namaPenyewa = namaPenyewa; }
    
    // 10. Seleksi (If-Else) & perhitungan total
    public double hitungTotalBayar() {
        double biayaFasilitas = 0;
        
        // Logika seleksi fasilitas
        if (tambahAC) {
            biayaFasilitas = 150000; // Tambahan biaya AC per bulan
        }
        
        double total = (getHargaBulanan() + biayaFasilitas) * lamaSewa;
        
        // Logika seleksi diskon (jika sewa lebih dari atau sama dengan 12 bulan)
        if (lamaSewa >= 12) {
            total = total - (total * 0.10); // Diskon 10%
        }
        
        return total;
    }

    // 9. Polymorphism (Overriding method dari Superclass)
    @Override
    public String displayInfo() {
        String infoFasilitas = tambahAC ? "Ya (+150k/bln)" : "Tidak";
        return super.displayInfo() + 
               "\nNama Penyewa: " + namaPenyewa + 
               "\nLama Sewa : " + lamaSewa + " bulan" +
               "\nTambah AC   : " + infoFasilitas +
               "\nTotal Bayar : Rp" + hitungTotalBayar();
    }
}
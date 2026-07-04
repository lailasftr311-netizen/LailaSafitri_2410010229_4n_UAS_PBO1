
package manajemenkos;

// 1. Class
public class Kamar {
    // 7. Encapsulation & 3. Atribut (menggunakan private)
    private String noKamar;
    private String tipeKamar;
    private double hargaBulanan;

    // 4. Constructor
    public Kamar(String noKamar, String tipeKamar, double hargaBulanan) {
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.hargaBulanan = hargaBulanan;
    }

    // 6. Accessor (Getter)
    public String getNoKamar() { return noKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public double getHargaBulanan() { return hargaBulanan; }

    // 5. Mutator (Setter)
    public void setNoKamar(String noKamar) { this.noKamar = noKamar; }
    public void setTipeKamar(String tipeKamar) { this.tipeKamar = tipeKamar; }
    public void setHargaBulanan(double hargaBulanan) { this.hargaBulanan = hargaBulanan; }

    // Method yang akan di-override
    public String displayInfo() {
        return "No Kamar: " + noKamar + " | Tipe: " + tipeKamar + " | Harga Dasar: Rp" + hargaBulanan;
    }
}

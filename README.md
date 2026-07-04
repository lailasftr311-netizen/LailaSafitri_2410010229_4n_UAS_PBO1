# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi pengolahan data transaksi penyewaan kamar kos/kontrakan di Banjarmasin menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa detail kamar kos, nama penyewa, lama sewa, serta pilihan fasilitas tambahan (AC). Output yang dihasilkan berupa rekapitulasi data penyewaan beserta kalkulasi otomatis total biaya sewa, termasuk pemberian diskon sebesar 10% jika masa sewa mencapai 12 bulan atau lebih.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class , Object , Atribut , Method Constructor , Method Mutator , Method Accessor , Encapsulation , Inheritance , Polymorphism , Seleksi , Perulangan , IO Sederhana , Array , dan Error Handling.
## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, Kamar, SewaDetail, dan SistemKosMain adalah contoh dari class.

```Java
public class Kamar {
    ...
}

public class SewaDetail extends Kamar {
    ...
}

public class SistemKosMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, dataSewa[i] = new SewaDetail(...) adalah contoh pembuatan object.

```Java
dataSewa[i] = new SewaDetail(no, tipe, harga, nama, lama, ac);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, noKamar, tipeKamar, hargaBulanan, namaPenyewa, lamaSewa, dan tambahAC adalah contoh atribut.

```Java
private String noKamar;
private String tipeKamar;
private double hargaBulanan;
private String namaPenyewa;
private int lamaSewa;
private boolean tambahAC;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Kamar dan SewaDetail.

```Java
public Kamar(String noKamar, String tipeKamar, double hargaBulanan) {
    this.noKamar = noKamar;
    this.tipeKamar = tipeKamar;
    this.hargaBulanan = hargaBulanan;
}

public SewaDetail(String noKamar, String tipeKamar, double hargaBulanan, String namaPenyewa, int lamaSewa, boolean tambahAC) {
    super(noKamar, tipeKamar, hargaBulanan);
    this.namaPenyewa = namaPenyewa;
    this.lamaSewa = lamaSewa;
    this.tambahAC = tambahAC;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNoKamar, setTipeKamar, dan setHargaBulanan adalah contoh method mutator.

```Java
public void setNoKamar(String noKamar) {
    this.noKamar = noKamar;
}

public void setNamaPenyewa(String namaPenyewa) {
    this.namaPenyewa = namaPenyewa;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNoKamar, getTipeKamar, getHargaBulanan, dan getNamaPenyewa adalah contoh method accessor.

```Java
public String getNoKamar() {
    return noKamar;
}

public double getHargaBulanan() {
    return hargaBulanan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut data kamar dienkapsulasi menggunakan keyword private.

```Java
private String noKamar;
private String tipeKamar;
private double hargaBulanan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, SewaDetail mewarisi properti dari Kamar dengan menggunakan sintaks extends.

```Java
public class SewaDetail extends Kamar {
    ...
}
```

9. **Polymorphism** adalah kemampuan suatu objek untuk memiliki banyak bentuk. Pada proyek ini diterapkan dalam bentuk Method Overriding, di mana method displayInfo() pada class SewaDetail memodifikasi secara total keluaran data dari class induk (Kamar).

```java
@Override
public String displayInfo() {
    String infoFasilitas = tambahAC ? "Ya (+150k/bln)" : "Tidak";
    return super.displayInfo() + 
           "\nNama Penyewa: " + namaPenyewa + 
           "\nLama Sewa : " + lamaSewa + " bulan" +
           "\nTambah AC   : " + infoFasilitas +
           "\nTotal Bayar : Rp" + hitungTotalBayar();
}
```

10. **Seleksi**adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if untuk memeriksa penambahan biaya operasional AC dan penentuan persentase potongan harga sewa (diskon).

```Java
if (tambahAC) {
    biayaFasilitas = 150000;
}

if (lamaSewa >= 12) {
    total = total - (total * 0.10);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk memproses penginputan data penyewa ke dalam array sekaligus menampilkannya kembali ke layar monitor.

```Java
for (int i = 0; i < jumlahData; i++) {
    ...
}

for (int i = 0; i < dataSewa.length; i++) {
    System.out.println(dataSewa[i].displayInfo());
}
```

12. **Input Output Sederhana**digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan objek dari class Scanner untuk menangkap input data kos dan fungsi System.out.println untuk mencetak hasilnya.

```Java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan jumlah data penyewa yang ingin diinput: ");

System.out.println("\n=== REKAP DATA PENYEWAAN KOS ===");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, digunakan Array of Objects untuk menampung sekumpulan data transaksi penyewa.

```Java
SewaDetail[] dataSewa = new SewaDetail[jumlahData];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan blok try-catch dengan tipe exception InputMismatchException untuk mencegah aplikasi terhenti mendadak apabila user memasukkan format inputan yang keliru (seperti memasukkan huruf pada input berupa nominal angka).

```Java
try {
    // proses input data menggunakan scanner
} catch (InputMismatchException e) {
    System.out.println("Terjadi Kesalahan: Input tidak sesuai tipe data.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Laila Safitri
NPM: 2410010229

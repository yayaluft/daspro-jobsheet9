**-- PERCOBAAN 1--**
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?  
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut 
    for (int i = 0; i < 4; i++) {
        System.out.println(bil[i]);
    }
    Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: <= 4, apa keluaran dari program? Mengapa demikian?

**Jawaban:**
1. Program tidak dapat dijalankan karena beberapa nilai yang diubah harusnya bertipe data double, namun dipaksa int karena deklarasi variabel bil adalah int.
2. Saya menambahkan sintaks dibawah
    int [] bil = {5, 13, -7, 17};
3. program mengeluarkan output yang sama persis seperti sebelumnya. Statement ini mencetak seluruh elemen array satu per satu dari indeks 0 hingga 3.
4. Setelah mengubah kondisi tersebut program hanya mencetak hingga indeks 3, dan pada indeks ke 4 tidak mengeluarkan output. Karena indeks hanya sampai 3, sedangkan kondisi tersebut memerlukan length=5.

**PERCOBAAN 2--**
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        nilaiAkhir[i] = sc.nextInt();
    }
    Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length?
3. Ubah  statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program 
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
    for (int i = 0; i < nilaiAKhir.length; i++) {
        if (nilaiAKhir[i] > 70) {
            System.out.println("Mahasiswa ke-")
        }
    }
    Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut: 

**Jawaban:**
1. Tidak terjadi perubahan, perulangan berjalan sebanyak jumlah array (indeks i bernilai 0 sampai 9).
2. Kondisi i < nilaiAkhir.length melakukan perulangan selama nilai i masih bernilai true dari jumlah elemen array tersebut, apabila i=10 maka kondisi akan bernilai false dan perulangan berhenti.
3. Setelah menambahkan statement tersebut, program mencetak output status mahasiswa lulus yang nilainya lebih dari 70. Program akan mencetak berikut:
"Mahasiswa ke-i lulus!"
4. Saya menambahkan struktur else dibawah struktur if mahasiswa lulus
    else {
        System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
    }

**--PERCOBAAN 3--**
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70). 
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini: 

**Jawaban:**
1. Saya menambahkan struktur if dengan kondisi dibawah ini:
    if (nilaiMhs[i] > 70) {
        lulus++;
    }
2. Saya telah commit modifikasi tersebut.
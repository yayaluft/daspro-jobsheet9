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
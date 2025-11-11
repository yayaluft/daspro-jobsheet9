import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya yang akan diinput: ");
        int jumlah = sc.nextInt();
        int[] arrNilai = new int[jumlah];

        int total = 0;
        int tertinggi = 0, terendah = 100;
        System.out.println();
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
            total += arrNilai[i];
            if (arrNilai[i] > tertinggi) {
                tertinggi = arrNilai[i];
            }
            if (arrNilai[i] < terendah) {
                terendah = arrNilai[i];
            }
        }

        System.out.println();
        System.out.println("--Nilai mahasiswa--");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrNilai[i]);
        }
        double rata2 = total / jumlah;
        System.out.println();
        System.out.println("Rata-rata nilai mahasiswa : " + (int) rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

    }
}
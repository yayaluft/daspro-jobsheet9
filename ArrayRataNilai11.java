import java.util.Scanner;
public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lulus=0, tidakLulus=0;
        double totalLulus=0, totalTidakLulus=0;

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }
        double rataLulus = totalLulus/lulus;
        double rataTdkLulus = totalTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata tidak lulus = "+rataTdkLulus);
    }
}

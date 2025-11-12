import java.util.Scanner;

public class MenuCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        System.out.println();
        System.out.println("--PESAN MENU--");
        sc.nextLine();

        int[] arrJumlah = new int[jumlah];
        String[] arrNama = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate" };
        int[] arrHarga = new int[jumlah];

        for (int i = 0; i < arrJumlah.length; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + " : ");
            arrNama[i] = sc.nextLine();

            System.out.print("Harga pesanan ke-" + (i + 1) + " : ");
            arrHarga[i] = sc.nextInt();
            System.out.println();
            sc.nextLine();
        }

        int total = 0;
        System.out.println("--DAFTAR PESANAN--");
        for (int i = 0; i < arrJumlah.length; i++) {
            System.out.println("Menu " + arrNama[i] + ": Rp." + arrHarga[i]);
            total += arrHarga[i];
        }
        System.out.println("Total biaya pesanan: Rp." + total);
    }
}

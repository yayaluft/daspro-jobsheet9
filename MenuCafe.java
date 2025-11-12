import java.util.Scanner;

public class MenuCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--DAFTAR MENU--");
        System.out.println(
                "1. Nasi Goreng \n2. Mie Goreng \n3. Roti Bakar \n4. Kentang Goreng \n5. Teh Tarik \n6. Cappucino \n7. Chocolate Ice");

        String[] menu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice" };
        int hasil = 0;
        System.out.println();
        System.out.print("Masukkan menu yang ingin dicari: ");
        String key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("Menu " + key + " tersedia!");
        } else {
            System.out.println("Menu " + key + " tidak tersedia!");
        }

    }
}

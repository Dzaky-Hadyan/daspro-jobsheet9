import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makanan = sc.nextLine();
        boolean ada = false;
        for (int i = 0; i < menu.length; i++) {
            if (makanan.equalsIgnoreCase(menu[i])) {
                ada = true;
            }
        }
        if (ada) {
            System.out.print(makanan + " tersedia");
        } else {
            System.out.print(makanan + " tidak tersedia");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int pesanan = sc.nextInt();
        String[] produk = new String[pesanan]; int[] harga = new int[pesanan];
        int total = 0;
        for (int i = 0; i < pesanan; i++) {
        String sampah = sc.nextLine();
        System.out.print("Masukkan nama makanan/minuman ke-" + (i+1) + ": ");
        produk[i] = sc.nextLine();
        System.out.print("Masukkan harga makanan/minuman ke-" + (i+1) + ": ");
        harga[i] = sc.nextInt();
        total += harga[i];
        }
        System.out.print("Daftar pesanan: ");
        for (int i = 0; i < pesanan; i++) {
            System.out.print(produk[i] + " ");
        }
        System.out.println();
        System.out.print("Total harga: " + total);
        sc.close();
    }
}
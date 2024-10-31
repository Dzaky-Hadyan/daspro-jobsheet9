import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int banyakNilai = sc.nextInt();
        int[] nilai = new int [banyakNilai];
        int total = 0, tertinggi = 0, terendah = 100;
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        double rerata = total/banyakNilai;
        System.out.println("Rata-rata nilai: " + rerata);
        for (int i = 0; i < banyakNilai; i++) {
            if (i > 0) {
                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                } else if (nilai[i] < terendah) {
                    terendah = nilai[i];
                }
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.print("Semua nilai: ");
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print(nilai[i] + " ");
        }
        sc.close();
    }
}

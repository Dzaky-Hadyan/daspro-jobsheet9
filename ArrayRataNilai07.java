import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        int totalLulus = 0, lulus = 0;
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            }
        }
        int totalGagal = 0, gagal = 0;
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] < 70) {
                totalGagal += nilaiMhs[i];
                gagal++;
            }
        }
        double rerataLulus, rerataGagal;
        if (lulus != 0) {
            rerataLulus = totalLulus/lulus;
            System.out.println("Rata-rata nilai lulus = " + (rerataLulus));
        } else {
            System.out.println("Tidak ada yang lulus");
        }
        if (gagal != 0) {
            rerataGagal = totalGagal/gagal;
            System.out.println("Rata-rata nilai tidak lulus = " + (rerataGagal));
        } else {
            System.out.println("Tidak ada yang tidak lulus");
        }
        sc.close();
    }
}

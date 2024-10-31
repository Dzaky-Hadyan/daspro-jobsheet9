import java.util.Scanner;
public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        System.out.println();
        for (int i = 0; i < banyakNilai; i++) {
            if (key == arrNilai[i]) {
                System.out.print("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-");
                for (int j = 0; j < banyakNilai; j++) {
                    if (key == arrNilai[j]) {
                        System.out.print((j+1) + ", ");
                    }
                }
                break;
            } else if (key != arrNilai[i]){
                System.out.print("Nilai yang dicari tidak ditemukan");
                break;
            }
        }
        System.out.println();
        sc.close();
    }
}
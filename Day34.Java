import java.util.Scanner;

public class RataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMataKuliah;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}

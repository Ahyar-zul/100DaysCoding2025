import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int nilaiPertama = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilaiKedua = scanner.nextInt();

        int hasilPenjumlahan = nilaiPertama + nilaiKedua;
        int hasilPengurangan = nilaiPertama - nilaiKedua;

        System.out.println("Hasil penjumlahan: " + nilaiPertama + " + " + nilaiKedua + " = " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan: " + nilaiPertama + " - " + nilaiKedua + " = " + hasilPengurangan);

        scanner.close();
    }
}

import java.util.Scanner;

public class PenentuKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        int nilai = scanner.nextInt();

        if (nilai >= 75) {
            System.out.println("Siswa lulus!");
        } else {
            System.out.println("Siswa tidak lulus!");
        }
    }
}

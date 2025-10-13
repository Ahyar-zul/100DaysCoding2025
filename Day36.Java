import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia kamu: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan penghasilan kamu: ");
        int penghasilan = scanner.nextInt();

        if (usia >= 18) {
            if (penghasilan >= 500000) {
                System.out.println("Kamu memenuhi syarat untuk kredit");
            } else {
                System.out.println("Kamu tidak memenuhi syarat untuk kredit");
            }
        } else {
            System.out.println("Kamu harus berusia minimal 18 tahun");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai boolean (true/false): ");
        boolean x = scanner.nextBoolean();

        System.out.println("Nilai asli: " + x);
        System.out.println("Nilai setelah di-NOT: " + !x);

        scanner.close();
    }
}

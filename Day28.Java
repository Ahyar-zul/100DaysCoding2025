import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();
        
        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();
        
        System.out.print("Masukkan nilai z: ");
        int z = input.nextInt();
        
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x != y);
        System.out.println(x != z);
    }
}

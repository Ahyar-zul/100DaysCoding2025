import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ngoding = new Scanner (System.in);
		System.out.print("Masukkan angka pertama: ");
		int angka1 = ngoding.nextInt();
		System.out.print("Masukkan angka kedua: ");
		int angka2 = ngoding.nextInt();
		
		int sisa = angka1 % angka2;
		System.out.println("Sisa dari: " + angka1 + " dibagi" + angka2 + " adalah" + sisa);
		
	}
}

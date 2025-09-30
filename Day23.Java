import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Masukkan panjang: ");
		double panjang = sc.nextDouble();
		
		System.out.print("Masukkan lebar: ");
		double lebar = sc.nextDouble();
		
		double luas = panjang * lebar;
		
		System.out.println("Luas persegi panjang adalah: " + luas);
		
		sc.close();
		
	}
}

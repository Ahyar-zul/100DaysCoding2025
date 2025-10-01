import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan jari-jari lingkaran: ");
		double jarijari = sc.nextDouble();
		System.out.println("Jarijari: " + jarijari);
		
		double luas = Math.PI * jarijari * jarijari;
		
		System.out.println("Luas: " + luas);
		
		sc.close();
	}
}

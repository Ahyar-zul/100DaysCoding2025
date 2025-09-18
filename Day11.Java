import java.util.Scanner;
public class Julzzz{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan nama anda: ");
		String nama = input.nextLine( );
		System.out.println("Masukkan usia anda: ");
		int usia = input.nextInt( );
		input.nextLine( );
		System.out.println("Masukkan tinggi badan anda: ");
		double tinggi = input.nextDouble( );
		
		System.out.println("\ninformasi anda: ");
		System.out.println("Nama: " + nama);
		System.out.println("Usia: " + usia + " tahun");
		System.out.println("Tinggi: " + tinggi + " meter");
		input.close( );
	}
}

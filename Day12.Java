mport java.util.Scanner;
public class Julzzz {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("\t>>Selamat datang di beranda informasi data siswa<<\n");
		System.out.println("Silahkan masukkan data diri anda: ");
		System.out.println("--------------------------------------");
		
		System.out.printf("Nama siswa\t\t: ");
		final String nama = input.nextLine( );
		System.out.printf("NIM\t\t: ");
		long nim = input.nextLong( );
		System.out.printf("Umur\t\t: ");
		double umur = input.nextDouble( );
		System.out.printf("Jenis kelamin\t: ");
		char gender = input.next( ) .charAt(0);
		input.nextLine( );
		System.out.printf("Alamat\t\t: ");
		String alamat = input.nextLine( );
		System.out.printf("Hobi\t\t: ");
		String hobi = input.nextLine( );
		
		System.out.println("\nBaik, Terima Kasih Atas Konstribusi Anda!! ");
		System.out.println("\t\t>>Data diri anda sudah diverifikasi<<");
		System.out.println("Silahkan lihat informasi anda: ");
		System.out.println("-----------------------------------");
		System.out.printf("Nama\t\t: %s%n", nama);
		System.out.printf("NIM\t\t: D%d%n", nim);
		System.out.printf("Umur\t\t: %. 1f%n", umur);
		System.out.printf("Jenis kelamin\t: %c%n", gender);
		System.out.printf("Alamat\t\t: %s%n", alamat);
		System.out.printf("Hobi\t\t: %s%n", hobi);
		input.close( );
		
		
		
	}
}

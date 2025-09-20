import java.util.Scanner;
public class Julzzz {
	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		System.out.print("Masukkan nama: ");
		String nama = ip.nextLine();
		System.out.print("Masukkan umur: ");
		int umur = ip.nextInt();
		System.out.print("Masukkan NIM: ");
		String nim = ip.next();
		System.out.print("Masukkan tinggi badan (cm):");
		double tinggi = ip.nextDouble();
		System.out.print("Masukkan status mahasiswa:");
		boolean status = ip.nextBoolean();
		System.out.print("Masukkan alamat: ");
		String alamat = ip.next();
		
		
		System.out.print("\n==========BIODATA==========\n");
		System.out.print("Nama\t\t:\t"+nama);
		System.out.print("Umur\t\t:\t"+umur);
		System.out.print("NIM\t\t:\t"+nim);
		System.out.print("Tinggi\t\t:\t"+tinggi+" cm");
		System.out.print("Status\t\t:\t"+status);
		System.out.print("Alamat\t\t:\t"+alamat);
		System.out.println("\n====================\n");
		ip.close();
	}
}

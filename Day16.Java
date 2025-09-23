import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ngoding = new Scanner (System.in);
		System.out.print("\nKALKULATOR SEDERHANA===\n");
		System.out.print("Masukkan jumlah barang: ");
		double jumlah = ngoding.nextDouble();
		System.out.print("Masukkan harga barang: ");
		double harga = ngoding.nextDouble();
		System.out.print("Masukkan jumlah orang yang membagi biaya: ");
		double jumlahOrang = ngoding.nextDouble();
		System.out.println("Total harga: " + jumlah * harga);
		System.out.println("Harga per orang: " + jumlah * harga / jumlahOrang);
		ngoding.close();
	}
}

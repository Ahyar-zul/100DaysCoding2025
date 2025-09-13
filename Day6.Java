public class Julzzz {
	public static void main(String[] args) {
		float hargaBarang = 27.5f;
		double diskon = 0.15;
		int jumlahBarang = 3;
		double hargaSetelahDiskon = hargaBarang * ( 1 - diskon );
		double totalHarga = hargaSetelahDiskon * jumlahBarang;
		System.out.println("harga barang: " + hargaBarang);
		System.out.println("Diskon: " + diskon);
		System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
		System.out.println("Total harga untuk: " + jumlahBarang + "barang: " + totalHarga);
	}
}

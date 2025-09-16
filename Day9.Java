public class Julzzz {
	public static void main(String[] args) {
		// Deklarasi dan inisialisasi variabel
		String namaUser  = "Zul";
		int umur = 18;
		float saldoAkun = 400.00f;
		Boolean statusAktif = true;
		// Menampilkan nilai awal
		System.out.println(" --- Data awal pengguna ---");
		System.out.println("Nama:" +  namaUser);
		System.out.println("Usia:" + umur);
		System.out.println("Saldo: Rp" + saldoAkun);
		System.out.println("Status aktif:" + statusAktif + "\n");
		// Update variabel
		namaUser = "Zul Ahyar";
		umur+= 1;
		saldoAkun-= 100.0;
		statusAktif = false;
		// Menampilkan nilai setelah update
		System.out.println("--- Data setelah update ---");
		System.out.println("Nama:" + namaUser);
		System.out.println("Usia:"+ umur);
		System.out.println("Saldo: Rp" + saldoAkun);
		System.out.println("Status aktif:" + statusAktif + "\n");
		
	}
}

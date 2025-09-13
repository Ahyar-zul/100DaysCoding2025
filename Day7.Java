public class Julzzz {
	public static void main(String[] args) {
		char jenisKelamin = 'p';
		int usia = 18;
		boolean bolehIkut = false;
		if (jenisKelamin == 'p' && usia >= 18) {
			bolehIkut = true;
		} else if (jenisKelamin == 'p' && usia >= 17) {
			bolehIkut = true;
		}
		System.out.println("jenis Kelamin: " + jenisKelamin);
		System.out.println("Usia: " + usia);
		System.out.println("Boleh ikut kegiatan: " + bolehIkut);
	}
}

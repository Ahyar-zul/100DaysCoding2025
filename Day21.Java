public class Main {
	public static void main(String[] args) {
		// Deklarasi variabel
		int a = 16;
		int b = 29;
		
		// Menampilkan nilai sebelum ditukar
		System.out.println("Menampilkan nilai sebelum ditukar: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Menukar nilai variabel
		int temp = a;
		a = b;
		b = temp;
		
		
   	 // Menampilkan nilai setelah ditukar
	    System.out.println("Menampilkan nilai setelah ditukar: ");
	    System.out.println("a = " + a);
	    System.out.println("b = " +b);
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ngoding = new Scanner (System.in);
		System.out.print("Masukkan nilai short: ");
		short nilaiShort = ngoding.nextShort();
		
		int nilaiInt = nilaiShort;
		long nilaiLong = nilaiInt;
		float nilaiFloat = nilaiLong;
		double nilaiDouble = nilaiFloat;
		
		System.out.println("Nilai awal: " + nilaiShort);
		System.out.println("Nilai setelah konversi ke int: " + nilaiInt);
		System.out.println("Nilai setelah konversi ke long: " + nilaiLong);
		System.out.println("Nilai setelah konversi ke float: " + nilaiFloat);
		System.out.println("Nilai setelah konversi ke double: " + nilaiDouble);
		
		ngoding.close();
		
	}
}

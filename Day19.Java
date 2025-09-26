import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ngoding = new Scanner (System.in);
		System.out.print("Masukkan nilai double: ");
		double nilaiDouble = ngoding.nextDouble();
		float nilaiFloat = (float) nilaiDouble;
		System.out.println("Nilai double: " + nilaiDouble);
		System.out.println("Nilai setelah konversi ke float: " + nilaiFloat);
		long nilaiLong = (long) nilaiFloat;
		System.out.println("Nilai setelah konversi ke long: " + nilaiLong);
		int nilaiInt = (int) nilaiLong;
		System.out.println("Nilai setelah konverai ke int: " + nilaiInt);
		short nilaiShort = (short) nilaiInt;
		System.out.println("Nilai setelah konversi ke short: " + nilaiShort);
		ngoding.close();
		
	}
}

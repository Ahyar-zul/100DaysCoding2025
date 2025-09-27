public class Main {
    public static void main(String[] args) {
        int kecepatan = 120;
        double jarak = 250.8;
        boolean isAktif = false;
        char grade = 'A';
        long jumlah = 1000000L;
        float harga = 99.99f;
        
        String strKecepatan = String.valueOf(kecepatan);
        String strJarak = String.valueOf(jarak);
        String strIsAktif = String.valueOf(isAktif);
        String strGrade = String.valueOf(grade);
        String strJumlah = String.valueOf(jumlah);
        String strHarga = String.valueOf(harga);
        
        System.out.println("String dari kecepatan : " + strKecepatan);
        System.out.println("String dari jarak : " + strJarak);
        System.out.println("String dari status aktif : " + strIsAktif);
        System.out.println("String dari grade : " + strGrade);
        System.out.println("String dari jumlah : " + strJumlah);
        System.out.println("String dari harga : " + strHarga);
    }
}

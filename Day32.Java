public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("x > 3 || y < 5: " + (x > 3 || y < 5)); 
        System.out.println("x > 10 || y > 5: " + (x > 10 || y > 5));
        System.out.println("x > 10 || y < 5: " + (x > 10 || y < 5));
    }
}

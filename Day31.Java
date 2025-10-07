public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("x > 3 && y > 5: " + (x > 3 && y > 5)); 
        System.out.println("x > 3 && y < 5: " + (x >  && y < 5)); 
        System.out.println("x == z && y > 5: " + (x == z && y > 5)); 
        System.out.println("x > y && z == 5: " + (x > y && z == 5));
    }
}

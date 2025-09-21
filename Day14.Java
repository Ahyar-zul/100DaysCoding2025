public class Julzzz {
    public static void main(String[] args) {
        String string = "123";
        int A = Integer.parseInt(string);
        System.out.println("int: " + A);

        string = "123.45";
        double B = Double.parseDouble(string);
        System.out.println("double: " + B);

        string = "true";
        boolean C = Boolean.parseBoolean(string);
        System.out.println("boolean: " + C);

        string = "10";
        byte D = Byte.parseByte(string);
        System.out.println("byte: " + D);

        string = "1000";
        short E = Short.parseShort(string);
        System.out.println("short: " + E);

        string = "1234567890";
        long F = Long.parseLong(string);
        System.out.println("long: " + F);

        string = "123.45";
        float Z = Float.parseFloat(string);
        System.out.println("float: " + Z);

        String stringChar = "A";
        char G = stringChar.charAt(0);
        System.out.println("char: " + G);
    }
}

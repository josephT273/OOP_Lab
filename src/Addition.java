// Single line comment
/*
 * multi line comment
 * ans here it goes
*/

/**
 * Documentation comment
 * like this
 * @params int a
 * @author Joseph Tadesse
 * @version 1.0
 */


public class Addition {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Sum " + x + y);
        System.out.println("Sub " + (x - y));
        System.out.println("Multi " + x * y);
        System.out.println("Div " + x / y);

        byte c = 64, d;
        int i = c << 2; // Multiply the value 2 times the shift value
        int j = c >> 2; // Divided the value by two and discard the reminder
        d = (byte) (c << 2);
        System.out.println(i);
        System.out.println(d);
        System.out.println(j);

        int k = -1;
        System.out.println((k >> 24));
        System.out.println((k >>> 24));

        int w = (10 + 21) > 30 ? (21 + 31) : (20 + 2);
        System.out.println(w);

        if (10 + 21 > 30) {
            System.out.println("Greaterthan 30");
        }else{
            System.out.println("Lessthan 30");
        }

        String arg[] = {"Hello", "world"};
        for (String string : arg) {
            System.out.println(string);
        }
    }

    
}
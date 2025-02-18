package App;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        System.out.printf("%s%n%d%n", name, age);
        
        s.close();
    }
}

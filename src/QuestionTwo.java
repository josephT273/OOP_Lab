/*
 * Write a Java program that reads a user’s name from the console and then greets them.
 * Expected Task: Use the Scanner class to obtain input and then print a greeting.
*/
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        input.close();
    }
}

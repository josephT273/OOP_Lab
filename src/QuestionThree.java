/*
 * Write a Java program that demonstrates the use of the ternary operator to assign a value based on a condition.
 * Expected Task: Use the ? : operator to choose between two values.
 */
public class QuestionThree {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int max = (y > x) ? y : x;
        System.out.println("The maximum value is: " + max);
    }
}

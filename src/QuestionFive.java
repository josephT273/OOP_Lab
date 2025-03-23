/*
 * Write a Java program that demonstrates type casting by converting an int to a byte explicitly.
 * Expected Task: Show narrowing conversion with an explicit cast.
 */
public class QuestionFive {
    public static void main(String[] args) {
        int number = 50;
        byte castedNumber = (byte) number;
        System.out.println("Orginal int: " + number);
        System.out.println("After casting to byte: " + castedNumber);
    }
}

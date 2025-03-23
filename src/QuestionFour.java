/*
 * Write a Java program that creates and initializes an array of integers and then prints each element using a for-each loop.
 * Expected Task: Declare an array, initialize it, and iterate using the enhanced for loop.
 */
public class QuestionFour {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 1, 6};
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}

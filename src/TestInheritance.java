/*
 * Write a Java program to demonstrate inheritance. Create a base class Animal with a method makeSound() and a subclass Dog that overrides this method.
 * Expected Task: Use extends and override the method.
*/
public class TestInheritance {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

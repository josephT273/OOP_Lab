/*
 * Write a Java program to demonstrate inheritance. Create a base class Animal with a method makeSound() and a subclass Dog that overrides this method.
 * Expected Task: Use extends and override the method.
*/
public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}

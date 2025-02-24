public class App {
    public static void main(String[] args) {
        sayHello();
        sayHello("John");
    }

    public static void sayHello() {
        System.out.println("Hello, world");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

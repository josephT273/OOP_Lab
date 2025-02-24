public class App {
    public static void main(String[] args) {
        Box redBox = new Box();
        redBox.set_width(12);
        redBox.set_length(12);
        redBox.set_height(12);

        print("Area: " + redBox.calculate_area());
        print("Volumt: " + redBox.calculate_volume());
        
    }

    public static void print(String value) {
        System.out.println(value);
    }
}

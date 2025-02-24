public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.set_name("John Doe");
        student.set_age(20);
        student.set_sex("Male");
        student.set_department("Software Engineering");
        student.set_gpa(3.5f);
        student.printInfo();

        Student hose = new Student();
        hose.set_name("Hose Adem");
        hose.set_age(21);
        hose.set_sex("Male");
        hose.set_department("Software Engineering");
        hose.set_gpa(3.9f);

        hose.printInfo();
    }

    public static void print(String value) {
        System.out.println(value);
    }
}

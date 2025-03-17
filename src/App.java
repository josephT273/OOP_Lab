public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.set_name("John Doe");
        student.set_age(20);
        student.set_sex("Male");
        student.set_department("Software Engineering");
        student.set_gpa(3.5f);
        student.set_courseCode("12qq2");
        student.set_courseName("Fundamental of Software engineering");
        student.set_courseType("online");
        student.set_creditHour(5);
        student.displayStudentInfo();

        Student hose = new Student();
        hose.set_name("Hose Adem");
        hose.set_age(21);
        hose.set_sex("Male");
        hose.set_department("Software Engineering");
        hose.set_gpa(3.9f);
        hose.set_courseCode("12qq2");
        hose.set_courseName("Fundamental of Software engineering");
        hose.set_courseType("online");
        hose.set_creditHour(5);
        hose.displayStudentInfo();
    }
}

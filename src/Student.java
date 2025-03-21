public class Student extends Course {
    private String _name;
    private int _age;
    private String _sex;
    private String _department;
    private float _gpa;
    private String _studentId;
    private String _studentType;

    public Student(){}

    public void set_name(String name){
        this._name = name;
    }

    public String get_name(){
        return this._name;
    }

    public void set_age(int age){
        this._age = age;
    }

    public int get_age(){
        return this._age;
    }

    public void set_sex(String sex){
        this._sex = sex;
    }

    public String get_sex(){
        return this._sex;
    }

    public void set_department(String department){
        this._department = department;
    }

    public String get_department(){
        return this._department;
    }

    public void set_gpa(float gpa){
        this._gpa = gpa;
    }

    public float get_gpa(){
        return this._gpa;
    }

    public String get_studentId() {
        return _studentId;
    }

    public String get_studentType() {
        return _studentType;
    }

    public void set_studentId(String _studentId) {
        this._studentId = _studentId;
    }

    public void set_studentType(String _studentType) {
        this._studentType = _studentType;
    }

    public void displayStudentInfo(){
        System.out.println("Student Information");
        System.out.println("Name: " + this.get_name());
        System.out.println("Age: " + this.get_age());
        System.out.println("Sex: " + this.get_sex());
        System.out.println("Departiment: " + this.get_department());
        System.out.println("GPA: " + this.get_gpa());
        System.out.println("Course Information");
        System.out.println("Course Name: " + this.get_courseName());
        System.out.println("Course Code: " + this.get_courseCode());
        System.out.println("Credit Hour: " + this.get_creditHour());
        System.out.println("Course Type: " + this.get_courseType());
    }
}

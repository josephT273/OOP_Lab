public class Course {
    private String _courseName;
    private String _courseCode;
    private String _courseType;
    private int _creditHour;

    public Course(){}

    public Course(String courseName, String courseCode, int creditHour, String courseType){
        set_courseCode(courseCode);
        set_courseName(courseName);
        set_creditHour(creditHour);
        set_courseType(courseType);
    }

    public void set_courseType(String _courseType) {
        this._courseType = _courseType;
    }

    public String get_courseType() {
        return _courseType;
    }

    public void set_courseCode(String _courseCode) {
        this._courseCode = _courseCode;
    }
    
    public void set_courseName(String _courseName) {
        this._courseName = _courseName;
    }
    public void set_creditHour(int _creditHour) {
        this._creditHour = _creditHour;
    }

    public String get_courseCode() {
        return _courseCode;
    }

    public String get_courseName() {
        return _courseName;
    }

    public int get_creditHour() {
        return _creditHour;
    }
    
    
}

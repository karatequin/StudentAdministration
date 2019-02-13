import java.util.ArrayList;

public class Student {

    String name, course;
    int StudentId, age;

    ArrayList<Student> students = new ArrayList<>();

    public Student(String name, String course, int studentId, int age) {
        this.name = name;
        this.course = course;
        StudentId = studentId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", StudentId=" + StudentId +
                ", age=" + age +
                '}';
    }
}
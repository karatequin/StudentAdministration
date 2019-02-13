import java.util.ArrayList;

public class Teacher {

    String name, course;
    int age, teacherId;

    ArrayList<Teacher> teachers = new ArrayList<>();

    public Teacher(String name, String course, int age, int teacherId) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.teacherId = teacherId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                ", teacherId=" + teacherId +
                '}';
    }
}

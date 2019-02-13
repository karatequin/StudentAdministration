import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Anders", "Dat10v5", 0,29);
        Student s2 = new Student("Bjørn", "Dat11v1", 1,23);
        Student s3 = new Student("Christian", "Dat12v3", 2,21);
        Student s4 = new Student("Daniel", "Dat13", 3,24);
        Student s5 = new Student("Emil", "Dat14", 4,34);

            ArrayList<Student> students = new ArrayList<>();
            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);
            students.add(s5);

                for(int i = 0; i< students.size();i++){
                    System.out.println(students.get(i).name + "     ");

                    System.out.println(students.get(i).course + "    ");

                    System.out.println(students.get(i).StudentId + "    ");

                    System.out.println(students.get(i).age + "    ");

                    System.out.println("------------------<");
                }


        }
    }


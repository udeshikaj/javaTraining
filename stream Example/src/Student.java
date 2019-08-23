import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student(String name , int id){
        this.name= name;
        this.id= id;

    }
    public static List<Student> getStudent(){
        List <Student> students = new ArrayList<>();
        students.add(new Student("krish", 1));
        students.add(new Student("hasini", 2));
        students.add(new Student("Bhagya", 12));
        students.add(new Student("Suranga", 2));
        students.add(new Student("Nuwan", 21));
        students.add(new Student("Praveen", 22));
        students.add(new Student("Shehanza", 31));
        return students;
    }
}

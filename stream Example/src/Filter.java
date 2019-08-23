import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        printStudentsWithShortnames();
        count();
        findMin();
        findMax();


    }
    public  class filterWithStream{

        List <Student> students= Student.getStudent().stream().filter(s ->s.getName().length()<=6)
                .collect(Collectors.toList());
    }

    static void count(){

        long count = Student.getStudent().stream().filter(s -> s.getName().length()<=6)
        .collect(Collectors.counting());
        System.out.println("Number of students with short names = " +count);


    }

   static void findMax(){

       int maxID = Student.getStudent().stream().max(Comparator.comparing(s -> s.getId())).get().getId();
        System.out.println("maximum ID Is " +maxID);

    }

    static void findMin(){

        int minID= Student.getStudent().stream().min(Comparator.comparing(s -> s.getId())).get().getId();
        System.out.println("Minimum ID is " +minID);

    }


        static void printStudentsWithShortnames(){
            List<Student> students= Student.getStudent();
            for(Student student:students){
                if(student.getName().length()<=6){
                    System.out.println(student.getName());
                }
            }
        }

    }


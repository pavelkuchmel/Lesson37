import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {

        /*List<Log> logList = List.of(new Log("Сосна сосновая", 10), new Log("Сосна деревянная", 32), new Log("Сосна минская", 10), new Log("Ольха", 5), new Log("Береза", 12), new Log("Каштан", 9));

        Stream<Log> logStream = logList.stream();

        Stream<Log> filtered = logStream.filter( x -> x.getType().contains("Сосна")).filter( x -> x.getCount() > 10);

        filtered.forEach(x -> System.out.println(x.toString()));*/

        List<Student> studentList = new ArrayList<>();

        Random rdm = new Random();

        for (int i = 0; i < 10; i++){
            Student student = new Student();
            if (rdm.nextBoolean()){
                student.setGender("Male");
            }
            else {
                student.setGender("Female");
            }
            student.setAge(rdm.nextInt(51) + 15);
            student.setPoint(rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1, rdm.nextInt(10) + 1);
            student.setAvg();
            studentList.add(student);
        }

        //studentList.stream().filter( x -> x.getAvg() > 7 ).forEach(System.out::println); //(x -> System.out.println(x.toString)

        System.out.println(studentList.stream().map(x -> x.getAvg()).reduce(0.0, (x, y) -> x + y) / 10);
        
    }
}

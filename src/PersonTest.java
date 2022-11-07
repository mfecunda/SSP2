import java.util.ArrayList;

public class PersonTest {
    public static ArrayList<Person> AllStudents = new ArrayList<>();

    public static void main(String[] args) {
        Person n0 = new Person();
        n0.setAge(20);
        n0.setName("Mark");
        n0.setGender("Male");

        Person n1 = new Person("Mike", 22, "Male");

        for (Person student : AllStudents) {
            if (student.getName() != null && student.getAge() != 0 && student.getGender() != null) {
                AllStudents.add(student);
            }


        }
    }
}

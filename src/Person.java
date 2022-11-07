import java.util.ArrayList;
public class Person {

    private String name;
    private int age;
    private String gender;
    public String subject;
    public ArrayList<String > StudentClasses = new ArrayList<String>();
    public ArrayList<String > AllClasses = new ArrayList<String>();



    public Person(){

    }
    public Person (String name,int age,String gender){
        this.name= name;
        this.age = age;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;


    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void enrollToClass (){
        for (int i = 0; i < AllClasses.size(); i++) {
            if(AllClasses.get(i) == subject){
                StudentClasses.add(subject);
            }
        }

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public  void getAllStudents(){
        System.out.println("List of all Students");
        for (int i = 0; i < PersonTest.AllStudents.size() ; i++) {
            System.out.println("Name: "+ this.getName() + " Age: "+ this.getAge()+ " Gender : " + this.getGender());
        }

    }
    public void printStudents(){
        getAllStudents();
    }


}

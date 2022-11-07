import java.util.ArrayList;
import java.util.Scanner;

public class Lab1Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("Please enter first string :");
        String str1 = scanner.nextLine();
        strings.add(str1);
        System.out.println("Please enter second string :");
        String str2 = scanner.nextLine();
        strings.add(str2);
        System.out.println("Please enter third string :");
        String str3 = scanner.nextLine();
        strings.add(str3);


        System.out.println(" Entered strings are: " + strings);


        for (int i = 1; i < strings.size(); i++) {
            compareStrings(strings.get(0),strings.get(i));
            System.out.println("Comparing : "+ strings.get(0) + " to : " +
                    strings.get(i)+ " , " +
                    compareStrings(strings.get(0),strings.get(i)));
        }
        


    }
    public static int compareStrings(String a , String b ){
       return a.compareTo(b);
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first  number ");
        int a = scanner.nextInt();

        System.out.println("PLease enter second number");
        int b = scanner.nextInt();

        System.out.println("Smaller number is "+ Math.min(a,b));

    }
}

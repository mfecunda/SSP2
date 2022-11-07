public class Expressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b) / c);
// 3 and 4 are added with sum 7
// 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
// 4 is divided by 5 with quotient 0
// 3 is added to 0 with sum 3
        System.out.println(a + 1);
        // a is 3 so just simple add +1 thos 3+1 = 4
        System.out.println(d % c);
        // remainder from 17 by 5 is  2 as 17/5 =3 , 3*5 =15 , 17-15  = 2
        System.out.println(d / c);
        System.out.println(d % b);
        System.out.println(d / b);
        System.out.println(d + a / d + b);
        System.out.println((d + a) / (d + b));
        System.out.println(Math.sqrt(b));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(-a));
        System.out.println(Math.max(a, b));
    }
}
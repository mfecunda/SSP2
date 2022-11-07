import java.sql.SQLOutput;

/**
 * The type Lab 2 q 4.
 */
public class Lab2Q4 {

    /**
     * It checks if the credit card number is valid.
     */
    public static void main(String[] args) {
        int num = 2315778;

        System.out.println(num);

        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1111111;

        System.out.println("CC number: " + num + " is " + checkDigits(num));

    }


    /**
     * The above function checks if a number is valid or not.
     *
     * @param number the number to be checked
     * @return The method is returning a string that says if the number is valid or not.
     */
    public static String checkDigits(int number) {
        int counter = 1;
        boolean isEven;
        int total =0;
        int decoded  = 0 ;
        while (number > 0) {

            int lastDigit = number % 10;
            number = number / 10;
            if (counter % 2 == 0) {
                isEven = true;
                decoded = decode(lastDigit,isEven);
                counter++;

            }
            else{
                isEven = false;
                decoded = decode(lastDigit,isEven);
                counter++;


            }
            total+=decoded;

        }
        if (total %10 ==0){
            return "This number may be valid "+ (total);
        }
        else{
            return "This number is invalid"+ (total);
        }

    }


    /** 
     * It takes a digit and a boolean value as input. If the boolean value is true, it doubles the digit and adds the
     * digits of the result. If the boolean value is false, it returns the digit.
     *
     * @param digit the digit to be decoded
     * @param position true if the digit is in an odd position, false if it's in an even position.
     * @return The sum of the digits of the number.
     */
    public static int decode(int digit,boolean position){
            int digitSum =0;
            if(position == false){
                return digit;
            }
            else{
                digit = digit*2;
                if(digit / 10 > 0 ){

                    while(digit/10 > 0 || digit > 0 ) {
                        int lastDigit = digit % 10;
                        digit = digit / 10;
                        digitSum += lastDigit;
                    }
                }
                else{
                    digitSum = digit;
                }

            }
            return digitSum;
        }
    }


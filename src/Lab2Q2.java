public class Lab2Q2 {
    public static void main(String[] args) {
        float length = (float) 3.4;
        float width = (float) 8.4;


        System.out.println("The length and width of Rectangle are: "+ length+
                        " , "+ width + " and the Area is : " + areaOfRectangle(length,width)+ " ^2");
    }

    /**
     *
     * @param length
     * @param width
     * @return multiply of length by width
     */

    public static double areaOfRectangle(float length,float  width){

        double area = length * width;
        return area;
    }
}

package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //write an application that will read diameter of a circle (variable of type float) and calculate perimeter
        //of given circle.
        //firstly assume pi =3.14.Later, use value of pi from built-in Math class.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter=scanner.nextFloat();
        float pi=(float)Math.PI;//float pi=3.14f;
        System.out.println("The perimeter has the following size: "+diameter*pi);
    }
}
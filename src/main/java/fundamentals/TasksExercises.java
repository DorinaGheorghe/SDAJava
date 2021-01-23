package fundamentals;

import java.util.Scanner;

public class TasksExercises {
    static float pi = (float) Math.PI;//float pi=3.14f;
    int x=10;
    static int y=1;
    //task 1 din pfd Java Fundamentals Coding
    // Write an application that will read diameter of a circle (variable of type float) and calculate perimeter
    //of given circle.
    //firstly assume pi =3.14.Later, use value of pi from built-in Math class.
    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the following size: " + diameter * pi);
    }
}

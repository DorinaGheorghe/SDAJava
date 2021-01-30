package fundamentals;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TasksExercises {
    static float pi = (float) Math.PI;//float pi=3.14f;
    int x = 10;
    static int y = 1;

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

    //task 2.
    //write an application calculating BMI (Body Mass Index) and checking if it's optimal or not. Your application
    //should read two variables: weight (in kilograms, type float) and height (in centimeters, type int).
    //BMI should be calculated given following formula: BMI = weight[kg]/height[m] la patrat
    //The optimal range is from 18.5 to 24.9, smaller or bigger values are non-optimal values. Your program should
    //write "BMI optimal" or "BMI not optimal", according to the assumptions above.
    public static void calculateBMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your weight (in kilos): ");
        float weight = scanner.nextFloat();
        System.out.println("Insert your height (in cm): ");
        int height = scanner.nextInt();
        float bmi = weight / ((float) height / 100 * (float) height / 100);
        System.out.println("BMI is " + bmi);
        if ((bmi >= 18.5f) && (bmi <= 24.9)) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }

    //Task 3
    //Write an application that takes a positive number from the user (type int) and writes all numbers from 1 to the given number, each
    // on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void fizzBuzz (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number=scanner.nextInt();
        for (int i=1; i<=number;i++){
            if((i%3==0) && (i%7==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%7==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    //Task.4
    // Write an application that takes a positive number from the user (type int) and prints all prime numbers greater
    // than 1 and less than the given number.

    public static void(){

    }

    //Task.5
    // Write an application that will take a positive number from the user (type int) and calculate the Fibonacci number
    // at the indicated index. For example, if the number equals 5, your program should print the fifth Fibonacci number.
    // In Fibonacci sequence, each number is the sum of the two preceding ones.

    //Task.6
    // Write an application that gets one positive number (type int) from the user and calculates a sum of digits of the
    // given number. Hint: to make some operations on every single digit of the number (digit by digit), you can calculate
    // the remainder of dividing the number by 10 (to get the value of the last digit) and divide the number by 10 (to
    // "move" to the next digit).

    //Task.7
    // Write an application that will read texts (variables of the String type) until the user gives the text "Enough!"
    // and then writes the longest of the given texts (not including the text "Enough!"). If the user does not provide
    // any text, write "No text provided".

    //Task.8
    // Write an application that reads a text from the user (type String) and counts a percentage of occurrences of a
    // space character.

    //Task.9
    // Write an application that "stutters", that is, reads the user's text (type String), and prints the given text,
    // in which each word is printed twice. For example, for the input: "This is my test" the application should print
    // "This This is is my my test test".

}

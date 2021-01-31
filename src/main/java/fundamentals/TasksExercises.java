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

    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("FizzBuzz" + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz" + i);
            } else if (i % 7 == 0) {
                System.out.println("Buzz" + i);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz1() { //varianta imbunatatita
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("FizzBuzz" + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz" + i);
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Buzz" + i);
                continue;
            }
            System.out.println(i);
        }
    }


    //Task.4
    // 2.Write an application that takes a positive number from the user (type int) and prints all prime numbers greater
    // than 1 and less than the given number.

    public static void printAllPrimenumbers() {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println("The number is not greater than 1");
            return;
        }
        for (int i = 2; i < newNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    private static boolean isPrime(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break;
            }
        }
        return isPrimeNo;
    }

    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i != 0) {
                continue;
            }
            isPrimeNo = false;
            break;
        }
        return isPrimeNo;
    }

    private static boolean isPrime3(int nr) {
        if (nr == 2) {//daca este 2, atunci e prim
            return true;
        }
        if (nr == 0 || nr == 1 || nr % 2 == 0) {//daca nr este 0 sau 1 sau se imparte la 2, atunci nu este nr prim
            return false;
        }
        for (int i = 3; i * i <= nr; i += 2) { //pornim de la 3 pt ca 2 l-am verificat mai sus deja; incrementare din 2 in 2;
            //in for mergem doar pana la radical din nr (pt ca dupa acela nu mai gasim alti divizori)
            // pt ca deja am tratat cazurile exceptate pana la 2; programul devine de 2 ori mai rapid
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }


    //Task.5
    // 3.Write an application that will take a positive number from the user (type int) and calculate the Fibonacci number
    // at the indicated index. For example, if the number equals 5, your program should print the fifth Fibonacci number.
    // In Fibonacci sequence, each number is the sum of the two preceding ones.

    public static void fibonacciNumber(int no) {
        Scanner scanner = new Scanner(System.in);


    }

    //Task.6
    // 4.Write an application that gets one positive number (type int) from the user and calculates a sum of digits of the
    // given number. Hint: to make some operations on every single digit of the number (digit by digit), you can calculate
    // the remainder of dividing the number by 10 (to get the value of the last digit) and divide the number by 10 (to
    // "move" to the next digit).

    //Task.7
    // 5.Write an application that will read texts (variables of the String type) until the user gives the text "Enough!"
    // and then writes the longest of the given texts (not including the text "Enough!"). If the user does not provide
    // any text, write "No text provided".

    public static void longestWord() {
        System.out.println("Type a word: ");
        String word = "";
        String longestWord1 = "";
        Scanner scanner = new Scanner(System.in);
        do {
            word = scanner.next();
            if (!word.equals("Enough") && longestWord1.length() < word.length()) {
                longestWord1 = word;
            }
        } while (!word.equals("Enough"));
        if (longestWord1.length() == 0) {
            System.out.println("No text provided.");
            return;
        }
        System.out.println("The longest word provided is: " + longestWord1);
    }

    public static void longestWord2() {
        System.out.println("Type a word: ");
        String word = "";
        String longestWord1 = "";
        Scanner scanner = new Scanner(System.in);
        while (!word.equals("Enough")) {
            if (longestWord1.length() < word.length()) {
                longestWord1 = word;
            }
            word = scanner.next();//prin faptul ca am pus citirea dupa if, ne asiguram ca nu luam in calcul si Enough
        }
        if (longestWord1.length() == 0) {
            System.out.println("No text provided.");
            return;
        }
        System.out.println("The longest word provided is: " + longestWord1);

    }

    //Task.8
    // 6.Write an application that reads a text from the user (type String) and counts a percentage of occurrences of a
    // space character.


    //Task.9
    // 7.Write an application that "stutters", that is, reads the user's text (type String), and prints the given text,
    // in which each word is printed twice. For example, for the input: "This is my test" the application should print
    // "This This is is my my test test".

    public static void stutters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println("Stutters: ");

        for (int i = 0; i < words.length - 1; i++) {
            System.out.println(words[i] + " " + words[i] + " ");
        }
        System.out.println(words[words.length - 1] + " " + words[words.length - 1] + " ");
    }

    public static void testStrings() {
        String s1 = "abc", s2 = "abc", s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

    }

    //test objects from Dog class

    public static void testObjects() {
        Dog dog1 = new Dog("Azorel");
//        dog1.setName("Azorel");
        Dog dog2 = new Dog("Azorel");
//        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getName().equals(dog2.getName()));

    }


}

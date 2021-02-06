package fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

//Strings: For these exercises implement them as methods in a class: StringExercises and test them in Main


public class StringsExercises {
    /**
     * Write a Java program to get the character at the given index within the String
     */
    public static void getCharacterAtGivenIndex() {
        String string = "wonderfull kids";
        System.out.println("The string is: " + string);
        int index = string.charAt(6); // index given 0; charAt returns the char value at the specified index
        System.out.println("The character of the 6 index is: " + (char) index); //daca pun (char) imi arata litera de la
        //indexul dat, fara char imi returneaza valoarea literei din tabelul ASCII, respectiv 102 pt lit.f-index6

    }

    /**
     * Write a Java program to test if a given string contains the specified sequence of char values (another string).
     */
    public static void testSpecifiedSequence() {
        String string1 = "Java not fundamentals";
        String string2 = "yes";
        System.out.println("First string: " + string1);
        System.out.println("Does the first string contains the word: " + "'" + string2 + "'");
        System.out.println(string1.contains(string2));// .contains() Returns true if and only if this string
        // contains the specified sequence of char values.
    }

    /**
     * Write a Java program to replace a specified character with another character in a string.
     */
    public static void replaceSpecifiedCharacter() {
        String string = "Peace is a state of mind";
        System.out.println("Old string:" + string);

        //replace 'a' character with 'g' character
        String new_string = string.replace('a', 'g');// .replace -->Returns a string resulting from
        // replacing all occurrences of oldChar in this string with newChar.
        System.out.println("New string: " + new_string);
    }

    /**
     * Write a Java program to uppercase first letter of every word in a text(string).
     */
    public static void uppercaseFirstLetter() {

    }

    /**
     * Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)
     */
    public static void compareStrings() {

        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Compare the two strings. .compareToIgnoreCase->Compares two strings lexicographically, ignoring case
        // differences.
        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparison.
        if (result < 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        } else // if (result > 0)

        {
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }
}

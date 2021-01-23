package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //sunt 2 metode de apelare a metodei tasksExercises.circlePerimeter
        //prima metoda
//        TasksExercises tasksExercises = new TasksExercises(); //instantiere
//        tasksExercises.circlePerimeter();//apelare metoda

        //a doua metoda
        TasksExercises.circlePerimeter();

        //static vs non-static
        TasksExercises tasksExercises1=new TasksExercises();
        TasksExercises tasksExercises2=new TasksExercises();
        System.out.println("x= "+tasksExercises1);
        System.out.println("y= "+tasksExercises1.y);
        System.out.println("y= "+tasksExercises2.y);
        tasksExercises1.x=22;
        TasksExercises.y=3;
        System.out.println("x1= "+tasksExercises1.x);
        System.out.println("x2= "+tasksExercises2.x);
        System.out.println("y1= "+tasksExercises1.y);
        System.out.println("y2= "+tasksExercises2.y);

        //Task1
        TasksExercises.circlePerimeter();
    }
}

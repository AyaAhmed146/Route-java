package javaThree;
import java.util.Scanner;
public class JavaThree {
    public static void main(String[] args) {

        //Exam#1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: "+ System.lineSeparator() );
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String result1 = (num1 > num2) ? "First number is greater than second number" : "Second number is greater than first number";
        System.out.println(result1);

        //Exam#2
        System.out.print("Enter third number: "+ System.lineSeparator() );
        int num3 = input.nextInt();
        int smallest;
        if (num1 < num2) {
            if (num1 < num3) smallest = num1;
            else smallest = num3;
        } else {
            if (num2 < num3) smallest = num2;
            else smallest = num3;
        }
        System.out.print("The smallest number is: "+ smallest+ System.lineSeparator() );
        // Exam3

        input.nextLine();
        System.out.print("Enter day name: ");

        String day = input.nextLine().toLowerCase();

        int dayNumber;
        switch (day) {
            case "monday":
                dayNumber = 3;
                break;
            case "tuesday":
                dayNumber = 4;
                break;
            case "wednesday":
                dayNumber = 5;
                break;
            case "thursday":
                dayNumber = 6;
                break;
            case "friday":
                dayNumber = 7;
                break;
            case "saturday":
                dayNumber = 1;
                break;
            case "sunday":
                dayNumber = 2;
                break;
            default:
                dayNumber = -1;
        }

        if (dayNumber == -1) {
            System.out.println("Invalid day name!");
        } else {
            System.out.println("Day number: " + dayNumber);
        }
    }
}




package javaTwo;
import java.util.Scanner;
public class JavaTwo {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: "+ System.lineSeparator() );
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //Arithmetic operations
        System.out.println("Sum = "+ (num1+num2) + System.lineSeparator() );
        if (num1>num2) System.out.println("Differance = "+ (num1-num2)+ System.lineSeparator());
        else  System.out.println("Differance = "+ (num2-num1)+ System.lineSeparator());
        System.out.println("Product = "+ (num1*num2) + System.lineSeparator() );
        System.out.println("Reminder = "+ (num1%num2) + System.lineSeparator() );

        //If conditions
        if (num1>num2) {System.out.println("The graater number is "+ num1+ System.lineSeparator());}
        else if  (num1<num2){System.out.println("The graater number is "+ num2+ System.lineSeparator());}
        else {  System.out.println("The two numbers are equal "+ System.lineSeparator());}
        //Logical operators
        if (num1>0 && num2>0 ) {System.out.println("Both are positive "+ System.lineSeparator());}
        else if  (num1<0 || num2<0){System.out.println("No positives "+  System.lineSeparator());}
        else {System.out.println("One is positive "+  System.lineSeparator());}


        //Ternary operator
        String result1 =  (num1>num2) ? "First number is greater than second number" : "Second number is greater than first number";
        System.out.println(result1);


        String result2 =   ((num1%2)== 0) ? "First number is Even" : "First number is Odd";
        System.out.println(result2);

    }
}

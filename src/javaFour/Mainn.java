package javaFour;
import javax.lang.model.element.Name;
import java.net.IDN;
import java.util.Scanner;
public class Mainn {
public  static  void main (String[] args)
{
Scanner input= new Scanner(System.in);

    JavaFour.Student [] Students= new JavaFour.Student [3];

    for (int i = 0; i < Students.length; i++) {
        System.out.println("Enter name of student " + (i + 1) + ":");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("ID: ");
        int id = input.nextInt();

        System.out.print("Grade 1: ");
        Double g1 = input.nextDouble();

        System.out.print("Grade 2: ");
        Double g2 = input.nextDouble();

        System.out.print("Grade 3: ");
        Double g3 = input.nextDouble();
        input.nextLine(); // clear buffer

        Students[i] = new JavaFour.Student(name, id, g1, g2, g3);

}

    System.out.println("\n--- Student Report ---");
    for (int i = 0; i < Students.length; i++) {
        Students[i].displayInfo();
    }

}

}

package daySix;
import java.util.Scanner;
public class InstantPayCheck {

    static  double RequiredSalary=25000;
    static  double RequiredScore=700;
     Scanner Input =new Scanner(System.in);
 public  double getSalary (){
     System.out.println("Enter your salary, please");
     double salary;
     salary = Input.nextDouble();
     return salary;
    }


    public int getScore (){
        System.out.println("Enter your I Score , Please");
        int score ;
        score=Input.nextInt();
        return score;
    }

    public boolean isQualifed(double salary, int score) {
        return score >= RequiredScore && salary >= RequiredSalary;
    }

    public void notifyUser(boolean isQualifed ) {
if (isQualifed)

    System.out.println("you are qualified");

else
    System.out.println("you are not qualified");
    }

    }






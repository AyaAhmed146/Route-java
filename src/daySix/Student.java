package daySix;

public class Student {


    private static int grade;
    private static String name;

    public Student(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }


    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }


    public void  setGrade (int grade)
    {
        if (grade>=0&& grade<=100)
        {
            this.grade=grade;
        }
        else {
            System.out.println("Invalid Grade , please enter valid value");
        }
    }
    public static void  printInfo(){
        System.out.println("Name is : "+  name + ", Grade is : " +grade);
    }

}

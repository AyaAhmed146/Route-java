package javaFour;

public class JavaFour {

    public static class Student {
        String Name;
        int ID;
        Double Grade1, Grade2, Grade3;

        public Student(String Name, int ID, Double Grade1, Double Grade2, Double Grade3) {
            this.Name = Name;
            this.ID = ID;
            this.Grade1 = Grade1;
            this.Grade2 = Grade2;
            this.Grade3 = Grade3;
        }

        public double calculateAverage() {
            return (Grade1 + Grade2 + Grade3) / 3;
        }

        public boolean isPassed() {
            return calculateAverage() >= 50;
        }

        public void displayInfo() {
            System.out.println("Name : " + Name + System.lineSeparator());
            System.out.println("ID : " + ID + System.lineSeparator());
            System.out.println("Average :" + calculateAverage() + System.lineSeparator());

            if (isPassed()) {
                System.out.println("Result : Passed" + System.lineSeparator());
            } else {
                System.out.println("Result : Failed" + System.lineSeparator());
            }


        }
    }}

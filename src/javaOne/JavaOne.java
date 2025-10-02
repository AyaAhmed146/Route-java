package javaOne;

public class JavaOne {
    public static void main (String [] args){
        byte b =127;
        short sh=10000;
        int i=1000000000;
        long L=1000000000L;
        float ff=10.7f;
        double d=10.78;
        char ch1='A';
        char ch2='y';
        boolean t= true;
        boolean f = false;
        System.out.println(b);
        System.out.println("Hello Worled!");
        System.out.println ("Value of b is :"+b);
        System.out.println("Value of b and sh is :" + b+sh); // invalid
        System.out.println("Value of b and sh is :" + (b+sh));
        System.out.println(f);
        System.out.println(ff+i);
        System.out.println(ff+L);
        System.out.println(ch1+ch2);
        String txt = "patient";
        String S1 = "Aya";
        String S2 = "Ahmed";
        System.out.println(S1+S2);
        //Static
        int num1 =100;
        System.out.println(num1);
        int num2 =500;
        System.out.println(num1);

        int q =10;
        int z= q;
        System.out.println(z);
    }
}


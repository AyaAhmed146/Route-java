package daySix;

public class Java_5 {
    public  static  boolean search(int [] arr, int input)
    {
        //Ex#1
        for(int i =0 ; i < arr.length;i++)

        {
            if (arr[i]==input)
            {
                return true;
            }
        }
         return  false;
    }

    //Ex#2
    public static int Repetition(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    //Ex#3
    public static int[] sort(int[] arr) {
        java.util.Arrays.sort(arr);
        return arr;
    }

    //Ex#4
    public static void Reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Ex#5
    public static boolean Prime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 1) {
                boolean prime = true;
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void EvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even + ", Odd = " + odd);
    }

    public static void main(String[] args) {


        int[] a={1,2,3,4,3};
        System.out.println("Search 3: " + search(a, 3));
        System.out.println("Repetition of 3: " + Repetition(a, 3));

        System.out.println("Sorted:" + java.util.Arrays.toString(sort(a)));
        System.out.print("Reverse: ");
        Reverse(a);
        System.out.println("Has Prime? " + Prime(a));
        EvenOdd(a);
    }



}

package Project1;

public class Task5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable

        int a=25;
        int b=55;
        System.out.println("a="+a+" b="+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("After swaping a="+a+" and b="+b);
    }
}

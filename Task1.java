package Project1;

public class Task1 {
    public static void main(String[] args) {
        //1. Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.
        int[]temperatures = {103,89,95,85,102,105,99};
        int highestTemp=temperatures[0];
        int lowestTemp=temperatures[0];
        for (int i = 0; i <temperatures.length ; i++) {
            if (temperatures[i]>highestTemp){
                highestTemp=temperatures[i];}
            else if (temperatures[i]<lowestTemp){
                    lowestTemp=temperatures[i];
            }}

        System.out.println("" +
                "Highest temperature of the week is "+ highestTemp);

        System.out.println("Lowest temperature of the week is "+lowestTemp);

        }}
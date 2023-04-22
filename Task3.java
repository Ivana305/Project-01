package Project1;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] numbers = {
                {11, 89, 14, 25, 7},
                {25, 44, 1078, 66},
                {99, 122, 244, 735, 465},
                {2, 5, 8,}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0)
                    System.out.println(numbers[i][j]);
            }
        }
    }}
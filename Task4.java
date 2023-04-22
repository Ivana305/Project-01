package Project1;

public class Task4 {
    public static void main(String[] args) {
      //Create a 2D array of integers. Develop a program which will calculate
        // the sum of even and odd numbers for that array.
        int [][]numbers={
                {11,22,33,44,55},
                {66,77,88,99},
                {100,200,300,400},
                {111,222,333,444,555,666}
        };
        int sumOdd=0;
        int sumEven=0;
        int number=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (numbers[i][j]%2==0)
                    sumEven=sumEven+numbers[i][j];
                else sumOdd=sumOdd+numbers[i][j];
                number++;
        }
            }
        System.out.println(sumEven);
        System.out.println(sumOdd);


    }
}
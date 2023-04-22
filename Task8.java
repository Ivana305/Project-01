package Project1;

public class Task8 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array
        int[] numbers = {11, 22, 33, -4, 55, 50, 40, 259, 20, 10};
        int max = numbers[0];
        int min =numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            } else if (numbers[i]<min) {
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        }

    }

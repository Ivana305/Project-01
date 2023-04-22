package Project1;

public class Task2 {
    public static void main(String[] args) {
      // Create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array
        int [] numbers={2,25,30,50,14,8,12,9};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}


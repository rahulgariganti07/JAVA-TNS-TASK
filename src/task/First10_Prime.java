package task;

public class First10_Prime {
    public static void main(String[] args) {
        int count = 0;
        int number ;
        int sum = 0;

        for(number=2;count<+
                10;number++){
                boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number%i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum = sum + number;
                count++;
            }
        }

        System.out.print("Sum of first 10 prime numbers: " + sum);


    }
}
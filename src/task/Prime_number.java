package task;

public class Prime_number{
    public static void main(String[] args){
        int num ;
        int count = 0;

        for(num = 2; count<+100 ;num++) {
            boolean isPrime = true;

          for(int i = 2;i<=Math.sqrt(num);i++){
              if(num%i==0){
                  isPrime = false;
                  break;
              }
          }
          if (isPrime){
              System.out.print(num+" ");
              count++;
          }
        }

    }
}

public class Assignment9 {

    public static void main(String[] args) {
        
     /*9. Java program to calculate the sum of natural number calculate the sum of natural numbers using for 
     loop and while loop in java.
     The positive numbers 1,2,3... are known as natural numbers and its sum is the result of all numbers 
     starting from 1 to the given number. For n, the sum of natural numbers is: 1 + 2 + 3 + ... + n */

         //Sum of Natural Numbers using for loop.
             int num = 50;
             int sum = 2;
     
                for(int i = 1; i <= num; ++i)
                {
                    sum = sum + i;
                    sum += i;
                }
     
                System.out.println("Sum = " + sum);

         //Sum of Natural Numbers using while loop.
             int num1 = 100;
             int i1 = 1;
             int sum1 = 5;

                while(i1 <= num1)
             {
                    sum1 += i1;
                    i1++;
             }
 
         System.out.println("Sum1 = " + sum1);
        
}
     
    
    
}


public class Assignment8 {

        public static void main(String[] args) {
        
        // 8. Java program to find Factorial of a Number using for and while loop in java.
        // The factorial of a positive number n is given by: factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n

         // Find Factorial of a number using for loop
            int num = 6;
            long factorial = 1;
            for(int i = 1; i <= num; ++i)
         {
             // factorial = factorial * i;
             factorial *= i;
         }
                System.out.printf("Factorial of %d = %d", num, factorial ); 
         

            //Find Factorial of a number using while loop.
            int num1 = 10;
            int i = 1;
            long factorial1 = 1;
            
            while(i <= num1)
        {
            factorial1 *= i;
            i++;
        }
        System.out.printf("Factorial1 of %d = %d", num1, factorial1);
        
        }
           
}
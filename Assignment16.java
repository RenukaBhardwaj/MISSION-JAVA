public class Assignment16 {

    public static void main(String[] args) {
        //A positive integer of n digits is called an Armstrong number of order n (order is number of digits).
        //153 is an Armstrong number. 1*1*1 + 5*5*5 + 3*3*3 = 153
        //16. Armstrong number in java.
             int number = 153;
             int originalNumber;
             int remainder;
             int result = 0;

             originalNumber = number;

                 while (originalNumber != 0)
             {
                 remainder = originalNumber % 10;
                 result += Math.pow(remainder, 3);
                 originalNumber /= 10;
             }
                if(result == number)
                    System.out.println(number + " is an Armstrong number.");
                else
                    System.out.println(number + " is not an Armstrong number.");
    }
    
}

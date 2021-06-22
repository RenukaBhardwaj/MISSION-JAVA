public class Assignment11 {

    public static void main(String[] args) {

     /*11. Java program to find GCD of two numbers. 
     This is done by using for and while loops with the help of if else statements. 
     The HCF or GCD of two integers is the largest integer that can exactly divide both numbers(without a remainder). */

        //Find GCD of two numbers using for loop and if statement.
        // find GCD between n1 and n2
            int num1 = 49;
            int num2 = 112;
    
            // initially set to gcd
             int gcd = 1;

                for (int i = 1; i <= num1 && i <= num2; ++i) {
                    
                 // check if i perfectly divides both n1 and n2
                 if (num1 % i == 0 && num2 % i == 0) {
                 //System.out.println(i + " is GCD of " + num1 +" and " + num2 + " is " + gcd + " ?");
                    gcd = i;
                 }// else {
                  //System.out.println(i + "is not GCD of " + num1 +" and " + num2 + " is " + gcd);
                 
            }
                    System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);

        //Find GCD of two numbers using while loop and if else statement.

            //Find GCD between n1 and n2
            
            int num3 = 77;
            int num4 = 176;
    
                while(num3 != num4) {
    
                if(num3 > num4) {
                 num3 -= num4;
              }
    
                else {
                num4 -= num3;
              }
            }

               System.out.println("GCD: " + num3);
        
    }
    
}

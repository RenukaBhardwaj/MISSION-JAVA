public class Assignment12 {

    public static void main(String[] args) {
        
    /*12. Java program to find LCM of two numbers. This is done using for and while loops in Java.
      The LCM of two integers is the smallest positive integer that is perfectly divisible by both the
      numbers (without a remainder). */
    
        //LCM (Least Common Multiple) of two numbers is the smallest number which can be divided by both numbers. 
        int num1 = 45;
        int num2 = 150;
        int lcm = 1;

            lcm = (num1 > num2) ? num1 : num2;

             while(true){
                if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                  System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                  break;
              }
                 ++lcm;
        }

        int n1 = 45;
        int n2 = 150;
        int lcm1 = 1;

            //lcm1 = (n1 > n2) ? n1 : n2;
           
            for (int i = 1; i <= n1 && i <= n2; ++i) {
                if( lcm1 % n1 == 0 && lcm1 % n2 == 0 ) {//   if(num1 % i == 0 && num2 % i == 0){
                    
                        System.out.printf("The LCM1 of %d and %d is %d.", n1, n2, lcm1);
                }
                ++lcm1;
    }
    }
}


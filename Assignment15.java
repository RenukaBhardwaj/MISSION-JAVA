public class Assignment15 {

    public static void main(String[] args) {
        
         //15. Palindrome program in java.
         //int num = 45554;
         int num = 12345;
         int reversedNum = 0;
         int remainder;
    
         // store the number to originalNum
         int originalNum = num;
        
         // get the reverse of originalNum
         // store it in variable
            while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
         }
        
         // check if reversedNum and originalNum are equal
            if (originalNum == reversedNum) {
                 System.out.println(originalNum + " is Palindrome.");
         }
            else {
                 System.out.println(originalNum + " is not Palindrome.");
         }
      
 
    }
    
}

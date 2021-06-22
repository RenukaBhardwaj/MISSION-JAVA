public class Assignment14 {

    public static void main(String[] args) {
        
       //14. Prime number program in java. 

       int num = 77;
       int i = 2;
       boolean flag = false;
       
          while (i <= num / 2) {
           // condition for nonprime number
            if (num % i == 0) {
            flag = true;
            break;
     }
           ++i;
    }
           if (!flag)
           System.out.print(num + " is a prime number.");
           else
           System.out.print(num + " is not a prime number."); 
    }
    
}

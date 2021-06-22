public class Assignment10 {

    public static void main(String[] args) {
        
     //10. Java program to generate multiplication tabel using for or while loop.

            //Generate multiplication tabel using for loop.
            int num = 2;
                        
                for(int i = 1; i <= 10; ++i)
        {
             System.out.printf("%d * %d = %d %n", num, i, num * i);
        }

            //Generate multiplication tabel using while loop.
            int num1 = 4;
            int i = 1;
            
                while(i <= 10)
        {
             System.out.printf("%d * %d = %d %n", num1, i, num1 * i);
             i++;
        }
     


        
    }
    
}

public class Assignment123 {

    public static void main(String[] args) {
        
         //1. Java method to add two integers.

         // declare a variable
         int a = 1;
         int b = 2;
 
         System.out.println(a+b);
 
         //2. Java Program tp compute Quotient(/) and Remainder(%).
         
         //Division operator(/) and Modulo Operator(%)
         // declare a variable
         int c = 10, d = 5;
 
         System.out.println("c / d =" + (c / d));
         System.out.println("c % d =" + (c % d));
 
         //3. Java program to swap two numbers.
 
         // declare a variable
         int first = 5;
         int second = 10;
         int temporary;

         System.out.println("--Before swap--");
         System.out.println("First number = " + first);
         System.out.println("Second number = " + second);
         
         // Value of first is assigned to temporary
         temporary = first;
 
         // Value of second is assigned to first
         first = second;
 
         // Value of temporary (which contains the initial value of first) is assigned to second
         second = temporary;
 
         System.out.println("--After swap--");
         System.out.println("First number = " + first);
         System.out.println("Second number = " + second);
 
    }
    
}

import java.util.Scanner;

public class Assignment4 {

public static void main(String[] args) {
        
    //4. Java program to check whether a number is even or odd. 
    
    Scanner reader = new Scanner(System.in); 

    int num = reader.nextInt();
    System.out.println("Enter a number : " + num);
   
    if(num % 2 == 0)
        System.out.println(num + " is even");
    
    else 
        System.out.println(num + " is odd");
    
    reader.close();

 }
}    
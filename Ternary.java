public class Ternary {

    public static void main(String[] args) {
    
    //If the Expression is true, expression1 is assigned to the variable.
    //If the Expression is false, expression2 is assigned to the variable.  
    
    int februaryDays = 29;
    String result;

    // ternary operator
    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
    System.out.println(result);
  
    }
    
}

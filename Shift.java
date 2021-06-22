public class Shift {

    public static void main(String[] args) {
        var a = 70;          
        int b = -60;        
        var c = 0;
        System.out.println("90  = " + Integer.toBinaryString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));
  
        //signed shift
        c = a >> 1;              
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));
  
        //unsigned shift
        c = a >>> 1;            
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );
  
        c = b >> 1;              
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );
  
        c = b >>> 1;            
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
    }
    
}

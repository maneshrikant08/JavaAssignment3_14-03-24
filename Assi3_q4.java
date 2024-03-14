/*4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and
prints the result.*/
package Assignment3;

public class Assi3_q4 {
  public static void main(String[] args) {
    int intnum=1207;
    float floatnum=intnum;
    double doublenum=(double)intnum;
    boolean  boolval = intnum !=0;
    String str=String.valueOf(intnum);
    System.out.println("intnum value"+" "+intnum);
    System.out.println("floatnum value"+" "+floatnum);
    System.out.println("doublenum value"+" "+doublenum);
    System.out.println("boolval "+" " + boolval); 
    
  }
  
}

/*3) Write a program that performs arithmetic operations involving different data types (int, double, float)
and observes how Java handles widening conversions automatically. */
package Assignment3;

public class Assi3_q3 {
  public static void main(String[] args) {
    int intValue = 10;
    float floatValue = 5.5f;
    double doubleValue = 9.5;

    // Widening conversion from int to float
    float resultFloat = intValue + floatValue;
    System.out.println("Result (int + float) as float: " + resultFloat);

    // Widening conversion from float to double
    double resultDouble = floatValue + doubleValue;
    System.out.println("Result (float + double) as double: " + resultDouble);

    // Widening conversion from int to double
    resultDouble = intValue + doubleValue;
    System.out.println("Result (int + double) as double: " + resultDouble);
    
  }
  
}

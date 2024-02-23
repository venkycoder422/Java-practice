package wrapper_code;

public class WrapperClass {
  public static void main(String[] args) {
            // Using Boolean wrapper class
            Boolean boolObj = Boolean.valueOf(true); // Wrapping a boolean value
            System.out.println("Boolean Value: " + boolObj);
    
            // Using Double wrapper class
            Double doubleObj = Double.valueOf(3.14); // Wrapping a double value
            System.out.println("Double Value: " + doubleObj);
    
            // Using Integer wrapper class
            Integer intObj = Integer.valueOf(42); // Wrapping an integer value
            System.out.println("Integer Value: " + intObj);
    
            // Unwrapping or extracting primitive values from wrapper objects
            boolean boolValue = boolObj.booleanValue();
            double doubleValue = doubleObj.doubleValue();
            int intValue = intObj.intValue();
    
            System.out.println("Unwrapped Boolean Value: " + boolValue);
            System.out.println("Unwrapped Double Value: " + doubleValue);
            System.out.println("Unwrapped Integer Value: " + intValue);
          }
}

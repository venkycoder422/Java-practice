package variables_init_casting;

public class InitVariableCast {

    public static void main(String args[]) {
        // int age;
        // age=10;
        // byte a = 100;
        // short shortNum = 30000;
        // long large = 1000000000L;
        // double doubled = 2000.44D;
        // float decimal = 20.00f;
        // char gender = 'M';
        // boolean yes = true;
        // System.out.println(a);
        // System.out.println(shortNum);
        // System.out.println(large);
        // System.err.println(doubled);
        // System.out.println(decimal);
        // System.out.println(gender);
        // System.out.println(yes);
        // Real life examples with values.
        byte temperature = 20;

        // short: Representing distance in meters
        short distance = 1500;

        // int: Representing the population of a city
        int population = 1000000;

        // long: Representing national debt in dollars
        long nationalDebt = 25000000000L;

        // float: Representing the price of a product
        float price = 19.99f;

        // double: Representing the mathematical constant π
        double pi = 3.14159265359;

        // char: Representing a student's grade
        char grade = 'A';

        // boolean: Representing weather conditions
        boolean isSunny = true;

        // Printing out the values of the variables
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Distance: " + distance + " meters");
        System.out.println("Population: " + population);
        System.out.println("National Debt: $" + nationalDebt);
        System.out.println("Price: $" + price);
        System.out.println("π (Pi): " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is it sunny today? " + isSunny);

        // Type Casting in Java --> 1. Implicit Casting 2. Explicit Casting

        // 1. Smaller data type - Bigger data type.
        // 2. Bigger data type - Smaller data type.

        int longToInt = (int) 10000000000L;
        System.out.println("Casting Long to Int: " + longToInt);

        int age = 25;
        float ageAsFloat = (float) age;
        System.out.println("Int  to Float: " + ageAsFloat);

        long apPopulation = (long) 10;
        System.out.println(apPopulation);

    

    }
}

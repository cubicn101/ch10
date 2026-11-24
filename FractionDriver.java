
public class FractionDriver {

    public static void main(String[] args) {

        // Test constructors
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction("3/4");
        Fraction f4 = new Fraction(f2);

        System.out.println("Default: " + f1);
        System.out.println("Two integers: " + f2);
        System.out.println("String: " + f3);
        System.out.println("Copy: " + f4);

        // Test accessors
        System.out.println("Numerator: " + f2.getNum());
        System.out.println("Denominator: " + f2.getDenom());
        System.out.println("Decimal: " + f2.toDouble());

        // Test mutators
        Fraction f5 = new Fraction(12, 18);
        System.out.println("Before reduce: " + f5);

        f5.reduce();
        System.out.println("After reduce: " + f5);

        f5.setNum(5);
        f5.setDenom(6);
        System.out.println("After setters: " + f5);

        // Test arithmetic
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        Fraction product = Fraction.multiply(a, b);
        Fraction quotient = Fraction.divide(a, b);
        Fraction sum = Fraction.add(a, b);
        Fraction difference = Fraction.subtract(a, b);

        System.out.println("Multiply: " + product);
        System.out.println("Divide: " + quotient);
        System.out.println("Add: " + sum);
        System.out.println("Subtract: " + difference);

        // Test zero denominator
        Fraction invalid = new Fraction(2, 0);
        System.out.println("Zero denominator test: " + invalid);
    }
}

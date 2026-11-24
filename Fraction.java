
public class Fraction {

    // Instance variables
    private int numerator;
    private int denominator;

    // 1. Default constructor
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    // 2. Constructor with two integers
    public Fraction(int n, int d) {
        numerator = n;
        setDenom(d);
    }

    // 3. Constructor with a String
    public Fraction(String b) {
        int slash = b.indexOf("/");

        int n = Integer.parseInt(b.substring(0, slash));
        int d = Integer.parseInt(b.substring(slash + 1));

        numerator = n;
        setDenom(d);
    }

    // 4. Copy constructor
    public Fraction(Fraction b) {
        numerator = b.numerator;
        denominator = b.denominator;
    }

    // ACCESSOR METHODS

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    // MUTATOR METHODS

    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        if (d != 0) {
            denominator = d;
        } else {
            System.out.println("Error: denominator cannot be zero");
            denominator = 1;
        }
    }

    // HELPER METHOD: Greatest Common Factor
    private static int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    // MUTATOR: Reduce to lowest terms
    public void reduce() {
        int factor = gcf(numerator, denominator);

        if (factor != 0) {
            numerator = numerator / factor;
            denominator = denominator / factor;
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // STATIC: Multiply two fractions
    public static Fraction multiply(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDenom() * b.getDenom();

        Fraction answer = new Fraction(n, d);
        answer.reduce();

        return answer;
    }

    // STATIC: Divide two fractions
    public static Fraction divide(Fraction a, Fraction b) {
        if (b.getNum() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int n = a.getNum() * b.getDenom();
        int d = a.getDenom() * b.getNum();

        Fraction answer = new Fraction(n, d);
        answer.reduce();

        return answer;
    }

    // STATIC: Add two fractions
    public static Fraction add(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom()
              + b.getNum() * a.getDenom();

        int d = a.getDenom() * b.getDenom();

        Fraction answer = new Fraction(n, d);
        answer.reduce();

        return answer;
    }

    // STATIC: Subtract two fractions
    public static Fraction subtract(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom()
              - b.getNum() * a.getDenom();

        int d = a.getDenom() * b.getDenom();

        Fraction answer = new Fraction(n, d);
        answer.reduce();

        return answer;
    }
}

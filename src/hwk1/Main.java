package hwk1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}

class Fraction{
    private int a=1;
    private int b=1;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int gcd(int m, int n) {
        while (n>0) {
            int tmp = m%n;
            m = n;
            n = tmp;
        }
        return m;
    }

    public double toDouble() {
        return (double)1.0*a/b;
    }

    public Fraction plus(Fraction r) {
        int x = a*r.b + b*r.a;
        int y = b*r.b;
        Fraction res = new Fraction(x, y);
        return res;
    }

    public Fraction multiply(Fraction r) {
        int x = a*r.a;
        int y = b*r.b;
        Fraction res = new Fraction(x, y);
        return res;
    }

    public void print() {
        int gcd = gcd(a,b);
        a /= gcd;
        b /= gcd;

        if (a == b) {
            System.out.printf("%d\n", 1);
        } else {
            System.out.printf("%d/%d\n", a, b);
        }

    }


}


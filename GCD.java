//iterative method to find out GCD of two numbers

public class GCD {
    public int gcd(int m, int n) {
        while (n != 0) {
            int q = m % n;
            m = n;
            n = q;
        }
        return m;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int output = gcd.gcd(150, 12);
        System.out.println(output);
    }
}
public class Power {
    public int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y/2) * power(x, y/2);
        }
        else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }

    public static void main(String[] args) {
        Power pow = new Power();
        System.out.println(pow.power(4, 5));
    }
}

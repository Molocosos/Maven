public class Triangle {
    private int a;
    private int b;
    private int c;
    private double s;
    private double p;

    public double getSquare(int a, int b, int c) throws NonIntResultException {
        if (!((a + b) > c && (a + c) > b && (c + b) > a && a > 0 && b > 0 && c > 0))
            throw new NonIntResultException(a, b, c);
        p = (double) (a + b + c) / 2;
        double temp = p * (p - a) * (p - b) * (p - c);
        s = Math.sqrt(temp);
        return s;
    }
}

public class NonIntResultException extends Exception {
    private int a;
    private int b;
    private int c;

    NonIntResultException(int d, int e, int f) {
        a = d;
        b = e;
        c = f;
    }

    public String toString() {
        return " Треугольник с заданными сторонами: " + a + ", " + b + ", " + c + " - не существует!";
    }
}

package Unidad1.TallerPractico;

public class Fibonaci {
    public static void main(String[] args) {
        long a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 50; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


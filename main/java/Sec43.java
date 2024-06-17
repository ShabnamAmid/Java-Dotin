public class Sec43 {

    public static void main(String[] args) {

        int a = 10;
        int square = square(a);
        int root = root(a);
        System.out.println(square);
        System.out.println(root);
       int delta = delta(3,6,2);
        System.out.println(delta);

    }

    public static int square (int a) {
        return a*a;
    }
    public static int root (int a) {
        return a ^ (1/2);
    }

    public static int delta(int a, int b, int c) {
        return (b ^ b)-(4*a*c);
    }
}

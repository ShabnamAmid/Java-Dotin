import org.w3c.dom.ls.LSOutput;

public class Sec44 {

    public static void main(String[] args) {

        int add1 = add (5,2);
        System.out.println(add1);

        int d = 2;
        d += 5;
        d -= 3;
        d *= 10;
        d /= 2;
        d %= 5;
        System.out.println(d);

        int x = 5;
        int y = 5;
        int z = ++x;
        int h = --x;


        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(z);
        System.out.println(h);
    }
    public static int add(int a, int b) {
        return (a + b) / 2;
    }

}

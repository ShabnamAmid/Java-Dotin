public class Section4E {
    public static void main(String[] args) {
       int m = 6;
        System.out.println(factorial(m));
    }

    public static int factorial(int n) {
        int fa = 1;
        for (int i = 2; i <= n; i++) {
            fa = fa * i;
        }
        return fa;
    }
}

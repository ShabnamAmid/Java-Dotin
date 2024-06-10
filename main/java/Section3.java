public class Section3 {
    public static void main(String[] args) {

        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;

        String str = "CCLX";
        int sum = 0;

        char[] strArray = str.toCharArray();

        for (int i = 0; i < str.length() ; i++) {

            if ('I' == strArray[i]) {
                sum = sum + 1;
            }
            else if ('V' == strArray[i]){
                sum = sum + 5;
            }
            else if ('X' == strArray[i]) {
                sum = sum + 10;
            }
            else if ('L' == strArray[i]) {
                sum = sum + 50;
            }
            else sum = sum + 100;

        }
        System.out.println("String is = " + str);
        System.out.println(sum);
    }
}

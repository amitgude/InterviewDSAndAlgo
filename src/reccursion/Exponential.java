package reccursion;

public class Exponential {

    public static void main(String[] args) {
        int v = 3;
        int n = 3;

        System.out.println( expo(v,n));
    }

    private static int expo(int v, int n) {

        if (n == 0){
            return 1;
        }
        else if (n % 2 == 0) {
            int y = expo(v, n/2);
            return y*y;
        }
        else {
            return v * expo(v, n - 1);
        }
    }
}

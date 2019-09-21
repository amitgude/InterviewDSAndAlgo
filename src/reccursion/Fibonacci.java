package reccursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n= 60;

        System.out.println(fibo(n));
    }

    private static int fibo(int i) {

        if(i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fibo(i-1) + fibo(i-2);
    }
}

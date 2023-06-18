package solutions.sobes;

public class Factorial {

    public static void main(String[] args) {

        int x = 5;

        System.out.println(fac(x));
        System.out.println(fucCicle(x));
    }

    private static int fucCicle(int x) {
        if (x == 0) return 1;

        int result = 1;
        for (int i = 1; i <=x ; i++) {
            result *= i;
        }
        return result;
    }

    private static int fac(int x) {

        if (x == 0) return 1;

        return x * fac(x - 1);

    }


}

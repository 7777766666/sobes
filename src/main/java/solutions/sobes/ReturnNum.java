package solutions.sobes;

public class ReturnNum {

    public static void main(String[] args) {

        int x = Integer.MIN_VALUE;
        System.out.println(returnN(x) + " answer");


    }

    private static long returnN(int x) {


        long result = 0;
        while (x != 0 ){
            result = result * 10 +  (x % 10);
            x = x / 10;
        }
        return result;


    }
}

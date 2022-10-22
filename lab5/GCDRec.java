public class GCDRec {


    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = gcd(number1, number2);

        System.out.println("GDC of " + number1 + " and " + number2 + " = " + result);

    }

    private static int gcd(int number1, int number2){
        int remainder = number1 % number2;
        if (remainder == 0)
            return number2;
        return gcd(number2, remainder);
    }
}

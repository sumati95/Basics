public class Gcd {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 12;
        gcdPrint(num1, num2);
    }

    static void gcdPrint(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

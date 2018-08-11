public class Armstrong {
    static void armCall(int num) {
        int temp, remainder, result = 0;
        temp = num;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, digits);
            temp /= 10;
        }
        if (result == num) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("NA");
        }
    }
    public static void main(String[] args) {
        int n = 567;
        armCall(n);
    }
}

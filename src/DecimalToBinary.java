public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 121;
        dTobConversion(number);
    }
    static void dTobConversion(int num) {
        int index = 0;
        int b[] = new int[50];
        while (num != 0) {
            b[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }
    }
}

public class Strong {
    public static void main(String[] args) {
        strongNumber(145);
    }

    static void strongNumber(int num) {
        int sum = 0, rem, temp, fact;
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
}

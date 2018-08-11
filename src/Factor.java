public class Factor {
    public static void main(String[] args) {
        fact(24);
    }
    static void fact(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}

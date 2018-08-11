public class Perfect {
    public static void main(String[] args) {
        prefect(6);
    }

    static void prefect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum  = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not perfect");
        }
    }
}

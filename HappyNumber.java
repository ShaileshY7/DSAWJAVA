public class HappyNumber {
    public static void main(String[] args) {
        int n = 888;
        int sum;

        while (n != 1 && n != 4) { // 4 means it's stuck in a loop (unhappy)
            sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum; // assign the new sum to n and repeat
        }

        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}

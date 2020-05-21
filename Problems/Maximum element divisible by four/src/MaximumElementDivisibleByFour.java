import java.util.Scanner;

class MaximumElementDivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int nextNumber = 0;

        for (int i = 0; i < n; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0) {
                if (max < nextNumber) {
                    max = nextNumber;
                }
            }
        }
        System.out.println(max);
    }
}
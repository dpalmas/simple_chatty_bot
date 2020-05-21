import java.util.Scanner;

class CheckValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean result = (num < 10) && (num > 0);
        System.out.println(result);
    }
}
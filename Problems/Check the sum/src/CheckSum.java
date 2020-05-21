import java.util.Scanner;

class CheckSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result;
        if (a + b == 20 || b + c == 20 || c + a == 20)
            result = true;
        else
            result = false;
        System.out.println(result);
    }
}
import java.util.Scanner;

class IsBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean result;
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3))
            result = true;
        else
            result = false;
        System.out.println(result);
    }
}
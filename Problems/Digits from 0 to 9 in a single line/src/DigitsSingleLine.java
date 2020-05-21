class DigitsSingleLine {
    public static void main(String[] args) {
        int numbers[] = result();

        for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
        }
    }

    public static int[] result() {
        return new int[]{9,8,7,6,5,4,3,2,1,0};
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int num = 4;
        int[] numbers = new int[num];
        int i = 0;
        while (i < num) {
            numbers[i++] = scanner.nextInt();
        }
        i = 0;
        while (i < num) System.out.print(--numbers[i++] + " ");
    }
}
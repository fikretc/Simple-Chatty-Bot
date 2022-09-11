import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int digit = 0;

        digit = scanner.nextInt();
        int result = (digit%1000)/100 + ((digit%100)/10)*10 + (digit%10)*100;
        System.out.println(result);
    }
}
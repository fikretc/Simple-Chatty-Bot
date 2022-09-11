import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        if ((numA + numB > numC) && (numB + numC > numA) && (numA + numC > numB)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
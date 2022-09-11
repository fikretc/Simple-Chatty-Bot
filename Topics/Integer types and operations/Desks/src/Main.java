import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int num = 3;
        int students;
        int i = 0;
        int desks = 0;
        while (i < num) {
            students = scanner.nextInt();
            desks += students / 2 + students % 2;
            i++;
        }
        System.out.println(desks);

    }
}
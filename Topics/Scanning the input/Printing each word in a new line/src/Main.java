import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int num = 5;
        String[] words = new String[num];
        int i = 0;
        while (i < num) {
            words[i] = scanner.next();
            i++;
        }
        i = 0;
        while (i < num) {
            System.out.println(words[i]);
            i++;
        }
    }
}
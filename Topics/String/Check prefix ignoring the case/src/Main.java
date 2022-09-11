import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.next();
        str = str.toUpperCase();
        Boolean result = str.startsWith("J");
        System.out.println(result);
    }
}
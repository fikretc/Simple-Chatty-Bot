import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
        int numK = scanner.nextInt();
        int numRemain = (numN*numM)%numK;
        if (numN * numM < numK) {
            System.out.println("NO");
        } else if (numRemain % numN == 0 || numRemain % numM == 0) {
            if (numK % numN ==0 || numK % numM == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }


    }
}
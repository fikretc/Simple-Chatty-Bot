import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int ready = 0;
        int fix = 0;
        int reject = 0;
        int error = 0;
        for (int i = 0; i < num; i++) {
            int det = scanner.nextInt();
            if (det == -1){
                reject++;
            } else if (det == 0) {
                ready++;

            } else if (det == 1) {
                fix++;
            } else {
                error++;
            }
        }
        System.out.println(ready + " " + fix + " " + reject);
        if (error > 0) {
            System.out.println("error:" + error);
        }
    }
}
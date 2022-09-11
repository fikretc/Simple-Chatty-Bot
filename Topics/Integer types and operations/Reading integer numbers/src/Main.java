import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int num = 4;
        String[] nums = new String[num];
        int i = 0;
        while (i < num){
            nums[i] = scanner.next();
            i++;
        }
        i = 0;
        while (i < num){
            System.out.println(nums[i]);
            i++;
        }
    }
}
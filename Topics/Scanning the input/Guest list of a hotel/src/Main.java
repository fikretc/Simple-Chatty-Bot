import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num=4;
        String[] guests = new String[num];
        int i=0;
        while (i < num) {
            guests[i] = scanner.next();
            i++;
        }
        i=4;
        while (i>0){
            i--;
            System.out.println(guests[i]);
        }


    }
}
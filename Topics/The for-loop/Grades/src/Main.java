import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numGrades = 4;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        int numStudents = scanner.nextInt();
        for (int i = 0; i<numStudents; i++) {
            String grade = scanner.next();
            if (grade.equals("A")) {
                gradeA++;
            } else if (grade.equals("B")) {
                gradeB++;
            } else if (grade.equals("C")) {
                gradeC++;
            } else if (grade.equals("D")) {
                gradeD++;
            }

        }
        System.out.println(gradeD + " " + gradeC + " " +gradeB + " " + gradeA);

    }
}
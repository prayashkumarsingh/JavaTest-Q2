import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int number = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 2; i < number; i++) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

import java.util.Scanner;

public class IT26101921Lab8Q4 {
    public static void main(String[] args) {
        int[] studentsArray = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                studentsArray[i] = value;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}
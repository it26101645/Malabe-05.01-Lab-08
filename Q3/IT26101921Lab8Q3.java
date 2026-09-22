import java.util.Scanner;

public class IT26101921Lab8Q3 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int value = scanner.nextInt();
            if (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                numbers[i] = value;
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);

        scanner.close();
    }
}
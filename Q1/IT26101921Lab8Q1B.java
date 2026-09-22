import java.util.Scanner;

public class IT26101921Lab8Q1B {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[index] = myArray[i];
                index++;
            }
        }

        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println("\nevenArray Contents:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
import java.util.Scanner;

public class IT26101921Lab8Q1A {
    public static void main(String[] args) {
        
        int[] myArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
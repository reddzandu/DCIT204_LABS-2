import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        // Create the array
        int[] numbers = new int[size];

        System.out.println();
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println();
        System.out.print("Enter the Target Sum: ");
        int target = input.nextInt();

        boolean found = false;


        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println();
                    System.out.println("========== PAIR FOUND ==========");
                    System.out.println("Index 1 : " + i);
                    System.out.println("Value 1 : " + numbers[i]);
                    System.out.println("Index 2 : " + j);
                    System.out.println("Value 2 : " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    System.out.println("================================");

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        // If no pair exists
        if (!found) {
            System.out.println("\nNo pair of numbers adds up to the target sum.");
        }

        input.close();
    }
}


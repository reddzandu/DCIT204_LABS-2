import java.util.Scanner;
public class FindMax {
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


        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("========== RESULTS ==========");
        System.out.println("Largest Value : " + max);
        System.out.println("Index         : " + maxIndex);
        System.out.println("=============================");

        input.close();
    }
}

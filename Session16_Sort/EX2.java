package ThuatToanSapXepVaTimKiem;

import java.util.*;

public class EX2 {
    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
        /** Copyright belongs to Rekkei Academy */
    }

    // Method to search for a number in the 2D array
    private static boolean searchNumber(int[][] arr, int number) {
        // List to store the positions where the number is found
        List<Map<Integer, Integer>> positions = new ArrayList<>();
        boolean found = false;  // Variable to track if the number is found

        // Nested loop to search through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    Map<Integer, Integer> position = new HashMap<>();
                    position.put(i, j);  // Store the position
                    positions.add(position);  // Add position to the list
                    found = true;  // Set found to true if the number is found
                }
            }
        }

        // Print the positions if the number is found
        if (found) {
            System.out.println("Number " + number + " found at positions:");
            for (Map<Integer, Integer> position : positions) {
                for (Map.Entry<Integer, Integer> entry : position.entrySet()) {
                    System.out.println("Row: " + entry.getKey() + ", Column: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Number " + number + " not found in the array.");
        }

        return found;  // Return whether the number was found
    }

    // Main method
    public static void main(String[] args) {
        int[][] arr = getArr();  // Generate the 2D array

        // Print the generated 2D array
        System.out.println("Generated 2D Array:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int number = scanner.nextInt();

        // Search for the number in the array and print the result
        boolean result = searchNumber(arr, number);
        System.out.println("Search result: " + result);
    }
}

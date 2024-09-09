/***
 * Question:
 * Owner Name: Ayush ray
 * Date: 9-9-2024
 */

import java.util.Scanner;

class ValidParanthesis {

    // Swap elements at index i and j in the array
    public static void swap(char[] array, int i, int j) {
        char temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    // Generate all permutations of the given character array
    public static void generateCombinations(char[] chars, int start, int n) {
        printCombination(chars, start);

        for (int i = start; i < n; i++) {
            swap(chars, i, start);
            generateCombinations(chars, start + 1, n);
            swap(chars, i, start);
        }
    }

    // Print the current permutation up to the specified end index
    public static void printCombination(char[] chars, int end) {
        for (int i = 0; i < end; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input;
        System.out.println(Constants.ENTER_STRING);
        input = userInput.next();
        char[] chars1 = input.toCharArray();
        generateCombinations(chars1, 0, chars1.length);
    }
}
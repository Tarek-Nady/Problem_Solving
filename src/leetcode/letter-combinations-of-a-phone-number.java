import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    // Method to get all possible letter combinations for a given string of digits
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        // Return an empty list if the input string is empty
        if (digits == null || digits.length() == 0) {
            return output;
        }
        // Mapping of digits to corresponding letters, as on a telephone keypad
        String[] digitToLetters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // Start the recursive backtracking process
        backtrack(output, digits, "", 0, digitToLetters);
        return output;
    }

    // Recursive method to generate combinations
    private void backtrack(List<String> output, String digits, String current, int index, String[] digitToLetters) {
        // Base case: if the current index is equal to the length of digits, add current combination to output
        if (index == digits.length()) {
            output.add(current);
            return;
        }

        // Get the letters corresponding to the current digit
        String letters = digitToLetters[digits.charAt(index) - '0'];
        // Loop through these letters
        for (char letter : letters.toCharArray()) {
            // Recursive call: add the current letter to the combination and proceed to the next digit
            backtrack(output, digits, current + letter, index + 1, digitToLetters);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        LetterCombinations comb = new LetterCombinations();
        List<String> results = comb.letterCombinations("23");
        // Print the generated combinations
        for (String s : results) {
            System.out.println(s);
        }
    }
}

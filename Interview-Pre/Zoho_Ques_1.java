import java.util.Scanner;
public class Zoho_Ques_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        // Convert the input string into a character array.
        char[] chars = input.toCharArray();
        // Create a new string builder to store the output string.
        StringBuilder output = new StringBuilder();
        // Iterate over the character array and append the appropriate number of characters to the output string.
        for (char c : chars) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                for (int i = 0; i < num; i++) {
                    output.append(chars[chars.length - 2]);
                }
            } else {
                output.append(c);
            }
        }
        // Print the output string to the console.
        System.out.println("Output: " + output.toString());
    }
}

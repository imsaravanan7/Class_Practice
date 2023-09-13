import java.util.Scanner;
public class Zoho_Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input string
        String str = sc.nextLine();
        // Create a new string to store the output
        String output = "";
        // Iterate over the input string
        for (int i = 0; i < str.length(); i++) {
            // Add the current character to the output string
            output += str.charAt(i);
            // Add a space to the output string
            output += " ";
            // Add the current character to the output string again
            output += str.charAt(i);
            // Add a newline character to the output string
            output += "\n";
        }
        // Print the output string
        System.out.println(output);
    }
}

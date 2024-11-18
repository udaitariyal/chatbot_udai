import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Hello! I am a simple chatbot. Type 'exit' to end the chat.");

        // Main loop to keep the chatbot running
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            // Exit condition
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Simple responses based on user input
            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    // Method to generate responses based on user input
    private static String getResponse(String input) {
        input = input.toLowerCase(); // Convert input to lower case for easier matching

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a program, but thanks for asking!";
        } else if (input.contains("what is your name")) {
            return "I am a simple chatbot created in Java.";
        } else if (input.contains("help")) {
            return "Sure! What do you need help with?";
        } else {
            return "I'm sorry, I don't understand that.";
        }
    }
}
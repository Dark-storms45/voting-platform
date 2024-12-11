package utility;

public class Diplay {

    public static void displayBox(String text) {
        int textLength = text.length(); // Get the length of the text
        int paddingSize = 4; // Set padding size
        int boxWidth = textLength + paddingSize * 2; // Calculate the width of the box

        // Print the top border
        for (int i = 0; i < boxWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Print the padding
        System.out.print("|");
        for (int i = 0; i < paddingSize; i++) {
            System.out.print(" ");
        }
        System.out.print(text); // Print the text

        // Print the rest of the padding
        for (int i = 0; i < paddingSize; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        // Print the bottom border
        for (int i = 0; i < boxWidth; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}

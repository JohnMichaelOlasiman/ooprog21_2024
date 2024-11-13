import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        SpoonerismGenerator spoonerizer = new SpoonerismGenerator();
        int userOption;

        do {
            spoonerizer.run();
            System.out.println("\nWant to try again? (1)Yes (2)No");
            userOption = inputScanner.nextInt();
            inputScanner.nextLine();
        } while (userOption == 1);
    }

    public void run() {
        String wordOne = getWord("Word 1: ");
        String wordTwo = getWord("Word 2: ");
        
        int vowelPosOne = vowelIndex(wordOne);
        int vowelPosTwo = vowelIndex(wordTwo);

        if (vowelPosOne == -1 || vowelPosTwo == -1) {
            System.out.println("\n" + wordOne + " and " + wordTwo + " are not good words to spoonerize.");
            return;
        }

        String spoonerizedOne = wordTwo.substring(0, vowelPosTwo) + wordOne.substring(vowelPosOne);
        String spoonerizedTwo = wordOne.substring(0, vowelPosOne) + wordTwo.substring(vowelPosTwo);

        System.out.println("\n" + wordOne + " and " + wordTwo + " spoonerized are " + spoonerizedOne + " " + spoonerizedTwo);
    }

    private String getWord(String promptText) {
        Scanner wordScanner = new Scanner(System.in);
        System.out.print(promptText);
        return wordScanner.nextLine().toLowerCase();
    }

    private int vowelIndex(String text) {
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (isVowel(letter)) {
                if (i == 0) {
                    return -1;
                }
                return i;
            }
        }
        return -1;
    }

    private boolean isVowel(char vowelChar) {
        return "aeiou".indexOf(Character.toLowerCase(vowelChar)) != -1;
    }
}

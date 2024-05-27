public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "this is a sample string to capitalize";
        String capitalizedString = capitalizeWords(input);
        System.out.println(capitalizedString);
    }

    public static String capitalizeWords(String input) {
        StringBuilder result = new StringBuilder();
        // Split the input string by spaces
        String[] words = input.split("\\s+");
        for (String word : words) {
            // Capitalize the first letter of each word and append to result
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        // Convert StringBuilder to String and trim trailing whitespace
        return result.toString().trim();
    }
}




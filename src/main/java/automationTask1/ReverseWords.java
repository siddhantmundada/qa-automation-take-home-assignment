package automationTask1;

public class ReverseWords {

	public static void main(String[] args) {
		String input = "Today is Monday";
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reverseWords(input));
	}

	public static String reverseWords(String input) {

		if (input == null || input.trim().isEmpty()) {
			return input;
		}

		String[] words = input.trim().split("\\s+");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);

			if (i != 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}
}
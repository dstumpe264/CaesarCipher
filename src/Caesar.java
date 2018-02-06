import java.util.Scanner;

public class Caesar {
	public static void main(String[] args) {

		// The user is asked if he would like to encrypt or decrypt a word
		System.out.print("Would you like to encrypt or decrypt?(Enter 'e' or 'd) ");
		Scanner kb = new Scanner(System.in);
		String input = kb.next();
		char c = input.charAt(0);
		while (c != 'e' && c != 'E' && c != 'd' && c != 'D') {
			System.out.println("ERROR: Please enter a 'e' or 'd'.");
			input = kb.next();
			c = input.charAt(0);
		}
		Cipher decoder = new Cipher();

		// The user is now prompted to input the word in a question
		System.out.print("What is the word? ");
		String phrase = kb.nextLine();
		phrase = kb.nextLine();

		// The user is now asked by what shift amount they would like to encrypt or
		// decrypt the word.
		System.out.print("How much would you like to shift?(1-26): ");
		int shift = kb.nextInt();

		// the word is then displayed in its encrypted or decrypted state depending on
		// the selection in step 1.
		if (c == 'e' || c == 'E') {
			decoder.encrypt(phrase, shift);
		} else {
			decoder.decrypt(phrase, shift);
		}
		kb.close();

		// can you decipher the message "or fher gb qevax lbhe binygvar" with a shift of
		// 13? be sure drink your ovaltine
	}

}

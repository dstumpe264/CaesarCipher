
public class Cipher {

	public char shiftLetter(char c, int shift) {
		int u = c;

		if (!Character.isLetter(c)) {
			return c;
		}

		u = u + shift;
		if (Character.isUpperCase(c) && u > 'Z' || 
			Character.isLowerCase(c) && u > 'z') {
			u -= 26;
		}
		if (Character.isUpperCase(c) && u < 'A' || 
			Character.isLowerCase(c) && u < 'a') {
			u += 26;
		}
	
		return (char) u;
	}
	
	
	public void encrypt(String phrase, int shift) {
		String code = "";
		for (int i = 0; i < phrase.length(); i++) {
			 code += shiftLetter(phrase.charAt(i), shift);	
		}
		System.out.println(code);
	}
	public void decrypt(String phrase, int shift) {
		String code = "";
		for (int i = 0; i < phrase.length(); i++) {
			 code += shiftLetter(phrase.charAt(i), 26-shift);	
		}
		System.out.println(code);
	}
}

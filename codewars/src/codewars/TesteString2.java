package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteString2 {

	public static void main(String[] args) {

		String s = "abcde";
		if (s.length() % 2 != 0)
			s = s + '_';
		char[] letras = new char[s.length()];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = s.charAt(i);
		}
//		System.out.println(Arrays.toString(letras));
		String[] answer = new String[s.length() / 2];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < letras.length; j++) {
				answer[i] = String.valueOf(letras[j]) + String.valueOf(letras[j + 1]);
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}

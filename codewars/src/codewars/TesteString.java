package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteString {

	public static void main(String[] args) {

		String s = "abcde";
		if (s.length() % 2 != 0)
			s = s + '_';
		String[] answer = new String[s.length() / 2];
		for (int i = 0; i < s.length(); i += 2) {
			for (int j = 0; j < answer.length; j++) {
				String sub = s.substring(i, i + 2);
				answer[j] = sub;
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}

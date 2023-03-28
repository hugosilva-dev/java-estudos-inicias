package codewars;

import java.util.ArrayList;

/**
 * @author hugou Kata: SplitStrings (6kyu):
 * 
 *         Conclua a solução para que ela divida a string em pares de dois
 *         caracteres. Se a string contiver um número ímpar de caracteres, ela
 *         deverá substituir o segundo caractere ausente do par final por um
 *         sublinhado ('_').
 *
 *         Ex.: 'abc' => ['ab', 'c_']; 'abcdef' => ['ab', 'cd', 'ef'].
 *
 */
public class SplitStrings {

	public static void main(String[] args) {

		String s = "abcde";
		ArrayList<String> pair = new ArrayList<>();
		if (s.length() % 2 != 0)
			s = s + '_';
		for (int i = 0; i < s.length(); i += 2) {
			String sub = s.substring(i, i + 2);
			pair.add(sub);
		}
		for (int i = 0; i < pair.size(); i++) {
			System.out.print("'" + pair.get(i) + "'" + " ");
		}
	}
}

//System.out.println(sub);
//System.out.print("'" + sub + "'" + " ");
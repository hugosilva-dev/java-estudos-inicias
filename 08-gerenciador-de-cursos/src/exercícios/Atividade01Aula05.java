package exercícios;

import java.util.HashSet;
import java.util.Set;

public class Atividade01Aula05 {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
//		alunos.forEach(aluno -> {System.out.println(aluno);
//		});
	}

}

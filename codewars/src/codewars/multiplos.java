package codewars;

public class multiplos {
	// Crie uma função com dois argumentos que retornem um vetor com os primeiros "n" multiplos de "x"
	
	public static void main(String[] args) {
		int variavel = 10;
		int n = 1;
		int resultado = 0;
		
		while(n<=9) {
			resultado = variavel*n;
			n++;
			System.out.print(resultado + " ");		
		}
		
	}

}

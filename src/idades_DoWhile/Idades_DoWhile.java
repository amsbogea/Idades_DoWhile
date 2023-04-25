package idades_DoWhile;

import java.util.Scanner;

public class Idades_DoWhile {

	public static void main(String[] args) {
		
		int idade,somaIdade, cont;
		
		double mediaIdade;
		
		Scanner input = new Scanner(System.in);
		
		somaIdade = 0;
		cont = 0;
		
		do {
			System.out.println("Digite uma idade:");
			idade = input.nextInt();
			somaIdade = somaIdade + idade;
			cont = cont + 1;
			
		} while (idade != 0);
		
		mediaIdade = somaIdade / (cont-1);
		System.out.println("A média das idades é, " + mediaIdade);
		
		input.close();
	}

}

package ARRAYS;

import java.util.Scanner;


public class Tarefa1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores 
		 * de ontua��o de uma atividade e o escreva em seguida. Encontre 
		 * ap�s a maior pontua��o e a apresente
		 */
		Scanner leia = new Scanner(System.in);
		int valores[] = new int [5];
		int maiorPontuacao =0;
		/*
		System.out.println(" Digite o Valor 1: ");
		valores [0] = leia.nextInt();
		System.out.println(" Digite o Valor 2: ");
		valores [1] = leia.nextInt();
		System.out.println(" Digite o Valor 3: ");
		valores [2] = leia.nextInt();
		System.out.println(" Digite o Valor 4: ");
		valores [3] = leia.nextInt();
		System.out.println(" Digite o Valor 5: ");
		valores [4] = leia.nextInt();
		*/
		
		for (int y=0;y<valores.length; y++) {
			System.out.println(" Digite o valor " + (y+1)+ " :");
			valores [y]= leia.nextInt();
		}
		
		for (int y=0; y<valores.length; y++) {
			System.out.println(" O Valor " +y+1 + " � "+valores[y]);
			if (valores[y] > maiorPontuacao) {
				maiorPontuacao = valores[y];
			}
		}

		System.out.printf(" A maior pontua��o � %d", maiorPontuacao);
}
}

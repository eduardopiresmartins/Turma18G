package LacoDeDecisao;


import java.util.Scanner;

public class Exercicio1 {
	/* EDUARDO PIRES MARTINS - GENERATION BRASIL - TURMA 18
	 *PROJETO:
	 *1- Fa�a um programa que receba tr�s inteiros 
	 *e diga qual deles � o maior.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		int numero2 = sc.nextInt();
		System.out.print("Digite mais um n�mero inteiro: ");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero2 >= numero3) {
			System.out.println("O maior n�mero digitado foi o 1o. n�mero: " + numero1);
		}	
		else if (numero2 > numero1 && numero1 >= numero3) {
			System.out.println("O maior n�mero digitado foi o 2o. n�mero: " + numero1);
		}
		else {
			System.out.println("O maior n�mero digitado foi o 3o. n�mero: " + numero3);
		}
		sc.close();
	}
}
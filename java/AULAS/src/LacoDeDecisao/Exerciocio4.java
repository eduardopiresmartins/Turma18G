package LacoDeDecisao;



import java.util.Scanner;

public class Exerciocio4 {

	/* EDUARDO PIRES MARTINS - GENERATION BRASIL - TURMA 18
	 *PROJETO:
	 * 4- Fa�a um programa em que permita a entrada de um 
	 * n�mero qualquer e exiba se este
	 * n�mero � par ou �mpar. Se for par exiba tamb�m 
	 * a raiz quadrada do mesmo; se for
	 * �mpar exiba o n�mero elevado ao quadrado.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int numero = 0;
		System.out.print("Digite um n�mero real inteiro para saber se � par ou �mpar: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			if ( numero < 0) {
				System.out.println("O n�mero " + numero + ", � par e negativo.");
				System.out.println("E ele n�o possu� ra�z quadrada por ser negativo");
			}
			else {
				System.out.println("O n�mero " + numero + ", � par e positivo.");
				System.out.println("E sua ra�z quadrada �: " + Math.sqrt(numero));
			}
		}
		else if (numero % 2 != 0) {
			if ( numero < 0) {
				System.out.println("O n�mero " + numero + ", � �mpar e negativo.");
				System.out.println("E o seu quadrado vale: " + Math.pow(numero, 2));
			}
			else {
				System.out.println("O n�mero " + numero + ", � �mpar e positivo.");
				System.out.println("E o seu quadrado vale: " + Math.pow(numero, 2));
			}
		}
		sc.close();
	}
}
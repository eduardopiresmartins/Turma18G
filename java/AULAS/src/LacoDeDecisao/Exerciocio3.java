package LacoDeDecisao;


import java.util.Scanner;


public class Exerciocio3 {

	/* EDUARDO PIRES MARTINS - GENERATION BRASIL - TURMA 18
	 *PROJETO:
 * 3- Fa�a um programa que receba a idade de uma 
 * pessoa e mostre na sa�da em qual
   categoria ela se encontra:
	.10-14 infantil
	. 15-17 juvenil
	. 18-25 adulto*/

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Digite sua idade: ");
	int idade = sc.nextInt();
	if (idade < 10 && idade > 25) {
		System.out.println("Voc� n�o digitou uma idade v�lida. Tente novamente");
	}
	else if (idade >= 10 && idade <= 14) {
		System.out.println("Voc� est� na categoria INFANTIL: 10 - 14 anos");
	}
	else if (idade >= 15 && idade <= 17) {
		System.out.println("Voc� est� na categoria JUVENIL: 15 - 17 anos");
	}
	else if (idade >= 18 && idade <= 25) {
		System.out.println("Voc� est� na categoria ADULTO: 15 - 17 anos");
	}
	sc.close();
}

}
package LISTA1;

import java.util.Scanner;

public class Tarefa1 {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anosIdade;
		int mesesIdade;
		int diasIdade;

		
		System.out.print("Favor informar anos da pessoa: ");
		anosIdade = leia.nextInt();
		System.out.print("Favor informar os meses da pessoa: ");
		mesesIdade = leia.nextInt();
		System.out.print("Favor informar os dias da pessoa: ");
		diasIdade = leia.nextInt();
		
		System.out.println("Sua idade em dias é: " + (diasIdade + (anosIdade*365 + (mesesIdade*30))));
		leia.close();
		

		}
		
	}


package LISTA1;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int idadeemDias;
		
		System.out.print("Favor informar sua idade em dias: ");
		idadeemDias = leia.nextInt();
		
		System.out.println((idadeemDias / 365) + " ano(s), " + (idadeemDias % 365 / 30) + " mes(es), " + (idadeemDias % 365 % 30) + " dias ");
		

		
		
		leia.close();
	}
}
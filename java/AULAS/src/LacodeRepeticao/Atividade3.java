package LacodeRepeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
public class Atividade3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = 0;
		int menores21 = 0;
		int maiores50 = 0;
		
		while(idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) 
			{
				menores21++;
			}
			else if(idade > 50)
			{
				maiores50++;
			}
		}
		
		System.out.printf("Pessoas menores de 21 anos: %d \n",menores21 - 1); //coloquei o " - 1" para não contar o " -99 " nos menores de 21 anos.
		System.out.printf("Pessoas maiores de 50 anos: %d \n",maiores50);
	}
	
}
package ARRAYS;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int lancamentos []= new int [3];
		double mediaAritimetica=0.00; 
		double somaValores=0.00;
		int maiorPontuacao;
		int contadorMaiorPontuacao = 0;
		
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("Digite o resultado do lançamento %d :", x+1);
			lancamentos[x]=leia.nextInt();
	}
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("O valor do lançamento %d é %d \n", x+1, lancamentos[x]);
			somaValores = somaValores+lancamentos[x];
			
		}
		
		mediaAritimetica = somaValores / lancamentos.length;
		
		
		System.out.printf("Total de lançamentos digitados: %0.f \n", somaValores);
		System.out.printf("A média é %2.f \n", mediaAritimetica);
		
		
		
		
		
	}
	
}
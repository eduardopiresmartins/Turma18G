package LacodeRepeticao;


import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int numero = 0;
			int par = 0;
			int impar = 0;
			int contador = 0;
			
				for(contador = 1; contador <=10; contador++) {
					System.out.print("Digite um numero: ");
					numero = ler.nextInt();
					
					if(numero %2 == 0) 
					{
						par++;
					}	
					else 
					{
						impar++;
					}
				}
			
			System.out.printf("Quantidade de números pares: %d \n",par);
			System.out.printf("Quantidade de números pares: %d ",impar);
		}
	}
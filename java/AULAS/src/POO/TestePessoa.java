package POO;

import java.util.Scanner;


public class TestePessoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String agenda [][] = new String [25][31];
		int hora = 0;
		int dia = 0;
		int opcao = 0;
		int atividade = 0;

			do
			{
	            System.out.println("Minha agenda");
	            
	
	            System.out.print("Digite o dia em número [1-30] ");
	            dia = ler.nextInt();
	
	            //dia += dia - 1;
	
	            System.out.print("Digite a hora [0-24] ");
	            hora = ler.nextInt();
	
	            System.out.print("Digite sua anotacao: ");
	            agenda[hora][dia] = ler.next();
	
	            System.out.print("Desenja continuar? [1 Sim] ou [0] - Nao] ");
	            opcao = ler.nextInt();
			}while(opcao == 1);
			
			for (dia = 0; dia < 31; dia++) //giro dos dias 
			{
				for (hora = 0; hora < 24; hora++) //giro das horas
				{
					if(agenda[hora][dia] != "") 
					{
						System.out.printf("Dia: %d hora: %d %s",(dia +1),hora,agenda[hora][dia]);
						System.out.println();
						atividade++;
					}
	            }
					
			}
			
		System.out.printf("\nTotal de atividades cadastradas: %d",atividade);	
	}
}

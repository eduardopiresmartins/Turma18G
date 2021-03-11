package LacodeRepeticao;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
 */
public class Atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int pessoas = 0;
		int idade;
		int genero;
		int masculino1;
		int feminino2;
		int outros3;
		int estado;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40 = 0;
		int pessoasNervosasMenos18 = 0;
		
		while(pessoas < 150){
			
			/*
			 * (1-feminino / 2-masculino / 3-Outros), e as opções
(1 calma; 2,  nervosa e 3, agressiva)
			 */
			
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			System.out.println("Informe o genero: [1 Feminino] [2 Masculino] [3 outros] : ");
			genero = ler.nextInt();
			System.out.println("Informe o estado de espírito: [1 calma] [2 nervosa] [3 agressiva] : ");
			estado = ler.nextInt();
			
				if(estado == 1) 
				{
					pessoasCalmas++;
				}
				if(genero == 1 && estado == 2) 
				{
					mulheresNervosas++;
				}
				if(genero == 2 && estado == 3)
				{
					homensAgressivos++;
				}
				if(genero == 3 && estado == 1)
				{
					outrosCalmos++;
				}
				if(estado == 2 && idade > 40)
				{
					pessoasNervosasMais40++;
				}
				if(estado == 2 && idade < 18)
				{
					pessoasNervosasMenos18++;
				}
			
			
			pessoas++;
			
		}
		System.out.printf("Quantidade de pessoas calmas: %d \n",pessoasCalmas);
		System.out.printf("Quantidade de mulheres nervosas: %d \n",mulheresNervosas);
		System.out.printf("Quantidade de homens agressivos: %d \n",homensAgressivos);
		System.out.printf("Quantidade de outros calmos: %d \n",outrosCalmos);
		System.out.printf("Quantidade de pessoas nervosas com mais de 40 anos: %d \n",pessoasNervosasMais40);
		System.out.printf("Quantidade de pessoas nervosas menores de 18 anos: %d \n",pessoasNervosasMenos18);
	}
}
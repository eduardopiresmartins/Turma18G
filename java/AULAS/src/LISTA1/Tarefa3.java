package LISTA1;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos;
		
		 System.out.println("Digite a dura��o do evento em segundos: ");
		 segundos = leia.nextInt();
		 
		   System.out.println(" A dura��o do evento foi de " + (segundos / 3600) + " horas, " + ((segundos % 3600) / 60) + " minutos, " + ((segundos % 3600) % 60) + " segundos. " );
		    
		    
		   
		
		leia.close();

	}

}

package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*

		 */
		
		 Random valor = new Random();
		    int n1[][] = new int[4][6];
		    int n2[][] = new int [4][6];
		    int m1[][] = new int [4][6];
		    int m2[][] = new int [4][6];

		    for(int x=0; x<4;x++) {
		        for (int y=0; y<6; y++) {
		            n1[x][y]= valor.nextInt(10)+1;
		            n2[x][y]= valor.nextInt(10)+1;

		        }
		    }
		    for (int x=0; x<4; x++) {
		        for (int y=0; y<6; y++) {
		            m1[x][y] = n1[x][y] + n2[x][y];
		            m2[x][y] = n1[x][y] - n2[x][y];

		        }
		    }
		    System.out.println(" Matriz N1");
		     for (int x=0; x<4;x++) {
		        for(int y=0;y<6;y++) {
		            System.out.print(n1[x][y]);
		        System.out.print(" ");

		        }
		        System.out.println();

		     }
		     System.out.println();
		     System.out.println(" Matriz N2");
		     for (int x=0; x<4;x++) {
		        for(int y=0;y<6;y++) {
		            System.out.print(n2[x][y]);
		        System.out.print(" ");

		        }
		        System.out.println();

		     }
		     System.out.println();
		     System.out.println(" Matriz M1");
		     for (int x=0; x<4;x++) {
		        for(int y=0;y<6;y++) {
		            System.out.print(m1[x][y]);
		        System.out.print(" ");

		        }
		        System.out.println();

		     }
		     System.out.println();
		     System.out.println(" Matriz M2");

		     for (int x=0; x<4;x++) {
		        for(int y=0;y<6;y++) {
		            System.out.print(m2[x][y]);
		        System.out.print(" ");

		        }
		        System.out.println();

		     }
		     System.out.println();

		    }

		    }

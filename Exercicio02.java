package br.com.generation.lacosrepeticao0507;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		int par = 0 , impar = 0;
		
		for(int contador = 1; contador<=10; contador++) {
			System.out.println("Informe um n�mero: ");
			numero = read.nextInt();
			if(numero%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("A quantidade de n�meros escolhidos pares s�o: "+ par);
		System.out.println("A quantidade de n�meros escolhidos impares s�o: " + impar);
		
		read.close();
		}
}
		
		
		


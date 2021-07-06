package br.com.generation.lacosrepeticao0507;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int soma = 0, numero = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			soma += numero;
		}
		while (numero != 0);
		System.out.println("soma: "+soma);
		
		read.close();
	}
}
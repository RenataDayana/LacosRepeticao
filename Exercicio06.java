package br.com.generation.lacosrepeticao0507;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double numero, quantidadeNumeros = 0.0, total = 0.0;
		
		while(true) {
			System.out.print("Digite um número: ");
			numero = read.nextDouble();
			
			if(numero == 0) {
				break;
			}

			if(numero % 3 == 0) {
				quantidadeNumeros++;
				total += numero;
			}
		}
		
		System.out.println("Média: " + (total / quantidadeNumeros));
		
		read.close();
	}
}	
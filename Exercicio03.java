package br.com.generation.lacosrepeticao0507;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int menos21 = 0, mais50 = 0, idade=0;
		
		while(idade != 99) {
			System.out.println("Digite a idade: ");
			idade = read.nextInt();
			
			if(idade<21) {
				menos21++;
			}
			else if (idade>50) {
				mais50++;
			}
				
		}
			System.out.println("O número de pessoas com menos de 21 anos é: "+ menos21);
			System.out.println("O número de pessoas com mais de 50 anos é: "+ mais50);
			
			read.close();
	}
	
}
	

			
		
	

			
		
	



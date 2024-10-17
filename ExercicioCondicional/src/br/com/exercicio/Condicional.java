package br.com.exercicio;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número positivo ou negativo:");
		num = sc.nextInt();
		
		if ( num < 0){ 
			System.out.println("Este número é negativo!");
			
		}
		else {
			System.out.println("Este número é positivo!");
			
		}
		
		
		
		
		
		sc.close();
	}
	
}

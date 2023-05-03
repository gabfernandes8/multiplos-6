package br.senai.sp.jandira;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2;
		int maior, menor;
		
		System.out.println("******************************");
		System.out.println("        MÚLTIPLOS DE 6        ");
		System.out.println("******************************");
		System.out.println("");
		
		System.out.println("Digite o primeiro valor.");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor.");
		valor2 = teclado.nextInt();
		
		if (valor1 < valor2) {
			menor = valor1;
			maior = valor2;
		} else {
			maior = valor1;
			menor = valor2;
		}
		
		while (menor <= maior) {
			if (menor % 6 == 0) {
				System.out.println(menor);
			}
			menor++;
		}
		
	}

}

package br.com.generation.entrega3.matrizvetor;

import java.util.Scanner;

/*
 * Projeto: Ex 2 - Arrays
 * Nome: D�lis Edwirges
 * Data: 07/06/2021
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
 */
public class Ex2arrays {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[6];
		int somapar = 0, quantimpar = 0, i = 0;
		System.out.println("Entre com os valores: ");
		for (; i < 6; i++) {
			vetor[i] = ler.nextInt();
		}
		System.out.println("Valores par: ");
		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				somapar += vetor[i];
				System.out.printf(vetor[i] + ", ");
			}
		}
		System.out.println("\nValores impar: ");
		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 1) {
				System.out.printf(vetor[i] + ", ");
				quantimpar++;
			}
		}
		System.out.println("\nSomat�rio de n�meros pares: " + somapar);
		System.out.println("A quantidade digitada de n�meros impares: " + quantimpar);
	}
}

package br.com.generation.entrega3.matrizvetor;

import java.util.Scanner;

/*
 * Projeto: Ex 3 - Arrays
 * Nome: Délis Edwirges
 * Data: 07/06/2021
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
public class Ex3arrays {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int cont = 0;
		for (int l = 0; l < matriz.length; l++) {// percorre a linha
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite os valores de [%d] [%d]: ", l, c);
				matriz[l][c] = ler.nextInt();
			}
		}

		for (int l = 0; l < matriz.length; l++) {// percorre a linha
			for (int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] > 10) {
					cont++;
				}
			}
		}
		System.out.println("\nE sua quantidade é: " + cont);
	}
}

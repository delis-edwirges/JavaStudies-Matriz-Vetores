package br.com.generation.entrega3.matrizvetor;
import java.util.Scanner;
/*
 * Projeto: Ex 1 - Arrays
 * Nome: D?lis Edwirges
 * Data: 07/06/2021
 * 1- Fa?a um programa que possua um vetor denominado A que armazene 6 n?meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari?vel inteira (simples) a soma entre os valores das posi??es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi??o 4, atribuindo a esta posi??o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 * 
 */
public class Ex1arrays {
	public static void main(String[] args) {
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		int soma = (A[0] + A[1] + A[5]);
		System.out.println("A soma dos valores [0], [1] e [5] s?o: " + soma);
		System.out.println("Os vetores s?o: ");
		for (int i = 0; i < A.length; i++) {
			A[4] = 100;
			System.out.printf(A[i] + ", ");
		}
	}
}

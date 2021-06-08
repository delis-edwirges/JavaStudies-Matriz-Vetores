package br.com.generation.entrega3.matrizvetor;

import java.util.Scanner;

/*
 * Projeto: Ex 4 - Arrays
 * Nome: Délis Edwirges
 * Data: 07/06/2021
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
	(1) somar as duas matrizes 
	(2) subtrair a primeira matriz da segunda 
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes 
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 * 
 */
public class Ex4arrays {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[][] m1 = new double[2][2];
		double[][] m2 = new double[2][2];
		double[][] m3 = new double[2][2];

		int menu;
		double constante;
		System.out.println("Insira o valor da primeira matriz 2 x 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d]: ", l, c);
				m1[l][c] = ler.nextDouble();
			}
		}
		System.out.println("Insira o valor da segunda matriz 2 x 2: ");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d]: ", l, c);
				m2[l][c] = ler.nextDouble();
			}
		}
//------------------------------------------------------------------------------------------
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Escolha uma das alternativas a seguir: ");
		System.out.println("-------------------------------------------------------");
		System.out.println(
				"ESCREVA 1 para SOMAR as duas matrizes" + "\nESCREVA 2 para SUBTRAIR a primeira matriz da segunda"
						+ "\nESCREVA 3 para ADICIONAR uma constante as duas matrizes"
						+ "\nESCREVA 4 para IMPRIMIR as matrizes");
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		menu = ler.nextInt();
//--------------------------------------------------------------------------------
		if (menu == 1) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m3[l][c] = m1[l][c] + m2[l][c];
				}
			}

			System.out.println("\nO resultado da soma de (m1 + m2) é: ");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m3[l][c]);
				}
				System.out.println();// pular espaço p ficar como matriz
			}
		} 
//----------------------------------------------------------------------------
		else if (menu == 2) {
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m3[l][c] = m2[l][c] - m1[l][c];
				}
			}
			System.out.println("\nO resultado da subtração de (m2 - m1) é: ");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m3[l][c]);
				}
				System.out.println();// pular espaço
			}
		}
//--------------------------------------------------------------------
		else if (menu == 3) {
			System.out.println("Digite a constante: ");
			constante = ler.nextDouble();
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] += constante;
					m2[l][c] += constante;
				}
			}
			System.out.println("\nA matriz resultante da adição da constante é: ");
			System.out.println("Matriz 1:");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();//espaço
			}
			System.out.println("\nMatriz 2:");
			for (int l = 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println(); // espaço
			}
		}
//-----------------------------------------------------------------------------
			else if (menu == 4) {
				System.out.println("Matriz 1:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m1[l][c]);
					}
					System.out.println();//espaço
				}
				System.out.println("\nMatriz 2:");
				for(int l=0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("\t %.2f \t", m2[l][c]);
					}
					System.out.println();//espaço p matriz
				}
			}
//------------------------------------------------------------------------------
			else {
				System.out.println("Alternativa inválida! Tente novamente.");
			}
//----------------------------------------------------------------------------end
	}
}

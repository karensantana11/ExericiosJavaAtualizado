package Aula4;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		int elementos = 3;
		int matrizNum[][] = new int[elementos][elementos];
		int contador = 1;
		int somaPrincipal = 0, somaSecundaria = 0;
		

		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < matrizNum.length; linha++) {
			for (int coluna = 0; coluna < matrizNum[linha].length; coluna++) {
				matrizNum[linha][coluna] = contador;
				contador++;
			}
		}

		for (int linha = 0; linha < matrizNum.length; linha++) {
			for (int coluna = 0; coluna < matrizNum[linha].length; coluna++) {
				System.out.print(matrizNum[linha][coluna] + " , ");
			}
			System.out.println();
		}
		
		System.out.println("Elementos da Diagonal principal");
		for(int linha = 0; linha < matrizNum.length; linha++) {
			System.out.print(matrizNum[linha][linha] + " , ");
			somaPrincipal+= matrizNum[linha][linha];
		
			
		} 
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		
		
		System.out.println("\nElementos da Diagonal secundária");
		for(int linha = 0; linha < matrizNum.length; linha++) {
			for(int coluna = matrizNum.length-1; coluna >= 0;coluna-- ) {
				System.out.print(matrizNum[linha][coluna] + " , ");
				somaSecundaria+= matrizNum[linha][coluna];
				linha++;
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSecundaria);
		
		
	}
}

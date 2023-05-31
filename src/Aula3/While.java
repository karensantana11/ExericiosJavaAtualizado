package Aula3;

import java.util.Scanner;


public class While {

			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				
				int idade = 0, Menor21 = 0, Maior50 = 0;
			
				
				 while (idade >= 0) {
					 
					 if (idade < 21 && idade > 1) {
			                Menor21++;
			            } else if (idade > 50) {
			                Maior50++;
			         }
					 System.out.println("Digite a idade:");
					 idade = leia.nextInt();
					 
				 if (idade < 0) {
					System.out.println("Total de pessoas menores de 21 anos: " + Menor21 );
					System.out.println("Total de pessoas maiores de 50 anos: " + Maior50);
				 	}
				}
			}
	

	}


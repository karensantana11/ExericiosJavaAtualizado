package Aula2;

import java.util.Scanner;

public class Exercicio1 {
	

		public static main(Strings[] args) {
		Scanner ler = new Scanner(System.in);
		int num, a, b, c;
					
			
		System.out.println("Digite a número A: ");	
		a = ler.nextInt();
		      
	    System.out.println("Digite o número B");
	    b = ler.nextInt();
		    		  
        System.out.println("Digite o número C");
		 c = ler.nextInt();
		      
	     num = (a + b);
		    	    		  
		 if( num < c ) {
		 System.out.println("A soma de A + B é menor que C");
		    
		   }					
	      if(num > c) {
	      System.out.println("A soma de A + B é maior que C");
	        	  
	       }
	          
	       if(num == c) {
	    System.out.println("A soma de A + B é igual que C");
	          
		      


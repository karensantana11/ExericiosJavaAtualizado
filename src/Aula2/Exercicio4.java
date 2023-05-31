package Aula2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	 Scanner = leia - new Scanner(System.in);
	String caracteristica1, caracteristica2,caracteristica3, caracteristica4;
	
	System.out.println("Digite as caracteristicas do animal (vertebrado/invertebrado");
     caracteristica1 = leia.next();
     System.out.println("Digite as caracteristicas ave/mamifero/inseto/anelídeo");
     caracteristica2 = leia.next();
     System.out.println("Digite as caracteristicas carnívoro/onívoro/herbívoro/hematófago");
     caracteristica3 = leia.next();
     
     
     if (caracteristica1.equalsIgnoreCase("vertebrado")){
    	 if (caracteristica2.equalsIgnoreCase("ave")) {
    		if (caracteristica3.equalsIgnoreCase("carnivoro")) { 
    		 System.out.println ("Àguia");
    		 
    		}else {
    			System.out.println ("pombo");
    		}
    	 }else {
    		 if (caracteristica2.equalsIgnoreCase("onívoro")) {
    			 System.out.println("pessoa");
    		 }else {
    			 System.out.println("vaca");
    		 }
    	 }
     } else	{
    	 
    		
    		}
    		 
    		 
    	 }
 
	}


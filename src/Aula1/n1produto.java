package Aula1;
import java.util.Scanner;
public class n1produto {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
	}
	Scanner escute = new Scanner (System.in);
	
	System.out.println("Digite o número 1");
	n1 = escute.nextFloat();
	System.out.println("Digite o número 2");
	n2 = escute.nextFloat();
	System.out.println("Digite o número 3");
	n3 = escute.nextFloat();
	System.out.println("Digite o número 4");
	n4 = escute.nextFloat();
	
	diferenca = (n1*n2) - (n3*n4);
	
	System.out.printf("Esse é o valor da diferença: %.1f" + diferenca);
package Aula1;
import java.util.Scanner;
public class AbonoSalario {

			public static void main(String[] args) {
	
	
				float salario, abono, salarioFinal;
				
		     	Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite o salário");
				
				salario = leia.nextFloat();
				
				System.out.println("Digite o abono");
				
				abono = leia.nextFloat();
			
				
				salarioFinal = salario + abono;
				
				System.out.println("esse é o salario final: " + salarioFinal);

	}

}

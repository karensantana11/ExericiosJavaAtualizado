package Aula1;

import java.util.Scanner;
public class SalarioBruto {

	public static void main(String[] args) {
	float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario Bruto");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional Noturno");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os descontos");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("Este é o Salário Líquido: " + salarioLiquido);
		

	}

}

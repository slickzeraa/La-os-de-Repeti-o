package exercícios08_12_2023;

import java.util.Scanner;

public class exerc1For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador, num1, num2;
		
		System.out.println("Digite 2 números inteiros,"
				+ "onde o primeiro número deve ser menor do que o segundo número. ");
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número");
		num2 = leia.nextInt();
		if(num1>num2) {
			System.out.println("\nIntervalo inválido!");
		}else {
			System.out.println("\nNo intervalo de "+num1+" e "+num2+":");
		}
		
		for(contador= num1; contador <=num2; contador++) {
			if(contador %3 ==0 && contador%5 ==0) {
				System.out.println(contador+" é multiplo de 3 e 5"); 
			}
	
		}
		
}
}


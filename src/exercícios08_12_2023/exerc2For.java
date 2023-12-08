package exercícios08_12_2023;

import java.util.Scanner;

public class exerc2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador, num;
		int par=0, impar=0;
		
		System.out.println("Digite 10 números inteiros: ");
		
		for(contador=1; contador <=10; contador++) {
			System.out.println("\nDigite o "+ contador+"º número: ");
			num=leia.nextInt();
			if(num % 2 ==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Total de números pares: "+par); 
		System.out.println("Total de números ímpares: "+impar); 
	}

}

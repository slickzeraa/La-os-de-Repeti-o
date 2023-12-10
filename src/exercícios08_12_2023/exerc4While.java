package exercícios08_12_2023;

import java.util.Scanner;

public class exerc4While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, genero, categoria , back=0, front=0, mobile=0, fullstack=0, cont=0, media=0, soma=0;
		String continua = "S";
		
		while (continua.equals("S")) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			System.out.println("Digite a Identidade de Gênero: (1 – Mulher Cis/2 – Homem Cis/3 – Não Binário"
					+ "4 – Mulher Trans 5 – Homem Trans 6 – Outros): ");
			genero = leia.nextInt();
			
			while(genero < 1 || genero >6) {
				System.out.println("Digite a Identidade de Gênero: (1 – Mulher Cis/2 – Homem Cis/3 – Não Binário"
						+ "4 – Mulher Trans 5 – Homem Trans 6 – Outros): ");
				genero = leia.nextInt();
				
			}
			
			System.out.println("Digite a categoria..");
			System.out.println("(1-Backend/2-Frontend/3-Mobile/4-FullStack): ");
			categoria = leia.nextInt();
			
			while (categoria < 1 || categoria > 4) {
				System.out.println("Digite a categoria..");
				System.out.println("(1-Backend/2-Frontend/3-Mobile/4-FullStack): ");
				categoria = leia.nextInt();
			}
			
			
			
			if (categoria == 1) {
                back++;
			}
			
			if (categoria == 2 && genero == 1 || genero == 4 ) {
				front++;
			}
			
			if (categoria == 3 &&  idade > 40 && genero == 2 || genero == 5 ) {
				mobile++;
			}
			
			if (categoria == 4 && genero == 3 && idade < 30) {
				fullstack++;
			}
			
			cont++;
			
			soma += idade;
			
			System.out.println("Deseja Continuar (S/N)?");
			leia.nextLine();
			continua = leia.nextLine().toUpperCase();
				
		}
		
		media = soma / cont;
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend:" + front);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + fullstack);
		System.out.println("\nO número total de pessoas que responderam à pesquisa:" + cont);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " + media);

	}

}
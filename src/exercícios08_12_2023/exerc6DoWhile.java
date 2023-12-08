package exercícios08_12_2023;

import java.util.Scanner;


public class exerc6DoWhile{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, soma=0, contador = 0;
        float multiplosDe3;

        do {
            System.out.println("\nDigite um número: ");
            numero = leia.nextInt();

            if (numero %3 ==0 && numero != 0 ) {
                soma+=numero;
                contador++;
            }
            

        } while (numero != 0);
        multiplosDe3 = (float) soma /contador;
        System.out.println(contador);
        System.out.println("\nA média de todos os números múltiplos de 3 é: "+ multiplosDe3);

    }
}
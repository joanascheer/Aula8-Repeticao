import java.util.Scanner;

public class Exercicio2Repeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que número você quer multiplicar? ");
        int numero = leitor.nextInt();

        for (int i=0; i <= 10; i++ ) {
            int resultado = numero * i;
            System.out.println(numero+ "x" +i+ "=" +resultado);
        }
    }
    
}

/* Faça um programa que mostre a taboada a partir da escolha do
usuário */

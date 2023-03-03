import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Digite um número inteiro: ");
                int numero = input.nextInt();

                int fibo1 = 0;
                int fibo2 = 1;
                int fibo3 = 0;
                boolean pertence = false;

                while (fibo3 < numero) {
                    fibo3 = fibo1 + fibo2;
                    fibo1 = fibo2;
                    fibo2 = fibo3;

                    if (fibo3 == numero) {
                        pertence = true;
                    }
                }

                if (pertence) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println(numero + " não pertence à sequência de Fibonacci.");
                }
            }

        }
    }
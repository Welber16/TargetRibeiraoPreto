import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um texto: ");
            String texto = scanner.nextLine();
            String textoInvertido = "";
            for(int i = texto.length() - 1; i >= 0; i--){
                textoInvertido += texto.charAt(i);
            }

            System.out.println("Texto invertido: " + textoInvertido);
        }
    }

    public static String inverteString(String texto) {
        int tamanho = texto.length();
        StringBuilder sb = new StringBuilder();

        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }

        return sb.toString();
    }
}
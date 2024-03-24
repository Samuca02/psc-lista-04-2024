    import java.util.Scanner;

public class Atividade1Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        while (true) {
            try {
                System.out.print("Digite uma nota entre zero e dez: ");
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    System.out.printf("A nota informada é válida: %.2f%n", nota);
                } else {
                    System.out.println("Valor inválido. A nota deve estar entre zero e dez.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine(); //Repete a opção para digitar um número válido.
            }

            System.out.print("\nDeseja verificar outra nota? Digite S para sim: ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }
        scanner.close();
    }
}
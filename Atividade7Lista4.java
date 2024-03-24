import java.util.Scanner;
public class Atividade7Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Recebe os números.
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        double numero4 = scanner.nextDouble();

        System.out.print("Digite o quinto número: ");
        double numero5 = scanner.nextDouble();

        double resposta1 = Math.max(numero1, Math.max(numero2, Math.max(numero3, Math.max(numero4, numero5))));
        System.out.println("O maior número é: " + resposta1);

        scanner.close();
    }
}   

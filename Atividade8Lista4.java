import java.util.Scanner;
public class Atividade8Lista4 {
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

        double resposta1 = (numero1 + numero2 + numero3 + numero4 + numero5);
         System.out.println("A soma dos números é: " + resposta1);
        
        double resposta2 = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
         System.out.println("A média dos números é: " + resposta2);

        scanner.close();
    }
}
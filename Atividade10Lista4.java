import java.util.Scanner;
public class Atividade10Lista4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Recebe o primeiro número.
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        //Recebe o segundo número.
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        // Garante que num1 seja menor ou igual a num2 para não dar erro.
        while (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Imprime os números no intervalo
        for (int p = num1; p <= num2; p++) {
            System.out.print(p + "  ");
        }
        System.out.println("\n\nPrograma Finalizado. ");

        scan.close();
    }
}

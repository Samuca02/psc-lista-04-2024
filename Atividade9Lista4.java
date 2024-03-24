import java.util.Scanner;
public class Atividade9Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int n = 1; n <= 50; n++) {
            if (n % 2 != 0) {
             System.out.print(n + " ");
            }
        }
             System.out.println("\n\nPrograma Finalizado. ");
        scanner.close();
    }
}
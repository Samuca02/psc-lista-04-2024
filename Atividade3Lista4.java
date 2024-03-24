import java.util.Scanner;
public class Atividade3Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do usuário.
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Nome inválido. Digite novamente (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        }

        // Leitura da idade do usuário.
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida. Digite novamente (entre 0 e 150): ");
            idade = scanner.nextInt();
        }

        // Leitura do salário do usuário.
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        while (salario <= 0) {
            System.out.print("Salário inválido. Digite novamente (maior que zero): ");
            salario = scanner.nextDouble();
        }

        // Leitura do sexo do usuário.
        System.out.print("Digite seu sexo (f/m): ");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido. Digite novamente (f para feminino, m para masculino): ");
            sexo = scanner.next().charAt(0);
        }

        // Leitura do estado civil do usuário.
        System.out.print("Digite seu estado civil (s/c/v/d): ");
        char estadoCivil = scanner.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Estado civil inválido. Digite novamente (s para solteiro, c para casado, v para viúvo, d para divorciado): ");
            estadoCivil = scanner.next().charAt(0);
        }

        // Exibição das informações validadas do usuário.
        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: " + salario + " R$");
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + (estadoCivil == 's' ? "Solteiro" : estadoCivil == 'c' ? "Casado" : estadoCivil == 'v' ? "Viúvo" : "Divorciado"));

        scanner.close();
    }
}
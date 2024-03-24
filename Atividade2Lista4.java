import java.util.Scanner;

public class Atividade2Lista4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escreva seu usuário: ");
            String nome = scanner.nextLine();
            //Recebendo o nome do usuário.
            
            System.out.print("Escreva sua senha de login: ");
            String senha = scanner.nextLine();
            //Recebendo a senha do usuário.

            while(senha == nome)
                System.out.print("Escreva sua senha novamente.");

            if (!senha.equals(nome)) {
             System.out.println("cadastro aprovado. ");
             break;
             //Caso a senha seja diferente do nome, ele exibe "cadastro aprovado".

            } else {
                System.out.println("\nPara sua segurança, a senha não deve ser o mesmo nome do usuário: \nDigite uma nova senha: ");
                String novo = scanner.nextLine();
                while(novo == nome)
                    System.out.print("Escreva sua senha novamente.");

             if (!novo.equals(nome)) {
             System.out.println("cadastro aprovado. ");
             break;
             } else {
                System.out.println("\nPara sua segurança, a senha não deve ser o mesmo nome do usuário: \nDigite uma nova senha: ");
                String novo2 = scanner.nextLine();}
                //caso a senha seja igual ao nome ele informa que não pode, depois pede para digitar novamente.
                scanner.close();
            }
        }
    }
}
import java.util.Scanner;
public class Atividade5Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor da população do País A?: ");
        int paisA = scanner.nextInt();
        //Recebe o valor da população de A.

        System.out.print("Qual o valor da população do País B?: ");
        int paisB = scanner.nextInt();
        //Recebe o valor da população de B.

        System.out.print("Qual o valor da taxa de crescimento inicial do País A?: ");
        double taxapaisA = scanner.nextDouble();
        //Recebe o valor da taxa inicial de A.
       
        System.out.print("Qual o valor da taxa de crescimento inicial do País B?: ");
        double taxapaisB = scanner.nextDouble();
        //Recebe o valor da taxa inicial de B.

        int anos = 0;
        while (paisA <= paisB){
            
            paisA *= taxapaisA;
            paisB *= taxapaisB;
            anos++;
            System.out.println(paisA);
            //Estrutura de repetição.
        }
            System.out.println("Anos necessários para ultrapassar: " + anos + " anos");
            //Resultado.
        scanner.close();
    }   
}

import java.util.Scanner;
public class Atividade4Lista4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;
        //Criei as variáveis.

        while (paisA <= paisB){
            
            paisA *= 1.03;
            paisB *= 1.015;
            anos++;
            System.out.println(paisA);
            //Estrutura de repetição.
        }
        System.out.println("Anos necessários para ultrapassar: " + anos + " anos");
        //Resultado.
        scanner.close();
    }
}
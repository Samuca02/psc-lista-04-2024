import java.util.Scanner;
public class Atividade6Lista4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros = 1;
        
        while (numeros <= 20) {
            System.out.println(numeros + " ");
            numeros++;
            //Enquanto "numeros" for <= 20 ele vai gerar numeros+1.
        }
            System.out.println("Deseja escrever os números lado a lado, caso sim digite (S) se não digite (N)? ");
            String resposta1 = scanner.nextLine();
            //Depois de chegar a 20, ele pergunta se quer fazer novamente só que lado a lado.

            int numeros2 = 1;
            if (resposta1.equalsIgnoreCase("S")) {
                while(numeros2 <= 20){
                System.out.print(numeros2 + "  ");
                ++numeros2;}
                //While novamente... só retirar o "Ln" do print e fica lado a lado.

            } else {
                System.out.println("Programa Finalizado. ");
                //Caso usuário se recuse a imprimir lado a lado, "Programa Finalizado".
                scanner.close();
        }
    }
}
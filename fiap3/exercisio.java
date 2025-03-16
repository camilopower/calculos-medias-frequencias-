
import java.util.Scanner;

public class exercisio {

    public static void main(String[] args) {
        
   Scanner leitor = new Scanner(System.in);
   double investimento;
   System.out.println("digite o valor da doação: R$ ");
   double doacao = leitor.nextDouble();
   if(doacao <  1000) {
     investimento = doacao * 0.05;

   }else
   investimento = doacao * 0.10;
   System.out.println("o valor do investimento sera de r$ " + investtimento);
    }
    
}

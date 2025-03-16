
import java.util.Scanner;

public class decisaosimples {

  public static void main(String[] args) {

    System.out.println("aula -2 - decisao simples");
    System.out.println("digite sua idade");
    //comando de entrada  
    Scanner leitor = new Scanner(System.in);
    //variavel de memoria =>
    //tipo nome;
    int idade = leitor.nextInt();
    //processamento = calculo e atribuições (=)
    //condição => analisar o resultado de uma comparação
    //variavel orpracional valor/variavel
    //desvio condicional ou comando de decisão
    if(idade >= 18){
     System.out.println("pode tirar a hablitação");
     System.out.println("O voto é obrigatório!");
}
  }
}
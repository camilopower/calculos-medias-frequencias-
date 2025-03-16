import java.util.Scanner;

public class media {
     public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double nota1, nota2, media, frequencia;
    System.out.println("digite a primeira nota:");
    nota1 = leitor.nextDouble();
    System.out.println("digite a segunda nota:");
    nota2 = leitor.nextDouble();
    System.out.println("digite a frequencia do aluno: ");
    frequencia = leitor.nextDouble();
    media = (nota1 + nota2) /2;
    if(media >= 7 && frequencia >= 75){
            System.out.println("aluno aprovado com média" + media);
    }
    else{
        System.out.println("aluno reprovado com média"  + media);
 



    }
    
}
}
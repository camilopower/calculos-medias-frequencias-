
import java.util.Scanner;

public class verificapermissao {
    public static void main(String[] args ) {
        Scanner leitor = new Scanner(System.in);

        String perfilUsuario;
        System.out.println("digite o perfil do seu usuario:");
        perfilUsuario = leitor.nextLine();
    
        if(!(perfilUsuario.equals(" administrador"))){
       System.out.println("atenção, usuario sem privilegios administrativos ,Algumas funcionalidades"
      );
        }
        String nome = "eliane";
        if(nome.equalsIgnoreCase("eliane"))
        System.out.println("bem vinda(O)" + nome);
        }
    }

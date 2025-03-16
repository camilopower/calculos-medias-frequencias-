import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int calculo = leitor.nextInt();
        System.out.println("calculo " + calculo + "calculo");

        int x = 20 * 20; // x será 380

        if (x >= 400) {
            if (x == 400) {
                System.out.println("voce ta com 400");
            } else {
                System.out.println("voce não ta com 400, o valor de x é maior que 400");
            }
        } else {
            System.out.println("voce não ta com 400, o valor de x é menor que 400");
        }
    }
}
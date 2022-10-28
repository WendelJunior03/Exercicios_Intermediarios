import java.util.InputMismatchException;
import java.util.Scanner;

public class Porta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int aberta = 0;
    //Aqui fiz um tratamento em um erro de digitação, onde a variavel pede numero int e o usuario digita String
    // agora sempre quando o usuario digitar uma String o codigo está tratando esse erro do usuario.
        do {
            try {
                System.out.println("Qual a senha para abrir a porta? ");
                aberta = entrada.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Você digitou caracteres. preciso que digite apenas números: ");
                break;
            }
           /* entrada.nextLine();*/
        } while (aberta == 0);
            System.out.println("Click para digitar a senha novamente!");

            if(aberta == 32269907)
                System.out.println("Porta aberta");
            else
                System.out.println("Digite a senha correta para abrir a porta! ");
    }


}

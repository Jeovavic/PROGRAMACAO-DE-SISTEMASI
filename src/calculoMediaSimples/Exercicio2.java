package calculoMediaSimples;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        /*Faça um programa em JAVA que solicite dois números ao usuárops calcule a média e exiba o resultado */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("A média é: " + (n1 + n2)/2);
    }
} 

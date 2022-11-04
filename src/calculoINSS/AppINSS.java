package calculoINSS;
import java.util.Scanner;
public class AppINSS {
    public static void main(String[] args) {
        System.out.println("Informe o nome");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Informe o salário");
        double salario = scanner.nextDouble();
        double imposto = salario*(0.11);
        double salarioLiquido = salario - imposto;
        System.out.println("Nome: "+ nome);
        System.out.printf("Salário bruto RS%,.2f\n", salario);
        System.out.printf("Salário imposto RS%,.2f\n", imposto);
        System.out.printf("Salário Liquido RS%,.2f\n", salarioLiquido);


    }
}

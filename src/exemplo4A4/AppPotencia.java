package exemplo4A4;

import java.util.Scanner;

public class AppPotencia {
    public static void main(String[] args) {
        double x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 1 número inteiro: ");
        x = (double) scanner.nextInt();
        System.out.println("Informe o 2 numero inteiro: ");
        y =(double) scanner.nextInt();

        double potencia = Math.pow(x,y);
        double raiz = Math.pow(x, (1/y));
        System.out.println("A potência é: "+ potencia);
        System.out.println("A raiz é: "+ raiz);
    }
}

package CalculadoresSemInterface;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2, resp;
        char opcao;

        System.out.println("+----------------+");
        System.out.println("| CALCULADORA |");
        System.out.println("+----------------+");
        System.out.println("|7     8     9|");
        System.out.println("|4     5     6|");
        System.out.println("|1     2     3|");
        System.out.println("+----------------+");
        System.out.println("| + = * / |");
        System.out.println("+----------------+");
        System.out.println("Informe a operação desejada:  + = * / " );
        opcao = sc.next().charAt(0);
        System.out.println("Informe o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        n2 = sc.nextDouble();
        if (n2 != 0)
            System.out.println("+----------------+");
        else
            System.out.println("+----------------+");
        
        switch(opcao){
            case '+': 
                resp = n1+n2;
                System.out.println("Soma = " + resp);
                break;
            case '-':
                resp = n1 - n2;
                System.out.println("Subtração = "+ resp);
                break;
            case '*':
                resp = n1 * n2;
                System.out.println("Multiplicação ="+ resp);
                break;
            case '/':
            if(n2 == 0){
                System.out.print("Divisão por zero");
            }
            else{
                resp = n1 / n2;
                System.out.println("Divisão ="+ resp);
                break;
            }
            default:
                System.out.println("  Operação Inválida!!");
        }
    }
}

import java.util.Scanner;

public class Principal{
/** Referente ao exercicio 1 da aula 3
 * @autor Edson lessa
 * @version 1.0
 */
    public static void main(String[] args){
        /* nome matricula fone */
        System.out.println("Informe o nome: ");
        Scanner scannerNome = new Scanner(System.in);
        String nome = scannerNome.nextLine();

        System.out.println("Informe a matricula: ");
        Scanner scannerMatricula = new Scanner(System.in);
        int matricula =  scannerMatricula.nextInt();

        System.out.println("Informe o fone: ");
        Scanner scannerFone = new Scanner(System.in);
        int fone = scannerFone.nextInt();

        System.out.println("nome" + nome + "\n" + "Matricula: " + matricula + "\n" + "fone: " + fone);
    }
}
package exemplo2A5;

import javax.swing.*;

public class VetorFuncionario {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do Funcionario ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
        int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes"));
        String[] nomeDepedentes = new String[qtdDependentes];
        double salarioFamilia=0;
        for (int i=0; i < qtdDependentes; i++){
            nomeDepedentes[i] = JOptionPane.showInputDialog("Informe o nome do "+(i+1)+ "° dependente");
            salarioFamilia += 20;
        }
        System.out.println("Funcionário: "+ nome);
        for (int i = 0; i < qtdDependentes; i++){
            JOptionPane.showMessageDialog(null, ("Dependente "+i+": "+ nomeDepedentes[i]));;
        }
        JOptionPane.showMessageDialog(null,"Salário: R$"+(salario + salarioFamilia));
    }
}

package exemplo1A5;

import javax.swing.*;

public class VetorMedia {
    public static void main(String[] args) {
        
        String qtdNotasString = JOptionPane.showInputDialog("Quantos notas possuem");
        int qtdNotas = Integer.parseInt(qtdNotasString);

        double[] notas = new double[qtdNotas]; 

        for(int i=0; i < qtdNotas; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a note n° ", +i));
        }
        double soma = 0;
        for (int i = 0; i < qtdNotas; i++){
            soma+=notas[i];
        }

        JOptionPane.showMessageDialog(null,"A média é: "+(soma/qtdNotas));
    }
}
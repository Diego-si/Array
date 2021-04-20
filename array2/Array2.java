/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //cria um array com 6 elementos
        int[] array = {10,15,25,3,8,7};
        int total = 0;
        String saida = "Ìndice\tValor\n";
    
        //adicionando o valor de cada
        //elemento do array na variavel saida
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            saida += i  + "\t" + array[i] + "\n";
        }
        saida += "\n\nA soma dos elementos do array é: " + total;
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, ""
                + "Criando um array de inteiros",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

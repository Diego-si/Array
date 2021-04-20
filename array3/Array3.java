/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

/**
 *
 * @author diven
 */
public class Array3 extends JApplet{

    int[] array = {10,15,25,3,8,7};
        int total = 0;
        String saida = "Ìndice\tValor\n";
    
        //adicionando o valor de cada
        //elemento do array na variavel saida
       // for (int i = 0; i < array.length; i++) {
         //   total += array[i];
           // saida += i  + "\t" + array[i] + "\n";
        //}
        //saida += "\n\nA soma dos elementos do array é: " + total;
        
        JTextArea saidaArea = new JTextArea();
        //saidaArea.setText(saida);
    
    //JtextArea saidaArea;
    
    @Override
    public void init() {
        super.init();
        
        saidaArea = new JTextArea();
        Container container = getContentPane();
        container.add(saidaArea);
        
        int[][] array1 = { {1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2},{3},{4,5,6,}};
        
        saidaArea.setText("Os valores do array1 são \n");
        buildSaida(array1);
        
        saidaArea.append("Os valores do array2 sao \n");
        buildSaida(array2);
    }
    
    public void buildSaida(int[][] array) {
        //percorre as linhas do array com um for
        for (int linha=0; linha < array.length; linha++) {
            //percorre as columas da linha corrente com outro for
            
            for (int coluna=0; coluna< array.length; coluna++) {
                saidaArea.append(array[linha][coluna] + " ");
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
    
}

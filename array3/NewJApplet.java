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
 * @author Diego
 */
public class NewJApplet extends JApplet {
    int[] array = {10,15,25,3,8,7};
    int total = 0;
    String saida = "Ìndice\tValor\n";
    JtextArea saidaArea = new JTextArea();
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
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
    // TODO overwrite start(), stop() and destroy() methods
}

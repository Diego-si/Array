package array7treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 * @since 2019
 * @version 1.0
 */
public class Array7TreeSet {

    /**
     * @param args the command line arguments
     */
   String saida = "";
    private String[] cores = {"vermelho", "branco",
        "azul", "verde", "cinza","laranja","bronze",
        "branco","ciano","pessego","cinza","laranja"};


    public static void main(String[] args) {
        // TODO code application logic here
        new Array7TreeSet();
    }
    
    public Array7TreeSet() {
        TreeSet tree = new TreeSet(Arrays.asList(cores));
        
        saida += "\nSet de elementos não "
                + "duplicados e ordenados:\n";
        this.mostrarSet(tree);
        
        saida += "\n\nSubconjunto de TreeSet "
                + "menor que 'laranja':\n";
        this.mostrarSet(tree.headSet("laranja"));
        
        saida += "\n\nSubconjunto de TreeSet "
                + "maior que ou igual a 'laranja':\n";
        this.mostrarSet(tree.tailSet("laranja"));
        
        saida += "\n\nPrimeiro elemento de Set: "
                + tree.first();
        saida += "\nÙltimo elemento de set: "
                + tree.last();
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Trabalhando com Sets",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private void mostrarSet(SortedSet ss) {
        Iterator iterator = ss.iterator();
        
        while (iterator.hasNext()){
            saida += iterator.next() + " ";
        }
    }
    
}

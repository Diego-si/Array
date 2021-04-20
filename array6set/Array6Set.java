package array6set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 * @since 2019
 * @version 1.0
 */
public class Array6Set {

    /**
     * @param args the command line arguments
     */
    String saida = "";
    private String[] cores = {"vermelho", "branco",
        "azul", "verde", "cinza","laranja","bronze",
        "branco","caino","pessego","cinza","laranja"};


    public static void main(String[] args) {
        // TODO code application logic here
        new Array6Set();
    }
    
    public Array6Set() {
        List lista;
        
        lista = new ArrayList(Arrays.asList(cores));
        saida += "Lista com elemntos duplicados: ";
        saida += "\n"+lista;
        
        this.gerarListaNaoDuplicada(lista);
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Trabalhando Com Sets",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public void gerarListaNaoDuplicada(Collection collection) {
        Set set = new HashSet(collection);
        Iterator iterator = set.iterator();
        
        saida += "\n\nLista com elementos nao duplicados\n";
        
        while (iterator.hasNext()){
            saida += iterator.next() + " ";
        }
    }
}
package array5ordemalfabetica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 * @version 1.0
 */
public class Array5OrdemAlfabetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("maria");
        listaNomes.add("joao");
        listaNomes.add("queue");
        listaNomes.add("vaca");
        listaNomes.add("boi");
        
        String saida = "";
        saida += "Lista Desordenada: "+listaNomes;
        
        Collections.sort(listaNomes);
        
        saida += "\nLista ordenada: "+listaNomes;
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Trabalhando com ArrayList",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}

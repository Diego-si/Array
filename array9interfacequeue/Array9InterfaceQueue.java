package array9interfacequeue;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 * @since 2019
 * @version 1.0
 */
public class Array9InterfaceQueue {
    
    String saida = "";
    
    public Array9InterfaceQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        this.adicionarElemento(queue);
        saida += "\n";
        this.removerElemento(queue);
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Trabalhando com queues",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Array9InterfaceQueue();
    }
    
    private void adicionarElemento(Queue qe) {
        int elemento = 10;
        for (int i = elemento; i >= 0; i++) {
            saida += "Adicionando o elemento: " +i+"na fila\n";
            qe.add(i);
        }
    }
    private void removerElemento(Queue qe) {
        while (!qe.isEmpty()) {
            saida += "Removendo o elemento: " + qe.remove()
                    + " da fila\n";
        }
    }
}

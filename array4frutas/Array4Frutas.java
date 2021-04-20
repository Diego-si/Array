package array4frutas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 */
public class Array4Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> listaFrutas = new ArrayList<String>();
        String s ="Uva";
        listaFrutas.add("melancia");
        listaFrutas.add(s);
        listaFrutas.add("caju");
        
        String saida = "";
        saida += "Frutas da lista: "+
                listaFrutas.toString();
        saida += "\nTotal de Frutas na lista: "+
                listaFrutas.size();
        saida += "\nA lista possui pera? "+
                listaFrutas.contains("pera");
        saida += "\nA lista possui caju? "+
                listaFrutas.contains("caju");
        listaFrutas.remove("Uva");
        saida += "\nTotal de Frutas na lista "+
                "apos remover uva: "+ listaFrutas.size();
        saida += "\nFrutas da lista "+
                "apos remover uva: "+ listaFrutas.toString();
        saida += "\nÌndice da Fruta "+
                "caju na lista: "+ listaFrutas.indexOf("caju");
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, ""
                + " Trabalhando com ArrayList",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}

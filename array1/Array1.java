/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Diego
 */
public class Array1 {
    
private String variedade;
public Array1(){
    this("misto frio");
}
public Array1(String variedade){
    this.variedade = variedade;
}

@Override
public String toString(){
    return "lanche: " + variedade;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array1 a = new Array1();
        Array1 b = new Array1("misto quente");
        System.out.println(a);
        System.out.println(b);
        // TODO code application logic here
        //atividade 1 4
        /*int [] ag = new int [999];
        for (int i =0; i<999;i++) {
            ag[i]=i*3;
        }System.out.println(ag[123]);
        //atividade 1 8
        ArrayList<String> nomes = new ArrayList();
        nomes.add("paohj");
        nomes.add("dsdhjhf");
        nomes.add("sfdggf");
        nomes.add("dfsfs");
        int x = 0;
        for (int i =0; i <nomes.size(); i++) {
            x += nomes.get(0).length();
        }
        System.out.println(x);
        */
        /*int [] array; //declara referencia para um array
        
        array = new int[10]; //cria um array com 10 elementos
        String saida = "Ìndice\tValor\n";
        
        //adicionando o valor de cada
        //elemento do array na variavel saida
        for (int i= 0; i < array.length; i++) {
            saida += i + "\t" + array[i] + "\n";
        }
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Criando um array de inteiros" ,
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    List<String> listaNomes = new ArrayList<String>();
    listaNomes.add("Maria");
    listaNomes.add("João");
    listaNomes.add("José");
    listaNomes.add("Adriano");
    listaNomes.add("Willian");
    listaNomes.add("Adriano");
    listaNomes.add("Patrícia");
    String saida = ""; 

    Set<String> conj = new TreeSet<String>(listaNomes);

    saida += "Conjunto: "+conj;
    
        
        JOptionPane.showMessageDialog(null, saida,
                "Criando um array de inteiros" ,
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

        

        try {
        String[] nomes = {"j","t","r"};
        System.out.println(nomes[3]);            
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de índice = ArrayIndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println("Erro aritmético = ArithmeticException");
        }catch(NullPointerException e){
            System.out.println("Erro de elemento nulo = NullPointerException");
        }catch(Exception e){
            System.out.println("Erro desconhecido = Exception");
        }
        
    int[] n = {0,1,2,3,4,5,6,7,8,9};

        for(int pares = 0; pares<n.length; pares++){
            if(pares%2==0){
                System.out.println(pares+" valor par ");
            }
            
        }*/
    }
}

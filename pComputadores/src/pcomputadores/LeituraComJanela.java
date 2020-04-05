package pcomputadores;

import javax.swing.JOptionPane;

public class LeituraComJanela {
    
    public static void main(String[] args) {
        
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insira um número inteiro: "));
        
        JOptionPane.showMessageDialog(null, "O número introduzido foi " + x);
    }
    
}

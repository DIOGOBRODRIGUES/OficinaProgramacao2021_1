package exemplo;

import javax.swing.*;
/**
 *
 * @author diogo
 */
public class Principal {
    public static void main(String[] args) {
        float notaProva = 0, notaTrab = 0, notaProj = 0;
        float mediaFinal = 0;
        String esc;
        int escolha;
             
        for(int i =0; i<10; i++){
   
        esc = JOptionPane.showInputDialog("Digite sua Escolha");
        escolha = Integer.parseInt(esc);
      
        switch(escolha){
            case 1: 
                notaProva = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova: "));
                
            case 2:
                notaTrab = Integer.parseInt(JOptionPane.showInputDialog("Nota do trabalho: "));
            case 3:
                notaProj = Integer.parseInt(JOptionPane.showInputDialog("Nota do projeto: "));
            default:
                if(escolha < 4)
                    mediaFinal = (notaProva + notaTrab +notaProj)/(3 - escolha +1 );
        }

        JOptionPane.showMessageDialog(null, "M"
                + "é"
                + "dia "
                + "Final " 
                +mediaFinal);
        
        }
        System.exit(0);
    }
}

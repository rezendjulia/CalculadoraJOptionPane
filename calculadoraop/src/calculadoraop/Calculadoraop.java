package calculadoraop;
import javax.swing.JOptionPane;
public class Calculadoraop {
    public static void main(String[] args) {
        
       String operacao =
                JOptionPane.showInputDialog (" Digite a Operação de Seu Interesse: adicao, subtracao, divisao ou multiplicacao");
        String primeiron =        
                JOptionPane.showInputDialog("Digite um número:");
        String segundon =
               JOptionPane.showInputDialog("Digite outro número:");
        int n1 = Integer.parseInt (primeiron);
        int n2 = Integer.parseInt (segundon);
        
        if(operacao.equals("adicao")){
            int adicao = n1 + n2; 
            JOptionPane.showMessageDialog(null, "O resultado da soma é:"+ adicao,"Soma de Dois Valore", JOptionPane.PLAIN_MESSAGE);
            
        }else{
            if(operacao.equals("subtracao")){
                int subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado da soma é:"+ subtracao,"Diferença de Dois Valores", JOptionPane.PLAIN_MESSAGE);
                
        }else{
            if(operacao.equals("divisao")){
                float divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado da soma é:"+ divisao,"Quociente de Dois Valores", JOptionPane.PLAIN_MESSAGE);
                
        }else{
            if(operacao.equals("multiplicacao")){
                int multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado da soma é:"+ multiplicacao,"Produto de Dois Valores", JOptionPane.PLAIN_MESSAGE);
                
        }else{
            JOptionPane.showMessageDialog( null," Operação Inválida", "ERROR", JOptionPane.PLAIN_MESSAGE);
            }
            }
            }
        }
    }
}
        
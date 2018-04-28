
package calculadoraparaswitch;

import javax.swing.JOptionPane;

public class CalculadoraParaSwitch {
 
    public static void main(String[] args) {
        int total;
        int volta=0;
        while (volta <5){
            int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
            int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));   
        
        
            String operacao = JOptionPane.showInputDialog(null, "Digite o símbolo da operação que deseja realizar \n+ : Somar\n- : Subtrair\n* : Multiplicar\n / : dividir");
            switch(operacao){
                case "+":
                    total = num1+num2;
                    JOptionPane.showMessageDialog(null, "O valor é: "+total, "resultado", JOptionPane.OK_OPTION );
                break;
                
                case "-":
                    total = num1-num2;
                    JOptionPane.showMessageDialog(null, "O valor é: "+total, "resultado", JOptionPane.OK_OPTION );
                break;    
                case "*":
                    total = num1*num2;
                    JOptionPane.showMessageDialog(null, "O valor é: "+total, "resultado", JOptionPane.OK_OPTION );
                break;
                 case "/":
                    total = num1/num2;
                    JOptionPane.showMessageDialog(null, "O valor é: "+total, "resultado", JOptionPane.OK_OPTION );
                break;
            
          
            }
           volta++; 
        }        
                      
    }
    
}

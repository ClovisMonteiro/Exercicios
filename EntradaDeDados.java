
package entradadedados;

import javax.swing.JOptionPane;


public class EntradaDeDados {

    
    public static void main(String[] args) {
       //Pega a idade e verifica se é maior de idade
       
        int idade;
        String numero = JOptionPane.showInputDialog("Digite a sua idade: ");
        idade = Integer.parseInt(numero);
        if(idade>=18){
            System.out.println("Maior de idade!!!");     
            //ou
        JOptionPane.showMessageDialog(null, "Maior de idade", "Resultado", JOptionPane.WARNING_MESSAGE);
    }
        else{
            System.out.println("Menor de idade!!!");
            //ou
            JOptionPane.showMessageDialog(null, "Menor de idade", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}

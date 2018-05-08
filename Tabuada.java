package exercicios;

import java.util.Scanner;

/**
 *
 * @author clovis
 */
public class Tabuada {
    
    public static void main(String[] args) {
         float numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = entrada.nextFloat();
                 System.out.println();

        for(int x=0; x <= 10;x++){
        System.out.printf("%f x %d = %g\n",numero,x,numero*x);
    }
  }    
}

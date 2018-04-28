
package faculdade;

public class PosGraduacao extends Aluno {
      @Override
      public void calculaCredito(){
     int resultado = qtdDisciplinas * 2;
        System.out.println(nome+" possui "+resultado+" de créditos.");
   
    }   
    
}

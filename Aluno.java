package faculdade;

import java.time.Year;

public class Aluno {
    //Atributos = Variáveis
    String Matricula, nome, curso;
    int anoDeIngresso, qtdDisciplinas;
    double valorMensadidade; 
               
    //Métodos = Funções
    public void calculaCredito(){
     int resultado = qtdDisciplinas * 4;
        System.out.println(nome+" possui "+resultado+" de créditos.");
    //System.out.println("Sou um método estatico");
    }   
    public void calculaTempo(int tempoIdeal){
            int tempo;
            int ano = Year.now().getValue();
            int resultado = ano - anoDeIngresso;
        
                if(resultado < tempoIdeal){
                    tempo = tempoIdeal - resultado;
                    System.out.println("Ainda faltam"+ tempo +" para se formar.");    
                } else if (resultado == tempoIdeal){
                    System.out.println(nome+" se forma ou se formou esse ano.");
                } else{
                    System.out.println("Já passou do tempo de formar.");
                }
    }   
}

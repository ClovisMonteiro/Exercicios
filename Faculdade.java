
package faculdade;

public class Faculdade {

   
    public static void main(String[] args) {
    Aluno a1 = new Aluno();
    a1.nome = "Clovis";
    a1.curso = "Engenharia da Computação";
    a1.qtdDisciplinas = 13;
    a1.anoDeIngresso = 2017;
    a1.calculaCredito();
    
    
    
    Aluno a2 = new Aluno();
    Aluno a3 = new Aluno();
    
    PosGraduacao p1 = new PosGraduacao();
    p1.curso = "Ciencia da computação";
    p1.nome = "Júlia";
    p1.qtdDisciplinas = 20;
    p1.calculaCredito();
    
    
    
        
        
        
    }
    
}

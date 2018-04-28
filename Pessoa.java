
package mundo;

public class Pessoa {
    //Atributos = variavéis
    String nome;
    char sexo;
    int idade;
    double altura;
    
    //Método construtor : ele leva a palavra public e o nome da classe, seu papel é inicializar os valores das variaveis (atributos);
    public Pessoa(String nome, char sexo, int idade, double altura){
        //this: faz referencia ao que é da classe
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        
    }
     public Pessoa(String nome, int idade){
       
        this.nome = nome;
        this.idade = idade;            
    }
    
      public Pessoa(){
       
                   
    }
    //Métodos = funções
    public void dormir(){
        System.out.println(nome+" Esta dormindo e tem "+idade+" anos");
        
    }
    public void andar(){
        System.out.println(nome+" Esta andando");
    }
    
    
}

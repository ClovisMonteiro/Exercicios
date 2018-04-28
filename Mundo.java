
package mundo;


public class Mundo {

    public static void main(String[] args) {
       //new: operador que indica a criação do objeto
       //Pessoa(): método construtor, ou metodo default, cria o objeto
       
       Pessoa p1 = new Pessoa("Adão", 'M', 10, 1.80);
       p1.nome = "Clovis";
       p1.idade = 18;
       p1.dormir();
       
       Pessoa p2 = new Pessoa("Eva", 10);
       p2.andar();
       Pessoa p3 = new Pessoa("Clovis", 'M', 18, 1.89);
       
       Bebe b = new Bebe();
       b.sexo = 'F';
       b.andar();
       b.andar();
    }
    
}

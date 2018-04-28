
package estrutura.de.dados;


import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;


public class EstruturaDeDados {

    
    public static void main(String[] args) {
        //Criando um vetor V com 4 casas para abrigar valores inteiros
        int v[] = new int [4]; 
        //Criando um vetor F com 4 casas para abrigar valores decimais;
        float f[] = new float[4];
        //Criando um vetor O para abrigar 4 objetos
        Aluno o[] = new Aluno[4]; 
        
        //PREENCHIMENTO DE UM VETOR : temos que colocar um elemento em uma casa diferente
        v[0] = 100;
        v[1] = 200;
        v[2] = 300;
        v[3] = 400;
        
       //LAÇOS
       int i = 0;
       while (i<4){
           System.out.println(v[i]);
           i++;
       }
        for (int j=0; j<v.length; j++){
            System.out.println(v[j]);
            System.out.println(v.length);
        }
        System.out.println("Com for each");
        for(int valor : v){
        System.out.println(valor);
        }
        
        //PILHA: O primeiro elemento a entrar é o ultimo elemento a sair;
        Stack<String> pilha = new Stack<String>();
        pilha.push("Java");
        pilha.push("UNIFACS");
        pilha.push("Clovis");
        
        while (!pilha.isEmpty()){
            System.out.println("Retirando: "+pilha.pop());
        }
        if(pilha.isEmpty()){
            System.out.println("Pilha vazia");
        }
        
        //FILA: o primeiro elemento a entrar é o primeiro a sair
        Queue<String> fila = new LinkedList<String>() {};
        fila.add("João");
        fila.add("Maria");
        fila.add("Miguel");    
        
        while (!fila.isEmpty()){
            System.out.println("Retirando: "+fila.remove());
        }
        if(fila.isEmpty()){
            System.out.println("Fila vazia!");
        }
        
        //Lista encadeada ou lista ligada
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Ford");
        lista.add("chevrolet");
        lista.add("Renault");
        lista.add("VolksWagen");
        lista.addFirst("Empresas de carro");
        lista.addLast("...");
        lista.addLast("salve porra");
        while(!lista.isEmpty()){
            System.out.println("Retirando "+lista.poll());
        }     
        if(lista.isEmpty()){
            System.out.println("Lista Vazia");
        }
        
        
    }
    
}

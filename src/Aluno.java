
public class Aluno {

    String nome;
    double peso;
    double altura;
    int idade;


    Aluno (String nome, double peso, double altura, int idade){

        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;

    }

     public String toString(){
          return nome+"\n"+peso+"\n"+altura+"\n"+idade;
      }

}

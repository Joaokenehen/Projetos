import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno(null, 0.0, 0.0, 0);
        Academia academia = new Academia();

        System.out.println("Digite o nome do aluno");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite o peso do aluno");
        aluno.peso = scanner.nextDouble();
        System.out.println("Digite a altura do aluno");
        aluno.altura = scanner.nextDouble();
        System.out.println("Digite a idade do aluno");
        aluno.idade = scanner.nextInt();

        System.out.println();
        if(aluno.idade < 18){
            System.out.println("Voce ganhou um desconto!!");
        }
        System.out.println();
        System.out.println(aluno);
        System.out.println();
        academia.imc(aluno);
    }
}
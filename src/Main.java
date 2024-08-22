import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("Albert Einstein");
        Pessoa pessoa2 = new Pessoa("Isaac Newton");
        Universidade uni = new Universidade(" Princeton (Nova Jersey - Estados Unidos da América)", "Cambridge (Inglaterra)");

        System.out.println(pessoa1.nome+" Trabalhou em "+uni.nome1);
        System.out.println(pessoa2.nome+" Trabalhou em "+uni.nome2);


    }
}
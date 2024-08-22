import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        Operacao operacao = new Operacao();

        System.out.println("Digite o nome do usuario:");
        banco.cliente = scanner.nextLine();
        System.out.println("Digite a conta do usuario");
        banco.conta = scanner.nextInt();
        System.out.println("Digite seu saldo atual:");
        banco.saldo = scanner.nextDouble();
        banco.i = 1;

        while(banco.i != 0) {
            banco.i = 0;
            System.out.println("Digite\n 1 para fazer saque\n 2 para depositar\n 0 para sair");
            banco.i = scanner.nextInt();

            if (banco.i == 1) {
                if (banco.saldo > 0){
                operacao.saque();
                operacao.dinheiro = scanner.nextDouble();
                banco.saldo -= operacao.dinheiro;}
                else {
                    System.out.println("A conta esta negativa para sacar\n");
                }
            } else if (banco.i == 2) {
                operacao.deposito();
                operacao.dinheiro = scanner.nextDouble();
                banco.saldo += operacao.dinheiro;
            } else if (banco.i == 0) {
                System.out.println("Voce saiu do programa\n");
            } else {
                System.out.println("Comando invalido");
            }

            if (banco.saldo < 0){
                System.out.println("Sua conta ficou negativa");
            }else
                System.out.println(banco);

        }
    }
}
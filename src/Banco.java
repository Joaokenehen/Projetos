public class Banco {

    String cliente;
    int conta;
    double saldo;
    int i;

    Banco(){
        this.cliente = cliente;
        this.conta = conta;
        this.i = i;
        this.saldo = saldo;
    }

    public String toString(){
        return "Cliente "+this.cliente+"\nConta "+this.conta+"\nSaldo de R$"+this.saldo;

    }



}

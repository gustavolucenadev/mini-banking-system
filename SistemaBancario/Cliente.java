package SistemaBancario;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome, int numeroConta) {
        this.nome = nome;
        this.conta = new Conta(numeroConta);
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome);
        conta.exibirSaldo();
    }
}

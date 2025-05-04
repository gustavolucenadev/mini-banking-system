package SistemaBancario;

public class Cliente {
    private String nome;
    private String CPF;
    private Double saldo;

    public Cliente(){}

    public Cliente(String nome, String CPF, Double saldo) {
        this.nome = nome;
        this.CPF = CPF;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public Double getSaldo() {
        return saldo;
    }
}

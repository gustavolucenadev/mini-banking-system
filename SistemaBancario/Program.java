package SistemaBancario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;
        do {
            System.out.println("\n===== MENU BANCÁRIO =====");
            System.out.println("1 - Criar cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("Número da conta: ");
                    int numConta = sc.nextInt();
                    sc.nextLine();
                    banco.adicionarCliente(new Cliente(nome, numConta));
                    break;
                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeDep = sc.nextLine();
                    Cliente clienteDep = banco.buscarCliente(nomeDep);
                    if (clienteDep != null) {
                        System.out.print("Valor para depositar: R$");
                        double valor = sc.nextDouble();
                        clienteDep.getConta().depositar(valor);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do cliente: ");
                    String nomeSaq = sc.nextLine();
                    Cliente clienteSaq = banco.buscarCliente(nomeSaq);
                    if (clienteSaq != null) {
                        System.out.print("Valor para sacar: R$");
                        double valor = sc.nextDouble();
                        clienteSaq.getConta().sacar(valor);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nome do cliente: ");
                    String nomeSaldo = sc.nextLine();
                    Cliente clienteSaldo = banco.buscarCliente(nomeSaldo);
                    if (clienteSaldo != null) {
                        clienteSaldo.exibirInfo();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}

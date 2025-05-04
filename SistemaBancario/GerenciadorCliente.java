package SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    List<Cliente> listaCliente = new ArrayList<>();

    public void removerCliente(Cliente cliente) {
        if (!clienteExiste(cliente)) {
            System.out.println("Erro ao remover! Cliente não existe no sistema");
        } else {
            listaCliente.remove(cliente);
        }
    }

    public void cadastrarCliente(Cliente cliente) {
        if (clienteExiste(cliente))
            System.out.println("Erro! Cliente já cadastrado no sistema");
        else
            listaCliente.add(cliente);
    }

    private boolean clienteExiste(Cliente cliente) {
        for (Cliente cli : listaCliente) {
            if (cliente.getCPF() == cli.getCPF())
                return true;
        }
        return false;
    }
}

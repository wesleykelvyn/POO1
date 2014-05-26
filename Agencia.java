import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<ContaIF> contas = new ArrayList<ContaIF>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente pesquisarClientePorNome(String nome) {
        
        for (Cliente cliente : clientes) {
            
            if (cliente.getNome().equals (nome)) {
                return cliente;
            }
        }
        
        throw new RuntimeException("Conta não encontrada: " + numero);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void cadastrarConta(ContaIF conta) {
        contas.add(conta);
    }
    
    public ContaIF pesquisarContaPorNumero(int numero) {
        
        for (ContaIF conta : contas) {
            
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        
        throw new RuntimeException("Conta não encontrada: " + numero);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

}

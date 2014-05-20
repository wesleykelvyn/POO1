import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<ContaAbstrata> contas = new ArrayList<ContaAbstrata>();

    public void cadastrarConta(ContaAbstrata conta) {
        contas.add(conta);
    }
    
    public ContaAbstrata pesquisarContaPorNumero(int numero) {
        
        for (ContaAbstrata conta : contas) {
            
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

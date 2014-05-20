import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<Conta> contas = new ArrayList<Conta>();

    public void cadastrarConta(Conta conta) {
        contas.add(conta);
    }
    
    public Conta pesquisarContaPorNumero(int numero) {
        
        for (Conta conta : contas) {
            
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

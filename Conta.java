public class Conta {
    
    private int numero;
    private double limite; //Especifico de conta. Nao se aplica a poupanca
    private Agencia agencia;
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    
}

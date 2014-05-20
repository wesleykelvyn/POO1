public class Poupanca {
    
    private int numero;
    private double rendimento; //Especifico de poupanca. 
    private Agencia agencia;
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    
}

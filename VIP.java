public abstract class VIP implements ContaIF{
    
    private int numeroVIP;
    private Agencia agenciaVIP;
    
    public void setNumero(int numero) {
        this.numeroVIP = numero;
    }

    public int getNumero() {
        return numeroVIP;
    }

    public void setAgencia(Agencia agencia) {
        this.agenciaVIP = agencia;
    }

    public Agencia getAgencia() {
        return agenciaVIP;
    }

}

public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo){
        // Falta tratar esses argumentos do parametro
        this.numero = numero;
        this.saldo = saldo;

    }

    public double consultarSaldo() {
        return saldo;
    }

    public void sacar(double valorSaque){
        if (valorSaque < 0) {
            throw new IllegalArgumentException("O valor não pode ser menor que zero.");
        }

        if (saldo < valorSaque) {
            throw new IllegalArgumentException("Sem saldo suficiente para saque.");
        }        

        saldo -= valorSaque;

    }

    public void depositar(double valorDeposito){
        if (valorDeposito == 0) {
            throw new IllegalArgumentException("O valor não pode ser 0");            
        }

        if (valorDeposito < 0) {
            throw new IllegalArgumentException("O valor não pode ser menor que 0");
        }

        saldo += valorDeposito;

    }

}

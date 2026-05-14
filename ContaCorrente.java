public class ContaCorrente extends Conta {
    private double limite;
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public void sacar(double valor) {
        if (valor > this.getSaldo() + this.limite) {
            System.out.println("Saque inválido");
        } else {

            this.setSaldo(this.getSaldo() - valor);

            System.out.println("Saque com sucesso");
        }
    }
}
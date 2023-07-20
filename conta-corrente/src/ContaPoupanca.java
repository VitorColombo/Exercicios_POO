public class ContaPoupanca extends Conta{
    private static double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, int agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa(){
        double saldo = getSaldo();
        saldo = (saldo * JUROS_MENSAL);
        setSaldo(saldo);
    }
    public void imprimir() {
        System.out.println("ContaPoupanca - " +
                " cliente: " + getCliente().getNome() +
                " numeroConta: " + getNumeroConta() +
                " agencia: " + getAgencia() +
                " saldo: " + getSaldo() +
                " juros mensais: " + JUROS_MENSAL);
    }
}

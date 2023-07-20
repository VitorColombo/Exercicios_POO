public class ContaPagamento extends Conta implements Impressao{

    private static final double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, int agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public boolean sacar(double valor){
        if (valor <= 0)
            return false;
        if(valor + TAXA_SAQUE > getSaldo()){
            return false;
        }
        double novoSaldo = getSaldo();
        novoSaldo = novoSaldo - valor - TAXA_SAQUE;
        setSaldo(novoSaldo);
        return true;
    }

        @Override
    public void imprimir() {
            System.out.println("ContaPagamento - " +
                    " cliente: " + getCliente().getNome() +
                    " numeroConta: " + getNumeroConta() +
                    " agencia: " + getAgencia() +
                    " saldo: " + getSaldo() +
                    " taxa de saque: " + TAXA_SAQUE);
    }
}

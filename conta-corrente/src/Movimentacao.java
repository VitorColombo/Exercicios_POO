public interface Movimentacao {

    public boolean depositar(double valor);

    public boolean transferir(Conta beneficiario, double valor);

    public boolean sacar(double valor);

}



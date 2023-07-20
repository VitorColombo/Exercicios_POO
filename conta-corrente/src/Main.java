

public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato(1, "zapzap", "83423749");
        Contato contato2 = new Contato(2, "telefone", "31238923");
        Contato contato3 = new Contato(1, "zaperson", "98312839");
        Contato contato4 = new Contato(2, "tele", "2222222");
        Endereco end2 = new Endereco("BR", "Xangri", "432432", " ", 1, "RS", "Rio camisas", 123);
        Endereco end1 = new Endereco("SU", "tramanda", "11111", " ", 2, "SR", "jijigji", 222);

        Cliente cliente1 = new Cliente("letlet","38492834", end1, contato1);
        Cliente cliente2 = new Cliente("euzin","55555555", end2, contato2);

        cliente1.adicionarEndereco(end2);
        cliente2.adicionarEndereco(end2);
        cliente1.adicionarContato(contato3);
        cliente2.adicionarContato(contato4);

        ContaCorrente cc1 = new ContaCorrente(cliente1, "18191", 1, 2000, 500);
        ContaPagamento cpag1 = new ContaPagamento(cliente1, "181", 1, 100);
        ContaPoupanca cp2 = new ContaPoupanca(cliente2, "2222", 2, 1000);

        if(cpag1.sacar(100)){
            System.out.println("pagou");
        }
        else
            System.out.println("saldo insuficiente");
        cpag1.imprimir();
        cc1.depositar(100);
        cp2.transferir(cpag1, 90);

        cc1.imprimir();
        cp2.imprimir();
        cpag1.imprimir();
    }

}

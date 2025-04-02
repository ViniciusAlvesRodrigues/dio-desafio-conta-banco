public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato(String tipoConta) {
        super.imprimirExtrato("cp");
    }
}

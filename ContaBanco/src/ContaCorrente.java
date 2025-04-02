public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato(String tipoConta) {
        super.imprimirExtrato("cc");
    }    


    
}

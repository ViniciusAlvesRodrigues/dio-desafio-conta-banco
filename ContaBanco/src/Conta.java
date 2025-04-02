public class Conta implements IConta{
    
    private static int SEQUENCIAL = 1;

    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco){
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);    
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getCliente(){
        return  cliente.getNome();
    }


    @Override
    public void imprimirExtrato(String tipoConta) {
        if(tipoConta.equals("cc")){
            System.out.println("***Extrato Conta Corrente***");
        }else{
            System.out.println("***Extrato Conta Poupança***");
        }

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.banco.getAgenciaBanco()));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

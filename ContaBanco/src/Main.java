import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        List<Conta> listConta = new ArrayList<>();

        Banco bank = new Banco("BANK DIO", 1001);

        System.out.println("BEM VINDO AO "+ bank.getNome());
        
        System.out.println("Qual o seu nome?");
        String nomeCliente = terminal.next();

        Cliente newCliente = new Cliente();
        newCliente.setNome(nomeCliente);

        Conta cc = new ContaCorrente(newCliente, bank);
        Conta cp = new ContaPoupanca(newCliente, bank);

        listConta.add(cc);
        listConta.add(cp);
        bank.setContas(listConta);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato("cc");
        cp.imprimirExtrato("cp");

        bank.imprimeContas();

        terminal.close();
    }
}

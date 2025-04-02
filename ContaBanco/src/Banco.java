import java.util.List;

public class Banco {

    private String nome;
    private int agenciaBanco;
    private List<Conta> contas;

    public Banco(String nome, int agenciaBanco){
        this.nome = nome;
        this.agenciaBanco = agenciaBanco;
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) {
        this.agenciaBanco = agenciaBanco;
    }    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimeContas(){
        List<Conta> contas = getContas();
        System.out.println("\nContas cadastradas no banco");
        for (Conta conta : contas) {
            System.out.println("Conta ativa: "+conta.getCliente()+" - Agencia: "+conta.banco.agenciaBanco+" - Conta: "+conta.numeroConta);
        }
    }
    
}

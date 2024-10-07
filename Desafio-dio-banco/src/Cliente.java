import java.util.List;

public class Cliente extends Conta{

	private String nome;
	
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	private List<Cliente> listaCliente;

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	@Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                '}';
    }
	
	
}

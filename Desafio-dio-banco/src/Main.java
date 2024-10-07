import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Cliente cliente1 = new Cliente();
		
		List<Cliente > listaClientes = new ArrayList<Cliente>();
		
		cliente1.setNome("Saulo");
		cliente1.setNumero(1234);
		cliente1.setAgencia(0);
		cliente1.setSaldo(500.00);
		
		
		listaClientes.add(cliente1);
		
		Cliente cliente2 = new Cliente();

		cliente2.setNome("Pedro");
		cliente2.setNumero(5678);
		cliente2.setAgencia(0);
		cliente2.setSaldo(500.00);
		
		listaClientes.add(cliente2);
		
		
		System.out.println("Lista de cliente");
		
		System.out.println(listaClientes.toString());
				
	}

}

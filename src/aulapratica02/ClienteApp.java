package aulapratica02;

/**
 * Classe executável para realizar o estudo de herança
 * 
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class ClienteApp {
	
	public static void main(String[] args) {
		
		ClientePF clientepf1 = new ClientePF("Mariana","Bairro Teste","111.222.333-44");
		ClientePF clientepf2 = new ClientePF("Lucas", "Vizinho da Mariana", "159.426.359-94");
		ClientePJ clientepj1 = new ClientePJ("Loja do Neno","Centro da Cidade","11.222.333/4444-55");
		ClientePJ clientepj2 = new ClientePJ("Concorrente do Neno","Quase Centro","31.456.853/749-98");

		System.out.println("O nome das lojas cadastradas são: "+clientepj1.getNome()+" e "+clientepj2.getNome());
		System.out.println("O nome dos clientes cadastrados são: "+clientepf1.getNome()+" e "+clientepf2.getNome());
		System.out.println("Todos os dados do cliente 1: "+clientepf1.toString());
		System.out.println("Todos os dados da loja 1: "+clientepj1.toString());
		
	}
	
}

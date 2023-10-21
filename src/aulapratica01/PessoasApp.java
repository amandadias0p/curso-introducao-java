package aulapratica01;

/**
 * Classe com método executável para estudo do método acessador e modificador
 * 
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class PessoasApp {
	
	//criando dois objetos
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "Mariana");
		Pessoa pessoa2 = new Pessoa(2, "Fernando");
		
		//solicitando o nome do objeto através do método getNome pois o atributo é privado
		System.out.println("O nome do objeto pessoa1 é: "+pessoa1.getNome()); 
		
		//alterar o nome da pessoa1 para Marina
		pessoa1.setNome("Marina");
		
		//printar o nome da pessoa1 após alteração
		System.out.println("O nome do objeto pessoa1, após alteração, é: "+pessoa1.getNome()); 

	}
	
}



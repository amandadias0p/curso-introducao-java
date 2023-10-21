package aulapratica02;

/**
 * Classe que herda os atributos e métodos da classe Pai 'Cliente' feita para estudo
 * 
 * Estudo de polimorfismo ao herdar o método toString e alterar seu comportamento
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class ClientePF extends Cliente{
	
	private String cpf;
	
	public ClientePF(String nome, String endereco, String cpf){
		super(nome, endereco);
		this.cpf=cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	//herda o método do Pai e acrescenta
	public String toString() {
		return super.toString()+" CPF: "+cpf;
	}
}

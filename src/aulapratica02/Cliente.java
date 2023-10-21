package aulapratica02;
/**
 * Classe Pai para estudar os conceitos de herança
 * 
 * @author Amanda Dias
 * @date 12/09/2023
 */

//criando a classe Pai e seu método construtor, que serão herdados
public class Cliente {
	
	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}

	//criando métodos get e set, que também serão herdados
	public String getNome() {
	return nome;
}

	public String getEndereco() {
		return endereco;
}

	public void setNome(String nome) {
		this.nome=nome;
}

	public void setEndereco(String endereco) {
		this.endereco=endereco;
}
	
	public String toString() {
		return "nome: " + nome + " endereço: " + endereco;
	}

}

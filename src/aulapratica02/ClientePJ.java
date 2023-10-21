package aulapratica02;

/**
 * Criação de uma classe Filha para herdar os atributos e métodos
 * 
 * Estudo de polimorfismo ao herdar o método toString e alterar seu comportamento
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class ClientePJ extends Cliente{
	
	private String cnpj;
	
	//criando o método construtor chamando os atributos da classe Pai com o 'super'
	public ClientePJ(String nome, String endereco, String cnpj) {
		super(nome,endereco);
		this.cnpj=cnpj;
	}

	//montar os métodos get e set somente do atributo específico dessa classe, pois os outros foram herdados
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	//herda o método do Pai e acrescenta
	public String toString() {
		return super.toString()+" CPNJ: "+cnpj;
	}
}

package aulapratica01;


/**
 * Criando uma classe Pessoa
 * 
 * @author Amanda
 * @date 12/09/2023
 */

public class Pessoa {
	private int codigo;
	private String nome;
	
	public Pessoa(int codigo, String nome){
		this.codigo=codigo;
		this.nome=nome;
	}

	//acesso o nome pelo método pois o atributo é privado
	public String getNome() {
		return nome;
}

	//modifica o atributo
	public void setNome(String nome){
		this.nome=nome;
}

	public int getCodigo() {
		return codigo;
}

	public void setCodigo(int codigo) {
		this.codigo=codigo;
}
}
package aulapratica03;

/**
 * Classe para realizar o teste de sobrecarga de métodos
 * 
 * Criação de dois métodos com nomes iguais, porém parâmetros diferentes
 * 
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class ContaCorrente {

	private int numero, agencia;
	private double limite;
	
	public ContaCorrente(int numero, int agencia) {
		this.numero=numero;
		this.agencia=agencia;
	}
	
	public ContaCorrente(int numero, int agencia, double limite) {
		this.numero=numero;
		this.agencia=agencia;
		this.limite=limite;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia=agencia;
	}
	
	public void setLimite(double limite) {
		this.limite=limite;
	}
}

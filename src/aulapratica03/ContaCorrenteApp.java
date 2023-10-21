package aulapratica03;

/**
 * Classe executável para realizar o teste de sobrecarga de métodos
 * 
 * Instanciamos dois objetos na mesma classe porém com atributos diferentes
 * 
 * @author Amanda Dias
 * @date 12/09/2023
 */

public class ContaCorrenteApp {

	public static void main(String[] args) {
		
		ContaCorrente contacomum = new ContaCorrente(149, 169);
		ContaCorrente contalimite = new ContaCorrente(397, 134, 4700.00f);
		
		System.out.println("A conta comum é da agência: " + contacomum.getAgencia() + " e a conta especial é da agência: " + contalimite.getAgencia());
		System.out.println("O limite da conta especial é de " + contalimite.getLimite() + " reais.");
	}
}

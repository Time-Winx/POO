/* 
	Arthur Alves Correa - 1903356
	Gabriel Tomaz do Nascimento - 1903811 
	Eduardo Akira Hanada Oushiro - 1903669
	Matheus Pollini Malaquias - 1903942
	Victor Bastos De Carvalho - 1903491
	William Alves Ribeiro - 1903690
*/

package AC02_poo;

import java.util.Random;

public class ContaBancaria {
    private static int ultimoNumeroConta = 1000; // ultimo numero de conta utilizado
    private String correntista;
    private int numeroConta; // numero da conta
    private double saldo; // saldo da conta
    private String senha;
    private static double cpmfTaxa = 0.0025; // taxa da cpmf, atributo pertence a classe, não ao objeto
    private double cpmf; // Acumulo pago

    public ContaBancaria(String correntista, double saldo) {
        ultimoNumeroConta++;
        this.numeroConta = ultimoNumeroConta;
        this.saldo = saldo;
        this.correntista = correntista;
        // Senha gerada automaticamente
        this.senha = criarSenha();
        this.setCpmf(0);
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
        cpmf();
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
    	this.saldo = this.saldo - valor;
    	contaDestino.saldo = contaDestino.saldo + valor;			
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }
    
    private String criarSenha() {
    	Random ran = new Random();

		String[] letras ={"0","1","2","3","4","5","6","7","8","9"};
		String senha = "";
	  
		for ( int i = 0; i < 6; i++){
			int a = ran.nextInt(letras.length);
			senha += letras[a];
		}
		return senha;  
	}
	
    // Descontando cpmf do saldo da conta
    public void cpmf() {
        double taxa = this.saldo * cpmfTaxa;
        this.saldo -= taxa;
        this.setCpmf(this.getCpmf() + taxa);
    }
    
    public String toString() {
        return "Conta de " + this.correntista + " - Saldo de R$ " + this.saldo;
    }
    
    // Buscar valor acumulado da cmpf
	public double getCpmf() {
		return cpmf;
	}

	private void setCpmf(double cpmf) {
		this.cpmf = cpmf;
	}
	
	// Buscar senha do objeto
	public String getSenha() {
		return senha;
	}
}
package AC02_poo;

import java.util.Random;

public class ContaBancaria {
    private static int ultimoNumeroConta = 1000; // Último número de conta utilizado

    private String correntista;
    private int numeroConta; // número da conta
    private double saldo; // saldo da conta
    private String senha;

    public ContaBancaria(String correntista, double saldo) {
        ultimoNumeroConta++;
        this.numeroConta = ultimoNumeroConta;
        this.saldo = saldo;
        this.correntista = correntista;
        this.senha = criarSenha();
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
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

    public String toString() {
        return "Conta de " + this.correntista + " - Saldo de R$ " + this.saldo;
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
}
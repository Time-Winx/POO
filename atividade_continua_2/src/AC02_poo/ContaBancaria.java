package AC02_poo;

public class ContaBancaria {
    private static int ultimoNumeroConta = 1000; // �ltimo n�mero de conta utilizado
    private String correntista;
    private int numeroConta; // n�mero da conta
    private double saldo; // saldo da conta
    private static double cpmfTaxa = 0.0025; // Atributo da classe e não do objeto
    private double cpmf; // Acumulo pago


    public ContaBancaria(String correntista, double saldo) {
        ultimoNumeroConta++;
        this.numeroConta = ultimoNumeroConta;
        this.saldo = saldo;
        this.correntista = correntista;
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

    public void cpmf() {
        double taxa = this.saldo * cpmfTaxa;
        this.saldo -= taxa;
        this.setCpmf(this.getCpmf() + taxa);
    }
    
    public String toString() {
        return "Conta de " + this.correntista + " - Saldo de R$ " + this.saldo;
    }

	public double getCpmf() {
		return cpmf;
	}

	private void setCpmf(double cpmf) {
		this.cpmf = cpmf;
	}
}
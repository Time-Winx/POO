package AC02_poo;

import java.util.Scanner;

public class Banco {

	public static Scanner entrada;

	public static void mostrarInfo(ContaBancaria[] contas) {
		System.out.println("\nContas de todos os clientes:");
		for (int i = 0; i < contas.length; i++) {
			System.out.println("[" + i + "]" + contas[i].toString());
		}
		System.out.println("");
	}

	public static void interacaoSacar(ContaBancaria[] contas) {
		boolean clienteValido = false;
		int indiceConta = -1;
		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print("O saque ser� efetuado na conta de qual cliente? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("�ndice de cliente inv�lido!");
			}
		}

		System.out.print("Qual o valor do saque? ");
		double saque = entrada.nextDouble();
		contas[indiceConta].sacar(saque);
		System.out.println("Saque finalizado.\n");
	}

	public static void interacaoDepositar(ContaBancaria[] contas) {
		boolean clienteValido = false;
		int indiceConta = -1;
		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print("O dep�sito ser� efetuado na conta de qual cliente? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("�ndice de cliente inv�lido!");
			}
		}
		
		System.out.println("Qual o valor do dep�sito?");
		double deposito = entrada.nextDouble();
		contas[indiceConta].depositar(deposito);
		System.out.println("Dep�sito finalizado.\n");
		
	}
	public static void interacaoTransferir(ContaBancaria[] contas) {
		boolean clienteValido = false;
		int indiceConta = -1;
		int indiceConta2 = -1;
		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print("A transfer�ncia ser� feita de qual conta? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("�ndice de cliente inv�lido!");
			}
			
			System.out.print("Para qual conta ir� transferir? (0 a " + (contas.length - 1) + "): ");
			indiceConta2 = entrada.nextInt();
			if (indiceConta2 >= 0 && indiceConta2 < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("�ndice de cliente inv�lido!");
			}
		}
		
		System.out.print("Qual o valor da transfer�ncia?");
		double valor = entrada.nextDouble();
		ContaBancaria contaDestino = contas[indiceConta2];
		contas[indiceConta].transferir(valor, contaDestino);
		System.out.println("Transfer�ncia finalizada.\n");
	}
	
	public static void main(String[] args) {
		ContaBancaria[] contas = new ContaBancaria[5];
		contas[0] = new ContaBancaria("Marcos", 1000.00);
		contas[1] = new ContaBancaria("J�lia", 250.00);
		contas[2] = new ContaBancaria("Jo�o", 2500.00);
		contas[3] = new ContaBancaria("Roberto", 3000.00);
		contas[4] = new ContaBancaria("Jana�na", 4500.00);

		entrada = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("Escolha uma opera��o:");
			System.out.println("(1) mostrar informa��es de todas as contas");
			System.out.println("(2) sacar");
			System.out.println("(3) depositar");
			System.out.println("(4) transferir");
			System.out.println("(5) sair");
			System.out.print("Op��o escolhida: ");
			int escolha = entrada.nextInt();
			System.out.println();

			switch (escolha) {
			case 1:
				mostrarInfo(contas);
				break;
			case 2:
				interacaoSacar(contas);
				break;
			case 3:
				interacaoDepositar(contas);
				break;
			case 4:
				interacaoTransferir(contas);
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}
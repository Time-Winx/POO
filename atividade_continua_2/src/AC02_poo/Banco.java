/* 
	Arthur Alves Correa - 1903356
	Gabriel Tomaz do Nascimento - 1903811 
	Eduardo Akira Hanada Oushiro - 1903669
	Matheus Pollini Malaquias - 1903942
	Victor Bastos De Carvalho - 1903491
	William Alves Ribeiro - 1903690
*/


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
			System.out.print("O saque será efetuado na conta de qual cliente? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("Indice de cliente invalido!");
			}
		}

		System.out.print("Qual o valor do saque? ");
		double saque = entrada.nextDouble();
		contas[indiceConta].sacar(saque);
		System.out.println("Saque finalizado.\n");
	}
	
	// Interação para realizar deposito (Questão 1)
	public static void interacaoDepositar(ContaBancaria[] contas) {
		boolean clienteValido = false;
		int indiceConta = -1;
		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print("O deposito será efetuado na conta de qual cliente? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("Indice de cliente invalido!");
			}
		}
		
		System.out.print("Qual o valor do deposito? ");
		double deposito = entrada.nextDouble();
		contas[indiceConta].depositar(deposito);
		System.out.println("Deposito finalizado.\n");
		
	}
	
	// Interação para realizar a tranferência (Questão 3)
	public static void interacaoTransferir(ContaBancaria[] contas) {
		boolean clienteValido = false;
		int indiceConta = -1;
		int indiceConta2 = -1;
		
		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print("A transferancia será feita de qual conta? (0 a " + (contas.length - 1) + "): ");
			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("Indice de cliente invalido!");
			}
			
			System.out.print("Para qual conta ira transferir? (0 a " + (contas.length - 1) + "): ");
			indiceConta2 = entrada.nextInt();
			if (indiceConta2 >= 0 && indiceConta2 < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("Indice de cliente invalido!");
			}
		}
		
		System.out.print("Qual o valor da transferencia?");
		double valor = entrada.nextDouble();
		ContaBancaria contaDestino = contas[indiceConta2];
		
		boolean tentativas = true;
		
		// Verificando senha para realizar tranferência
		while(tentativas) {
			String senha = contas[indiceConta].getSenha();
			System.out.println("Dica, a senha é: " + senha);
			System.out.print("Informe a senha: ");
			String s = entrada.next();
			if (senha.equals(s)) {
				contas[indiceConta].transferir(valor, contaDestino);
				System.out.println("Transferência efetuada!");
				tentativas = false;
			}
			else {
				System.out.println("Senha incorreta!\n");
				System.out.print("Tentar novamente? (s/n)");
				String t = entrada.next();
				if(t == "n") {
					tentativas = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		ContaBancaria[] contas = new ContaBancaria[5];
		contas[0] = new ContaBancaria("Marcos", 1000.00);
		contas[1] = new ContaBancaria("Julia", 250.00);
		contas[2] = new ContaBancaria("João", 2500.00);
		contas[3] = new ContaBancaria("Roberto", 3000.00);
		contas[4] = new ContaBancaria("Janaina", 4500.00);

		entrada = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("Escolha uma operação:");
			System.out.println("(1) mostrar informações de todas as contas");
			System.out.println("(2) sacar");
			System.out.println("(3) depositar");
			System.out.println("(4) transferir");
			System.out.println("(5) sair");
			System.out.print("Opção escolhida: ");
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
				System.out.println("Opção invalida!");
			}
			System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}
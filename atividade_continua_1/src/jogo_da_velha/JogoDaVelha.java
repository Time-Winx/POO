/**
 * Arthur Alves Correa - 1903365
 * Eduardo Akira Hanada Oushiro - 1903669
 * Gabriel Tomaz do Nascimento - 1903811
 * Matheus Pollini Malaquias - 1903942
 * Victor Bastos De Carvalho - 1903491
 * William Alves Ribeiro - 1903690
 */
package jogo_da_velha;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {

    private static final int qtde_jogadores = 2;

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Definição de um jogador utilizndo como base a Estrtura de nodo
     */
    private static class Jogador {

        public String name;
        public int id;
        public char identifier;

        protected Jogador next;

        public Jogador(String user_name, int user_id, char user_identifier) {

            this.name = user_name;
            this.id = user_id;
            this.identifier = user_identifier;

        }

        /**
         * @return retorna proximo jogador
         */
        public Jogador getNext() {
            return next;
        }

        /**
         * configura jogador
         *
         * @param player jogdaor
         */
        public void setNext(Jogador player) {
            next = player;
        }
    }

    /**
     * Classe responsavel por implementar uma lista circular encadeada
     * para fazer a transição entre os jogadores
     */
    private static class listaJogadores {

        public Jogador cursor;
        protected int size;

        public void to_proximo() {
            cursor = cursor.getNext();
        }

        public void add(Jogador jogador) {
            if (cursor == null) {
                jogador.setNext(jogador);
                cursor = jogador;
            } else {
                jogador.setNext(cursor.getNext());
                cursor.setNext(jogador);
            }
            size++;
        }


    }

    private static final char[] lista_simbolos = {'X', 'O'};

    private static final String[] codigos_status = {
            "Ocorreu um empate",
            "Jogador 0 venceu",
            "Jogador X venceu"};

    public static void main(String[] args) {

        game();

    }


    /**
     * Representação do tabuleiro como uma matriz de caracteres 3x3.
     *
     * @return Matriz de caracteres 3x3 com algum valor que indique que a posição não foi ocupada
     */
    public static char[][] initialize() {

        return new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    }


    /**
     * @param M     Matriz do jogo da velha
     * @param lin   Linha da matriz
     * @param col   Coluna da matrz
     * @param gamer Codigo do jocador (X ou 0)
     * @return Retorna True se a posição puder ser preenchida
     * Retorna False se posição nao puder ser preenchida
     * OBS: a  Considere como posições válidas as linhas 0, 1 e 2; e as colunas 0, 1 e 2.]
     */
    public static boolean step(char[][] M, int lin, int col, char gamer) {

        if (lin < M.length && col < M[0].length) {
            if (M[lin][col] == '-') {
                M[lin][col] = gamer;
                return true;
            }
            System.out.println("Posição ocupada. Tente novamente");
            return false;
        }
        System.out.println("Posição inválida. Escolha novamente");
        return false;
    }


    /**
     * @param M Matriz do jogo da valha
     * @return (- 1 - jogo pode continuar, 0 - ocorreu um empate, 1 - jogador O venceu, 2 - jogador X venceu
     *)
     */
    public static int status(char M[][]) {

        // conferencia linhas
        for (char[] linha_atual : M) {

            char caracter_predominante = checkIfAllisEqual(linha_atual);

            if (caracter_predominante == 'O') {
                return 1;
            } else if (caracter_predominante == 'X') {
                return 2;
            }
        }

        // Conferencia colunas

        char valor_culunas = getCharColumn(M);

        if (valor_culunas == 'X') {
            return 2;
        } else if (valor_culunas == 'O') {
            return 1;
        }

        // Conferencia diagonal
//        TODO: fazer conferencia diagonal


        char[] matriz_identidade = new char[M[0].length];
        for (int i = 0; i < M.length; i++) {
            matriz_identidade[i] = M[i][i];
        }

        char valor_predominante_matriz_identidade = checkIfAllisEqual(matriz_identidade);

        if (valor_predominante_matriz_identidade == 'O') {
            return 1;
        } else if (valor_predominante_matriz_identidade == 'X') {
            return 2;
        }

        char[] matriz_inversa = new char[M.length];
        for (int j = M.length - 1, i = 0; j >= 0 && i < M.length; j--, i++) {
            matriz_inversa[i] = M[i][j];
        }


        char valor_predominante_matriz_inversa = checkIfAllisEqual(matriz_inversa);

        if (valor_predominante_matriz_inversa == 'O') {
            return 1;
        } else if (valor_predominante_matriz_inversa == 'X') {
            return 2;
        }

        // fazer conferencia empate

        boolean contem_barra = false;
        for (char[] linha_atual : M) {
            for (char el : linha_atual) {
                if (el == '-') {
                    contem_barra = true;
                    break;
                }
            }
        }

        if (!contem_barra) return 0;

        return -1;
    }

    public static char getCharColumn(char nums[][]) {

        char[] vetorLinha = new char[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                vetorLinha[j] = nums[j][i];
            }

            char caracter_predominante = checkIfAllisEqual(vetorLinha);

            if (caracter_predominante != '-') return caracter_predominante;
        }

        return '-';
    }

    public static char checkIfAllisEqual(char array[]) {

        boolean todos_os_valores_iguais = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] || array[i - 1] == '-') {
                todos_os_valores_iguais = false;
                break;
            }
        }

        if (todos_os_valores_iguais) {
            return array[0];
        } else {
            return '-';
        }
    }

    /**
     * Exexução da logica do jogo
     * LOGICA:
     * O jogador `O`sempre deve iniciar
     * A cada jogada, a matriz do jogo deverá ser exibida na tela.
     * Ao final do jogo, esse método deve mostrar o resultado
     */
    public static void game() {

        char[][] main_matrix = initialize();

        listaJogadores lista_jogadores = new listaJogadores();

        System.out.println("""
                Bem vindo ao jogo da velha!
                para iniciar, vamos definir os nomes dos jogadores
                """);

        for (int i = 1; i <= qtde_jogadores; i++) {

            System.out.printf("\nInsira o nome do jogador %d%n\n", i);

            String nome_jogador = scanner.nextLine();

            Jogador jogador = new Jogador(nome_jogador, i, lista_simbolos[i - 1]);

            System.out.printf("""

                            Olá %s !!!
                            Você ficará com o simbolo %C
                            """,
                    nome_jogador, lista_simbolos[i - 1]);

            lista_jogadores.add(jogador);
        }

        System.out.println("\n\n----INiCIANDO O JOGO----\n\n");

        print_tabuleiro(main_matrix);

        int status = status(main_matrix);

        while (status == -1) {

            boolean valores_validos = false;

            while (!valores_validos) {

                System.out.printf("%s('%c'), escolha a coluna: ",
                        lista_jogadores.cursor.name,
                        lista_jogadores.cursor.identifier);
                int valor_input_coluna = scanner.nextInt();
                System.out.printf("%s('%c'), escolha a linha: ",
                        lista_jogadores.cursor.name,
                        lista_jogadores.cursor.identifier);
                int valor_input_linha = scanner.nextInt();


                valores_validos = step(main_matrix, valor_input_linha,
                        valor_input_coluna,
                        lista_jogadores.cursor.identifier);
            }

            status = status(main_matrix);
            if (status == -1) {
                System.out.println("Jogo pode continuar");
            } else {
                System.out.println(codigos_status[status]);
            }
            lista_jogadores.to_proximo();
            print_tabuleiro(main_matrix);

        }

        System.out.println(codigos_status[status]);

    }

    public static void print_tabuleiro(char[][] tabuleiro) {

        System.out.println(Arrays.deepToString(tabuleiro).replace(
                "], ", "\n").replace("[", "").replace(
                "]]", "").replace(",", ""));
        System.out.println("\n");

    }
}


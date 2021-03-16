package jogo_da_velha;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {

    private static int qtde_jogadores = 2;

    private static Scanner scanner = new Scanner(System.in);

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

        public Jogador getNext() {
            return next;
        }

        public void setNext(Jogador player) {
            next = player;
        }
    }

    private static class listaJogadores {

        public Jogador cursor;
        protected int size;

        public void ListaJogadores() {
            cursor = null;
            size = 0;
        }

        public int size() {
            return size;
        }

        public Jogador getJogador() {
            return cursor;
        }

        public Jogador proximojogador() {
            return cursor.getNext();
        }

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

    private static char[] lista_simbolos = {'X', 'O'};

    private static String[] codigos_status = {
            "Ocorreu um empate",
            "jogo pode continuar",
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
     * @return (1 - jogo pode continuar, 0 - ocorreu um empate, 3 - jogador O venceu, 2 - jogador X venceu
     *)
     */
    public static int status(char M[][]) {


        for (int index_lin = 0; index_lin < M.length; index_lin++) {

            char[] linha = M[index_lin];

            for (int index_item_line = 0; index_item_line < linha.length; index_item_line++) {

                // TODO: Implementar check if all variables matches with case

            }
        }


        // TODO: check for all columns

        // TODO: check for indentity matrix

        // TODO: check for seconday matrix

        return 1;
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

        System.out.println("Bem vindo ao jogo da velha!\n" +
                "para iniciar, vamos definir os nomes dos jogadores\n");

        for (int i = 1; i <= qtde_jogadores; i++) {

            System.out.printf("\nInsira o nome do jogador %n\n", i);

            String nome_jogador = scanner.nextLine();

            Jogador jogador = new Jogador(nome_jogador, i, lista_simbolos[i - 1]);

            System.out.printf("\nOlá %s !!!\n" +
                            "Você ficará com o simbolo %C\n",
                    nome_jogador, lista_simbolos[i - 1]);

            lista_jogadores.add(jogador);
        }

        System.out.println("\n\n----INiCIANDO O JOGO----\n\n");

        print_tabuleiro(main_matrix);

        int status = status(main_matrix);


        while (status == 1) {

            boolean valores_validos = false;

            while (valores_validos == false) {

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
            System.out.println(codigos_status[status]);
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


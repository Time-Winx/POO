package jogo_da_velha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {

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

    public static void print_tabuleiro(char[][] tabuleiro) {

        System.out.println(Arrays.deepToString(tabuleiro).replace(
                "], ", "\n").replace("[", "").replace(
                "]]", "").replace(",", ""));
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

        if (M[lin][col] == '-') {
            M[lin][col] = gamer;
            return true;
        }
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

        return 0;
    }

    /**
     * Exexução da logica do jogo
     * LOGICA:
     * O jogador `O`sempre deve iniciar
     * A cada jogada, a matriz do jogo deverá ser exibida na tela.
     * Ao final do jogo, esse método deve mostrar o resultado
     */
    public static void game() {

        Scanner scanner = new Scanner(System.in);

        String[] codigos_status = {
                "jogo pode continuar",
                "Ocorreu um empate",
                "Jogador 0 venceu",
                "Jogador X venceu"};

        char[][] main_matrix = initialize();

        print_tabuleiro(main_matrix);

        int status = status(main_matrix);


        while (status == 1) {
//            # TODO: implementar logica

        }

        System.out.println(codigos_status[status]);

    }

}

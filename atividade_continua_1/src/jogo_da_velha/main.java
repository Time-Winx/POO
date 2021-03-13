package jogo_da_velha;

public class main {

    /**
     * Representação do tabuleiro como uma matriz de caracteres 3x3.
     *
     * @return Matriz de caracteres 3x3 com algum valor que indique que a posição não foi ocupada
     */
    public static char[][] initialize() {
        // TODO: implmentar metodo
        return null;
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
    public static boolean step(char M[][], int lin, int col, char gamer) {
        // TODO: implmentar metodo
        return false;
    }


    /**
     * @param M Matriz do jogo da valha
     * @return (1 - jogo pode continuar, 0 - ocorreu um empate, 1 - jogador O venceu, 2 - jogador X venceu
     *)
     */
    public static int status(char M[][]) {
        // TODO: implmentar metodo
        return 0;
    }

    /**
     * Exexução da logica do jogo
     *
     * LOGICA:
     *
     * O jogador `O`sempre deve iniciar
     * A cada jogada, a matriz do jogo deverá ser exibida na tela.
     * Ao final do jogo, esse método deve mostrar o resultado
     */
    public static void game() {
        // TODO: implmentar metodo
    }


}

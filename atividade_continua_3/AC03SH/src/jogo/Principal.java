package jogo;

public class Principal {
    public static void main(String args[]){
        /*
            Arthur Alves Correa - 1903356
            Gabriel Tomaz do Nascimento - 1903811 
            Eduardo Akira Hanada Oushiro - 1903669
            Matheus Pollini Malaquias - 1903942
            Victor Bastos De Carvalho - 1903491
            William Alves Ribeiro - 1903690
        */
        // Crie um objeto da classe SuperHeroi e um objeto da classe Vilao.
        SuperHeroi heroi = new SuperHeroi("Homem-Aranha", "Peter Park");
        Vilao vilao = new Vilao("Duende-Verde", "Norman Osbourne", 1);

        // Crie os superpoderes a atribua-os ao objetos SuperHeroi e Vilao.
        SuperPoder poder1 = new SuperPoder("soltar teia", 3);
        SuperPoder poder2 = new SuperPoder("andar em paredes", 2);
        SuperPoder poder3 = new SuperPoder("sentido apurado", 1);
        SuperPoder poder4 = new SuperPoder("força", 5);

        heroi.adicionarSuperPoder(poder1);
        heroi.adicionarSuperPoder(poder2);
        heroi.adicionarSuperPoder(poder3);
        vilao.adicionarSuperPoder(poder4);

        // Crie um objeto da classe Confronto e invoque o método lutar, passando como parâmetro o super-herói e o vilão
        Confronto confronto = new Confronto();
        int resultado = confronto.lutar(heroi, vilao);

        // Mostre uma mensagem na tela dizendo quem é que vence o confronto.
        if(resultado == 1){
            System.out.println("O Heroi venceu a luta!");
        }else if(resultado == 2){
            System.out.println("O Vilão venceu a luta!");
        }else{
            System.out.println("A luta terminou empatada!");
        }
    }
}

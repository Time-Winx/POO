package jogo;

public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal);
    }
    
    @Override
    public double getPoderTotal(){
        double soma = super.getPoderTotal();
        return soma + (soma * 0.1);
    }
}
        
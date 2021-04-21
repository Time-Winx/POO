package jogo;

public class SuperPoder {
    private String nome;
    private int categoria;

    // Construtor
    public SuperPoder(String nome, int categoria){
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCategoria(){
        return this.categoria;
    }
}

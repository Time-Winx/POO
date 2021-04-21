package jogo;

public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private SuperPoder[] poderes = new SuperPoder[4];


    public void adicionarSuperPoder(SuperPoder superpoder){
        for(int i = 0; i < poderes.length; i++){
            if(poderes[i] == null){ 
                poderes[i] = superpoder; 
                break;
            }
        }
    }

    public double getPoderTotal(){
        double soma = 0;
        for(int i = 0; i < poderes.length; i++){
            if(poderes[i] != null){
                soma += poderes[i].getCategoria();
            }
        }
        return soma;
    }

    public Personagem(String nome, String nomeVidaReal){
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }
}

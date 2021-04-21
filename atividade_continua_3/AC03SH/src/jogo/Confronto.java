package jogo;

public class Confronto {
    public int lutar(SuperHeroi superheroi, Vilao vilao){
        if(superheroi.getPoderTotal() > vilao.getPoderTotal()){
            return 1;
        }else if(vilao.getPoderTotal() > superheroi.getPoderTotal()){
            return 2;
        }else{
            return 0;
        }
    }
}

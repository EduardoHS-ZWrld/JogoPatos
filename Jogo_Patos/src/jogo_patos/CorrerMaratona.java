package jogo_patos;

public class CorrerMaratona {
    
    private int correrV;
    
    CorrerMaratona() {
        correrV = 10;
    }

    public int getCorrerV() {
        return correrV;
    }
    
    public String Correr() {
        if(1000 /*número representando a distância*/ < 200){
            correrV = 20;
            return "Correndo como um maratonista. Velocidade: " + getCorrerV();
        } else {
            return "Corre com seus pés de pato. Velocidade: " + getCorrerV();
        }
        
    }
    
}

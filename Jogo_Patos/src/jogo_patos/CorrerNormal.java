package jogo_patos;

public class CorrerNormal {
    
    private int correrV;
    
    public CorrerNormal() {
        correrV = 10;
    }

    public int getCorrerV() {
        return correrV;
    }
    
    public String Correr() {
        return "Corre com seus pés de pato. Velocidade: " + getCorrerV();
    }
    
}

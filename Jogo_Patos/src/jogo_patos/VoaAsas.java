package jogo_patos;

public class VoaAsas implements PadraoVoar {
    
    private double voarV;
    
    public VoaAsas() {
        voarV = 10;
    }
        
    public double getVoarV() {
        return voarV;	
    }
    
    public String Voar() {
        return "Voando como um pássaro que voa. Velocidade: " + getVoarV();
    }
}

package jogo_patos;

public class VoaNvoa implements PadraoVoar {
    
    public VoaNvoa() {
    }
    
    public String Voar() {
        return "Esse pato não Voa. Velocidade: " + getVoarV();
    }

    public double getVoarV() {
        return 0;
    }
}

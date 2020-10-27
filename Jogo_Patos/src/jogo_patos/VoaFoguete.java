package jogo_patos;

public class VoaFoguete implements PadraoVoar{
    
    private double Voarv;
    
    public VoaFoguete(){
        Voarv = 1000;	
    }
    
    public double getVoarV() {
        return Voarv;
    }
        
    public String Voar() {
        return "Voando como um foguete. Velocidade: " + getVoarV();		
    } 
}

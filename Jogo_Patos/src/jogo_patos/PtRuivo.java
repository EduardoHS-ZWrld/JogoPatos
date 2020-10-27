package jogo_patos;

public class PtRuivo extends Pato implements PadraoGrasnar{

    public PtRuivo(){
        setComportVoar(new VoaAsas());
    }
    
    public String Mostrar() {
        return "Eu sou o Pato Ruivo." ;
    }
    	
    public String Grasnar() {
        return "Que-Que.";
    }
}

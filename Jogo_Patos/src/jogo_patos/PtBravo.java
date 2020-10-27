package jogo_patos;

public class PtBravo extends Pato implements PadraoGrasnar{

    public PtBravo(){
        setComportVoar(new VoaAsas());
    }
    
    public String Mostrar() {		
        return "Eu sou o Pato Bravo.";
    }

    public String Grasnar() {
        return "Que-Que. Grrrrrrrrr.";
    }
}

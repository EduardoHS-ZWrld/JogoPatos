package jogo_patos;

public abstract class Pato {
    
    public PadraoVoar comportVoar;
    public PadraoCorrer comportCorrer;

    abstract String Mostrar();
	
    public String Nadar() {
        return "Pato Nadando.";
    }	

    public void setComportVoar(PadraoVoar padrao) {
        comportVoar = padrao;		
    }   
    public String ComportVoo() {		
        return comportVoar.Voar();		
    }
    
    public void setComportCorrer(PadraoCorrer padrao) {
        comportCorrer = padrao;		
    }
    public String ComportCorrer() {		
        return comportCorrer.Correr();		
    }
}

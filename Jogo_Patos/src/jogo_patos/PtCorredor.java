package jogo_patos;

public class PtCorredor extends Pato implements PadraoGrasnar{
    
    public PtCorredor() {
        setComportCorrer((PadraoCorrer) new CorrerNormal());
    }

    @Override
    public String Mostrar() {
        return "Eu sou o Pato Corredor";
    }

    @Override
    public String Grasnar() {
        return "Quá Quá";
    }
    
}

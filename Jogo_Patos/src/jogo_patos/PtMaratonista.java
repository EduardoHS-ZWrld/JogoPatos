package jogo_patos;

public class PtMaratonista extends Pato implements PadraoGrasnar{
    
    public PtMaratonista() {
        setComportCorrer((PadraoCorrer) new CorrerMaratona());
    }

    @Override
    public String Mostrar() {
        return "Eu sou o Pato Maratonista";
    }

    @Override
    public String Grasnar() {
        return "Quick Quick";
    }
    
}

package jogo_patos;

public class PtBorracha extends Pato {

    public PtBorracha() {
	setComportVoar(new VoaNvoa());
    }

    public String Mostrar() {
	return "Olá, eu sou de Boarracha.";
    }
}

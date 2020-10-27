package jogo_patos;

public class Main {

    public static void main(String[] args) {
        Pato pt = new PtRuivo();		

	System.out.println(pt.Mostrar());
	System.out.println(pt.Nadar());
	System.out.println(pt.ComportVoo());
	
	pt.setComportVoar(new VoaFoguete());
	
	System.out.println(pt.ComportVoo());
        
    }
}


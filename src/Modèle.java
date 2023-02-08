import java.awt.Color;
import java.util.Random;

public class Modèle {
	public static final Color[] COULEURS = {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.BLACK,Color.WHITE};
	public static final int N_TENTATIVES = 0;
	public static final int DIFFICULTE =0 ;
	public static enum Etat {ENEN_COURS,GAGNé,PERDU};
	
	Etat état;
	Rangée combinaison;
	Rangée[] prpopositions;
	int tentative;
	public Modèle(){
		Random rand = new Random();
		Color[] temp= new Color[4];
		for (int i = 0; i < 4; i++) {
	        int randomIndex = rand.nextInt(this.COULEURS.length);
	        temp[i]= this.COULEURS[randomIndex];
	    }
		this.combinaison = new Rangée(temp);
	}
	
	
}

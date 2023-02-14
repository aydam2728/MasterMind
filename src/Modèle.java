import java.awt.Color;
import java.util.Random;

public class Modèle {
	public static final Color[] COULEURS = {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.BLACK,Color.WHITE};
	public static final int N_TENTATIVES = 0;
	public static final int DIFFICULTE =4;
	public static enum Etat {ENEN_COURS,GAGNé,PERDU};
	
	Etat état;
	Rangée combinaison;
	Rangée[] propositions;
	int tentative;
	public Modèle(){
		//
	}
	public void newCombinaison() {
		Random rand = new Random();
		Color[] temp= new Color[4];
		for (int i = 0; i < 4; i++) {
	        int randomIndex = rand.nextInt(this.COULEURS.length);
	        temp[i]= this.COULEURS[randomIndex];
	    }
		this.combinaison = new Rangée(temp);
	}
	
	public void CreateProposition(Color c) {
		this.propositions[this.propositions.length] = new  Rangée(new Color[] {c});
	}
	
	public void AddToProposition(int i, Color c) {
		this.propositions[i].addToLine(c);
	}
}

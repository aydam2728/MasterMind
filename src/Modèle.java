import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Modèle {
	public static final Color[] COULEURS = {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.BLACK,Color.WHITE};
	public static final int N_TENTATIVES = 0;
	public static final int DIFFICULTE =4;
	public static enum Etat {ENEN_COURS,GAGNé,PERDU};
	
	Etat état;
	Rangée combinaison;
	Rangée[] propositions = new Rangée[10];
	int tentative=0;
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
		this.combinaison = new Rangée(temp,this.DIFFICULTE);
		this.CreateProposition(null);
	}
	
	public void CreateProposition(Color c) {
		this.propositions[this.tentative] = new  Rangée(c,this.DIFFICULTE);
	}
	
	public void AddToProposition(Color c) {
		if (this.propositions[this.tentative].complete) {this.tentative ++ ;this.CreateProposition(c);}
		this.propositions[this.tentative].addToLine(c);
	}
	
	public List calcul() {
		List<Integer> values = new ArrayList<>();
		int noir=0;
		int blanc=0;
		for(int i=0 ;i<this.DIFFICULTE;i++) {
			if(this.propositions[this.tentative].jetons[i] == this.combinaison.jetons[i]) {
				noir++;
			}else {
				for (int y=0 ;y<this.DIFFICULTE;y++)
					if (this.propositions[this.tentative].jetons[i] == this.combinaison.jetons[y] && blanc<5 && i!=y) {
						blanc ++;
					}
			}
		}
		this.propositions[this.tentative].blanc = blanc;
		this.propositions[this.tentative].noir = noir;
		
		values.add(noir);
		values.add(blanc);
		return values;
	}
	
}

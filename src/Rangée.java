import java.awt.Color;
import java.util.Arrays;

public class Rangée {
	Color[] jetons = new Color[4];
	int indiceJeton=0;
	int DIFFICULTE;
	boolean complete = false;
	int noir;
	int blanc;
	
	
	public Rangée(Color[] jet,int DIFFICULTE) {
		this.DIFFICULTE = DIFFICULTE;
		this.jetons =jet;
		this.noir = 0;
		this.blanc = 0;
	}
	public Rangée(Color c,int DIFFICULTE) {
		this.DIFFICULTE = DIFFICULTE;
		this.jetons[0] =c;
		this.noir = 0;
		this.blanc = 0;
	}
	public void ligne() {
		if (this.indiceJeton == this.DIFFICULTE ) {
			this.complete = true;
		}
	}
	public void addToLine(Color c) {
		this.jetons[this.indiceJeton] = c;
		this.indiceJeton ++;
		this.ligne();
	}
	public Color getColor(int indice) {
		return this.jetons[indice];
	}
	public String toString() {
		return Arrays.toString(this.jetons);
	}
}


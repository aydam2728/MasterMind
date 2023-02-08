import java.awt.Color;

public class Rangée {
	Color[] jetons = new Color[4];
	boolean complete = false;
	int noir;
	int blanc;
	
	
	public Rangée(Color[] jet) {
		jet = this.jetons;
		this.noir = 0;
		this.blanc = 0;
	}
	public void ligne() {
		if (this.jetons.length == Modèle.DIFFICULTE ) {
			this.complete = true;
		}
	}
	public void addToLine(Color c) {
		this.jetons[this.jetons.length] = c;
		this.ligne();
	}
}


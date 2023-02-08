import java.awt.Color;

public class Rangée {
	Color[] jetons = new Color[4];
	int indiceJetons = 0;
	int res;
	
	
	public Rangée(Color[] jet) {
		jet = this.jetons;
	}
	public void ligne(Color[] jet) {
		jet = this.jetons;
		if (this.indiceJetons == 4) {
			System.out.println("La ligne est complète");
		}
		else if (0 < this.indiceJetons && this.indiceJetons < 4) {
			System.out.println("La ligne est entamée");
		}else {
			System.out.println("La ligne n'est pas commencé");
		}
	}
	public int score() {
		for(int i = 0; i < this.jetons.length; i++) {
			try {
				if(this.jetons[i]== Modèle.combinaison[i]) {
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return this.res;
	}         
}

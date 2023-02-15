import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Contrôleur implements ActionListener{
	Modèle modele = new Modèle();
	Frame frame = new Frame(modele.COULEURS,this);
	public Contrôleur() {
		modele.newCombinaison();
		
	}
	
	public static void main(String[] args){
		new Contrôleur();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("yep");
	}
	
	public void checkWin() {
		for (int i = 0; i<this.modele.propositions.length; i++) {
			Rangée arr1[] = {this.modele.propositions[i]};
	        Rangée arr2[] =	{this.modele.combinaison};
	        if (Arrays.equals(arr1, arr2) && i <= this.modele.propositions.length)
	            System.out.println("Gagné");
	        else
	            System.out.println("Perdu gros naze");
		}
	}
}
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;


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
		this.modele.AddToProposition(((JButton) e.getSource()).getBackground());
		this.frame.addCircle(((JButton) e.getSource()).getBackground(), this.modele.propositions[this.modele.tentative].indiceJeton-1, this.modele.tentative);
		
		if (this.modele.propositions[this.modele.tentative].complete) {
		List<Integer> values = this.modele.calcul();
		for (int i=0;i<values.get(0);i++) {
			this.frame.addMinus(Color.black, i, this.modele.tentative);
		}
		for (int i=0;i<values.get(1);i++) {
			this.frame.addMinus(Color.white, i, this.modele.tentative);
		}
		this.checkWin();
		}
	}
	
	public void checkWin() {
		
			if (Arrays.equals(this.modele.propositions[this.modele.tentative].jetons, this.modele.combinaison.jetons)){
				System.out.println("gg");
			
			}else if (this.modele.tentative == 9){
				System.out.println("Perdu");
				this.frame.deleteAllButtons();
				
			}
}
}
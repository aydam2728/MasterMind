import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
		//System.out.println(((JButton) e.getSource()).getBackground());
		this.frame.addCircle(((JButton) e.getSource()).getBackground(), this.modele.propositions[this.modele.tentative].indiceJeton-1, this.modele.tentative);
		this.frame.addMinus(((JButton) e.getSource()).getBackground(), this.modele.propositions[this.modele.tentative].indiceJeton-1, this.modele.tentative);

		this.checkWin();
		//System.out.println(this.modele.propositions[this.modele.tentative]);
	}
	
	public void checkWin() {
		if (this.modele.propositions[this.modele.tentative].complete) {
			if (Arrays.equals(this.modele.propositions[this.modele.tentative].jetons, this.modele.combinaison.jetons)){
				System.out.println("gg");
			}else {
				System.out.println("gros naze");
			}

		
		}
	}
}
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
		
	}
}
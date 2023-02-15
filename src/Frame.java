import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Frame extends javax.swing.JFrame{

	public Frame(Color[] COULEURS,Contrôleur ctrl) {
		
		JPanel VueClavier = new JPanel();
		getContentPane().add(VueClavier, BorderLayout.SOUTH);
		VueClavier.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
		
		//Creation des boutons 
		for(Color r : COULEURS) {
			JButton btnNewButton = new JButton();
			btnNewButton.setBackground(r);
			btnNewButton.setPreferredSize(new Dimension(50, 50));
			btnNewButton.addActionListener(ctrl);
			VueClavier.add(btnNewButton);
		}
		
		
		Canvas VuePropositions = new Canvas();
		getContentPane().add(VuePropositions, BorderLayout.CENTER);
		this.getContentPane().setPreferredSize(new Dimension(500, 500));
	    this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


}

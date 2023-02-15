import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Frame extends javax.swing.JFrame{
	Graphics g ;
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
		this.g = VuePropositions.getGraphics();
	}
	
	public void addCircle(Color c,int i,int tentative) {
		System.out.println(i);
		g.setColor(c);
		this.g.fillOval(i*100, 50+(tentative*50), 25, 25);
		
	}
	
	public void addMinus(Color c,int i,int tentative) {
		System.out.println(i);
		g.setColor(c);
		if (i <=1) {
			this.g.fillOval(400+i*20, 50+(tentative*50), 10, 10);

		}else {
			if(i==3) {
				this.g.fillOval(420, 70+(tentative*50), 10, 10);

			}else {
				this.g.fillOval(400, 70+(tentative*50), 10, 10);

			}

		}
	}


}

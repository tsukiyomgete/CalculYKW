package com.ykwshowdown.VisualSwing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.ykwshowdown.menu.HomeMenu;

public class JFrameCard extends JFrame implements ActionListener{
	CardLayout card;
	JPanel panelPrincipale;
	
	JFrameCard()
	{
		this.setTitle("Navigation avec CardLayout");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
		
		card = new CardLayout();
		this.getContentPane().setLayout(card);
		HomeMenu hm = new HomeMenu();
        JHomeMenu jhm = new JHomeMenu(hm);
        
	}
	
	public void actionPerformed(ActionEvent e) {
        card.next(this.getContentPane());
    }
}

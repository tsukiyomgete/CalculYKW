package com.ykwshowdown.VisualSwing;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.ykwshowdown.VisualSwing.StylizedButton.BackgroundPanel;
import com.ykwshowdown.VisualSwing.StylizedButton.StyledButton;
import com.ykwshowdown.menu.HomeMenu;

public class JHomeMenu extends JPanel{
	
	static final Font VERDANA = new Font("Verdana", Font.PLAIN, 14);
	
	private HomeMenu leMenu;
	private JPanel MenuRightPanel;
	private JPanel fightPanel;
	private StyledButton battleButton;
	private StyledButton teamButton;
	private StyledButton logButton;

	
	public JHomeMenu(HomeMenu menu)
	{
		this.leMenu = menu;
		battleButton = new StyledButton("Fight !", 0xC987B8, 0xA84D96, 0x823B74);
		battleButton.setFont(VERDANA);
		teamButton = new StyledButton("Team Builder", 0x89AAD4, 0x4D7FB8, 0x3B628E);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		MenuRightPanel = new JPanel();
		MenuRightPanel.setLayout(new GridLayout(3,1));
		MenuRightPanel.setBorder(BorderFactory.createEmptyBorder(30, 15, 10, 15));
		
		
		fightPanel = new BackgroundPanel(Color.BLACK, 10,10,10,10,0.5f,25);
		fightPanel.setLayout(new BorderLayout());
		fightPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
		fightPanel.add(battleButton,BorderLayout.CENTER);
		MenuRightPanel.add(fightPanel);
		add(MenuRightPanel);
		

	}
}

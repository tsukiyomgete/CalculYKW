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
    private JPanel MiscPanel;
    private StyledButton battleButton;
    private StyledButton teamButton;
    private StyledButton logButton;


    public JHomeMenu(HomeMenu menu) {
        this.leMenu = menu;

        battleButton = new StyledButton("Fight !", "Find a random opponent", 0xC987B8, 0xA84D96, 0x823B74);
        battleButton.setFont(VERDANA);

        teamButton = new StyledButton("Teambuilder", 0x89AAD4, 0x4D7FB8, 0x3B628E);
        teamButton.setFont(VERDANA);

        logButton = new StyledButton("Login", 0x89AAD4, 0x4D7FB8, 0x3B628E); 
        logButton.setFont(VERDANA);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        MenuRightPanel = new JPanel();
        MenuRightPanel.setLayout(new GridLayout(3, 1, 0, 10)); 
        MenuRightPanel.setOpaque(false); 
        MenuRightPanel.setBorder(BorderFactory.createEmptyBorder(30, 15, 10, 15));

        fightPanel = new BackgroundPanel(Color.BLACK, 10, 10, 10, 10, 0.5f, 25);
        fightPanel.setLayout(new BorderLayout());
        fightPanel.add(battleButton, BorderLayout.CENTER);

        MiscPanel = new BackgroundPanel(Color.BLACK, 10, 10, 10, 10, 0.5f, 25);
        MiscPanel.setLayout(new BorderLayout());
        MiscPanel.add(teamButton, BorderLayout.CENTER); // ← teamButton ici

        //JPanel logPanel = new BackgroundPanel(Color.BLACK, 10, 10, 10, 10, 0.5f, 25);
        //logPanel.setLayout(new BorderLayout());
        //logPanel.add(logButton, BorderLayout.CENTER);

        MenuRightPanel.add(fightPanel);
        MenuRightPanel.add(MiscPanel);
        //MenuRightPanel.add(logPanel);

        add(MenuRightPanel);
    }
    
    public StyledButton getBattleButton() {
        return battleButton;
    }

    public StyledButton getTeamButton() {
        return teamButton;
    }

    public StyledButton getLogButton() {
        return logButton;
    }
}
package com.ykwshowdown;
import com.ykwshowdown.menu.HomeMenu;

import javax.swing.*;
import java.awt.*;

import com.ykwshowdown.VisualSwing.*;
import com.ykwshowdown.VisualSwing.JTeamBuilder;

public class Main {
	private static CardLayout cardLayout;
    private static JPanel mainPanel;
	
	public static void main(String[] args) {
        HomeMenu hm = new HomeMenu();
        JHomeMenu jhm = new JHomeMenu(hm);
        
        JTeamBuilder jt= new JTeamBuilder();
        
        JFrame frame = new JFrame("YKW Showdown");
        frame.add(jt);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
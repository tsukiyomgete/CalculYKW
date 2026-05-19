package com.ykwshowdown;
import com.ykwshowdown.menu.HomeMenu;

import javax.swing.JFrame;
import java.awt.*;

import com.ykwshowdown.VisualSwing.*;

public class Main {
    public static void main(String[] args) {
        HomeMenu hm = new HomeMenu();
        JHomeMenu jhm = new JHomeMenu(hm);
        
        JFrame frame = new JFrame("YKW Showdown");
        frame.add(jhm);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
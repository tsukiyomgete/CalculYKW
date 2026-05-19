package com.ykwshowdown.VisualSwing.StylizedButton;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class StyledButton extends JButton {

    private int topHex;
    private int bottomHex;
    private int borderHex;

    public StyledButton(String text, int topHex, int bottomHex, int borderHex) {
        super("<html><div style='text-align: center;'><strong> "+ "Fight !" +"</strong><br><small>Find a random opponent</small></div></html>");
        this.topHex = topHex;
        this.bottomHex = bottomHex;
        this.borderHex = borderHex; 
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15)); // padding
        setForeground(Color.WHITE);
        setHorizontalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(160, 55));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    int arc = 10;

    // ← clip arrondi
    g2.setClip(new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arc, arc));

    Color top    = new Color(topHex);
    Color bottom = new Color(bottomHex);

    GradientPaint gradient = new GradientPaint(0, 0, top, 0, getHeight(), bottom);
    g2.setPaint(gradient);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

    g2.dispose();
    super.paintComponent(g);
}

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(borderHex));
        g2.setStroke(new BasicStroke(1));
        
        int arc = 10;
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);

        g2.dispose();
    }
}
package com.ykwshowdown.VisualSwing.StylizedButton;

import java.awt.*;
import javax.swing.*;

public class BackgroundPanel extends JPanel {

    private Color backgroundColor;
    private float alpha;
    private int arc;

    public BackgroundPanel(Color backgroundColor, int top, int left, int bottom, int right, float alpha, int arc) {
        this.backgroundColor = backgroundColor;
        this.alpha = alpha;
        this.arc = arc;
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.setColor(backgroundColor);

        // ← clip arrondi pour couper les coins
        g2.setClip(new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arc, arc));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(backgroundColor);
        g2.setStroke(new BasicStroke(1));
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        g2.dispose();
    }
}
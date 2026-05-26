package com.ykwshowdown.VisualSwing.StylizedButton;


import java.awt.*;

import javax.swing.*;

public class TeamStyledButton extends JButton{
	private int bgHex;
    private int borderHex;
    
    public TeamStyledButton(String teamName, String format, int bgHex, int borderHex) {
        super("<html><div style='text-align: center; font-family: sans-serif; font-size: 8pt; white-space: nowrap; color: #333333;'>"
                + "<span style='color: #777777;'>" + format + "</span> <strong>" + teamName + "</strong>"
                + "</div></html>");
        
        this.bgHex = bgHex;
        this.borderHex = borderHex;

        // Configuration du bouton pour laisser le dessin personnalisé s'exprimer
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        
        // padding: 1px 6px 1px 6px;
        setBorder(BorderFactory.createEmptyBorder(1, 6, 1, 6)); 
        
        // vertical-align: middle / text-align: center
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        
        // width: 350px; height: 49px;
        Dimension size = new Dimension(350, 49);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Pas d'arrondi (arc = 0) ou très léger (2-3px) selon le rendu Showdown original. Ici, restons sur des angles droits purs.
        int arc = 0; 

        // Remplissage du fond uniforme (pas de dégradé pour reproduire le CSS fourni)
        g2.setColor(new Color(bgHex));
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.dispose();
        
        // Appeler super à la fin pour dessiner le texte HTML par-dessus le fond customisé
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(borderHex));
        g2.setStroke(new BasicStroke(1));
        
        // Dessin de la bordure extérieure de 1px
        g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

        g2.dispose();
    }
}

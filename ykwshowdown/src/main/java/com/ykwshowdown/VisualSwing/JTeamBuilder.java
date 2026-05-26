package com.ykwshowdown.VisualSwing;

import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class JTeamBuilder extends JPanel{
	
	public JTeamBuilder() {
        
        setBackground(new Color(240, 235, 245)); // Teinte violet clair/blanche de fond
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(20, 20, 20, 20)); // Marges intérieures


        // --- SECTION 2 : En-tête "All teams" et boutons d'action ---
        JLabel lblAllTeams = new JLabel("All teams (2)");
        lblAllTeams.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        actionPanel.setOpaque(false);
        JButton btnNewTeam = new JButton("⊕ New Team");
        JButton btnNewBox = new JButton("\uD83D\uDCD5 New Box"); // Icône box textuelle
        JTextField txtSearch = new JTextField(15);
        txtSearch.setToolTipText("search teams");
        actionPanel.add(btnNewTeam);
        actionPanel.add(btnNewBox);
        actionPanel.add(txtSearch);

        // --- SECTION 3 : Liste des équipes (Les encadrés) ---
        JPanel teamsListPanel = new JPanel();
        teamsListPanel.setLayout(new BoxLayout(teamsListPanel, BoxLayout.Y_AXIS));
        teamsListPanel.setOpaque(false);

        // Équipe 1 : Mega Scrafty Team
        JPanel team1 = createTeamRow("[gen9legendszaou] Copy of 'Mega Scrafty Team' by gengarfan831", 
                                     "Scrafty, Gengar, Scizor, Gardevoir, Talonflame, Noivern");
        // Équipe 2 : Untitled 1
        JPanel team2 = createTeamRow("[gen9nu] Untitled 1", "Altaria");

        teamsListPanel.add(team1);
        teamsListPanel.add(Box.createVerticalStrut(10)); // Espace entre les équipes
        teamsListPanel.add(team2);

        // --- SECTION 4 : Messages d'avertissement (Cookies / localStorage) ---
        JPanel warningPanel = new JPanel();
        warningPanel.setLayout(new BoxLayout(warningPanel, BoxLayout.Y_AXIS));
        warningPanel.setOpaque(false);
        warningPanel.setBorder(new EmptyBorder(20, 0, 0, 0));

        // Utilisation de HTML dans le JLabel pour gérer le gras et les retours à la ligne comme en CSS

        


        // --- AJOUT DE TOUS LES COMPOSANTS AU PANNEAU PRINCIPAL ---
        add(Box.createVerticalStrut(5));
        add(Box.createVerticalStrut(15));
        add(lblAllTeams);
        add(actionPanel);
        add(Box.createVerticalStrut(10));
        add(teamsListPanel);
        add(Box.createVerticalStrut(10));
    }
	
	private JPanel createTeamRow(String teamName, String pokemonList) {
        JPanel row = new JPanel(new BorderLayout());
        row.setBackground(new Color(245, 245, 245)); // Fond gris très clair
        row.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        row.setMaximumSize(new Dimension(Short.MAX_VALUE, 60)); // Remplir la largeur

        // Gauche : Infos et "Sprites" (simulés ici par du texte pour l'exemple)
        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.setOpaque(false);
        JLabel lblName = new JLabel("  " + teamName);
        lblName.setFont(new Font("Arial", Font.BOLD, 12));
        
        // C'est ici que vous chargeriez vos ImageIcon pour les Pokémon
        JLabel lblSprites = new JLabel("  [Sprites: " + pokemonList + "]"); 
        lblSprites.setFont(new Font("Arial", Font.ITALIC, 11));
        
        infoPanel.add(lblName);
        infoPanel.add(lblSprites);

        // Droite : Boutons d'action (Modifier, Copier, Supprimer)
        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        actionPanel.setOpaque(false);
        JButton btnEdit = new JButton("✎");
        JButton btnCopy = new JButton("❑");
        JButton btnDelete = new JButton("🗑 Delete");
        
        // Style CSS appliqué aux boutons
        btnDelete.setForeground(Color.RED);

        actionPanel.add(btnEdit);
        actionPanel.add(btnCopy);
        actionPanel.add(btnDelete);

        row.add(infoPanel, BorderLayout.CENTER);
        row.add(actionPanel, BorderLayout.EAST);

        return row;
    }
}

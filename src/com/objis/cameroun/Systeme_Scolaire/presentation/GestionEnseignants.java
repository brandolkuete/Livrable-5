package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GestionEnseignants extends JFrame {

	private JPanel contentPane;

	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEnseignants frame = new GestionEnseignants();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public GestionEnseignants() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setFont(new Font("Times New Roman", Font.BOLD, 13));
		setTitle("Gestion des Enseignants");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1005, 726);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		mnFichier.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnFichier.setForeground(new Color(0, 0, 0));
		menuBar.add(mnFichier);
		
		JMenu mnEdition = new JMenu("Edition");
		mnEdition.setForeground(new Color(0, 0, 0));
		mnEdition.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnEdition);
		
		JMenu mnAffichage = new JMenu("Affichage");
		mnAffichage.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnAffichage.setForeground(new Color(0, 0, 0));
		menuBar.add(mnAffichage);
		
		JMenu mnOutils = new JMenu("Outils");
		mnOutils.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnOutils.setForeground(new Color(0, 0, 0));
		menuBar.add(mnOutils);
		
		JMenu mnAide = new JMenu("Aide");
		mnAide.setForeground(new Color(0, 0, 0));
		mnAide.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnAide);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 1079, 139);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSystmeDeGestion = new JLabel("Syst\u00E8me de gestion de l'\u00E9tablissement scolaire");
		lblSystmeDeGestion.setForeground(Color.WHITE);
		lblSystmeDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystmeDeGestion.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSystmeDeGestion.setBounds(178, 36, 681, 51);
		panel.add(lblSystmeDeGestion);
		
		JLabel label_1 = new JLabel("");
		Image image1= new ImageIcon(this.getClass().getResource("/hom.png")).getImage();
		label_1.setIcon(new ImageIcon(image1));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(74, 0, 105, 103);
		panel.add(label_1);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(217, 214, 566, 343);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		

		JButton btnEnregistrerUnlve = new JButton("Enregistrer un enseignant");
		btnEnregistrerUnlve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnregistrerUnlve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnregistrerEnseignant frame = new EnregistrerEnseignant();
				frame.setVisible(true);
			}
		});
		btnEnregistrerUnlve.setBackground(Color.WHITE);
		btnEnregistrerUnlve.setForeground(Color.BLUE);
		btnEnregistrerUnlve.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEnregistrerUnlve.setBounds(155, 99, 244, 46);
		panel_1.add(btnEnregistrerUnlve);
		
		JButton btnRechercherUnlve = new JButton("Rechercher un enseignant");
		btnRechercherUnlve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RchercherEnseignant frame = new RchercherEnseignant();
				frame.setVisible(true);
			}
		});
		btnRechercherUnlve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRechercherUnlve.setBackground(Color.WHITE);
		btnRechercherUnlve.setForeground(Color.BLUE);
		btnRechercherUnlve.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnRechercherUnlve.setBounds(155, 156, 244, 46);
		panel_1.add(btnRechercherUnlve);
		
		JButton btnD = new JButton("Liste des enseignants");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeEnseignantsForm frame = new ListeEnseignantsForm();
				frame.setVisible(true);
			}
		});
		btnD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnD.setBackground(Color.WHITE);
		btnD.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD.setForeground(Color.BLUE);
		btnD.setBounds(155, 213, 244, 47);
		panel_1.add(btnD);
	}

}

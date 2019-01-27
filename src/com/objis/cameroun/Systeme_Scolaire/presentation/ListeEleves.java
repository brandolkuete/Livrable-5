package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve;
import com.objis.cameroun.Systeme_Scolaire.domaine.ElevesModel;
import com.objis.cameroun.Systeme_Scolaire.service.ITraitements;
import com.objis.cameroun.Systeme_Scolaire.service.Traitement;
import java.awt.FlowLayout;

public class ListeEleves extends JFrame {

	private JPanel contentPane;
	private ElevesModel eleveModel;
	private JTable table_1;


	/**
	 * Create the frame.
	 */
	public ListeEleves() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBounds(100, 100, 1225, 1081);
		setTitle("Liste des élèves");
		
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
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 1239, 139);
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
		
		JLabel lblListeEleves = new JLabel("Liste des \u00E9l\u00E8ves ");
		lblListeEleves.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeEleves.setFont(new Font("Verdana", Font.BOLD, 25));
		lblListeEleves.setBounds(326, 177, 596, 40);
		contentPane.add(lblListeEleves);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(66, 261, 1062, 437);
		contentPane.add(panel_1);

		// appel de la couche service
		ITraitements service= new Traitement();
						         
		//appel de la methode listeElevesService de la couche service
		List<Eleve> listEleves;
				
		listEleves= service.listerElevesService();
		eleveModel= new ElevesModel(listEleves);
			
		table_1 = new JTable(eleveModel);
		
		table_1.setBounds(66, 261, 1062, 437);
		table_1.setBackground(Color.CYAN);
		table_1.setForeground(Color.DARK_GRAY);
		panel_1.add(new JScrollPane(table_1));
	}
}

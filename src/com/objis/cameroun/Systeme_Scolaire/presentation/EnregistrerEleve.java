package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve;
import com.objis.cameroun.Systeme_Scolaire.service.ITraitements;
import com.objis.cameroun.Systeme_Scolaire.service.Traitement;


import javax.swing.JButton;
import java.awt.Cursor;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;

public class EnregistrerEleve extends JFrame {

	private JPanel contentPane;
	
	private JTextField matriculeTextField;
	private JTextField nomtextField;
	private JTextField prenomTextField;
	private JTextField nationaliteTextField;
	private JTextField adresseTextField;
	private JTextField ageTextField;
	private JTextField niveauTextField;
	private JTextField filiereTextField;
	
	/**
	 * Create the frame.
	 */
	public EnregistrerEleve() {
		setTitle("Enregistrer un \u00E9l\u00E8ve");
		setBounds(100, 100, 1147, 947);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 1131, 139);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("");
		Image image1= new ImageIcon(this.getClass().getResource("/hom.png")).getImage();
		label_1.setIcon(new ImageIcon(image1));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(74, 0, 105, 103);
		panel.add(label_1);
		
		JLabel lblSystmeDeGestion = new JLabel("Syst\u00E8me de gestion de l'\u00E9tablissement scolaire");
		lblSystmeDeGestion.setForeground(Color.WHITE);
		lblSystmeDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystmeDeGestion.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSystmeDeGestion.setBounds(178, 36, 681, 51);
		panel.add(lblSystmeDeGestion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(292, 243, 521, 578);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEnregistrementDunNouveau = new JLabel("Enregistrement d'un nouveau \u00E9l\u00E8ve");
		lblEnregistrementDunNouveau.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnregistrementDunNouveau.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEnregistrementDunNouveau.setBounds(251, 183, 596, 40);
		contentPane.add(lblEnregistrementDunNouveau);
		
		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricule.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMatricule.setForeground(new Color(0, 0, 0));
		lblMatricule.setBounds(10, 44, 81, 14);
		panel_1.add(lblMatricule);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		matriculeTextField.setHorizontalAlignment(SwingConstants.LEFT);
		matriculeTextField.setBackground(SystemColor.window);
		matriculeTextField.setForeground(Color.BLACK);
		matriculeTextField.setToolTipText("");
		matriculeTextField.setBounds(95, 38, 304, 27);
		panel_1.add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNom.setBounds(21, 88, 63, 14);
		panel_1.add(lblNom);
		
		nomtextField = new JTextField();
		nomtextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		nomtextField.setBounds(95, 83, 304, 27);
		panel_1.add(nomtextField);
		nomtextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPrenom.setBounds(21, 139, 63, 14);
		panel_1.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomTextField.setBounds(95, 134, 304, 27);
		panel_1.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexe :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 183, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		lblDateDeNaissance.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDateDeNaissance.setBounds(21, 226, 123, 27);
		panel_1.add(lblDateDeNaissance);
		
		JLabel lblNationalit = new JLabel("Nationalit\u00E9 : ");
		lblNationalit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNationalit.setBounds(21, 277, 80, 27);
		panel_1.add(lblNationalit);
		
		nationaliteTextField = new JTextField();
		nationaliteTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		nationaliteTextField.setBounds(105, 278, 294, 27);
		panel_1.add(nationaliteTextField);
		nationaliteTextField.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse : ");
		lblAdresse.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAdresse.setBounds(21, 336, 70, 14);
		panel_1.add(lblAdresse);
		
		adresseTextField = new JTextField();
		adresseTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		adresseTextField.setBounds(105, 331, 294, 27);
		panel_1.add(adresseTextField);
		adresseTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age : ");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAge.setBounds(21, 380, 46, 14);
		panel_1.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		ageTextField.setBounds(105, 375, 294, 27);
		panel_1.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblNiveau = new JLabel("Niveau : ");
		lblNiveau.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNiveau.setBounds(21, 427, 63, 14);
		panel_1.add(lblNiveau);
		
		niveauTextField = new JTextField();
		niveauTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		niveauTextField.setBounds(105, 418, 294, 27);
		panel_1.add(niveauTextField);
		niveauTextField.setColumns(10);
		
		JLabel lblFilire = new JLabel("Fili\u00E8re : ");
		lblFilire.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFilire.setBounds(21, 470, 63, 14);
		panel_1.add(lblFilire);
	
		filiereTextField = new JTextField();
		filiereTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		filiereTextField.setBounds(105, 465, 294, 27);
		panel_1.add(filiereTextField);
		filiereTextField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(154, 219, 246, 34);
		panel_1.add(dateChooser);
		
		ButtonGroup button= new ButtonGroup();
		
		JRadioButton rdbtnMasculin = new JRadioButton("Masculin");
		rdbtnMasculin.setActionCommand("Masculin");
		rdbtnMasculin.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnMasculin.setBounds(94, 178, 81, 27);
		panel_1.add(rdbtnMasculin);
		
		JRadioButton rdbtnFminin = new JRadioButton("Féminin");
		rdbtnFminin.setActionCommand("Féminin");
		rdbtnFminin.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnFminin.setBounds(234, 178, 82, 27);
		panel_1.add(rdbtnFminin);
		
		button.add(rdbtnFminin);
		button.add(rdbtnMasculin);
		
		rdbtnMasculin.setSelected(true);
		
		//JButton button1= new JButton("what is selected");
		// Add action listener to created button
		/*button1.addActionListener(new ActionListener() {
			String sexe;
			@Override
			public void actionPerformed(ActionEvent event) {
					if(event.getSource()==button1) {
						Enumeration<AbstractButton> allRadioButton=button.getElements();
						while(allRadioButton.hasMoreElements()) {
							JRadioButton temp=(JRadioButton)allRadioButton.nextElement();
							if(temp.isSelected()) {
								sexe=temp.getText();
							}
						}
					}
				}
			});*/
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				// recuperation des valeurs saisies par l'utilisateur
				
				String matricule= matriculeTextField.getText();
				String nom= nomtextField.getText();
				String prenom= prenomTextField.getText();
				String sexe=button.getSelection().getActionCommand();
				//System.out.print(sexe);
				
				SimpleDateFormat sp=new SimpleDateFormat("yyyy/MM/dd");
				String date=sp.format(dateChooser.getDate());
				
				//System.out.print(date);
				String nationalite= nationaliteTextField.getText();
				String adresse= adresseTextField.getText();
				int age= Integer.parseInt(ageTextField.getText());
				String niveau= niveauTextField.getText();
				String filiere= filiereTextField.getText();
				
				/*if(rdbtnMasculin.isSelected()) {
					sexe= rdbtnMasculin.getText();
				}else if(rdbtnFminin.isSelected()) {
					sexe= rdbtnFminin.getText();
					}*/
				
				
				// creation d'un objet Eleve et innitialisation de ses attributs
				
				Eleve elev= new Eleve();
				
				elev.setMatricule(matricule);
				elev.setNom(nom);
				elev.setPrenom(prenom);
				elev.setSexe(sexe);
				elev.setDate_nais(date);
				elev.setNationalite(nationalite);
				elev.setAddresse(adresse);
				elev.setAge(age);
				elev.setNiveau(niveau);
				elev.setFiliere(filiere);
				
				// Enregistrement de l'élève dans la BD via la couche service
				
				ITraitements service= new Traitement();
				
				int status;
				status=service.enregistrerEleve(elev);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "L'élève " + elev.getNom() + 
							  " a ete enregistré dans la Base de Données!");
					
					matriculeTextField.setText(" ");
					nomtextField.setText(" ");
					prenomTextField.setText(" ");
					nationaliteTextField.setText(" ");
					adresseTextField.setText(" ");
					ageTextField.setText(" ");
					niveauTextField.setText(" ");
					filiereTextField.setText(" ");
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement de l'élève!!! ");
					
					matriculeTextField.setText(" ");
					nomtextField.setText(" ");
					prenomTextField.setText(" ");
					nationaliteTextField.setText(" ");
					adresseTextField.setText(" ");
					ageTextField.setText(" ");
					niveauTextField.setText(" ");
					filiereTextField.setText(" ");
				}
				
			}
		});
		
		btnEnregistrer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnregistrer.setForeground(Color.WHITE);
		btnEnregistrer.setFont(new Font("Verdana", Font.BOLD, 16));
		btnEnregistrer.setBackground(Color.BLUE);
		btnEnregistrer.setBounds(199, 520, 139, 34);
		panel_1.add(btnEnregistrer);
	
	}
}

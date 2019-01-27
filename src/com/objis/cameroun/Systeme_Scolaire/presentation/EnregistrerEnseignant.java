package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import javax.swing.JRadioButton;

import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;
import com.objis.cameroun.Systeme_Scolaire.service.ITraitements;
import com.objis.cameroun.Systeme_Scolaire.service.Traitement;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class EnregistrerEnseignant extends JFrame {

	private JPanel contentPane;
	private JTextField matriculeTextField;
	private JTextField nomtextField;
	private JTextField prenomTextField;
	private JTextField nationaliteTextField;
	private JTextField adresseTextField;
	private JTextField ageTextField;
	private JTextField gradeTextField;
	private JTextField emailTextField;
	private JTextField telephoneTextField;
	private JTextField salaireTextField;

	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnregistrerEnseignant frame = new EnregistrerEnseignant();
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
	public EnregistrerEnseignant() {
		
		setTitle("Enregistrer un Enseignant");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1147, 930);
		
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
		panel_1.setBounds(279, 225, 543, 606);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEnregistrementDunNouveau = new JLabel("Enregistrement d'un nouveau Enseignant");
		lblEnregistrementDunNouveau.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnregistrementDunNouveau.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEnregistrementDunNouveau.setBounds(251, 183, 596, 40);
		contentPane.add(lblEnregistrementDunNouveau);
		
		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricule.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMatricule.setForeground(new Color(0, 0, 0));
		lblMatricule.setBounds(10, 45, 81, 14);
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
		lblNom.setBounds(21, 80, 63, 14);
		panel_1.add(lblNom);
		
		nomtextField = new JTextField();
		nomtextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		nomtextField.setBounds(95, 73, 304, 27);
		panel_1.add(nomtextField);
		nomtextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPrenom.setBounds(21, 118, 63, 14);
		panel_1.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		prenomTextField.setBounds(95, 111, 304, 27);
		panel_1.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sexe :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 143, 46, 22);
		panel_1.add(lblNewLabel);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		lblDateDeNaissance.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDateDeNaissance.setBounds(20, 176, 123, 27);
		panel_1.add(lblDateDeNaissance);
		
		JLabel lblNationalit = new JLabel("Nationalit\u00E9 : ");
		lblNationalit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNationalit.setBounds(21, 214, 80, 27);
		panel_1.add(lblNationalit);
		
		nationaliteTextField = new JTextField();
		nationaliteTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		nationaliteTextField.setBounds(105, 214, 294, 27);
		panel_1.add(nationaliteTextField);
		nationaliteTextField.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse : ");
		lblAdresse.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAdresse.setBounds(21, 252, 70, 22);
		panel_1.add(lblAdresse);
		
		adresseTextField = new JTextField();
		adresseTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		adresseTextField.setBounds(105, 249, 294, 27);
		panel_1.add(adresseTextField);
		adresseTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age : ");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAge.setBounds(21, 285, 46, 22);
		panel_1.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		ageTextField.setBounds(105, 282, 294, 27);
		panel_1.add(ageTextField);
		ageTextField.setColumns(10);
		
		JRadioButton rdbtnMasculin = new JRadioButton("Masculin");
		rdbtnMasculin.setActionCommand("Masculin");
		rdbtnMasculin.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnMasculin.setBounds(95, 145, 81, 27);
		panel_1.add(rdbtnMasculin);
		
		JRadioButton rdbtnFminin = new JRadioButton("F\u00E9minin");
		rdbtnFminin.setActionCommand("Féminin");
		rdbtnFminin.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnFminin.setBounds(229, 145, 82, 27);
		panel_1.add(rdbtnFminin);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(142, 176, 257, 27);
		panel_1.add(dateChooser);
		
		JLabel lblStatutMatrimonial = new JLabel("Statut Matrimonial :");
		lblStatutMatrimonial.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStatutMatrimonial.setBounds(21, 330, 134, 27);
		panel_1.add(lblStatutMatrimonial);
		
		JComboBox<String> statutComboBox = new JComboBox<String>();
		statutComboBox.setFont(new Font("Verdana", Font.PLAIN, 15));
		statutComboBox.setBounds(165, 330, 234, 27);
		panel_1.add(statutComboBox);
		
		statutComboBox.addItem(" ");
		statutComboBox.addItem("Marié");
		statutComboBox.addItem("Célibataire");
		
		JLabel lblSpcialite = new JLabel("Sp\u00E9cialite :");
		lblSpcialite.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSpcialite.setBounds(21, 368, 134, 32);
		panel_1.add(lblSpcialite);
		
		JComboBox<String> specialiteComboBox = new JComboBox<String>();
		specialiteComboBox.setFont(new Font("Verdana", Font.PLAIN, 15));
		specialiteComboBox.setBounds(105, 375, 294, 25);
		panel_1.add(specialiteComboBox);
		
		specialiteComboBox.addItem(" ");
		specialiteComboBox.addItem("Mathématiques");
		specialiteComboBox.addItem("Français");
		specialiteComboBox.addItem("Physiques-Chimie-Technologie");
		specialiteComboBox.addItem("Anglais");
		specialiteComboBox.addItem("Histoire-Géographie");
		specialiteComboBox.addItem("Espagnol");
		specialiteComboBox.addItem("EPS");
		specialiteComboBox.addItem("SVT");
		specialiteComboBox.addItem("Informatique");
		
		JLabel lblGrade = new JLabel("Grade :");
		lblGrade.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGrade.setBounds(21, 411, 105, 27);
		panel_1.add(lblGrade);
		
		gradeTextField = new JTextField();
		gradeTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		gradeTextField.setBounds(105, 412, 294, 27);
		panel_1.add(gradeTextField);
		gradeTextField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(21, 449, 90, 32);
		panel_1.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		emailTextField.setBounds(105, 451, 294, 27);
		panel_1.add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTlphone.setBounds(21, 492, 97, 27);
		panel_1.add(lblTlphone);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		telephoneTextField.setBounds(105, 489, 294, 27);
		panel_1.add(telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JLabel lblSalaire = new JLabel("Salaire :");
		lblSalaire.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSalaire.setBounds(21, 524, 105, 27);
		panel_1.add(lblSalaire);
		
		salaireTextField = new JTextField();
		salaireTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		salaireTextField.setBounds(105, 523, 294, 27);
		panel_1.add(salaireTextField);
		salaireTextField.setColumns(10);
		
		ButtonGroup button= new ButtonGroup();
		
		button.add(rdbtnFminin);
		button.add(rdbtnMasculin);
		
		rdbtnMasculin.setSelected(true);
		
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
				String statutMat= statutComboBox.getSelectedItem().toString();
				String specialite= specialiteComboBox.getSelectedItem().toString();
				String grade= gradeTextField.getText();
				String email=emailTextField.getText();
				String telephone= telephoneTextField.getText();
				double salaire= Double.parseDouble(salaireTextField.getText());
				
				// creation d'un objet Enseignant et innitialisation de ses attributs
				
				Enseignant enseign=new Enseignant();
				
				enseign.setMatricule(matricule);
				enseign.setNom(nom);
				enseign.setPrenom(prenom);
				enseign.setSexe(sexe);
				enseign.setDate_nais(date);
				enseign.setNationalite(nationalite);
				enseign.setAddresse(adresse);
				enseign.setAge(age);
				enseign.setSituationMat(statutMat);
				enseign.setSpecialite(specialite);
				enseign.setGrade(grade);
				enseign.setEmail(email);
				enseign.setTelephone(telephone);
				enseign.setSalaire(salaire);
				
				// Enregistrement de l'enseignant dans la BD via la couche service
				
				ITraitements service= new Traitement();
				
				int status;
				status=service.enregistrerEnseignant(enseign);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Enregistrement réussi");
					
					matriculeTextField.setText(" ");
					nomtextField.setText(" ");
					prenomTextField.setText(" ");
					nationaliteTextField.setText(" ");
					adresseTextField.setText(" ");
					ageTextField.setText(" ");
					gradeTextField.setText(" ");
					emailTextField.setText(" ");
					telephoneTextField.setText(" ");
					salaireTextField.setText(" ");
					statutComboBox.setSelectedItem(" ");
					specialiteComboBox.setSelectedItem(" ");
					
				}else {
					JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement ");
					
					matriculeTextField.setText(" ");
					nomtextField.setText(" ");
					prenomTextField.setText(" ");
					nationaliteTextField.setText(" ");
					adresseTextField.setText(" ");
					ageTextField.setText(" ");
					gradeTextField.setText(" ");
					emailTextField.setText(" ");
					telephoneTextField.setText(" ");
					salaireTextField.setText(" ");
				}
				
			}
		});
		btnEnregistrer.setForeground(Color.WHITE);
		btnEnregistrer.setBackground(Color.BLUE);
		btnEnregistrer.setFont(new Font("Verdana", Font.BOLD, 16));
		btnEnregistrer.setBounds(182, 561, 152, 34);
		panel_1.add(btnEnregistrer);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1114, 139, 17, 721);
		contentPane.add(scrollBar);
		
		
	}
}

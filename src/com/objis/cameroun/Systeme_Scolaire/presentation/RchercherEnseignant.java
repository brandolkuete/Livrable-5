package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;
import com.objis.cameroun.Systeme_Scolaire.service.ITraitements;
import com.objis.cameroun.Systeme_Scolaire.service.Traitement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class RchercherEnseignant extends JFrame {

	private JPanel contentPane;
	private JTextField matriculeTextField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RchercherEnseignant frame = new RchercherEnseignant();
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
	public RchercherEnseignant() {
		
		setTitle("Rechercher un Enseignant");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1147, 793);
		
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
		menuBar.add(mnAide);contentPane.setLayout(null);
		
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
		
		JLabel lblEnregistrementDunNouveau = new JLabel("Rechercher un enseignant");
		lblEnregistrementDunNouveau.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnregistrementDunNouveau.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEnregistrementDunNouveau.setBounds(251, 183, 596, 40);
		contentPane.add(lblEnregistrementDunNouveau);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(138, 250, 826, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVeillezEntrerLe = new JLabel("Veillez entrer le matricule :");
		lblVeillezEntrerLe.setForeground(new Color(0, 0, 0));
		lblVeillezEntrerLe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblVeillezEntrerLe.setBounds(20, 24, 235, 38);
		panel_1.add(lblVeillezEntrerLe);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		matriculeTextField.setBounds(266, 27, 315, 38);
		panel_1.add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//recupération du matricule saisi par l'utilisateur
				String matricule= matriculeTextField.getText();
				
				//appel de la methode qui permet de rechercher un enseignant à partir du matricule
				
				List<Enseignant> maListe;
				
				ITraitements service= new Traitement();
				
				maListe= service.rechercherEnseigService(matricule);
				if(maListe.isEmpty()==true) {
					JOptionPane.showMessageDialog(null, "Aucun enseignant de ce matricule n'a été trouvé");
					matriculeTextField.setText(" ");
					
				}else {
					
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(138, 350, 826, 353);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRsultatsDeLa = new JLabel("R\u00E9sultat de la récherche");
		lblRsultatsDeLa.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRsultatsDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblRsultatsDeLa.setBounds(296, 11, 223, 29);
		panel_2.add(lblRsultatsDeLa);
		
		JLabel lblFicheDeDetails = new JLabel("Fiche de d\u00E9tails sur l'enseignant");
		lblFicheDeDetails.setFont(new Font("Verdana", Font.BOLD, 16));
		lblFicheDeDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblFicheDeDetails.setBounds(171, 57, 456, 29);
		panel_2.add(lblFicheDeDetails);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setBounds(231, 97, 47, 22);
		panel_2.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom :");
		lblPrnom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrnom.setBounds(230, 127, 77, 22);
		panel_2.add(lblPrnom);
		
		JLabel lblSexe = new JLabel("Sexe :");
		lblSexe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSexe.setBounds(231, 157, 66, 22);
		panel_2.add(lblSexe);
		
		JLabel lblDateDeNaissance = new JLabel("Date de Naissance :");
		lblDateDeNaissance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDateDeNaissance.setBounds(231, 183, 121, 22);
		panel_2.add(lblDateDeNaissance);
		
		JLabel lblNationnalit = new JLabel("Nationnalit\u00E9 :");
		lblNationnalit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNationnalit.setBounds(230, 210, 90, 22);
		panel_2.add(lblNationnalit);
		
		JLabel lblSpcialit = new JLabel("Sp\u00E9cialit\u00E9 :");
		lblSpcialit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSpcialit.setBounds(231, 236, 90, 22);
		panel_2.add(lblSpcialit);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(231, 259, 66, 22);
		panel_2.add(lblEmail);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTlphone.setBounds(231, 285, 77, 22);
		panel_2.add(lblTlphone);
		
		JLabel nomLabel = new JLabel("");
		nomLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomLabel.setBounds(395, 97, 232, 22);
		panel_2.add(nomLabel);
		
		JLabel prenomLabel = new JLabel("");
		prenomLabel.setBackground(Color.WHITE);
		prenomLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(390, 127, 237, 17);
		panel_2.add(prenomLabel);
		
		JLabel sexeLabel = new JLabel("");
		sexeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		sexeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sexeLabel.setBounds(390, 157, 237, 22);
		panel_2.add(sexeLabel);
		
		JLabel dateNaisLabel = new JLabel("");
		dateNaisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateNaisLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		dateNaisLabel.setBounds(395, 187, 232, 17);
		panel_2.add(dateNaisLabel);
		
		JLabel nationaliteLabel = new JLabel("");
		nationaliteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nationaliteLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nationaliteLabel.setBounds(375, 215, 237, 17);
		panel_2.add(nationaliteLabel);
		
		JLabel specialiteLabel = new JLabel("");
		specialiteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		specialiteLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		specialiteLabel.setBounds(375, 241, 237, 17);
		panel_2.add(specialiteLabel);
		
		JLabel emailLabel = new JLabel("");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(375, 264, 237, 17);
		panel_2.add(emailLabel);
		
		JLabel telephLabel = new JLabel("");
		telephLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		telephLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telephLabel.setBounds(375, 290, 237, 17);
		panel_2.add(telephLabel);
					
					for(Enseignant enseign:maListe) {
						
						nomLabel.setText(enseign.getNom());
						prenomLabel.setText(enseign.getPrenom());
						sexeLabel.setText(enseign.getSexe());
						dateNaisLabel.setText(enseign.getDate_nais());
						nationaliteLabel.setText(enseign.getNationalite());
						specialiteLabel.setText(enseign.getSpecialite());
						emailLabel.setText(enseign.getEmail());
						telephLabel.setText(enseign.getTelephone());
						
					}
					
				}
			}
		});
		btnRechercher.setForeground(Color.BLUE);
		btnRechercher.setBackground(Color.WHITE);
		btnRechercher.setFont(new Font("Verdana", Font.BOLD, 15));
		btnRechercher.setBounds(603, 30, 127, 29);
		panel_1.add(btnRechercher);
		
	}
}

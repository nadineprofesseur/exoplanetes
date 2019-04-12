package editeur.action;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import editeur.donnee.ExoplaneteDAO;
import editeur.modele.Exoplanete;
import editeur.vue.NavigateurDePages;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class ControleurExoplanete implements Initializable{

	protected NavigateurDePages navigateur;
	protected ExoplaneteDAO exoplaneteDAO;
	
	public ControleurExoplanete()
	{
		System.out.println("new ControleurExoplanete()");

		this.exoplaneteDAO = new ExoplaneteDAO();
		this.navigateur = NavigateurDePages.getInstance();
	}
	
	public void initialiser()
	{
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDAO.listerExoplanete());		
	}
	
	public void recevoirActionNaviguerPageListeExoplanete(ActionEvent evenement)
	{
		this.navigateur.naviguerVersPageListeExoplanete();
	}

	public void recevoirActionNaviguerPageAjouter(ActionEvent evenement)
	{
		this.navigateur.naviguerVersPageAjouter();
	}
	
	public void recevoirActionNaviguerPageEditer(ActionEvent evenement)
	{
		// Recuperer la planete selectionnee dans la page liste
		String nom = this.navigateur.getPageListeExoplanete().lireExoplaneteSelectionnee(); 
		Exoplanete exoplanete = this.exoplaneteDAO.lireExoplaneteSelonNom(nom);
		System.out.println(exoplanete.getEtoile());
		// Afficher la bonne planete dans la page editer
		this.navigateur.getPageEditerExoplanete().afficherExoplanete(exoplanete);
		// Naviguer vers la page editer
		this.navigateur.naviguerVersPageEditer();
	}
	
	public void recevoirActionNaviguerPageEffacer(ActionEvent evenement)
	{
		// pas implémenté dans cette version
	}
	
	public void recevoirActionEnregistrerAjout(ActionEvent evenement)
	{
		// demander a la vue ses donnees
		Exoplanete exoplanete = this.navigateur.getPageAjouterExoplanete().lireExoplanete();
		System.out.println("Nouvelle planete " + exoplanete.getNom() + " dans l'etoile " + exoplanete.getEtoile());

		this.navigateur.naviguerVersPageListeExoplanete();		
	}
	
	public void recevoirActionEnregistrerEdition(ActionEvent evenement)
	{
		// demander a la vue ses donnees
		Exoplanete exoplanete = this.navigateur.getPageEditerExoplanete().lireExoplanete();
		System.out.println("Nouvelle planete " + exoplanete.getNom() + " dans l'etoile " + exoplanete.getEtoile());
		
		this.navigateur.naviguerVersPageListeExoplanete();		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}

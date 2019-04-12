package visualisateur.action;
import java.net.URL;
import java.util.ResourceBundle;

import visualisateur.modele.Exoplanete;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.vue.NavigateurDePages;

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
	public void recevoirActionNaviguerPageExoplanete(ActionEvent evenement)
	{
		// Recuperer la planete selectionnee dans la page liste
		String nom = this.navigateur.getPageListeExoplanete().lireExoplaneteSelectionnee(); 
		Exoplanete exoplanete = this.exoplaneteDAO.lireExoplaneteSelonNom(nom);
		//System.out.println(exoplanete.getEtoile());
		// Afficher la bonne planete dans la page editer
		this.navigateur.getPageExoplanete().afficherExoplanete(exoplanete);
		
		this.navigateur.naviguerVersPageExoplanete();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}

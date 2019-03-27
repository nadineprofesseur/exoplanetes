
public class ControleurExoplanete {

	
	
	protected NavigateurDesVues navigateur;
	public ControleurExoplanete()
	{
		ExoplaneteDAO exoplaneteDAO = new ExoplaneteDAO();
		this.navigateur = NavigateurDesVues.getInstance();
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDAO.listerExoplanete());
	}
	
}

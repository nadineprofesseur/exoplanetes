
public class ControleurExoplanete {

	
	
	protected NavigateurDePages navigateur;
	public ControleurExoplanete()
	{
		System.out.println("new ControleurExoplanete()");
		
		ExoplaneteDAO exoplaneteDAO = new ExoplaneteDAO();
		this.navigateur = NavigateurDePages.getInstance();
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDAO.listerExoplanete());
	}
	
}

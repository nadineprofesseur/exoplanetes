import java.util.List;

public class App {

	public static void main(String[] parametres) {

		/*ExoplaneteDAO exoplaneteDAO = new ExoplaneteDAO();
		List<Exoplanete> liste = exoplaneteDAO.listerExoplanete();		
		
		for(Exoplanete exoplanete : liste)
		{
			System.out.println(exoplanete.getNom());
		}*/
		NavigateurDesVues.launch(NavigateurDesVues.class, parametres);

		ControleurExoplanete controleur = new ControleurExoplanete();
	}

}

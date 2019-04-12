package visualisateur.donnee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import visualisateur.modele.Exoplanete;

public class ExoplaneteDAO {
	
	protected Map<String, Exoplanete> planetesSelonNom; // copie de la liste mappée par nom, car le nom est unique - pour un accès rapide

	public ExoplaneteDAO()
	{
		this.planetesSelonNom = new HashMap<String, Exoplanete>();		
	}
	
	public List<Exoplanete> listerExoplanete()
	{
		System.out.println("ExoplaneteDAO.listerExoplanete()");
		List<Exoplanete> listeExoplanete = new ArrayList<Exoplanete>();
		
		Configuration configuration = new Configuration();
		configuration.addClass(visualisateur.modele.Exoplanete.class);
		SessionFactory generateurSession = configuration.buildSessionFactory();
		Session session = generateurSession.openSession();
		
		Iterator visiteurExoplanete = session.createQuery("from Exoplanete ").iterate();
		while(visiteurExoplanete.hasNext())
		{
			Exoplanete exoplanete = (Exoplanete)visiteurExoplanete.next();
			listeExoplanete.add(exoplanete); 
			System.out.println("DAO Planete " + exoplanete.getNom());
		}
				
		//session.close();
		//generateurSession.close();
		
		for(Exoplanete exoplanete : listeExoplanete)
		{
			System.out.println("Initialiser hashmap avec " + exoplanete.getNom());
			this.planetesSelonNom.put(exoplanete.getNom(), exoplanete);
			//Exoplanete exoplanete2 = this.planetesSelonNom.get(exoplanete.getNom());
			//System.out.println(exoplanete2.getNom());
			//System.out.println("Confirmation avec " + this.planetesSelonNom.get(exoplanete.getNom()).getNom());
		}
		System.out.println("Il y a " + this.planetesSelonNom.values().size() + " items");

		
		return listeExoplanete;
	}
	
	public Exoplanete lireExoplaneteSelonNom(String nom)
	{
		this.listerExoplanete(); // todo optimiser
		return this.planetesSelonNom.get(nom);
	}

}

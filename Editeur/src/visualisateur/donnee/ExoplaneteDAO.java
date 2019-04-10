package visualisateur.donnee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import visualisateur.modele.Exoplanete;

public class ExoplaneteDAO {
	
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
		
		return listeExoplanete;
	}

}

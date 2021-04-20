package planning;

import java.util.ArrayList;
import java.util.List;
import coursProg.visite;

public class planning extends visite {
	List<visite> tabVis= new ArrayList<visite>();

	public planning() 
	{

	}
	
	public void ajoutVisite(visite nouvellevisite) 
	{
		this.tabVis.add(nouvellevisite);
	}
	
	public void supprVisite(visite unevisite) 
	{
		this.tabVis.remove(unevisite);
	}
	
	public static void  main(String[] args ) 
	{
			visite v1= new visite("jean","17-08-1894",15);
			visite v2= new visite("porto","17-08-2051",20);
	        planning lePlanning = new planning();
	        lePlanning.ajoutVisite(v1);
	        lePlanning.ajoutVisite(v2);
	        for(visite s : lePlanning.tabVis)
	            System.out.println("Le visiteur est " + s.getEtudiant() + ", il est venue le " + s.getDate() + " et a mis la note de " + s.getNote() );
	        lePlanning.supprVisite(v2);
	        for(visite s : lePlanning.tabVis	)
	        	System.out.println("Le visiteur est " + s.getEtudiant() + ", il est venue le " + s.getDate() + " et a mis la note de " + s.getNote() );
	}
	
}

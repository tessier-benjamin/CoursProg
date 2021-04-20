package coursProg;

public class visite {

	String etudiant;
	String date;
	int note;
	
	public visite(String etudiant,String date,int note) 
	{
		this.etudiant=etudiant;
		this.date=date;
		this.note=note;
	}
	
	public static void  main(String[] args ) 
	{
		visite v1= new visite("","",0);
		visite v2= new visite("porto","17-08-1592",15);
		
		System.out.println(v1.etudiant);
		System.out.println(v2.etudiant);
	}
	
}


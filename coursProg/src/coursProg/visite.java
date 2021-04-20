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
	
	String getEtudiant()
	{
		return this.etudiant;
	}
	
	String getDate()
	{
		return this.date;
	}
	
	int getNote()
	{
		return this.note;
	}
	
	void setEtudiant(String etudiant)
	{
		this.etudiant=etudiant;
	}
	
	void setDate(String date)
	{
		this.date=date;
	}
	
	void setNote(int note)
	{
		this.note=note;
	}
	
	public String toString() 
	{
		return "date :" + this.date +"  etudiant :" + this.etudiant +" note :" + this.note;
	}
	
	public static void  main(String[] args ) 
	{
		visite v1= new visite("","",0);
		visite v2= new visite("porto","17-08-1592",15);
		
		System.out.println(v1);
		System.out.println(v2);
	}
	
}


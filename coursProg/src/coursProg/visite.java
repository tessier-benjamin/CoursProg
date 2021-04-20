package coursProg;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * 
 * @author MrBen
 *
 */
public class visite {

	String etudiant;
	String date;
	int note;
	
	/**
	 * 
	 * 
	 * @param etudiant
	 * @param date
	 * @param note
	 */
	public visite() 
	{
	}
	
	public visite(String etudiant,String date,int note) 
	{
		this.etudiant=etudiant;
		this.date=date;
		this.note=note;
	}
	
	
	public String getEtudiant()
	{
		return this.etudiant;
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	public int getNote()
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
	
	 public String convertUS(Date date, Locale locale){

	        if(date==null){ date = new Date(); }
	        if(locale==null){ locale = Locale.getDefault(); }
	        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
	            DateFormat.SHORT,
	            DateFormat.SHORT,
	            locale
	        );
	        String newDate = shortDateFormat.format(date);
	        return newDate;
	    }
	
	/**
	 * 
	 * @param args
	 */
	
	public static void  main(String[] args ) 
	{
		visite v1= new visite();
		visite v2= new visite("porto","17-08-1592",15);
		
		System.out.println(v1);
		System.out.println(v2);
		
		 Integer a = 10;
	     String b = a.toString();
	     Integer c = a.intValue();
	     
	     System.out.println("\nconvert to FR : "+v1.convertUS(new Date(), Locale.FRANCE));
	     System.out.println("\nconvert to US : "+v1.convertUS(new Date(), Locale.ENGLISH));
	        
	}
	
	
}


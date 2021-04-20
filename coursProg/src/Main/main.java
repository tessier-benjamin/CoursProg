package Main;
import coursProg.visite;
import tools.mesDates;

public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	mesDates d1 = new mesDates("17/08/1590");
    	System.out.println("\n"+d1.dateFRtoUS());
    }
    	
}

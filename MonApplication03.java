public class MonApplication03{
	
	public static void main (String arg[]){
		System.out.println ("demo Wrapper");
		
		String maChaine = "10.34";
		
		float monFlottant = Float.parseFloat(maChaine) ;
		
		System.out.println ("valeur de mon flottant: " +monFlottant);
	}
}
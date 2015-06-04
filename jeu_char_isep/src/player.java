
public class player {

	private String nom,couleur;
	double posX;
	
	//public player(){
		
	//}
	
	
	public void nouveauJoueur(String nplayer,String ncolor,double nposXTank){
		nom = nplayer;
		couleur = ncolor;
		posX = nposXTank;
		
	}
	
	
	//getter
	public String getNom(){
		return nom;
	}
	public String getColor(){
		return couleur;
	}
	public double getPosX(){
		return posX;
	}
}
	
	
	

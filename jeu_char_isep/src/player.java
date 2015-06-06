
public class player {

	private String nom,couleur;
	double posX,inclinaisonCanon;
	
	public player(){
		
	}
	
	
	public void joueur(String nplayer,String ncolor,double nposXTank,double angleCanon){
		nom = nplayer;
		couleur = ncolor;
		posX = nposXTank;
		inclinaisonCanon= angleCanon;
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
	public double getinclinaisonCanon(){
		return inclinaisonCanon;
	}
	
	public void setposX(double sposX)  {
	    posX = sposX;
	}	
	public void setinclinaisonCanon(double sinclinaisonCanon)  {
	    inclinaisonCanon = sinclinaisonCanon;
	}
}
	
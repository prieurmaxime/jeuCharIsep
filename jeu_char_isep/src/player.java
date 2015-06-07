
public class player {

	private String nom,couleur;
	double posX,posY,inclinaisonCanon,puissance,vie;
	public player(){
		
	}
	
	
	public void joueur(String nplayer,String ncolor,double nposXTank,double angleCanon,double nposY,Map nomMap){
		
		nom = nplayer;
		couleur = ncolor;
		posX = nposXTank;
		inclinaisonCanon= angleCanon;
		posY = 0;
		puissance =0;
		vie =100;
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
	public double getPosY(){
		return posY;
	}
	public double getinclinaisonCanon(){
		return inclinaisonCanon;
	}
	//setter
	public void setposX(double sposX)  {
	    posX = sposX;
	}	
	public void setinclinaisonCanon(double sinclinaisonCanon)  {
	    inclinaisonCanon = sinclinaisonCanon;
	}
	public void setposY(double sposY)  {
	    posY = sposY;
	}
	
}
	
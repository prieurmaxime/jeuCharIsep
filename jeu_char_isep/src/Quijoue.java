
public class Quijoue {

	double nbaleatoire;
	
	public Quijoue(){
	
	}
	
	public void quiCommence(player joueur1,player joueur2,player changeur){
		nbaleatoire = Math.random();
		
		
		if(nbaleatoire<0.5){
			
		}
		else{
			joueur1=changeur;
			joueur2=joueur1;
			joueur2=changeur;
		}
	}
	
	public void changementdejoueur(int fin,player joueur1,player joueur2,player changeur){
		
	}
	
}

/*
public class Quijoue {

	double nbaleatoire;
	boolean afinidejouer;
	
	public Quijoue(){
	
	}
	
	public void quiCommence(player joue,player jouepas,player changeur){
		nbaleatoire = Math.random();
		
		
		if(nbaleatoire<0.5){
			
		}
		else{
			changeur = joue;
			joue=jouepas;
			jouepas=changeur;
		}
	}
	
	public void changementdejoueur(destructionTerrain destru,player joue,player jouepas,player changeur){
		
		afinidejouer = destru.getafinidejouer();
		if(afinidejouer){
			player changeur = joue.clone();
			joue = jouepas;
			jouepas = changeur;
			afinidejouer=!afinidejouer;
		}
		
	}
	
}*/
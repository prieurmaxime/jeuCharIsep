
public class Quijoue {

	double nbaleatoire;
	player joue = new player();
	public Quijoue(){
	
	}
	
	public void quiCommence(player joueur1,player joueur2){
		nbaleatoire = Math.random();
		
		
		if(nbaleatoire<0.5){
			joue = joueur1;
		}
		else{
			joue = joueur2;
		}
	}
	
}

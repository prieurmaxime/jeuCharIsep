import java.awt.event.KeyEvent;


public class Interaction {

	double posXTank;
	
	public Interaction(){
	
	}
	
	public void deplacement(player numJoueur){
		
		double posX = numJoueur.getPosX();
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){ //si fleche gauche appuyée
			
			if(posX<=1){
			}
			else{
				posX --;
			}
		}
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){ //si fleche gauche appuyée
			
			if(posX>=1549){
			}
			else{
				posX ++;
			}
			
		}
	}
	
	
	
}

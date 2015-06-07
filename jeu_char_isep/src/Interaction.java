import java.awt.event.KeyEvent;


public class Interaction {


	double inclinaisonCanon;
	double posX;
	
	public Interaction(){
	
	}
	
	public void deplacement(player numJoueur,){
		
		posX = numJoueur.getPosX();
		inclinaisonCanon = numJoueur.getinclinaisonCanon();
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){ //si fleche gauche appuyée
			
			if(posX<=11){
			}
			else{
				posX = posX -1	;
				numJoueur.setposX(posX);
			}

		}
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){ //si fleche gauche appuyée
			
			if(posX>=1540){
			}
			else{
				posX =posX +1;
				numJoueur.setposX(posX);
			}

		}
		
		if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){ 
			
			if(inclinaisonCanon<=190){
				inclinaisonCanon =inclinaisonCanon +1;
				numJoueur.setinclinaisonCanon(inclinaisonCanon);
			}
			else{

			}

		}
		if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){ 
			
			if(inclinaisonCanon>=-10){
				inclinaisonCanon =inclinaisonCanon -1;
				numJoueur.setinclinaisonCanon(inclinaisonCanon);
			}
			else{
			}
		}
		if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){ 
			
			shoot.drawObus(j1.getPosX(), t1.getposY(), j1.getinclinaisonCanon(), 10, 0, map1);
		}
		
	}

}
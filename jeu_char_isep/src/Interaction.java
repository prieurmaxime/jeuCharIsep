import java.awt.event.KeyEvent;


public class Interaction {


	double inclinaisonCanon;
	double posX;
	int cmdTir;

	
	public Interaction(){
	
	}
	
	public void deplacement(player numJoueur){
		
		posX = numJoueur.getPosX();

		
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
			cmdTir = 1;
			
		}
		
	}
	//getter
	public int getcmdTir(){
		return cmdTir;
	}
	//setter
	public void setcmdTir(int scmdTir)  {
	    cmdTir = scmdTir;
	}	
	
}


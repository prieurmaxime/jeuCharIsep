import java.awt.event.KeyEvent;


public class Interaction {


	double inclinaisonCanon;
	double posX;
	boolean cmdTir;
	double power;

	
	public Interaction(){
	
	}
	
	public void deplacement(player numJoueur){
		
		posX = numJoueur.getPosX();

		
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){ //si fleche gauche appuy�e
			
			if(posX<=11){
			}
			else{
				posX = posX -1	;
				numJoueur.setposX(posX);
			}

		}
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){ //si fleche gauche appuy�e
			
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
			
			cmdTir = true;
			
		}
		
	}
	//getter
	public boolean getcmdTir(){
		return cmdTir;
	}
	public double getpower(){
		power = 10;
		return power;
	}
	//setter
	public void setcmdTir(boolean scmdTir)  {
	    cmdTir = scmdTir;
	}	
	
}


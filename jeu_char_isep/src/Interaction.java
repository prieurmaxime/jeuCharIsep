import java.awt.event.KeyEvent;


public class Interaction {


	double inclinaisonCanon;
	double posX;
	
	double trajectoireObusX[] = new double[1500];
	double trajectoireObusY[] = new double[1500];
	double positionObusX[ ]= new double[1500];
	double positionObusY[] = new double[1500];
	public double angleTir;
	public double vInit;
	public double wind;
	public double Xorigine;
	public double Yorigine;
	int i =1;
	double gravite = 10;
	double obusX;
	double obusY;
	double mapY[];
	
	
	public Interaction(){
	
	}
	
	public void deplacement(player numJoueur){
		
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
		
	}
	
	public void commande(player numJoueur,double puissance,double vent,Map nomMap){

		if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){ 
			
			
			Xorigine = numJoueur.getPosX();
			Yorigine = numJoueur.getPosY();
			/*System.out.println("Y"+Yorigine);
			System.out.println("X"+Xorigine);*/
			trajectoireObusX[0] = Xorigine;
			trajectoireObusY[0] = Yorigine;

			angleTir = numJoueur.getinclinaisonCanon();
			vInit = puissance;
			wind = vent;
			mapY = nomMap.getmapY();
			
			/*for(i=1;mapY[(int)obusX]>=obusY || obusX>=0 || obusX <= 1500;i++){
				trajectoireObusX[i]=(vInit*Math.cos(angleTir))*i;
				System.out.println("X"+trajectoireObusX[i]);
				trajectoireObusY[i]=(-1/2)*gravite*i*i+(vInit*Math.sin(angleTir))*i;
				System.out.println("Y"+trajectoireObusY[i]);
				i++;
			}*/
			
			for(i=1;mapY[(int)obusX]>=obusY || obusX>=0 || obusX <= 1500;i++){
				positionObusX[i] = Xorigine + (vInit*Math.cos(angleTir))*i;
				positionObusY[i] = Yorigine + (-1/2)*gravite*i*i+(vInit*Math.sin(angleTir))*i;
			}
			
			for(i=1;mapY[(int)obusX]>=obusY || obusX>=0 || obusX <= 1500;i++){
				
				obusX = positionObusX[i];
				obusY = positionObusY[i];
				
				StdDraw.picture(obusX, obusY, "obus.png", 35, 7, 0);
				StdDraw.show(10);
			
		}
	}
}
}

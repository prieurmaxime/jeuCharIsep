
public class tank {


	double posXTank;
	double posYTank;
	double inclinaisonCanon;
	double mapY[];
	
	public tank(){
		
	}
	
	public void drawTank(player numJoueur,Map nomMap){
		
		posXTank = numJoueur.getPosX();
		double mapY[] = nomMap.getmapY();
		posYTank = mapY[(int)posXTank];
		inclinaisonCanon = numJoueur.getinclinaisonCanon();
		
		StdDraw.picture(posXTank-3, posYTank+40, "canonchar.png", 140, 8, inclinaisonCanon/*degré*/);
		StdDraw.picture(posXTank, posYTank+20, "corpchar.png", 116, 57, 0/*degré*/);
		
		numJoueur.setposY(posYTank);
	}
}
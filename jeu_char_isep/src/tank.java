
public class tank {

	double posCorpXbg,posCorpXbd,posCorpYbg,posCorpYhd,posTourXbg,posTourXbd,posTourYbg,posTourYhg,posCannonXc,posCannonYc;
	double corpXTank[] = new double[4];
	double corpYTank[] = new double[4];
	double tourXTank[] = new double[4];
	double tourYTank[] = new double[4];
	double posXTank;
	double posYTank;
	
	public tank(){
		
	}
	
	public void createTank(player numJoueur,Map nomMap){
		
		double posXTank = numJoueur.getPosX();
		double mapY[] = nomMap.getmapY();
		posYTank = mapY[(int)posXTank];
		
		posCorpXbg = posXTank - 20;
		corpXTank[0] = posCorpXbg;
		corpXTank[1] = posCorpXbg;
		posCorpXbd = posXTank + 20;
		corpXTank[2] = posCorpXbd;
		corpXTank[3] = posCorpXbd;
		
		posCorpYbg = posYTank;
		corpYTank[0] = posCorpYbg;
		corpYTank[3] = posCorpYbg;
		posCorpYhd = posYTank + 20;
		corpYTank[1] = posCorpYhd;
		corpYTank[2] = posCorpYhd;
		
		posTourXbg = posXTank - 10;
		tourXTank[0] = posTourXbg;
		tourXTank[1] = posTourXbg;
		posTourXbd = posXTank + 10;
		tourXTank[2] = posTourXbd;
		tourXTank[3] = posTourXbd;
		
		posTourYbg = posYTank + 20;
		tourYTank[0] = posTourYbg;
		tourYTank[3] = posTourYbg;
		posTourYhg = posYTank + 30;
		tourYTank[1] = posTourYhg;
		tourYTank[2] = posTourYhg;
		
		posCannonXc = posXTank;
		posCannonYc = posYTank +25;
		
		
		
	}
	
	
	public void drawTank(player numJoueur){
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledPolygon(corpXTank,corpYTank);
		StdDraw.filledPolygon(tourXTank,tourYTank);
	}
	
	public double getposXTank(){
		return posXTank;
	}

}

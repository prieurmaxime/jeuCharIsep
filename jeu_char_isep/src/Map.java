
public class Map {
	
	public double mapX[] = new double[1600];
	public double mapY[] = new double[1600];
	int i =0;
	
	public Map(){
			
	}
	//Création de mapRandom qui génere un terrain aléatoire
	public void mapRandom(){
		
		mapX[0]=0;
		mapY[0]=0;
		/*mapX[1]=0;
		mapY[1]=500;
		mapX[1549]=1549;
		mapY[1549]=500;*/
		mapX[1599]=1599;
		mapY[1549]=0;
		
		for(i=1;i<=1598;i++){
			mapX[i] = i;
			mapY[i] = 500+300*Math.cos(0.01*i);
		}


	}// Fin de mapRandom
	
	
	public void drawMap(){
		

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledPolygon(mapX,mapY);
	}
	// Getter 
	public double[] getmapY(){
		return mapY;
	}
	
	
	
	// SEtter 
	public void setmapY(double[] smapY)  {
	    mapY = smapY;
	}
	
}// Fin de Class
	


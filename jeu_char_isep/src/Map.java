
public class Map {
	
	public double mapX[] = new double[1551];
	public double mapY[] = new double[1551];
	int i =0;
	
	public Map(){
			
	}
	//Cr�ation de mapRandom qui g�nere un terrain al�atoire
	public void mapRandom(){
		
		mapX[0]=0;
		mapY[0]=0;
		mapX[1]=0;
		mapY[1]=500;
		mapX[1549]=1549;
		mapY[1549]=500;
		mapX[1550]=1549;
		mapY[1550]=0;
		
		for(i=2;i<=1548;i++){
			mapX[i] = i;
			mapY[i] = 500+300*Math.cos(0.01*i);
			System.out.println(mapX[i]);
			System.out.println(mapY[i]);
		}


	}// Fin de mapRandom
	
	
	public void drawMap(){
		
		//double test[]={100,200,200,100};
		//double test2[]={100,100,200,200};
		//StdDraw.filledPolygon(test,test2);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledPolygon(mapX,mapY);
	}
	// Getter 
	public double[] getmapY(){
		return mapY;
	}
	
	
	
	// SEtter 
	
	
}// Fin de Class
	


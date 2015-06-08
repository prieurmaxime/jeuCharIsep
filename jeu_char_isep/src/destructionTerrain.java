
public class destructionTerrain {

	public destructionTerrain(){
		
	}
	
	int chocX;
	int chocY;
	double mapY[];
	int i;
	boolean destru;
	double puissance;
	boolean afinidejouer;
	
	public void trou(Tir gchoc,Map nomMap,Interaction power){
		
		chocX = gchoc.getchocX();
		chocY = gchoc.getchocY();
		mapY = nomMap.getmapY();
		puissance = power.getpower();
		
		if(destru == true){
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(chocX, chocY, puissance);
			mapY[chocX]=mapY[chocX]-puissance;
			for(i=0;i<puissance;i++){
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledCircle(chocX, chocY, puissance);
				mapY[chocX-i]=mapY[chocX-i]-(puissance-i);
				nomMap.setmapY(mapY);
				mapY[chocX+i]=mapY[chocX+i]-(puissance-i);
				nomMap.setmapY(mapY);
				destru =false;
				afinidejouer = true;
		}

		}
		
	}
	
	public boolean getafinidejouer(){
		return afinidejouer;
	}
	public void setafinidejouer(boolean safinidejouer){
			afinidejouer=safinidejouer;
	}
	public void setdestru(boolean sdestru)  {
	    destru = sdestru;
	}


}



public class Tir {

	public Tir(){
		
	}

	double inclinaisonCanon;
	double posX;
	double positionObusX[ ]= new double[1500];
	double positionObusY[] = new double[1500];
	public double angleTir;
	double angleTirdegre;
	public double vInit;
	public double wind;
	public double Xorigine;
	public double Yorigine;
	int i ;
	int j ;
	double gravite;
	double obusX;
	double obusY;
	double mapY[];
	boolean afinidejouer;
	boolean tir;
	int chocX;
	int chocY;
	boolean destru;
	
	public void commande(Interaction cmd,player numJoueur,double puissance,double vent,Map nomMap,destructionTerrain destruction,Interaction finTir, player joue){

		tir = cmd.getcmdTir();
		
		if(tir == true){
		
		Xorigine = numJoueur.getPosX();
		Yorigine = numJoueur.getPosY();
		angleTirdegre = numJoueur.getinclinaisonCanon();
		double angleTir = Math.toRadians(angleTirdegre);
		//System.out.println("angle"+i+" "+angleTir);
		vInit = puissance;
		wind = vent;
		mapY = nomMap.getmapY();
		gravite = 0.1;
			

			for(i=0;i<500;i++){
				positionObusY[i] = Yorigine + 20-0.5*gravite*i*i+vInit*Math.sin(angleTir)*i;
				positionObusX[i] = Xorigine + (vInit*Math.cos(angleTir))*i;
			}
			
			for(i=0;mapY[(int)obusX]<=obusY && obusX>=0 && obusX <= 1500;i++){
				
				obusX = positionObusX[i];
				obusY = positionObusY[i];
				
				if(obusY<=mapY[(int)obusX]){ // COLLISION MAP
					chocX = (int)obusX;	
					chocY = (int)obusY;
					destru = true;
				}
				else if (obusX>=0 && obusX <= 1500 && obusY>0){//SORTIE DE MAP*
					destru = false;
					afinidejouer = true;
				}

				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(obusX, obusY,	15);
				//StdDraw.picture(obusX, obusY, "obus.png", 35, 7, 0);
				StdDraw.show(5);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(obusX, obusY,	16);		
				StdDraw.show(5);
			}
			
			destruction.setdestru(destru);
			destruction.setafinidejouer(afinidejouer);
			
		}

		tir = false;
		finTir.setcmdTir(tir);
	}
	
	public int getchocX(){
		return chocX;
	}
	public int getchocY(){
		return chocY;
	}
	public boolean getdestru(){
		return destru;
	}

}
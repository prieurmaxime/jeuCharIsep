import java.awt.event.KeyEvent;

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
	int afinidejouer;
	int tir;
	int choc;
	
	public void commande(Interaction cmd,player numJoueur,double puissance,double vent,Map nomMap,Interaction finTir){

		int tir = cmd.getcmdTir();
		
		if(tir==1){
		
		Xorigine = numJoueur.getPosX();
		Yorigine = numJoueur.getPosY();
		angleTirdegre = numJoueur.getinclinaisonCanon();
		double angleTir = Math.toRadians(angleTirdegre);
		//System.out.println("angle"+i+" "+angleTir);
		vInit = puissance;
		wind = vent;
		mapY = nomMap.getmapY();
		gravite = 0.1;
		
		if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){ 
			

			for(i=0;i<500;i++){
				positionObusY[i] = Yorigine+20-0.5*gravite*i*i+vInit*Math.sin(angleTir)*i;
				positionObusX[i] = Xorigine + (vInit*Math.cos(angleTir))*i;
			}
			
			for(i=0;mapY[(int)obusX]<=obusY && obusX>=0 && obusX <= 1500;i++){
				
				obusX = positionObusX[i];
				obusY = positionObusY[i];
				choc = i;

				StdDraw.picture(obusX, obusY, "obus.png", 35, 7, 0);
				StdDraw.show(10);
			}
			
			afinidejouer=1;
			
		}
		else{
		
		}
		tir=0;
		finTir.setcmdTir(tir);
	}
	}
	public int getchoc(){
		return choc;
	}
	
}
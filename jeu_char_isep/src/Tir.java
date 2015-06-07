import java.awt.event.KeyEvent;


public class Tir {
	
	public double trajectoireObusX[];
	public double trajectoireObusY[];
	public double positionObusX[];
	public double positionObusY[];
	public double angleTir;
	public double vInit;
	public double wind;
	public double Xorigine;
	public double Yorigine;
	int i =0;
	double gravite = 10;
	double obusX;
	double obusY;
	double mapY[];
	
	public Tir(){
		
	}
	
	public void drawObus(double posXCanon,double posYCanon,double inclinaisonCanon,double puissance,double vent,Map nomMap){
			
		
			Xorigine = posXCanon;
			Yorigine = posYCanon;
			trajectoireObusX[0] = Xorigine;
			trajectoireObusY[0] = Yorigine;
			angleTir = inclinaisonCanon;
			vInit = puissance;
			wind = vent;
			mapY = nomMap.getmapY();
			
			for(i=1;i<=1500;i++){
				trajectoireObusX[i]=(vInit*Math.cos(angleTir))*i;
				trajectoireObusY[i]=(-1/2)*gravite*i*i+(vInit*Math.sin(angleTir))*i;
			}
			
			for(i=0;mapY[(int)obusX]>=obusY || obusX>=0 || obusX <= 1500;i++){
				positionObusX[i] = Xorigine + trajectoireObusX[i];	
				positionObusY[i] = Yorigine + trajectoireObusY[i];
			}
			
			for(i=1;mapY[(int)obusX]>=obusY || obusX>=0 || obusX <= 1500;i++){
				
				obusX = positionObusX[i];
				obusY = positionObusY[i];
				
				StdDraw.picture(obusX, obusY, "obus.png", 35, 7, 0/*degré*/);
				
			}
		}

		
	
	
}





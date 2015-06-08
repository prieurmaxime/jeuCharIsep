
public class main_tank {


	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(1600,900);
		StdDraw.setXscale(0,1600);
		StdDraw.setYscale(0,900);
		 
		Map map1 = new Map();
		map1.mapRandom();
		
		player jouepas = new player();
		player joue = new player();
		player jouechangement = new player();
		//Quijoue debut = new Quijoue();
		destructionTerrain destru = new destructionTerrain();
		tank t1 = new tank();
		tank t2 = new tank();
		Tir shoot = new Tir();
		Interaction touche = new Interaction();
		joue.joueur("Maxime","ORANGE",20+Math.random()*1510,0,0,map1);
		jouepas.joueur("Hadrien","RED",20+Math.random()*1510,0,0,map1);
		//debut.quiCommence(joue, jouepas,jouechangement);
		
		//boolean  afinidejouer=false;
		while(true){
			if(destru.afinidejouer){
				jouechangement = joue;
				joue = jouepas;
				jouepas = jouechangement;
				destru.afinidejouer=!destru.afinidejouer;
			}
			//debut.changementdejoueur(destru, joue, jouepas, jouechangement);
			//afinidejouer=destru.getafinidejouer();
			StdDraw.clear();
			map1.drawMap();
			t1.drawTank(joue,map1);
			t2.drawTank(jouepas,map1);
			touche.deplacement(joue);
			shoot.commande(touche, joue, 10.0, 0.0, map1,destru, touche, joue);
			destru.trou(shoot, map1, touche);
			
			

			StdDraw.show(10);
		}
		
	}

}
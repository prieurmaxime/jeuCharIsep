
public class main_tank {

	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(1900,1000);
		StdDraw.setXscale(0,1500);
		StdDraw.setYscale(0,800);
		
		Map map1 = new Map();
		map1.mapRandom();
		
		player jouepas = new player();
		player joue = new player();
		player jouechangement = new player();
		Quijoue debut = new Quijoue();
		joue.joueur("Maxime","ORANGE",20+Math.random()*1510,0,0,map1);
		jouepas.joueur("Hadrien","RED",20+Math.random()*1510,0,0,map1);
		debut.quiCommence(joue, jouepas,jouechangement);
		tank t1 = new tank();
		tank t2 = new tank();
		Tir shoot = new Tir();
		
		Interaction touche = new Interaction();
		
		
		while(true){
			
			StdDraw.clear();
			map1.drawMap();
			t1.drawTank(joue,map1);
			t2.drawTank(jouepas,map1);
			touche.deplacement(joue);
			shoot.commande(touche, joue, 10, 0, map1, touche);
			//touche.commande(joue,10.0, 0.0, map1);

			StdDraw.show(10);
		}
		
	}

}
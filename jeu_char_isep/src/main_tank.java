
public class main_tank {

	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(1550,850);
		StdDraw.setXscale(0,1550);
		StdDraw.setYscale(0,850);
		
		Map map1 = new Map();
		map1.mapRandom();
		player j1 = new player();
		player j2 = new player();
		j1.nouveauJoueur("Maxime","ORANGE",20+Math.random()*1510);
		j2.nouveauJoueur("Hadrien","RED",20+Math.random()*1510);
		
		tank t1 = new tank();
		tank t2 = new tank();
		
		while(true){	
			StdDraw.clear();
			map1.drawMap();
			t1.createTank(j1,map1);
			t1.drawTank(j1);
			t2.createTank(j2,map1);
			t2.drawTank(j2);
			StdDraw.show(10);
		
		}
		
	}

}

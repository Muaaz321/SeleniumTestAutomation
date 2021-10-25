package Core;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.ArrayList<String> tvSeries = new java.util.ArrayList<String>();
		
		tvSeries.add("Knight");
		tvSeries.add("Air");
		tvSeries.add("horse");
		tvSeries.add("Flight");
		tvSeries.add("Car");
		tvSeries.add("Missile");
		
		
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		
		
		for(String show:tvSeries) {
			System.out.println(show);
		}
		
	}

}

package model;

import java.util.Comparator;

public class SortByDogId implements Comparator<Doggie>{

	@Override
	public int compare(Doggie o1, Doggie o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
